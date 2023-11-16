package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JComboBox cbOperations;
    private JPanel jpanel;
    private JTextField lblResult;

    public Calculator(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());
                int op = cbOperations.getSelectedIndex();

                switch (op){
                    case 0:
                        lblResult.setText(String.valueOf(num1 + num2));
                        break;
                    case 1:
                        lblResult.setText(String.valueOf(num1 - num2));
                        break;
                    case 2:
                        lblResult.setText(String.valueOf(num1 * num2));
                        break;
                    case 3:
                        lblResult.setText(String.valueOf(num1 / num2));
                }
            }
        });
    }
    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setContentPane(app.jpanel);
        app.setSize(1000, 700);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");
    }
}

