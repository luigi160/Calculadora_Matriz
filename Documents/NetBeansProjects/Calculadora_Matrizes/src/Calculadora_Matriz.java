///BRUNO LUIGI DE LUCCAS LONGHI RA: 1830482111050
///EDUARDO FORNARI RIDOLFI RA: 1830482111007

import java.util.Arrays;
import java.util.Scanner;

public class Calculadora_Matriz {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i_a = 0;
		int j_a = 0;
		int i_b = 0;
		int j_b = 0;

		double[][] matriz_a = new double[i_a][j_a];
		double[][] matriz_b = new double[i_b][j_b];

		while (true) {

			System.out.println("Escolha a opção desejada ");
			System.out.println("1. Definir matriz A (o tamanho desta matriz para valores reais)");
			System.out.println("2. Definir matriz B (o tamanho desta matriz para valores reais)");
			System.out.println("3. Ler matriz A");
			System.out.println("4. Ler matriz B");
			System.out.println("5. Exibir matriz A");
			System.out.println("6. Exibir matriz B");
			System.out.println("7. Trocar a matriz A pela matriz B, sem modificá-las");
			System.out.println("8. Somar matrizes A e B");
			System.out.println("9. Subtrair matrizes A e B");
			System.out.println("10. Multiplicar a matriz A por uma constante");
			System.out.println("11. Multiplicar a matriz B por uma constante ");
			System.out.println("12. Multiplicar matrizes A e B, matricialmente ");
			System.out.println("13. Somar os elementos da matriz A");
			System.out.println("14. Somar os elementos da matriz B");
			System.out.println("15. Mostrar a soma de uma linha da matriz A");
			System.out.println("16. Mostrar a soma de uma linha da matriz B");
			System.out.println("17. Mostrar a soma de uma coluna da matriz A");
			System.out.println("18. Mostrar a soma de uma coluna da matriz B");
			int x = teclado.nextInt();

			if (x < 1 || x > 18) {
				System.out.println("Invalid option");

			}

			else {

				switch (x) {

				case 1:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}

					i_a = Definir_I();
					j_a = Definir_J();
					break;

				case 2:

					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}

					i_b = Definir_I();
					j_b = Definir_J();
					break;

				case 3:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}
					matriz_a = Ler_Matriz(i_a, j_a);

					break;

