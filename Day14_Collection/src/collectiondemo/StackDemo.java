package collectiondemo;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		//insertion
		obj.push("giri");
		obj.push("sudee");
		obj.push("mahendra");
		obj.push("manoj");
		System.out.println(obj);
		//remove-LIFO
		obj.pop();
		System.out.println(obj);


	}

}
