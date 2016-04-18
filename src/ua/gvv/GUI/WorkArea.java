package ua.gvv.GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WorkArea extends JPanel {
	
	protected int x, y;
	protected int x1,y1;
	protected int mass = 0;
	protected int score = 0;
	protected JLabel l;
	WorkArea(int x, int y){
		super();
		this.x = x;
		this.y = y;
		x1 = (int)( Math.random()*(40-12)+12)*5;
		y1 = (int) (Math.random()*(68-16)+16)*5;
		setSize(500, 300);
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		setBackground(Color.GRAY);
		l = new JLabel("Score: "+ score);
		add(l);
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(x==x1){
			if(y==y1){
			score++;
			mass+=5;
			l.setText("Score: "+ score);
			x1 = (int)( Math.random()*(40-12)+12)*5;
			y1 = (int) (Math.random()*(68-16)+16)*5;
		System.out.println("Red check y");}	
			System.out.println("Red check x");}	
		
		g.drawRect(70, 50, 300, 180);
		g.setColor(Color.red);
		g.fillRect(y1, x1, 10, 10);
		g.setColor(Color.BLACK);
		g.fillRect(y, x, 20+mass, 20+mass);	
		System.out.println("Check paint" + x1 +" " + y1);
		
		
	}
	public void anima(int x,int y){
			this.x =x;
			this.y =y;
			
			repaint();
		System.out.println(x +" "+y);
	}

}
