package Snock;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Display {
	
	private String title;
	private int width;int height;
	
	private JFrame frame;
	private Dimension d;
	private Canvas canvas;
	
	Display(String title,int width,int height){
		this.title=title;
		this.width=width;
		this.height=height;
		createDisplay();
	}
	
	private void createDisplay(){
		
		frame=new JFrame(title);
		frame.setSize(width,height);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		d=new Dimension(width,height);
		canvas=new Canvas();
		canvas.setPreferredSize(d);
		canvas.setMaximumSize(d);
		canvas.setMinimumSize(d);
		canvas.setFocusable(false);
		
		frame.add(canvas);
		frame.pack();
		
	}
	
	public Canvas getCanvas(){
		return canvas;
	}
	
	public  JFrame getFrame(){
		return frame;
	}
	
}
