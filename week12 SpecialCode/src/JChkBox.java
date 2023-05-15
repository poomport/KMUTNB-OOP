import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class JChkBox extends JFrame {
	private JTextField txt;
	private JCheckBox  chkBold;
	private JCheckBox chkItalic;
	
	public JChkBox() {
		super("Title");
		this.getContentPane().setLayout(new FlowLayout());
		txt = new JTextField("This is a textfiled", 20);
		txt.setFont(new Font("Serif", Font.PLAIN, 24));
		
		chkBold = new JCheckBox("Bold");
		chkItalic = new JCheckBox("Italic");
		this.add(txt); this.add(chkBold); this.add(chkItalic);
		
		HandlerClass handler = new HandlerClass();
		chkBold.addItemListener(handler);
		chkItalic.addItemListener(handler);
		
		
	}
	
	private class HandlerClass implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent arg0) {
			Font font = null;
			int fontSize = 24;
			if(chkBold.isSelected() && (chkItalic.isSelected())) {
				font = new Font("Serif", Font.BOLD + Font.ITALIC, fontSize);
			}
			else if(chkBold.isSelected()) {
				font = new Font("Serif", Font.BOLD, fontSize);
			}
			else if(chkItalic.isSelected()) {
				font = new Font("Serif",  Font.ITALIC, fontSize);
			}
			else font = new Font("Serif", Font.PLAIN, fontSize);
			
			txt.setFont(font);
		}
		
	}
	

	public static void main(String[] args) {
		// Run the GUI codes in the Event-dispatching thread for thread-safety
		SwingUtilities.invokeLater(new  Runnable()  { 
			@Override
			public void run() { 
				JChkBox cb = new JChkBox();
				cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				cb.setSize(380, 240);
				cb.setVisible(true);
			} 
		}); 

	}

}
