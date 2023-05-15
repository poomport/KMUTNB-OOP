import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestNewWindow extends Frame implements WindowListener {
    private static final long serialVersionUID = 4567L;
    private Button btnTest;
	 
	public TestNewWindow() {
		super("Test New Window");
		this.addWindowListener(this);
		this.btnTest = new Button("Test");
		this.add(this.btnTest);
		
		//ClickHandler ch = new ClickHandler();
		//this.btnTest.addActionListener(ch);
		this.btnTest.addActionListener(new  ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("clickHadler");
		}});
		this.setSize(400,300);
		this.setVisible(true);
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
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
    	new TestNewWindow();
    }
}
