package javaprograming;

public class workshop {
	static int a = 0;
	float b = 0.1f;
	boolean c;
	short a1 = 2;
	long a2;
	byte a3;
	char d;
	double g;
	String str;
	Bird b1;
	Integer i;
	Float f1;
	Boolean c1;
	Long l1;
	Double d1;
	Byte b2;
	Short s;
	Character ch;
	static Bird penguinBird;
	final int FINAL = 10;
	
  public static void main(String args[]) {
	System.out.println("hello world");
	a = 20;
	penguinBird = new Bird();
	penguinBird.a = 10;
	penguinBird.name = "penguin";
	Bird parrot = new Bird();
	parrot.a = 20;
	parrot.name = "parrot";
	Bird duck = new Bird();
	duck.a = 30;
	duck.name = "duck";
	
	System.out.println(penguinBird.a + " " + parrot.a + " " + duck.a + " " + Bird.a);
	System.out.println(penguinBird.name + " " + parrot.name + " " + duck.name);
	penguinBird.eat();
	penguinBird.name = "penguin";
	
  }
}
class Bird{
	static int a;
	String name;
	String color;
	String species;
	
	void fly() {
		
	}
	void swing() {
		
	}
    void eat() {
    	
    }
}