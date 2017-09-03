import javax.swing.JOptionPane;

public class Quiz_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		String firstAnswer;
			firstAnswer = JOptionPane.showInputDialog("What is 5*5*5*5*5? ");
		if(firstAnswer.equalsIgnoreCase("3125")) {
		JOptionPane.showMessageDialog(null, "Correct!");
		score++;
		}else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		firstAnswer = JOptionPane.showInputDialog("What is 4*4*4*4? ");
		if(firstAnswer.equalsIgnoreCase("256")) {
		JOptionPane.showMessageDialog(null, "Correct!");
		score++;
		}else {
				JOptionPane.showMessageDialog(null, "Wrong!");
		}
		firstAnswer = JOptionPane.showInputDialog("What is 6*6*6*6*6*6? ");
		if(firstAnswer.equalsIgnoreCase("46656")) {
		JOptionPane.showMessageDialog(null, "Correct!");
		score++;
		}else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		System.out.println("Your score was " + score + ".");
		if(score == 3) {
			JOptionPane.showMessageDialog(null, "You got a perfect score! :) :) :) :)");
			
		}
		
	}
}
