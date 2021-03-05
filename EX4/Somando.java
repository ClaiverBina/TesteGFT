package somando;

import java.util.Scanner;

public class Somando {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numero = 0;
        int novo;
        
        while(numero <= 157){
            
            System.out.print("Digite um numero: ");
            novo = input.nextInt();
            
            if(novo < 0){
            
            System.out.println("Numero Inválido");
            
            }else{
            
                numero = numero + novo;
                
            }
            
        }
        
        System.out.println(numero);
        
    }
    
}
