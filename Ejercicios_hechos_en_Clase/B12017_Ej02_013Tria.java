/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.edu.ec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author alum_tes_a
 */
public class B12017_Ej02_013Tria 
{
    public static void main(String args [])
    {
        String linea=" "; 
        int cantidad = 4; 
        int aux = cantidad; 
        int i ; 

        for (i = 1; i <= cantidad; i++) 
        { 
            for (int j = aux; j>=1; j--) 
            { 
                linea = linea + " "; 
            } 
        int k = i; 
        k = 2*k-1; 
            for(int j=1; j<=k;j++) 
            { 
                linea += "*"; 
            } 

                System.out.println(linea); 
                linea = " "; 
                aux --;
        }	
    } 
}

