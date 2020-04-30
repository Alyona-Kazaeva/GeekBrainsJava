package Calculator;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;


public class Window extends JFrame {
    private double firstValue = 0;
    private String operation = "";

    private static String format(double x) {
        return NumberFormat.getInstance().format(x);
    }

    Window() {
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 200);

        JPanel panel = new JPanel();
        JPanel panelText = new JPanel();
        panelText.setLayout(new GridLayout(0, 1));
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(0, 40));
        panelText.add(textField);
        add(panelText, BorderLayout.NORTH);

        panel.setLayout(new GridLayout(0, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        add(panel, BorderLayout.CENTER);

        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divisionButton = new JButton("/");
        JButton equalButton = new JButton("=");
        JButton clearButton = new JButton("c");

        Font bigFont = new Font("serif", Font.BOLD, 25);
        plusButton.setFont(bigFont);
        minusButton.setFont(bigFont);
        multiplyButton.setFont(bigFont);
        divisionButton.setFont(bigFont);
        equalButton.setFont(bigFont);
        clearButton.setFont(bigFont);

        panel.add(plusButton);
        panel.add(minusButton);
        panel.add(multiplyButton);
        panel.add(divisionButton);
        panel.add(clearButton);
        add(equalButton, BorderLayout.SOUTH);

        getRootPane().setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        plusButton.addActionListener(e -> {
            firstValue = Integer.valueOf(textField.getText());
            textField.setText("");
            operation = "+";
        });

        minusButton.addActionListener(e -> {
            firstValue = Integer.valueOf(textField.getText());
            textField.setText("");
            operation = "-";
        });

        multiplyButton.addActionListener(e -> {
            firstValue = Integer.valueOf(textField.getText());
            textField.setText("");
            operation = "*";
        });

        divisionButton.addActionListener(e -> {
            firstValue = Integer.valueOf(textField.getText());
            textField.setText("");
            operation = "/";
        });
        clearButton.addActionListener(e -> textField.setText(""));

        equalButton.addActionListener(e -> {
            double secondValue = Integer.valueOf(textField.getText());
            if ("+".equals(operation)) {
                textField.setText("" + format(firstValue + secondValue));
            }
            if ("-".equals(operation)) {
                textField.setText("" + format(firstValue - secondValue));
            }
            if ("*".equals(operation)) {
                textField.setText("" + format(firstValue * secondValue));
            }
            if ("/".equals(operation)) {
                textField.setText("" + format(firstValue / secondValue));
            }
            firstValue = 0;
        });

        setVisible(true);
    }

}

