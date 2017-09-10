import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
			int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
			String answer = JOptionPane.showInputDialog("Where can you find everything you need and have it delivered the same day?");
			if(answer.equalsIgnoreCase("Amazon")) {
				JOptionPane.showMessageDialog(null,"Correct!");
				score++;
			}else {
				JOptionPane.showMessageDialog(null,"Wrong.");
				JOptionPane.showMessageDialog(null,"The answer is amazon.");
			}
			answer = JOptionPane.showInputDialog("I fly but I never land. What am I?");
			if(answer.equalsIgnoreCase("Time")) {
				JOptionPane.showMessageDialog(null,"Correct!");
				score++;
			}else {
				JOptionPane.showMessageDialog(null,"Wrong.");
				JOptionPane.showMessageDialog(null,"The answer was time.");
			}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
			JOptionPane.showMessageDialog(null, "Your score was: " + score);
	}
}

