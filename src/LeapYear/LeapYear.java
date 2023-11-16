package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame{
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel jpanel;

    public LeapYear() {

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputYear= tfYear.getText();
                try {
                    int year = Integer.parseInt(inputYear);
                    if (isLeapYear(year)) {
                        JOptionPane.showMessageDialog(LeapYear.this, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(LeapYear.this, "Not a leap year");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(LeapYear.this, "Please enter valid year.");
                }
            }
        });
    }
        private boolean isLeapYear(int year){
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); 
        }

    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.jpanel);
        app.setSize(1000, 700);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}
