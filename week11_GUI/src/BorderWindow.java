import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.BorderLayout;

public class BorderWindow extends Frame {
    private static final long serialVersionUID = 123334L;
    private Label IblNorth ,IblSouth;
    private Button btnEast,btnWest,btncenter;
    public BorderWindow() {
			super("Border window");
			//BorderLayout bl = new BorderLayout();
			//this.setLayout(bl);
			this.setLayout(new BorderLayout());
			this.IblNorth = new Label("Department of computer education",Label.CENTER);
			this.IblSouth = new Label("1518 pracharat1 Rd.wongsawang , Bangsue ,Bangkok 10700");
			this.btncenter = new Button("Center(main content goes here");
			this.btnWest = new Button("West");
			this.btnEast = new Button("East");
			
			this.add(this.IblNorth,BorderLayout.NORTH);
			this.add(this.btncenter,BorderLayout.CENTER);
			this.add(this.IblSouth,BorderLayout.SOUTH);
			this.add(this.btnEast,BorderLayout.EAST);
			this.add(this.btnWest,BorderLayout.WEST);
			// create component object
			this.setSize(600,400);
            this.setVisible(true);			
		}
 
	public static void main(String[] args) {
		new BorderWindow();
	}

}
