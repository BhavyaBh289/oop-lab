import javax.swing.*;
import java.awt.*;

public class _14 {

    public static void main(String args[]){

        JFrame jf = new JFrame("Swing calculator");

        JPanel panel = new JPanel();

        JTextField textField = new JTextField(480);

        JButton _7 = new JButton("7");
        JButton _8 = new JButton("8");
        JButton _9 = new JButton("9");
        JButton _product = new JButton("*");

        JButton _4 = new JButton("4");
        JButton _5 = new JButton("5");
        JButton _6 = new JButton("6");
        JButton _difference = new JButton("-");

        JButton _1 = new JButton("1");
        JButton _2 = new JButton("2");
        JButton _3 = new JButton("3");
        JButton _sum = new JButton("+");

        JButton _clear = new JButton("C");
        JButton _0 = new JButton("0");
        JButton _equals = new JButton("=");
        JButton _division = new JButton("/");

        panel.add(_7); panel.add(_8); panel.add(_9); panel.add(_product);
        panel.add(_4); panel.add(_5); panel.add(_6); panel.add(_difference);
        panel.add(_1); panel.add(_2); panel.add(_3); panel.add(_sum);
        panel.add(_clear); panel.add(_0); panel.add(_equals); panel.add(_division);

        panel.setLayout(new GridLayout(4, 4, 2, 2));

        jf.getContentPane().add(textField, BorderLayout.NORTH);
        jf.getContentPane().add(panel, BorderLayout.CENTER);

        jf.setSize(500, 500);
        jf.setVisible(true);

    }

}
