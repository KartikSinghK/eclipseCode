package qu12;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class College extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;
	String name = "Kartik", rollNum = "20", course = "Computer Science", college = "Aryabhatta College";
	String msg = "";
	String cgpa = "9.09";
	Button ButtonA,ButtonB;
    College(){
        
    	ButtonA=new Button("A");
    	ButtonB=new Button("B");
		ButtonA.setBounds(120, 200, 100, 30);
		ButtonB.setBounds(230, 200, 100, 30);
		add(ButtonA);add(ButtonB);
		ButtonA.addActionListener(this);
		ButtonB.addActionListener(this);
    	
    }
    public void actionPerformed(ActionEvent a) {
    	if(a.getSource() == ButtonA) {
    		msg =  name + ", "  + rollNum + ", " + course  + ", " +  college;
    		repaint();
    	}
    	else if(a.getSource() == ButtonB) {
    		msg = "CGPA : " + cgpa;
    		repaint();
    	}
    }
    public void paint(Graphics g) {
    	g.drawString(msg, 20, 100);
    }
	public static void main(String[] args) {
		College c = new College();
	    c.setSize(500, 500);
	    c.setTitle("College Data");
	    c.setVisible(true);
        c.setLayout(new FlowLayout());
	    c.addWindowListener(new WindowAdapter() {
    		public void windowClosing(WindowEvent w) {
    			System.exit(0);
    		}
    	});
	}

}