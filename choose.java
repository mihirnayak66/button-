import java.awt.*;
import java.awt.event.*;
class choose extends Frame
{
  Checkbox c;
  TextField tf;
   choose()
   {
 this.addWindowListener( new WindowAdapter()
  {
    public void windowClosing(WindowEvent we)
	{
	  System.exit(0);
	}
	});
	
	c=new Checkbox("BIKE");
	tf=new TextField(10);
	Choice c1=new Choice();
	c1.setBounds(100,100,80,80);
	c1.add("HONDA");
	c1.add("BMW");
	c1.add("KTM");
	c1.add("ROYAL ENFIELD");
	this.add(c);
	this.add(tf);
	this.add(c1);
	this.setLayout(new FlowLayout());
	
	
}
  public static void main(String [] args)
  {
    choose ob =new choose();
	ob.setSize(500,500);
	ob.setTitle("select the Bike");
	ob.setVisible(true);
	
	
	}
	
}
