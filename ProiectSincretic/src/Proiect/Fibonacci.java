package Proiect;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a1,a2,a3;
		System.out.println("Dati numar pana la care se afiseaza sirul lui Fibonacci:");
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		a1=0;
		a2=1;
		a3=a1+a2;
		System.out.print(a1+" "+a2);
		while(a3<=N)
		{
			
			System.out.print(" "+a3);
			a1=a2;
			a2=a3;
			a3=a1+a2;
		}

	

	}

}
