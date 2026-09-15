import java.util.Scanner;

public class MosaicoDoCastelo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero de 3 a 30: ");
        int n = entrada.nextInt();


        if (n < 3 || n > 30) {

            System.out.println("Dimensao invalida! Use um valor entre 3 e 20.");
            entrada.close();
            return;
        }


        System.out.println("--- DIMENSAO " + n + " x " + n + " ---");


        for (int linha = 0; linha < n; linha++) {
            StringBuilder saida = new StringBuilder();

            for (int coluna = 0; coluna < n; coluna++) {
                boolean bordaVertical = (linha == 0 || linha == n - 1);
                boolean bordaHorizontal = (coluna == 0 || coluna == n - 1);

                if (bordaVertical && bordaHorizontal) {
                    saida.append('+');   // canto
                } else if (bordaVertical || bordaHorizontal) {
                    saida.append('#');   // borda
                } else {
                    saida.append('.');   // interior
                }
            }

            System.out.println(saida);
        }

        entrada.close();
    }
}