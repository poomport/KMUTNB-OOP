import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Button;
import java .awt.Label;
// grid layout

public class loginwindow extends Frame {
	//properties
    private static final long serialVersionUID =34668800L;
    private TextField txtUser,txtPass;
    private Button btnlogin;
	
    public loginwindow() {
    	super("login page");
    	
    	/***set grid layout***/
    	this.setLayout(new GridLayout(3,2));
    	
    	
    	// create component object
    	this.txtUser = new TextField("",16);
    	this.txtPass = new TextField("",16);
    	this.txtPass.setEchoChar('*');
    	this.btnlogin = new Button("login");
    	
    	this.add(new Label("User:")); //1st row col
    	this.add(this.txtUser); //1st roe 2nd col
    	this.add(new Label("Pass:")); // 2nd row 1st col
    	this.add(this.txtPass); 
    	this.add(new Label(""));
    	this.add(btnlogin);
    	this.setSize(250,200);
    	this.setVisible(true);
    }
    
	public static void main(String[] args) {
		new loginwindow();

	}

}
