package com.lare03;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
	Scanner nimi = new Scanner(System.in);
	System.out.println("Syötä nimesi.");
	
	String Nimi = nimi.nextLine();
	
	Scanner ikä = new Scanner(System.in);
	System.out.println("Syötä ikäsi.");
	String Ikä = ikä.nextLine();
	System.out.println("Olet " + Ikä + "Vuotta vanha " + "Ja nimesi on " + Nimi);
	}

}
