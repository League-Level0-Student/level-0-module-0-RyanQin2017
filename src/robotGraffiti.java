import org.jointheleague.graphical.robot.Robot;

public class robotGraffiti {
	public static void main(String[] args) {
		Robot r = new Robot ();
		r.hide();
		r.sparkle();
		r.setY(500);
		r.setX(300);
		r.penDown();
		r.setSpeed(10);
		r.move(400);
		r.turn(90);
		r.move(200);
		r.turn(90);
		r.move(200);
		r.turn(90);
		r.move(200);
		r.turn(225);
		r.move(300);
		
	}
}
