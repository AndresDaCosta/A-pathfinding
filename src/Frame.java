import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class Frame extends JPanel
	implements ComponentListener{

	JLabel label;
	JFrame window;
	
	public Frame(){
		
		window = new JFrame();
		
		window.setContentPane(this);
		window.addComponentListener(this);
		
		window.setSize(500, 500);
		window.setVisible(true);
		
		paint(null);
		
		
	}
	public void paint(Graphics g) {
		
		int width = this.getWidth();
		int height = this.getHeight();
		
		
		
		for(int i = 0 ; i <=  width; i = i + 100) {
			
			for( int x = 0; x <= height; x = x +100 ) {
				
				
				g.drawRect(i, x, 100, 100);
				
			}
			
		}
		
	}
	
	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		
		int width, heigth;
		
		width = this.getWidth();
		heigth = this.getHeight();
		
		System.out.println(width + "  x " + heigth);
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main (String[] args) {
		
	 new Frame();
	 
	System.out.println("hola");	
		
		
	}
	
	
	

}
