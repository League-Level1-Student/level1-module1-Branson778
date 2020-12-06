package _04_popcorn;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn b = new Popcorn("Gamer's Mix");
	Microwave c = new Microwave();
	c.putInMicrowave(b);
	c.setTime(10);
	c.startMicrowave();
	
}
}
