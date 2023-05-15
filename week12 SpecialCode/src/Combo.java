import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class Combo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lblPic;
	private JComboBox box;
	private static String[] filename = {"a.png", "s.png"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),
							new ImageIcon(getClass().getResource(filename[1]))};
	
	public Combo() {
		super("Test Again!!!");
		this.getContentPane().setLayout(new FlowLayout());
		
		lblPic = new JLabel(pics[0]);
		box = new JComboBox(filename);
		box.addItemListener(
				new ItemListener() {
					public void itemStateChanged(ItemEvent ev) {
						if(ev.getStateChange()==ItemEvent.SELECTED) {
							lblPic.setIcon(pics[box.getSelectedIndex()]);
						}
					}
				}
		);
		
		this.add(box);
		this.add(lblPic);
		
	}
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new  Runnable()  { 
			@Override
			public void run() { 
				Combo cb = new Combo();
				cb.setSize(300,200);
				cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				cb.setVisible(true);
			} 
		}); 		

	}

}
