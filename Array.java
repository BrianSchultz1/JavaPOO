import java.util.Arrays;

public class Array { 

	public static void main(String[] args) {
		int[] arrayPares = new int[10];
		int[] arrayImpares = new int[10];
		int[] arrayAlternado = new int[20];

		int countPares = 0;
		int countImpares = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				arrayPares[countPares] = i;
				countPares++;
				arrayAlternado[i - 1] = i;
			} else {
				arrayImpares[countImpares] = i;
				countImpares++;
				arrayAlternado[i - 1] = i;
			}
		}
		System.out.println("array de pares" + Arrays.toString(arrayPares));
		System.out.println("Array de ímpares" + Arrays.toString(arrayImpares));
		System.out.println("Array alternado" + Arrays.toString(arrayAlternado));
	}

}
