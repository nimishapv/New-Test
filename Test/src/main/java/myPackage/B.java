package myPackage;

import java.io.IOException;

public class B {

	public static void main(String[] args) throws IOException {

		A a=new A();
		double t=a.readData(1,0);
		System.out.println(t);

	}

}
