package FoodOrder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame {

    private JPanel jpanel;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JButton btnOrder;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrder(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0;
                double discount = 0;

                if(cPizza.isSelected()){
                    total += 100;
                }
                if(cBurger.isSelected()){
                    total += 80;
                }
                if(cFries.isSelected()){
                    total += 65;
                }
                if(cSoftDrinks.isSelected()){
                    total += 55;
                }
                if(cTea.isSelected()){
                    total += 50;
                }
                if(cSundae.isSelected()){
                    total += 40;
                }
                if(rbNone.isSelected()){
                    discount = 0;
                }
                if(rb5.isSelected()){
                    discount = 0.05;
                }
                if(rb10.isSelected()){
                    discount = 0.10;
                }
                if(rb10.isSelected()){
                    discount = 0.15;
                }
                double amount = total - (total * discount);
                JOptionPane.showMessageDialog(null, "The total price is Php " + amount);
            }
        });
    }
    public static void main(String[] args) {
        FoodOrder app = new FoodOrder();
        app.setContentPane(app.jpanel);
        app.setSize(1000, 700);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }


}
