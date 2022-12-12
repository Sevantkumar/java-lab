import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class combobox implements ActionListener{
	JLabel l1;
	JComboBox<String> cb;
	combobox(){
		JFrame f1=new JFrame("Combo Box");
		f1.setLayout(new FlowLayout());
		f1.setSize(300,400);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
		String[] a={"C","C++","Python","Java","Dart"};
		cb=new JComboBox<String>(a);
		cb.addActionListener(this);
		l1=new JLabel("Label");
		f1.add(l1);
		f1.add(cb);
	}
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new combobox();
			}
		});
	}
	public void actionPerformed(ActionEvent e){
		l1.setText((String)(cb.getSelectedItem()));
	}
}
