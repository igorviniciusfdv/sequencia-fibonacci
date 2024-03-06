package testeEstagio2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        int a = 0; // Primeiro termo da sequência
        int b = 1; // Segundo termo da sequência 
        boolean verificar = false; // Variavel para verificar se o número pertence ou não a sequência 
        
        System.out.print(a);
        while (a <= numero ) {
        	int teste = b;
        	b = a + b;
        	a = teste;
        	if (a == numero) {
        		verificar = true;
        		break;
        	}
        
        	System.out.print(", " + a);
       
        }
        
        if (verificar) {
        	System.out.println (", " + numero);
        	System.out.println ("O número " + numero +" pertence a sequênca de Fibonacci");
        }else {
        	System.out.println(". " + "O número " + numero + " não pertence a sequência de Fibonacci");
        }
        
    }

   
    

	}


