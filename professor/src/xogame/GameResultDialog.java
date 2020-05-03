package xogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameResultDialog {

    public GameResultDialog(String labelText, ActionListener actionListener) {
        JDialog dialog = new JDialog();
        dialog.setResizable(false);
        dialog.setSize(300, 150);
        dialog.setLocation(550, 400);
        dialog.setLayout(new BoxLayout(dialog.getContentPane(), BoxLayout.Y_AXIS));
        dialog.setTitle("Результат игры");


        JLabel label = new JLabel(labelText);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setBorder(BorderFactory.createEmptyBorder(20, 0, 30, 0));
        dialog.add(label);

        JButton retryButton = new JButton("Сыграть еще раз");
        retryButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        retryButton.addActionListener(actionListener);
        retryButton.addActionListener(e -> dialog.setVisible(false));
        dialog.add(retryButton);

        dialog.setVisible(true);
    }
}
