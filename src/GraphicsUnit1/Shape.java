package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import static java.awt.Color.BLACK;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
                yPos = y;
                width = wid;
                height = ht;
                color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.drawRect(xPos, yPos, width, height);
      window.fillOval(xPos + 1, yPos + 1, width - 1 , height - 1);
      
      window.setColor(BLACK);
      window.drawLine(xPos, yPos, xPos + width, yPos + height);
      
      window.setColor(BLACK);
      window.drawLine(xPos + width, yPos, xPos, yPos + height);
      
      window.setColor(BLACK);
      window.fillRect(xPos + width/2, yPos + height/2, width/2 , height/2);
      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}