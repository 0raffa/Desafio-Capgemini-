package com.capgemini;

import java.util.Scanner;

public class Escada {
	public static void main(String[] args) {
	
Scanner s = new Scanner(System.in);

System.out.println("Informe um número");
int n = s.nextInt();

		
for(int i = n; i >= 1; i--){
    for(int a = i-1; a >= 1; a--){
        System.out.print(" ");
    }
    for(int b = i; b <= n; b++){
    	
        System.out.print("*");
    }
    System.out.println("");

}
	}
}

