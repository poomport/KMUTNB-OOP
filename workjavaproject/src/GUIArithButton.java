/* HW9 : GUI(AWT)
 * 
 *  Ratchapoom Huabiam
 *  ID: 6402041620256
 *  
 */

// I tried the color commands from the code Professor. apply in my code.
// import Java Command
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUIArithButton extends Frame implements WindowListener,ActionListener {
	private static final long serialVersionUID = 64398L;
	
    private Button OP1,OP2,OP3,OP4,CLR;
    private TextField TN1,TN2,TN3;
    private static Color colors = Color.PINK; // I try this color.
    
	// Constructor
	public GUIArithButton() {
		
		// Set title
		super("Calculator Appication");
		
		// Set FlowLayout 
		this.setLayout(new FlowLayout());
		
		// WindowListenner
		this.addWindowListener(this);
		
		/** Create Component Object **/
		// TextField
		this.TN1 = new TextField("",43);
		this.TN2 = new TextField("",43);
		this.TN3 = new TextField("",30);
		this.TN3.setEditable(false);
		//Button
		this.OP1 = new Button("ADD");
		this.OP2 = new Button("SUB");
		this.OP3 = new Button("MUL");
		this.OP4 = new Button("DIV");
		this.CLR = new Button("Clear");
		
		// Add Component object on to frame
	    this.add(new Label("X : "));
	    this.add(this.TN1);
	    this.add(new Label("Y : "));
	    this.add(this.TN2);
	    this.add(new Label("result :"));
		this.add(this.TN3);
	    this.add(this.CLR);
	   
	    this.add(this.OP1);
	    this.add(this.OP2);
	    this.add(this.OP3);
	    this.add(this.OP4);
	    this.setBackground(colors);
		
	    // Register ActionListener
	    this.OP1.addActionListener(new ActionListener() { // Button addition,+
	    	@Override
	        public void actionPerformed(ActionEvent e) {
	    	System.out.println("Addition is clicked"); // CHECK BUTTON
	    	double X = Double.parseDouble(TN1.getText());
	    	double Y = Double.parseDouble(TN2.getText());
	        TN3.setText(X+Y+"");
	        }});
	 	this.OP2.addActionListener(new ActionListener() { // Button subtract,-
	    	@Override
	        public void actionPerformed(ActionEvent e) {
	    	System.out.println("Subtract is clicked"); // CHECK BUTTON		
	    	double X = Double.parseDouble(TN1.getText());
	    	double Y = Double.parseDouble(TN2.getText());	        
	        TN3.setText(X-Y+"");
	        }});
	    this.OP3.addActionListener(new ActionListener() { // Button multiply,*
	    	@Override
	        public void actionPerformed(ActionEvent e) {
	    	System.out.println("Multiply is clicked"); // CHECK BUTTON
	    	double X = Double.parseDouble(TN1.getText());
	    	double Y = Double.parseDouble(TN2.getText());
	        TN3.setText(X*Y+"");
	        }});
	 	this.OP4.addActionListener(new ActionListener() { // Button divide,/
	 		
	    	@Override
	        public void actionPerformed(ActionEvent e) {
	    	System.out.println("Divide is clicked"); // CHECK BUTTON
	    	double X = Double.parseDouble(TN1.getText());
		    double Y = Double.parseDouble(TN2.getText());		    
	        TN3.setText(X/Y+""); 
	        }});
	 	this.CLR.addActionListener(this);
	 		
	 	
	 	// Set GUI Window FORM
	 	this.setSize(400,170);
		this.setVisible(true);		 
	}

	// CLEAR Value with Button on Calculator.
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println("All Clear is clicked"); // CHECK BUTTON
		command.equals("clear");
		TN1.setText("");
		TN2.setText("");
		TN3.setText("");
	}
	
	
	// Close Program
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Exit Program"); // CHECK BUTTON
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
		 new GUIArithButton();
	}
}
