
public class test {

	public static boolean playerTurn = true;
	public static boolean playerWon = false;
	public static boolean computerWon = false;
	
	public static Jeu board = new Jeu();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Jeu jeu1 = new Jeu();
		if (board.isVisible() == false) {
			board.setSize(300,300);
			board.setVisible(true);
		}
	}

	public static void checkforwin() {
		if (board.b1.getText().equals("X")) {
			if (board.b4.getText().equals("X")) {
				if (board.b7.getText().equals("X")) {
					playerWon = true;
					computerWon = false;
					System.out.println("Le joueur a gagné !");
				}
			}
		}
		
		if (board.b1.getText().equals("X")) {
			if (board.b2.getText().equals("X")) {
				if (board.b3.getText().equals("X")) {
					playerWon = true;
					computerWon = false;
					System.out.println("Le joueur a gagné !");
				}
			}
		}
		
		if (board.b1.getText().equals("X")) {
			if (board.b5.getText().equals("X")) {
				if (board.b9.getText().equals("X")) {
					playerWon = true;
					computerWon = false;
					System.out.println("Le joueur a gagné !");
				}
			}
		}
		
		if (board.b2.getText().equals("X")) {
			if (board.b5.getText().equals("X")) {
				if (board.b8.getText().equals("X")) {
					playerWon = true;
					computerWon = false;
					System.out.println("Le joueur a gagné !");
				}
			}
		}
		
		if (board.b3.getText().equals("X")) {
			if (board.b6.getText().equals("X")) {
				if (board.b9.getText().equals("X")) {
					playerWon = true;
					computerWon = false;
					System.out.println("Le joueur a gagné !");
				}
			}
		}
		
		if (board.b3.getText().equals("X")) {
			if (board.b5.getText().equals("X")) {
				if (board.b7.getText().equals("X")) {
					playerWon = true;
					computerWon = false;
					System.out.println("Le joueur a gagné !");
				}
			}
		}
		
		if (board.b4.getText().equals("X")) {
			if (board.b5.getText().equals("X")) {
				if (board.b6.getText().equals("X")) {
					playerWon = true;
					computerWon = false;
					System.out.println("Le joueur a gagné !");
				}
			}
		}
		
		if (board.b7.getText().equals("X")) {
			if (board.b8.getText().equals("X")) {
				if (board.b9.getText().equals("X")) {
					playerWon = true;
					computerWon = false;
					System.out.println("Le joueur a gagné !");
				}
			}
		}
		
		if (board.b1.getText().equals("O")) {
			if (board.b4.getText().equals("O")) {
				if (board.b7.getText().equals("O")) {
					playerWon = false;
					computerWon = true;
					System.out.println("L'ordinateur a gagné !");
				}
			}
		}
		
		if (board.b1.getText().equals("O")) {
			if (board.b2.getText().equals("O")) {
				if (board.b3.getText().equals("O")) {
					playerWon = false;
					computerWon = true;
					System.out.println("L'ordinateur a gagné !");
				}
			}
		}
		
		if (board.b1.getText().equals("O")) {
			if (board.b5.getText().equals("O")) {
				if (board.b9.getText().equals("O")) {
					playerWon = false;
					computerWon = true;
					System.out.println("L'ordinateur a gagné !");
				}
			}
		}
		
		if (board.b2.getText().equals("O")) {
			if (board.b5.getText().equals("O")) {
				if (board.b8.getText().equals("O")) {
					playerWon = false;
					computerWon = true;
					System.out.println("L'ordinateur a gagné !");
				}
			}
		}
		
		if (board.b3.getText().equals("O")) {
			if (board.b6.getText().equals("O")) {
				if (board.b9.getText().equals("O")) {
					playerWon = false;
					computerWon = true;
					System.out.println("L'ordinateur a gagné !");
				}
			}
		}
		
		if (board.b3.getText().equals("O")) {
			if (board.b5.getText().equals("O")) {
				if (board.b7.getText().equals("O")) {
					playerWon = false;
					computerWon = true;
					System.out.println("L'ordinateur a gagné !");
				}
			}
		}
		
		if (board.b4.getText().equals("O")) {
			if (board.b5.getText().equals("O")) {
				if (board.b6.getText().equals("O")) {
					playerWon = false;
					computerWon = true;
					System.out.println("L'ordinateur a gagné !");
				}
			}
		}
		
		if (board.b7.getText().equals("O")) {
			if (board.b8.getText().equals("O")) {
				if (board.b9.getText().equals("O")) {
					playerWon = false;
					computerWon = true;
					System.out.println("L'ordinateur a gagné !");
				}
			}
		}
		if(playerWon == true || computerWon == true) {
			board.setVisible(false);
		}
	}
}
