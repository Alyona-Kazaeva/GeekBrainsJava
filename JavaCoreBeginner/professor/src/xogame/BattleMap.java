package xogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;

    public static final int MODE_H_V_A = 0;
    public static final int MODE_H_V_H = 1;

    private int gameMode;
    String f;

    private int fieldSizeX;
    private int fieldSizeY;
    private int winLength;

    private int padding;
    private int cellHeight;
    private int cellWidth;

    private boolean isInit = false;

    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.LIGHT_GRAY);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                update(e);
            }
        });

    }

    private void update(MouseEvent e) {
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;

        if (!Logic.gameFinished) {
            Logic.setHumanXY(cellX, cellY);
        }
        if (Logic.gameFinished) {
            repaint();

            new GameResultDialog(Logic.resultText, actionEvent -> {
                Logic.initMap();
                Logic.printMap();
                Logic.gameFinished = false;
                repaint();
            });
        }

        System.out.println(cellX + " " + cellY);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render((Graphics2D) g);
    }

    private void render(Graphics2D g) {
        if (!isInit) {
            return;
        }

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSizeY;
        cellWidth = panelWidth / fieldSizeX;
        padding = (int) (cellWidth * 0.15);

        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWidth, y);
        }

        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }

        g.setStroke(new BasicStroke((float) (cellWidth * 0.05)));

        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[i][j] == Logic.DOT_O) {
                    drawO(g, j, i);
                }
                if (Logic.map[i][j] == Logic.DOT_X) {
                    drawX(g, j, i);
                }
            }
        }
        if (Logic.gameFinished && !Logic.noWin) {
            WinLineInfo w = Logic.winLineInfo;
            g.setStroke(new BasicStroke((float) (cellWidth * 0.1)));
            g.setColor(new Color(0, 255, 0));
            g.drawLine(
                    w.getCx() * cellWidth + cellWidth / 2,
                    w.getCy() * cellHeight + cellWidth / 2,
                    w.getCx() * cellWidth + cellWidth / 2 + (w.getVx() * cellWidth * Logic.DOTS_TO_WIN) - w.getVx() * cellWidth,
                    w.getCy() * cellWidth + cellWidth / 2 + (w.getVy() * cellWidth * Logic.DOTS_TO_WIN) - w.getVy() * cellWidth
            );
        }
    }

    private void drawO(Graphics g, int cellX, int cellY) {
        g.setColor(new Color(0, 0, 255));
        g.drawOval(cellX * cellWidth + padding, cellY * cellHeight + padding, cellWidth - padding * 2, cellHeight - padding * 2);

    }

    private void drawX(Graphics2D g, int cellX, int cellY) {
        g.setColor(new Color(255, 3, 0));
        g.drawLine(cellX * cellWidth + padding, cellY * cellHeight + padding, (cellX + 1) * cellWidth - padding, (cellY + 1) * cellHeight - padding);
        g.drawLine(cellX * cellWidth + padding, (cellY + 1) * cellHeight - padding, (cellX + 1) * cellWidth - padding, cellY * cellHeight + padding);

    }


    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
//        System.out.println(gameMode + " " + fieldSizeX + " " + fieldSizeY + " " + winLength);
        this.gameMode = gameMode;
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.winLength = winLength;
        isInit = true;
        repaint();
    }
}
