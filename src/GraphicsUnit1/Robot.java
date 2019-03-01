package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      //call other methods
      upperBody(window);
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);
      window.fillOval(300, 100, 200, 100);

      window.setColor(Color.GREEN);
      window.fillOval(350, 110, 20, 20);
      window.fillOval(400, 110, 20, 20);
      
      window.setColor(Color.BLACK);
      window.fillOval(370, 130, 20, 20);
      
      window.setColor(Color.RED);
      window.drawLine(350, 170, 400, 170);
		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
       window.setColor(Color.BLUE);
       window.fillRect(300, 200, 200, 100);
       window.drawLine(300, 210, 250, 170);
       window.drawLine(500, 210, 550, 170);
		//add more code here
   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.BLACK);
       window.fillRect(300, 320, 200, 100);
       window.drawLine(300, 410, 250, 450);
       window.drawLine(500, 410, 550, 450);
		//add more code here

   }
}