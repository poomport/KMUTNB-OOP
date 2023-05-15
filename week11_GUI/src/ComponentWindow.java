import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


public class ComponentWindow extends Frame {
    private static final long serialVersionUID = 342567L;
    public ComponentWindow() {
    	super("Java Component");
    	
    	
    	// Set Layout Manage(Flowlayout) //comment top
        FlowLayout fl = new FlowLayout();
    	this.setLayout(fl);
    	// create component object
    	Label lbtCount = new Label("Count:",1); // create object of label
    	TextField txtCount = new TextField("0",15);
    	Button btnCount = new Button("CED Count");
    	
    	
    	// Add component Object onto Frame
    	super.add(lbtCount);
    	super.add(txtCount);
    	super.add(btnCount);
    	super.setSize(400, 120);
    	super.setVisible(true); //แนะนำท้ายmac
    }
	public static void main(String[] args) {
		
		new ComponentWindow();

	}

}
