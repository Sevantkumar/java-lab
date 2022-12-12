import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class tree implements TreeSelectionListener{
	JTree t;
	JLabel l1;
	tree(){
		JFrame f1=new JFrame("A Simple Swing Applicatioin");
		f1.setLayout(new FlowLayout());
		f1.setSize(300,400);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
		DefaultMutableTreeNode top=new DefaultMutableTreeNode("MCE");
		DefaultMutableTreeNode cse=new DefaultMutableTreeNode("CSE");
		DefaultMutableTreeNode adj=new DefaultMutableTreeNode("ADJ");
		DefaultMutableTreeNode wp=new DefaultMutableTreeNode("WP");
		DefaultMutableTreeNode ise=new DefaultMutableTreeNode("ISE");
		DefaultMutableTreeNode ds=new DefaultMutableTreeNode("DS");
		DefaultMutableTreeNode ada=new DefaultMutableTreeNode("ADA");
		top.add(cse);
		cse.add(adj);
		cse.add(wp);
		top.add(ise);
		ise.add(ds);
		ise.add(ada);
		t =new JTree(top);
		l1=new JLabel("Path");
		f1.add(t);
		f1.add(l1);
		t.addTreeSelectionListener(this);
	}
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new tree();
			}
		});
	}
	public void valueChanged(TreeSelectionEvent te){
		l1.setText("Selection is :"+te.getPath());
	}
}
