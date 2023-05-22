import javax.swing.*;
import java.awt.*;

public class _9 {
    public static void main (String [] args ){
        JFrame jf = new JFrame();
        jf.setSize(500,500);
        JPanel panel = new JPanel();

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");

        menuBar.add(file);
        menuBar.add(help);

        JMenuItem open = new JMenuItem("Open");
        JMenuItem saveAs = new JMenuItem("Save as");

        file.add(open);
        file.add(saveAs);

        JTextArea textArea = new JTextArea();

        JTextField text = new JTextField(15);
        JButton reset = new JButton("reset");
        JButton send = new JButton("send");
        JLabel label = new JLabel("Please Enter Text");
        panel.add(label);
        panel.add(text);
        panel.add(send);
        panel.add(reset);

        jf.getContentPane().add(menuBar, BorderLayout.NORTH);
        jf.getContentPane().add(panel, BorderLayout.SOUTH);
        jf.getContentPane().add(textArea, BorderLayout.CENTER);

        jf.setVisible(true);
    }
}
