import java.applet.*; 
import java.awt.*; 
import java.awt.Button;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Happy.class" width="500" height="500"> 
</applet> 
*/ 
  
public class Happy extends Applet implements ActionListener { 
    int x=80,x1=70,o=90,o1=120,p=190,p1=120,a=110,a1=130,i=60,i1=60,h=168,h1=108;
    public void init()
    {
        setLayout(null);
        Button button1 = new Button("Right");
        add(button1);
        button1.setBounds(100,20,80,30);
        button1.addActionListener(this);

         Button button2 = new Button("Left");
        add(button2);
        button2.setBounds(10,20,80,30);
        button2.addActionListener(this);

        Button button3 = new Button("Up");
        add(button3);
        button3.setBounds(10,80,80,30);
        button3.addActionListener(this);

        Button button4 = new Button("Down");
        add(button4);
        button4.setBounds(100,80,80,30);
        button4.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
            
        
        if(str.equals("Right"))
        {
            x=x+10;
            o=o+10;
            p=p+10;
            a=a+10;
            i=i+10;
            h=h+10;
        }
        else if(str.equals("Left"))
        {
            x=x-10;
            o=o-10;
            p=p-10;
            a=a-10;
            i=i-10;
            h=h-10;
        }      
        else if(str.equals("Up"))
        {
            x1=x1-10;
            o1=o1-10;
            p1=p1-10;
            a1=a1-10;
            i1=i1-10;
            h1-=10;
        }   
        else if(str.equals("Down"))
        {
            x1=x1+10;
            o1=o1+10;
            p1=p1+10;
            a1=a1+10;
            i1=i1+10;
            h1+=10;
        }            
        repaint();
    }




public void paint(Graphics g) 
    { 
        g.setColor(Color.BLACK);
        g.fillOval(x, x1, 200, 200);//face
        g.setColor(Color.YELLOW); 
        g.fillOval(o, o1, 40, 40);//lefteye
        g.fillOval(p, p1, 40, 40);//righteye
        g.drawArc(a,a1,90,90,0,-180);//mouth
        g.drawLine( 160,120,160,170);//nose  
		
	

    }  

}
