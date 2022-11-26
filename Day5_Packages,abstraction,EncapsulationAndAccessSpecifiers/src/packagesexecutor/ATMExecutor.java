package packagesexecutor;

import java.util.Scanner;

import packagesdemo.ATM;

public class ATMExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the card no: ");
		String card_no=s.nextLine();
		ATM obj=new ();
		obj.display(card_no);
		

	}

}
