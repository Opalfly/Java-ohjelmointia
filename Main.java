package com.lare03;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
	Scanner nimi = new Scanner(System.in);
	System.out.println("Sy�t� nimesi.");
	
	String Nimi = nimi.nextLine();
	
	Scanner ik� = new Scanner(System.in);
	System.out.println("Sy�t� ik�si.");
	String Ik� = ik�.nextLine();
	System.out.println("Olet " + Ik� + "Vuotta vanha " + "Ja nimesi on " + Nimi);
	}

}
