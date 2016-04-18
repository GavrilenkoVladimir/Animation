package ua.gvv.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Screen {
	
	private int x = 0;
	private int y = 0;
	private WorkArea wa;
	Screen(){
		JFrame fr = new JFrame();
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(500, 300);
		fr.setLocationRelativeTo(null);
		 JButton b = new JButton("Reset");
		 b.setSize(20, 40);
		 b.addActionListener(new ActionListener() {
		 	
		 	@Override
		 	public void actionPerformed(ActionEvent e) {
		 		if (e.getSource()== b){
		 			wa.score = 0;
		 			wa.mass=0;
		 			wa.l.setText("Score: " + wa.score );
		 			wa.anima(0,0);
		 			x = 0;
		 			y = 0;
		 			b.setFocusable(false);
		 			
		 			
		 		}
		 		
		 	}
		 });
		 fr.getContentPane().add(b, BorderLayout.NORTH);
		 fr.setFocusable(true);
		 wa = new WorkArea(x,y);
		fr.getContentPane().add(wa);
		fr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyTyped(e);
				fr.setFocusable(true);
				if (e.getKeyChar()=='s'){
					if(x<220){
					x+=5;
					wa.anima(x,y);}
				}
				if (e.getKeyChar()=='w'){
					if(x>=20){
					x-=5;
					wa.anima(x,y);}
				}
				if (e.getKeyChar()=='a'){
					if(y>=20){
					y-=5;
					wa.anima(x,y);}
				}
				if (e.getKeyChar()=='d'){
					if(y<440){
					y+=5;
					wa.anima(x,y);}
				}
					
			}
		});
	}
	
	
}