				case 4:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}
					matriz_b = Ler_Matriz(i_b, j_b);

					break;

				case 5:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}
					Imprimi_Matriz(matriz_a);
					break;

				case 6:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}
					Imprimi_Matriz(matriz_b);
					break;

				case 7:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}
					double[][] A = new double[i_a][j_a];
					double[][] B = new double[i_a][j_a];
					A = matriz_b;
					B = matriz_a;
					matriz_a = A;
					matriz_b = B;
					System.out.println("Nova matriz A");
					Imprimi_Matriz(matriz_a);
					System.out.println("Nova matriz B");
					Imprimi_Matriz(matriz_b);
					break;

				case 8:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}
					if (i_a != i_b || j_a != j_b) {

						System.out.println("Não é possível somar matrizes de ordem diferentes.");
					}

					else {

						matriz_a = Soma(matriz_a, matriz_b, i_a, j_b);
					}

					break;

				case 9:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}
					if (i_a != i_b || j_a != j_b) {

						System.out.println("Não é possível subtrair matrizes de ordem diferentes.");
					}

					else {

						matriz_a = Subtracao(matriz_a, matriz_b, i_a, j_b);
					}
					break;

				case 10:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}

					System.out.println("Digite um valor para a constante:");
					double constante = teclado.nextDouble();
					matriz_a = Mult_Constante(matriz_a, i_a, j_a, constante);
					break;

				case 11:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}

					System.out.println("Digite um valor para a constante:");
					double constante_2 = teclado.nextDouble();
					matriz_b = Mult_Constante(matriz_b, i_b, j_b, constante_2);
					break;

				case 12:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}

					if (j_a != i_b) {
						System.out.println(
								"O numero de colunas da matriz A precisa ser igual ao numero de linhas da matriz B");

					}

					else {
						matriz_a = Multiplicacao(matriz_a, matriz_b, i_a, i_b, j_b);
					}
					break;

				case 13:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}

					System.out.println(Somatoria(matriz_a));

					break;

				case 14:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}

					System.out.println(Somatoria(matriz_b));
					break;

				case 15:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}

					System.out.println("Qual linha da matriz deseja somar? (1ª Linha = 0)");
					int X = teclado.nextInt();

					if (X < i_a) {
						System.out.println(Soma_Linha(matriz_a, X, j_a));
					}

					else {
						System.out.println("Matriz vazia ou atingiu seu limite");
					}
					break;

				case 16:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}
					System.out.println("Qual linha da matriz deseja somar? (Inicio = 0)");
					int Y = teclado.nextInt();

					if (Y < i_b) {
						System.out.println(Soma_Linha(matriz_b, Y, j_b));
					}

					else {
						System.out.println("Matriz vazia ou atingiu seu limite");
					}
					break;

				case 17:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}
					System.out.println("Qual linha da matriz deseja somar? (Inicio = 0)");
					int Z = teclado.nextInt();

					if (Z < j_a) {
						System.out.println(Soma_Coluna(matriz_a, Z, i_a));
					}

					else {
						System.out.println("Matriz vazia ou atingiu seu limite");
					}
					break;
				case 18:
					for (int a = 0; a < 300; a++) {
						System.out.print("\r\n");
					}
					System.out.println("Qual linha da matriz deseja somar? (Inicio = 0)");
					int W = teclado.nextInt();

					if (W < j_b) {
						System.out.println(Soma_Coluna(matriz_b, W, i_b));
					}

					else {
						System.out.println("Matriz vazia ou atingiu seu limite");
					}
					break;
				}

			}

		}
	}

	public static int Definir_I() {
		System.out.println("Digite o numero de linhas da matriz");
		int i_aux = teclado.nextInt();
		return i_aux;
	}

	public static int Definir_J() {
		System.out.println("Digite o numero de colunas da matriz");
		int j_aux = teclado.nextInt();
		return j_aux;
	}

	public static double[][] Ler_Matriz(int linha, int coluna) {
		double[][] matriz = new double[linha][coluna];

		if (linha == 0 || coluna == 0) {

			System.out.println("É necessário definir as dimensões das matrizes:");
			return matriz;
		}

		else {

			for (int i = 0; i < linha; i++) {
				for (int j = 0; j < coluna; j++) {
					System.out.println("Digite o elemento" + "[" + (i) + "]" + "[" + (j) + "]");
					matriz[i][j] = teclado.nextDouble();
				}
			}
			return matriz;
		}

	}

	public static void Imprimi_Matriz(double matriz[][]) {

		System.out.println(Arrays.deepToString(matriz));
	}

	public static double[][] Soma(double matriz[][], double matriz1[][], int linha, int coluna) {
		double[][] matriz_aux = new double[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz_aux[i][j] = matriz[i][j] + matriz1[i][j];
			}
		}

		return matriz_aux;
	}

	public static double[][] Subtracao(double matriz[][], double matriz1[][], int linha, int coluna) {
		double[][] matriz_aux = new double[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz_aux[i][j] = matriz[i][j] - matriz1[i][j];
			}
		}
		return matriz_aux;
	}

	public static double[][] Mult_Constante(double matriz[][], int linha, int coluna, double constante) {
		double[][] matriz_aux = new double[linha][coluna];
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matriz_aux[i][j] = matriz[i][j] * constante;
			}
		}
		return matriz_aux;
	}

	public static double[][] Multiplicacao(double matriz[][], double matriz1[][], int linha, int linha2, int coluna) {
		double[][] matriz_aux = new double[linha][coluna];
		for (int i = 0; i < linha; i++) {

			for (int j = 0; j < coluna; j++) {
				for (int x = 0; x < linha2; x++) {
					matriz_aux[i][j] += matriz[i][x] * matriz1[x][j];
				}
			}

		}
		return matriz_aux;
	}

	public static double Somatoria(double matriz[][]) {
		double somatoria = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				somatoria += matriz[i][j];
			}
		}
		return somatoria;

	}

	public static double Soma_Linha(double matriz[][], int x, int coluna) {
		int soma_linha = 0;

		for (int j = 0; j < coluna; j++) {
			soma_linha += matriz[x][j];
		}

		return soma_linha;
	}

	public static double Soma_Coluna(double matriz[][], int x, int linha) {

		int soma_coluna = 0;
		for (int i = 0; i < linha; i++) {
			soma_coluna += matriz[i][x];
		}
		return soma_coluna;
	}

}
