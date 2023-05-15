import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class CEDSwing extends JFrame implements ActionListener {
	private static final long serialVersionUID = 000231L;
    
	// Property
	JTextField txtCount;
	JButton btnCount;
	
	public CEDSwing() {
		super("CED Swing"); // setTitle()
		this.setSize(400,150);
		Container cp= this.getContentPane(); // get Content Pane of JFrame
		cp.setLayout(new FlowLayout());
		
		// Create Object of the Component
		this.txtCount = new JTextField("0",16);
		this.btnCount = new JButton("Count");
		
		// Add Object to the Content Pane (cp)
		cp.add(new JLabel("Count:"));
		cp.add(this.txtCount);
		cp.add(this.btnCount);
		
		// Add Action Listener to Button (Anonymous)ไม่ระบุชื่อ // Synonym<>Antonym,Acronym = nym=name
		this.btnCount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(txtCount.getText());
			    x = x+1; // x+=1; x++; ++x; // Increment
			    txtCount.setText(x+"");
		}});
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //stop run program and exit
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	
	}
	
	public static void main(String[] args) {
        // new CEDSwing(); // J swing don't use
		// Thread-Safe
		// EventQueue.invokeLater(new  Runnable()  
       SwingUtilities.invokeLater(new Runnable(){
    	   @Override
    	   public void run() {
    		  CEDSwing cs =  new CEDSwing();
    		   cs.setVisible(true);
    	   }  
       });
	  }
	}
		
	


