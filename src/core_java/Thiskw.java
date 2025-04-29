package core_java;

import javax.crypto.spec.ChaCha20ParameterSpec;

public class Thiskw {
	
	public static void main(String[] args) {
		
		Thiskw a1 = new Thiskw();
		Thiskw a2 = new Thiskw();
		a1.test();
		a2.test();
	}
	public void test() {
		Thiskw a3 = new Thiskw();
		a3.tet();
		System.out.println(this);
	}
	public void tet() {
		System.out.println(90);
	}

}
