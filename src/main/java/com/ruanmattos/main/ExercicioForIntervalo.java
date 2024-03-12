package com.ruanmattos.main;

import java.util.Scanner;

/**
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do
 * intervalo, mostrando essas informações conforme exemplo (use a palavra "dentro do intervalo" para dentro do intervalo, e "fora do intervalo" para fora do intervalo).
 *
 * @author Ruan Pereira Mattos
 */
public class ExercicioForIntervalo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a quantidade de valores que você deseja verificar se está dentro do intervalo de 10 até 20: ");
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int verificar = s.nextInt();
            if (10 <= verificar && verificar <= 20) {
                System.out.println("O número digitado " + verificar + " está dentro do intervalo");
            }else{
                System.out.println("O número digitado " + verificar + " está fora do intervalo");
            }
        }
    }
}
