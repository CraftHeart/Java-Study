package java_test;
//import javax.swing.plaf.synth.SynthSeparatorUI;

import java.util.Arrays;

import package_test.add;
import package_test.multiple;
import package_test.Minus;


public class Main {
	//add method = new add();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add method = new add();
		int i=20;
		int j=11;
		int ret = method.add_two(i,j);
		System.out.println(ret);
		multiple multi_method = new multiple(i, j);
		System.out.println(multi_method.multi(i, j));
		int[] array={1,3,5,2,10,7};
		int position = Arrays.binarySearch(array, 10);
		System.out.println(position);
		Minus minus_method = new Minus(1,2);
		ret = minus_method.MinusMethod(i, j);
		System.out.println(ret);
	}

}
