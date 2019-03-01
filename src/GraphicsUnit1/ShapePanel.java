package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import static java.awt.Color.BLUE;
import static java.awt.Color.YELLOW;
import static java.awt.Color.GREEN;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		//instantiate a Shape
                Shape s1 = new Shape(100, 100, 100, 100, YELLOW);
                s1.draw(window);
		//tell your shape to draw

		//instantiate a Shape
		//tell your shape to draw
                Shape s2 = new Shape(100, 300, 200, 200, GREEN);
                s2.draw(window);
		//instantiate a Shape
		//tell your shape to draw
                Shape s3 = new Shape(400, 300, 50, 50, BLUE);
                s3.draw(window);
	}
}