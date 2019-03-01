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

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);
      window.fillRect( 200, 200, 400, 400 );
      
      window.setColor(Color.GREEN);
      window.fillRect( 150, 150, 500, 50 );
      
      window.setColor(Color.YELLOW);
      window.fillRect( 250, 250, 100, 100 );
      
      window.setColor(Color.YELLOW);
      window.fillRect( 450, 250, 100, 100 );
      
      window.setColor(Color.WHITE);
      window.fillRect( 400, 450, 50, 150 );
   }
}