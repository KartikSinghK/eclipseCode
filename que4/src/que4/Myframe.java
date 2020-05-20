package que4;
import java.awt.*;
import java.awt.event.*;
public class Myframe extends Frame implements ActionListener
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField tf; Label l; Button B1,B2;
	Myframe()
	{
		l = new Label("ENTER COLOR:(red,yellow,green,orange,blue)");
		l.setBounds(100,150, 300,200);
		tf = new TextField();
		tf.setBounds(150,100,150,20);
		B1=new Button("SAVE COLOR" );
		B2=new Button("CHANGE COLOR");
		B1.setBounds(120, 200, 100, 30);
		B2.setBounds(230, 200, 100, 30);
		add(B1);add(B2);add(tf);add(l);
		B1.addActionListener(this);
		B2.addActionListener(this);
		
		
		
	}    
	    public void actionPerformed(ActionEvent e)
	    {
            String s1 = new String("red");
            String s2 = new String("orange");
            String s3 = new String("blue");
            String s4 = new String("yellow");
            String s5 = new String("green");
            String s = tf.getText();
            if(e.getSource() == B1)
            {
            	l.setText("COLOR SAVED ... ");
            	l.setBounds(250,300,120,500);
            }
             if(e.getSource() == B2)
            {
            	if(s1.equals(s) == true)
            	{
            		setBackground(Color.red);
            	}
            	else if(s2.equals(s) == true)
            	{
            		setBackground(Color.orange);
            	}
            	else if(s3.equals(s) == true)
            	{
            		setBackground(Color.blue);
            	}
            	else if(s4.equals(s) == true)
            	{
            		setBackground(Color.yellow);
            	}
            	else if(s5.equals(s) == true)
            	{
            		setBackground(Color.green);
            	}
            	l.setText("COLOR CHANGED ... ");
            	l.setBounds(100,300,120,50);
            }	
            	
            	
	    }   
	    
	    
	    	
        public static void main(String[] args) 
	    {
              Myframe my = new Myframe();
              my.setTitle("New Frame");
              my.setSize(500,500);
      	      my.setLayout(null);
      	      my.setVisible(true);
      	    my.addWindowListener(new WindowAdapter()
            {
                 public void windowClosing(WindowEvent e)
                 {
                     System.exit(0);
                 }
             });
	    }

}
