package core_java;

public class Constructor {

	Constructor(){
		System.out.println("hello form constructor");
	}
	Constructor(int x){
		System.out.println(x);
	}
	public static void main(String[] args) {
		new Constructor();
		new Constructor(100);

	}

}
