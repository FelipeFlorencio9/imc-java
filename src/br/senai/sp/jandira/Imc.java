package br.senai.sp.jandira;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		
		double altura, peso, imc;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Olá. Seja bem vindo a verificação do IMC!\n");
		System.out.println("Qual seu peso em kg?");
	     
		peso = input.nextDouble();
		//System.out.println(peso);
		
		
		System.out.println("Ótimo. Agora, qual a sua altura em metros?");
		altura = input.nextDouble();
		//System.out.println(altura);
		
		//Cálculo do IMC
		imc = peso/(altura*altura);
		System.out.printf("Seu IMC é: %s\n",imc);
		
		if(imc < 18.5) {
			System.out.printf("Você está abaixo do peso.");
			}
		if(imc >=18.5 && imc < 25.0) {
			System.out.println("Você está dentro do peso. Parabéns!!");
		};
		
		if(imc >=25.0 && imc < 30.0) {
			System.out.println("Você está levemente acima do peso.");
		};
		
		if(imc >=30.0 && imc < 35.0) {
			System.out.println("Você está na obesidade grau 1");
		};
		if(imc >=35.0 && imc < 40.0) {
			System.out.println("Você está na obesidade grau 2: severa");
		};
		if(imc >= 40.0) {
			System.out.println("Você está na obesidade grau 3: mórbida");
		};

}}
