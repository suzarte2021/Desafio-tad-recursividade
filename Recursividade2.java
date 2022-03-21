package Recursividade2;
import java.util.Scanner;
public class Recursividade2 {
	//2- Faça um programa que implemente recursividade onde deverá 
   //multiplicar os números compreendidos de 1 até o número que o usuário desejar.

	static int fibo(int n) {
        if (n == 1 || n ==2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
	int num;
	System.out.println("Informe o numero:");
	num = ler.nextInt();
	
    	for (int i = 1; i <= num; i++) {
            System.out.println(fibo(i));
        }

    }
}

