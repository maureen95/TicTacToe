import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Sophie Guillot, Aline Hudry & Maureen Ravanel
 */
public class Jeu extends JFrame {
	
	public Jeu() {
		initComponents();
	}

	public JButton b1;
	public JButton b2;
	public JButton b3;
	public JButton b4;
	public JButton b5;
	public JButton b6;
	public JButton b7;
	public JButton b8;
	public JButton b9;

	public void b1ActionPerformed(ActionEvent e) {
		if(b1.getText().equals("")) {
			if (test.playerTurn == true) {
				b1.setText("X");
				test.checkforwin();
				test.playerTurn = false;
			} else {
				b1.setText("O");
				test.checkforwin();
				test.playerTurn = true;
			}
		}
	}

	public void b2ActionPerformed(ActionEvent e) {
		if(b2.getText().equals("")) {
			if (test.playerTurn == true) {
				b2.setText("X");
				test.checkforwin();
				test.playerTurn = false;
			} else {
				b2.setText("O");
				test.checkforwin();
				test.playerTurn = true;
			}
		}
	}

	public void b3ActionPerformed(ActionEvent e) {
		if(b3.getText().equals("")) {
			if (test.playerTurn == true) {
				b3.setText("X");
				test.checkforwin();
				test.playerTurn = false;
			} else {
				b3.setText("O");
				test.checkforwin();
				test.playerTurn = true;
			}
		}
	}

	public void b4ActionPerformed(ActionEvent e) {
		if(b4.getText().equals("")) {
			if (test.playerTurn == true) {
				b4.setText("X");
				test.checkforwin();
				test.playerTurn = false;
			} else {
				b4.setText("O");
				test.checkforwin();
				test.playerTurn = true;
			}
		}
	}

	public void b5ActionPerformed(ActionEvent e) {
		if(b5.getText().equals("")) {
			if (test.playerTurn == true) {
				b5.setText("X");
				test.checkforwin();
				test.playerTurn = false;
			} else {
				b5.setText("O");
				test.checkforwin();
				test.playerTurn = true;
			}
		}
	}

	public void b6ActionPerformed(ActionEvent e) {
		if(b6.getText().equals("")) {
			if (test.playerTurn == true) {
				b6.setText("X");
				test.checkforwin();
				test.playerTurn = false;
			} else {
				b6.setText("O");
				test.checkforwin();
				test.playerTurn = true;
			}
		}
	}

	public void b7ActionPerformed(ActionEvent e) {
		if(b7.getText().equals("")) {
			if (test.playerTurn == true) {
				b7.setText("X");
				test.checkforwin();
				test.playerTurn = false;
			} else {
				b7.setText("O");
				test.checkforwin();
				test.playerTurn = true;
			}
		}
	}

	public void b8ActionPerformed(ActionEvent e) {
		if(b8.getText().equals("")) {
			if (test.playerTurn == true) {
				b8.setText("X");
				test.checkforwin();
				test.playerTurn = false;
			} else {
				b8.setText("O");
				test.checkforwin();
				test.playerTurn = true;
			}
		}
	}

	public void b9ActionPerformed(ActionEvent e) {
		if(b9.getText().equals("")) {
			if (test.playerTurn == true) {
				b9.setText("X");
				test.checkforwin();
				test.playerTurn = false;
			} else {
				b9.setText("O");
				test.checkforwin();
				test.playerTurn = true;
			}
		}
	}

	public void initComponents() {

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
		b1.setText("");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b1ActionPerformed(e);
			}
		});

		// ---- b2 ----
		b2.setText("");
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b2ActionPerformed(e);
			}
		});

		// ---- b3 ----
		b3.setText("");
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b3ActionPerformed(e);
			}
		});

		// ---- b4 ----
		b4.setText("");
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b4ActionPerformed(e);
			}
		});

		// ---- b5 ----
		b5.setText("");
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b5ActionPerformed(e);
			}
		});

		// ---- b6 ----
		b6.setText("");
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b6ActionPerformed(e);
			}
		});

		// ---- b7 ----
		b7.setText("");
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b7ActionPerformed(e);
			}
		});

		// ---- b8 ----
		b8.setText("");
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b8ActionPerformed(e);
			}
		});

		// ---- b9 ----
		b9.setText("");
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
}