
package com.mycompany.forex;

import java.util.Scanner;

public class ForEx {
    
//O primeiro número vai determinar a qauntidade dos próximos
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();
        int soma = 0;
        
        for(int i=0; i < n; i++) {
            int x = teclado.nextInt();
            soma += x;
        }
        System.out.println(soma);
        teclado.close();
        }
        
        
            }




