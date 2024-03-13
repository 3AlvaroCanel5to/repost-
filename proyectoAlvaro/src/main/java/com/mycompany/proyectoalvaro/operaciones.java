/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoalvaro;

import java.util.Scanner;
/**
 *
 * @author PC09
 */
public class operaciones {
    public int nose()
    {
        //Se esta instalando una variable/clase
         Scanner sc = new Scanner (System.in);
         System.out.println ("ingrese su numero");
         int numero = sc.nextInt();
         if (numero % 2 ==0 ) {
             System.out.println ("el numero es Par");
         } else {
             System.out.println ("El numero es Impar");
         }
         return numero;
     }
    }
             
         
       
  
