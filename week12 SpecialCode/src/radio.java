import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class radio extends JFrame {
	private JTextField txt;
	private Font pf, bf, itf, bif;
	private JRadioButton pb, bb, ib, bib;
	private ButtonGroup group;
	
	public radio() {
		super("Title");
		this.getContentPane().setLayout(new FlowLayout());
		
		txt = new JTextField("This is a text.", 20);
		pb = new JRadioButton("Plain", true);
		bb = new JRadioButton("Bold", false);
		ib = new JRadioButton("Italic", false);
		bib = new JRadioButton("Bold and Italic", false);
		
		this.add(txt); this.add(pb); this.add(bb); this.add(ib); this.add(bib);
		group = new ButtonGroup();
		group.add(pb); group.add(bb); group.add(ib); group.add(bib);
		
		int fontSize = 18;
		pf = new Font("Serif", Font.PLAIN, fontSize);
		bf = new Font("Serif", Font.BOLD, fontSize);
		itf = new Font("Serif", Font.ITALIC, fontSize);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, fontSize);
		
		txt.setFont(pf);
		
		pb.addItemListener(new Handler(pf));
		bb.addItemListener(new Handler(bf));
		ib.addItemListener(new Handler(itf));
		bib.addItemListener(new Handler(bif));
		
	}
	
	private class Handler implements ItemListener {
		private Font font;
		
		Handler(Font f) {
			this.font = f;
		}
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			txt.setFont(this.font);
			
		}
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new  Runnable()  { 
			@Override
			public void run() { 
				radio rd = new radio();
				rd.setSize(320, 200);
				rd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				rd.setVisible(true);
			} 
		}); 
	}

}
