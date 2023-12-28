package triple;

public class B {
	int x=2;
	void triple () {x=x*3;}
	int returnIt () {return x;}
	class C extends B {
		void triple () {
			x=x+3;
		}
	}

}
