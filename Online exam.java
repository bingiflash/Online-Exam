//papers should prepared 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.Graphics;
import java.applet.*;
import java.net.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class lufmonvencodejam11 
extends Frame
implements ActionListener,WindowListener
{

public void paint(Graphics g)
{
cp++;
if(d!=1||cm==1)
if(cp==1)
isr1.paintIcon(this,g,285,30);
else 
isr2.paintIcon(this,g,0,40);

}

int i=0,v=50,v1=50,cb=0,cts=0,ctm=0,m=0,c,cs=0,cd=0,cm=0,d=0,wc=0,cp=0;

int ran[]=new int[10];

String stu=new String("AbhiRam");

//BufferedImage im,isr1,isr2;

ImageIcon ic = new ImageIcon("tu1.gif");
ImageIcon isr1= new ImageIcon("srcj1.jpg");
ImageIcon isr2= new ImageIcon("sr.jpg");

JRadioButton r[][]=new JRadioButton[10][4];

Color co1=new Color(226,211,211);

Font f=new Font("helevetica",Font.BOLD,30);
Font f1=new Font("serif",Font.BOLD,21);
Font f2=new Font("helevetica",Font.BOLD,15);
Font f3=new Font("Gabriola",Font.PLAIN,50);

FocusListener fl=new FocusListener()
{

public void focusGained(FocusEvent e)
{
te.setText("");
}

public void focusLost(FocusEvent e){}

};

Timer ti1=new Timer(1000,this);
Timer ti2=new Timer(60000,this);

Button bs= new Button("submit");
Button b= new Button("start");
Button br= new Button("result");
Button bw=new Button("Instructions");

TextField te=new TextField("password");

Label lr1=new Label();
Label lr2=new Label("In 10 min we will inform you about your eligibility for second round");

Label ls1=new Label("Thanks for participating in this exam");
Label ls2=new Label("click 'result' button to know your result");

Label l[]=new Label[10];
Label lo[]=new Label[4];

Label ls=new Label();
Label lm=new Label();

Label li=new Label(stu);

Panel p=new Panel();

TextArea ta=new TextArea("Instructions:\n\n1.click 'start' button to start the exam.\n2.timer will be for 10 min after 10 min your answers will be locked.\n3.enter your answers in specified boxes as 1/2/3/4.\n4.Try to attempt every question as there is no negative marking.\n5.click submit buton whenever you want to submit your answers\n6.if you have any problem ,please contact the coordinator for help.\n\nCaution:\n\n1.Strictly don't use winows buttons(minimize,maximize,close)\n2.don't close command prompt.");

lufmonvencodejam11()
{

ButtonGroup bg[]=new ButtonGroup[10];

p.setBounds(1050,135,100,500);
p.setLayout(new GridLayout(10,5));

setVisible(true);
setTitle("CODEJAM");
setLayout(null);

addWindowListener(this);

for(i=0;i<10;i++)
{
bg[i]=new ButtonGroup();
for(int j=0;j<4;j++)
{
r[i][j]=new JRadioButton();
bg[i].add(r[i][j]);
p.add(r[i][j]);
}
}

ran[0]=4;
ran[1]=2;
ran[2]=3;
ran[3]=2;
ran[4]=1;
ran[5]=2;
ran[6]=3;
ran[7]=2;
ran[8]=4;
ran[9]=3;

li.setFont(new Font("serif",Font.BOLD,60));
li.setForeground(new Color(255,0,0));
li.setBounds(550,570,650,70);
add(li);


lr1.setBounds(200,300,600,40);
add(lr1);
lr1.setFont(f);
lr1.setVisible(false);

lr2.setBounds(200,350,1000,40);
add(lr2);
lr2.setFont(f);
lr2.setVisible(false);

ls1.setBounds(200,300,600,40);
add(ls1);
ls1.setFont(f);
ls1.setVisible(false);

ls2.setBounds(200,350,1000,40);
add(ls2);
ls2.setFont(f);
ls2.setVisible(false);

/*try
{
im=ImageIO.read(new File("im.jpg"));
isr1=ImageIO.read(new File("C:\\Users\\bingi\\Desktop\\java1\\srcj1.jpg"));
isr2=ImageIO.read(new File("sr.jpg"));
}
catch(IOException e){}*/

ta.setBounds(10,120,1000,605);
ta.setFont(f1);
ta.setBackground(co1);
ta.setEditable(false);

ls.setBounds(1210,30,50,50);
ls.setFont(new Font("serif",Font.BOLD,30));
add(ls);

lm.setBounds(1170,30,50,50);
lm.setFont(new Font("serif",Font.BOLD,30));
add(lm);

b.setBounds(1120,640,100,30);
b.addActionListener(this);
b.setActionCommand("1");

br.setBounds(1120,640,100,30);
br.addActionListener(this);
br.setActionCommand("4");

bs.setBounds(1120,640,100,30);
bs.addActionListener(this);
bs.setActionCommand("5");
add(bs);
bs.setVisible(false);

bw.setBounds(1120,640,100,30);
bw.addActionListener(this);
bw.setActionCommand("6");
add(bw);

te.setBounds(1150,300,100,30);
te.setFont(f1);
te.addFocusListener(fl);

for(i=0;i<10;i++)
{
l[i]=new Label(i+1+".");
l[i].setFont(new Font("helevetica",Font.BOLD,15));
l[i].setBounds(1025,155+(i*50),22,12);
}

for(i=0;i<4;i++)
{
lo[i]=new Label((char)(i+97)+"");
lo[i].setFont(new Font("helevetica",Font.BOLD,15));
lo[i].setBounds(1053+(i*25),118,22,12);
}

ti1.setActionCommand("2");

ti2.setActionCommand("3");

for(i=0;i<10;i++)
{
add(l[i]);
l[i].setVisible(false);
}

setBounds(0,0,1500,1500);
setExtendedState(JFrame.MAXIMIZED_BOTH);
}

public void actionPerformed(ActionEvent e)
{

int k=Integer.parseInt(e.getActionCommand());

switch(k)
{
case 1:	b.setVisible(false);
        ls.setText("00");
        lm.setText("00");
        for(i=0;i<10;i++)
        {
        l[i].setVisible(true);
        }
      	bs.setVisible(true);
      	ti1.start();
       	ti2.start();
      	for(i=0;i<10;i++)
       	add(l[i]);
     	for(i=0;i<4;i++)
      	add(lo[i]);
      	add(p);
      	setBounds(0,0,1500,1500);
      	setExtendedState(JFrame.MAXIMIZED_BOTH);
       	ta.setText("QUESTIONS");
       	break;
case 2:	cts++;
       	if(cts==60)
       	{
       	cts=0;
       	ls.setText("00");
      	}
      	else
       	{
       	if(cts<10)
       	ls.setText("0"+cts);
      	else
      	ls.setText(""+cts);
      	}
      	break;
case 3:	ctm++;
       	if(ctm==3)
       	{
       	ti1.stop();
       	ti2.stop();
      	ta.setVisible(false);
       	p.setVisible(false);
       	for(i=0;i<10;i++)
      	l[i].setVisible(false);
       	for(i=0;i<4;i++)
       	lo[i].setVisible(false); p.setVisible(false);
      	for(i=0;i<10;i++)
       	l[i].setVisible(false);
       	for(i=0;i<4;i++)
       	lo[i].setVisible(false);
      	bs.setVisible(false);
       	lm.setText("0"+ctm);
      	ls.setText("00");
      	JOptionPane.showMessageDialog(this,"OOPS\nTime up..........","ENDING MESSAGE", JOptionPane.INFORMATION_MESSAGE, ic);
      	ls1.setVisible(true);
      	ls2.setVisible(true);
       	add(br);       
	}
       	else if(ctm==2)
      	{
      	JOptionPane.showMessageDialog(null,"YOU HAVE ONLY ONE MINUTE LEFT");
      	lm.setText("0"+ctm);
      	}
       	else
       	lm.setText("0"+ctm);
      	break;
case 4:	m=0;
      	for(i=0;i<10;i++)
       	{
     	if(r[i][ran[i]-1].isSelected())
      	m++;
      	}
                   lr1.setText("Your result is "+m+" out of 10");
      	lr1.setVisible(true);
       	lr2.setVisible(true);
      	br.setVisible(false);
	break;
case 5:	cs++;
      	ti1.stop();
      	ti2.stop();
       	bs.setVisible(false);
       	p.setVisible(false);
       	for(i=0;i<10;i++)
       	l[i].setVisible(false);
       	for(i=0;i<4;i++)
       	lo[i].setVisible(false);
     	ta.setVisible(false);
       	ls1.setVisible(true);
      	ls2.setVisible(true);
       	add(br);
       	break;
case 6: repaint();
      	li.setFont(f);
     	li.setBounds(850,30,320,50);
     	bw.setVisible(false);
     	add(b);
     	add(ta);
      	break;
	}      
	}
public void windowClosed(WindowEvent e) {}

public void windowClosing(WindowEvent e) 
{
wc++;
if(wc==1)
add(te);
else
{
if((te.getText().compareTo("password"))==0)
System.exit(1);
else
{
if(d==0)
{
cd++;
if(cd==1)
{
JOptionPane.showMessageDialog(null, "You cannot close exam\nif you click once again you will be disqualified for the exam","Inane warning",JOptionPane.WARNING_MESSAGE);
}
else
{
ti1.stop();
ti2.stop();
br.setVisible(false);
bs.setVisible(false);
b.setVisible(false);
d=1;
repaint();
p.setVisible(false);
for(i=0;i<10;i++)
l[i].setVisible(false);
for(i=0;i<4;i++)
lo[i].setVisible(false);
ta.setVisible(false);
ls.setVisible(false);
lm.setVisible(false);
li.setText(stu+" disqualified");
li.setBounds(400,300,500,50);
 li.setFont(f);
li.setVisible(true);
te.setLocation(400,350);
bw.setVisible(false);
ls1.setVisible(false);
ls2.setVisible(false);
lr1.setVisible(false);
lr2.setVisible(false);
JOptionPane.showMessageDialog(null,"YOU ARE DISQUALIFIED BECAUSE YOU PRESSED CLOSE BUTTON TWICE","WE ARE SORRY",JOptionPane.ERROR_MESSAGE);
}
}
}
}
}

public void windowOpened(WindowEvent e) {}

public void windowIconified(WindowEvent e) {
if(d==0)
{
cm++;
if(cm==1)
{
cp--;
JOptionPane.showMessageDialog(null, "You cannot minimize exam\nif you click once again you will be disqualified for the exam","Inane warning",JOptionPane.WARNING_MESSAGE);
}
else
{
ti1.stop();
ti2.stop();
br.setVisible(false);
bs.setVisible(false);
d=1;
b.setVisible(false);
p.setVisible(false);
for(i=0;i<10;i++)
l[i].setVisible(false);
for(i=0;i<4;i++)
lo[i].setVisible(false);
ta.setVisible(false);
ls.setVisible(false);
lm.setVisible(false);
li.setText(stu+" disqualified");
li.setFont(f);
li.setBounds(400,300,500,50);
li.setVisible(true);
te.setLocation(400,350);
bw.setVisible(false);
ls1.setVisible(false);
ls2.setVisible(false);
lr1.setVisible(false);
lr2.setVisible(false);
JOptionPane.showMessageDialog(null,"YOU ARE DISQUALIFIED BECAUSE YOU PRESSED MINIMIZE BUTTON TWICE","WE ARE SORRY",JOptionPane.ERROR_MESSAGE);
}
}
}

public void windowDeiconified(WindowEvent e) {}

public void windowActivated(WindowEvent e) {}

public void windowDeactivated(WindowEvent e) {}

public void windowGainedFocus(WindowEvent e) {}

public void windowLostFocus(WindowEvent e) {}

public void windowStateChanged(WindowEvent e) {}

public static void main(String args[])
{
new lufmonvencodejam11();
}
}