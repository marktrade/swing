package io.robusta.fora.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class CommentView extends JPanel {

	/**
	 * Create the panel.
	 */
	public CommentView() {
		
		JTextPane txtpnIpsemLoret = new JTextPane();
		txtpnIpsemLoret.setText("ipsem loret");
		add(txtpnIpsemLoret);
		
		JLabel lblNewLabel = new JLabel("John");
		lblNewLabel.setIcon(new ImageIcon("F:\\crp\\bdd\\swing\\src\\io\\robusta\\fora\\swing\\images\\user.png"));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\crp\\bdd\\swing\\src\\io\\robusta\\fora\\swing\\images\\dislike.png"));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\crp\\bdd\\swing\\src\\io\\robusta\\fora\\swing\\images\\like.png"));
		add(lblNewLabel_2);
		
		


					
	

	
		

	}

}
