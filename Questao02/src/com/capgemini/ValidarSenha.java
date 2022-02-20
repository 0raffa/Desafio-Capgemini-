package com.capgemini;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarSenha {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Informe sua senha");
		String senha = s.next();

		int maior = 0, menor = 0, num = 0, quant;

		for (int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);
			if (Character.isUpperCase(c)) {
				maior++;
			} else if (Character.isLowerCase(c)) {
				menor++;
			} else if (Character.isDigit(c)) {
				num++;
			}
		}

		quant = 6 - senha.length();

		if (senha.length() < 6) {
			System.out.println("Você precisa de mais " + quant + " caracteres.");
		}

		else if (!validar(senha) && maior == 0) {
			System.out.println("Sua senha precisa de um caracter maiúsculo");
		}

		else if (!validar(senha) && menor == 0) {
			System.out.println("Sua senha precisa de um caracter minusculo ");
		} else if (!validar(senha) && num == 0) {
			System.out.println("Sua senha precisa de um número ");
		} else {
			validar(senha);
			System.out.println(" Sua senha é forte ");
		}
	}

	public static boolean validar(String senha) {

		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{6,20}$";

		Pattern p = Pattern.compile(regex);

		if (senha == null) {
			return false;
		}
		Matcher m = p.matcher(senha);
		return m.matches();
	}

}