import java.awt.Color;

import javax.swing.*;

public class MyFrame extends JFrame {

	GraphicsDemo graphicDemo = new GraphicsDemo();
	
	public MyFrame() {
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(graphicDemo);
		this.setVisible(true);
	}
	
	public MyFrame(Vector2 Size) {
		
		this.setSize(Size.X, Size.Y);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
