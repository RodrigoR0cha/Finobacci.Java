 import java.util.Scanner;
 public class Finobacci {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = 1, n2 = 0, soma = 0, f = 0, l;
        System.out.println("Seqûencia de Finobacci!");
        System.out.println("Digite um número maior que 0 e veja o resultado na sucessão de Finobacci! ");
        l = teclado.nextInt();
        System.out.println();
        teclado.close();

        for(f = 1; f <= l; f++) {
            soma = n1 + n2;
            n2 = n1;
            n1 = soma;
            System.out.println("Sequencia de Finobacci: " + soma);
        }

    }
 }