import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class order implements ItemListener,ActionListener{
    JLabel l1;
    int tatal=0;
    order(){
        JFrame f1=new JFrame("Order Food");
        f1.setLayout(new FlowLayout());
        f1.setSize(200,200);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox cb1=new JCheckBox("Pizza : Rs 99");
        JCheckBox cb2=new JCheckBox("Burger : Rs 50");
        JCheckBox cb3=new JCheckBox("Coffee : Rs 10");
        l1=new JLabel();
        JButton b1=new JButton("Total amt");
        b1.addActionListener(this);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        f1.add(cb1);
        f1.add(cb2);
        f1.add(cb3);
        f1.add(b1);
        f1.add(l1);
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        l1.setText("The Total Amount: "+tatal);
    }
    public void itemStateChanged(ItemEvent i){
        JCheckBox c=(JCheckBox)i.getItem();
        if(c.isSelected()){
            switch(c.getText()){
                case "Pizza : Rs 99": tatal+=99;
                    break;
                case "Burger : Rs 50": tatal+=50;
                    break;
                case "Coffee : Rs 10": tatal+=10;
                    break;
            }
        }
        else{
            switch(c.getText()){
                case "Pizza : Rs 99": tatal-=99;
                    break;
                case "Burger : Rs 50": tatal-=50;
                    break;
                case "Coffee : Rs 10": tatal-=10;
                    break;
            }
        }
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new order();
            }
        });
    }
}