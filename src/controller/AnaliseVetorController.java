package controller;

public class AnaliseVetorController {

	public AnaliseVetorController() {
		super();
	}

	/**
	 * Search for the minimum value inside an array using recursion.
	 * <p>
	 * The method searchs from the end to the beginning of the array
	 * and stores the current lowest number until it finds a lower number
	 *
	 * @param array The array that's It's going to be searched.
	 * @param size The current index that's being compared.
	 * @param lastNumber The current lowest number.
	 * @return The lowest number inside the array.
	 */
	public static int minimumArrayValue(int[] array, int size, int lastNumber) {
		// condição de parada:
		// se o index for menor que 0
		// retorna o valor atual do ultimo numero (lastNumber)
		// e termina a recursao
		if (size < 0) {
			return lastNumber;
		}

		// ultimo numero age como o menor numero
		// se o ultimo numero for maior que o index do array 
		// ultimo numero se torna o index do array
		// e continua buscando numeros menores
		if (lastNumber > array[size]) {
			System.out.println(lastNumber);
			return minimumArrayValue(array, size - 1, array[size]);
		} 
		// caso nao
		// mantem o ultimo numero e continua buscando numeros menores
		else {
			return minimumArrayValue(array, size - 1, lastNumber);
		}

	}

}
