package classe;

import java.util.Scanner;

public class Metodos {
    int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Metodos metodos = new Metodos();
        System.out.println(metodos.somar(600, 50));
    }
}
