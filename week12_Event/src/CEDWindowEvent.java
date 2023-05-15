import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CEDWindowEvent extends Frame implements WindowListener , ActionListener {
	private static final long serialVersionUID = 425666L;
	private Button btnCED,btn2;
	private TextField txtCED;
	
	public CEDWindowEvent() {
		super("CED Window Event"); // this.setTitle("xxxx");
	    
		//set layout for this Frame (FlowLayout)
		
		this.setLayout(new FlowLayout());
		
		
		
		
		// WindowListener
		this.addWindowListener(this);
		
		
		
		// Create Component Object
		this.btnCED = new Button("inc"); // increment = i++
		this.btn2 = new Button("dec"); // decrement =i--
		this.txtCED = new TextField("0",16);
		this.txtCED.setEditable(false);
		
		// Add Component object on to frame
		this.add(new Label("Number : "));
		this.add(this.txtCED);
		this.add(this.btnCED);
		this.add(this.btn2);
		
		
		
		// Register ActionListener
		this.btnCED.addActionListener(this);
		this.btn2.addActionListener(this);
		
		this.setSize(600,400);
	    this.setVisible(true);
	    
	
	}
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e.getActionCommand());
		String cmd = e.getActionCommand();
		String str = "";
		str = this.txtCED.getText(); 			
		// convert string "0" to 0 (int)
		int x = Integer.parseInt(str);
		
	    if(cmd.equals("inc")) { 
		x = x+1;
		}
		else if(cmd.equalsIgnoreCase("dec")) {
		x = x-1;
		}
	    this.txtCED.setText(x+""); 
	}
    @Override
	public void windowClosing(WindowEvent e) { //สำคัญสุดๆ
		//System.out.println("windowClosing");
		System.exit(0); // Terminal our program
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
    public static void main(String[] args) {
		new CEDWindowEvent();

	}
}
