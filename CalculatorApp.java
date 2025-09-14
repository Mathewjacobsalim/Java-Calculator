import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1));

        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        JLabel resultLabel = new JLabel("Result: ", JLabel.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4, 5, 5));

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        buttonPanel.add(add);
        buttonPanel.add(sub);
        buttonPanel.add(mul);
        buttonPanel.add(div);

        frame.add(new JLabel("Enter First Number:", JLabel.CENTER));
        frame.add(num1Field);
        frame.add(new JLabel("Enter Second Number:", JLabel.CENTER));
        frame.add(num2Field);
        frame.add(buttonPanel);
        frame.add(resultLabel);

        ActionListener calcListener = e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = 0;

                if (e.getSource() == add) result = num1 + num2;
                else if (e.getSource() == sub) result = num1 - num2;
                else if (e.getSource() == mul) result = num1 * num2;
                else if (e.getSource() == div) {
                    if (num2 == 0) {
                        resultLabel.setText("Error: Divide by 0");
                        return;
                    }
                    result = num1 / num2;
                }

                resultLabel.setText("Result: " + result);
            } catch (Exception ex) {
                resultLabel.setText("Invalid input.");
            }
        };

        add.addActionListener(calcListener);
        sub.addActionListener(calcListener);
        mul.addActionListener(calcListener);
        div.addActionListener(calcListener);

        frame.setVisible(true);
    }
}