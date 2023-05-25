import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _14 extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalButton, clearButton;
    private JPanel panel;

    private String firstNumber;
    private String operator;

    public _14() {
        // Set up the frame
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create the text field for calculation question
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

        // Create the number buttons
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 20));
            numberButtons[i].addActionListener(this);
        }

        // Create the operator buttons
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalButton = new JButton("=");
        clearButton = new JButton("C");

        addButton.setFont(new Font("Arial", Font.PLAIN, 20));
        subtractButton.setFont(new Font("Arial", Font.PLAIN, 20));
        multiplyButton.setFont(new Font("Arial", Font.PLAIN, 20));
        divideButton.setFont(new Font("Arial", Font.PLAIN, 20));
        equalButton.setFont(new Font("Arial", Font.PLAIN, 20));
        clearButton.setFont(new Font("Arial", Font.PLAIN, 20));

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Create panel and add components
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subtractButton);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(multiplyButton);
        panel.add(clearButton);
        panel.add(numberButtons[0]);
        panel.add(equalButton);
        panel.add(divideButton);


        // Add components to the frame
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        // Display the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle number button clicks
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
                return;
            }
        }

        // Handle operator button clicks
        if (e.getSource() == addButton || e.getSource() == subtractButton || e.getSource() == multiplyButton || e.getSource() == divideButton) {
            firstNumber = textField.getText();
            operator = ((JButton) e.getSource()).getText();
            textField.setText("");
        }

        // Handle equal button click
        if (e.getSource() == equalButton) {
            String secondNumber = textField.getText();
            double result = 0.0;

            switch (operator) {
                case "+":
                    result = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
                    break;
                case "-":
                    result = Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
                    break;
                case "*":
                    result = Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
                    break;
                case "/":
                    result = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
                    break;
            }

            textField.setText(String.valueOf(result));
        }

        // Handle clear button click
        if (e.getSource() == clearButton) {
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        // Run the GUI on the event dispatch thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new _14();
            }
        });
    }
}
