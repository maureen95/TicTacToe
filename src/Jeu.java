import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Sophie Guillot
 */
public class Jeu extends JFrame {
	public Jeu() {
		initComponents();
	}

	private void b1ActionPerformed(ActionEvent e) {

	}

	private void b2ActionPerformed(ActionEvent e) {

	}

	private void b3ActionPerformed(ActionEvent e) {

	}

	private void b4ActionPerformed(ActionEvent e) {

	}

	private void b5ActionPerformed(ActionEvent e) {

	}

	private void b6ActionPerformed(ActionEvent e) {

	}

	private void b7ActionPerformed(ActionEvent e) {

	}

	private void b8ActionPerformed(ActionEvent e) {

	}

	private void b9ActionPerformed(ActionEvent e) {

	}

	private void initComponents() {

		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();

		setTitle("Morpion");
		Container contenu = getContentPane();

		// ---- b1 ----
		b1.setText("1");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b1ActionPerformed(e);
			}
		});

		// ---- b2 ----
		b2.setText("2");
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b2ActionPerformed(e);
			}
		});

		// ---- b3 ----
		b3.setText("3");
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b3ActionPerformed(e);
			}
		});

		// ---- b4 ----
		b4.setText("4");
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b4ActionPerformed(e);
			}
		});

		// ---- b5 ----
		b5.setText("5");
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b5ActionPerformed(e);
			}
		});

		// ---- b6 ----
		b6.setText("6");
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b6ActionPerformed(e);
			}
		});

		// ---- b7 ----
		b7.setText("7");
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b7ActionPerformed(e);
			}
		});

		// ---- b8 ----
		b8.setText("8");
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b8ActionPerformed(e);
			}
		});

		// ---- b9 ----
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b9ActionPerformed(e);
			}
		});

		GridLayout layout = new GridLayout(3,3);
		contenu.setLayout(layout);
		contenu.add(b1);
		contenu.add(b2);
		contenu.add(b3);
		contenu.add(b4);
		contenu.add(b5);
		contenu.add(b6);
		contenu.add(b7);
		contenu.add(b8);
		contenu.add(b9);
																		
	
	}

	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
}