package view;

import controller.*;
import java.util.Scanner;
import java.util.Random;

public class AnaliseVetor { 
	public static void main(String[] args) {
		AnaliseVetorController ctrl = new AnaliseVetorController();
		Scanner in = new Scanner(System.in);
		Random gen = new Random();

		System.out.println("Digite o tamanho do vetor: ");
		int size = in.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = gen.nextInt(500);
			System.out.println("index "+i+" "+array[i]);
		}

		int lastNumber = array[size - 1];

		System.out.println("O menor valor no vetor é: " +
		ctrl.minimumArrayValue(array, size - 1, lastNumber));
		
	}

}
