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
public class B12017_Ej02_06Usuar 
{
    public static void main(String args [])
    {
        String strUsu, strIsc, strCsc;
        try
        {
            InputStreamReader isr=new InputStreamReader (System.in);
            BufferedReader bur=new BufferedReader(isr);
            System.out.println("ingrese su usuario: ");
            strUsu=bur.readLine();
            System.out.println("ingrese su Contraseña: ");
            strIsc=bur.readLine();
            System.out.println("Confirme su Contraseña: ");
            strCsc=bur.readLine();
         if(strIsc.equalsIgnoreCase(strCsc))
            System.out.println("Bienvenido " +" "+ strUsu);
        else
        System.out.println("Error la clave es diferente al de la confirmacion. ");    
     }
        catch (IOException e)
        {
            System.out.println("Exception: " + e.toString());       
        }
        catch (NumberFormatException e)
        {
            System.out.println("Exception: " + e.toString());    
        }
    }
}
