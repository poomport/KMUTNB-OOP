import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;


public class MultiList extends JFrame {
	private JList leftlist, rightlist;
	private JButton movebutton;
	private static String[] foods = {"Bacon", "Chicken", "Ham", "Pork", "Beef", "Noodle"};
	
	public MultiList() {
		super("Multi Selection List");
		this.getContentPane().setLayout(new FlowLayout());
		
		leftlist = new JList(foods);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.add(new JScrollPane(leftlist));
		
		movebutton = new JButton("Move-->");
		movebutton.addActionListener( 
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent ev) {
						rightlist.setListData(leftlist.getSelectedValues());
						
						//Vector<String> vect = new Vector<String>(leftlist.getSelectedValuesList());
						//rightlist.setListData(vect);
					}
				}				
		);
		this.add(movebutton);
		
		rightlist = new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(20);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.add(new JScrollPane(rightlist));
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new  Runnable()  { 
			@Override
			public void run() { 
				MultiList ml = new MultiList();
				ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ml.setSize(300, 200);
				ml.setVisible(true);
			} 
		}); 		
	}

}
