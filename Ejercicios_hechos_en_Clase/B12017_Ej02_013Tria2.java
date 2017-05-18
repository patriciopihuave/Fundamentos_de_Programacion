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
public class B12017_Ej02_013Tria2 
{
    public static void main(String args [])
    {
        String linea=" ";
        int n=4;
        int aux=n;
        int i;
            for (i=1;i<=n;i++)
            { 
                //triangulo bordes cuadrado
                for(int j=aux;j>=1;j--)
                { 
                    linea=linea + "";
                    //System.out.print("*");
                } 
                int k = i;
                k = 2*k-1;
                    for(int j=1;j<=k;j++)
                    {
                        linea += "*";
                    }
                    System.out.println(linea); 
                    linea = " "; 
                    aux --;
                    //System.out.print("\n"); 
            }   
    }
}
