package com.beeva.banco.BancoBeeva;



import javax.swing.JFrame;
import com.beeva.banco.BancoBeeva.view.Formulario;

/**
 * @author Armando Duran Salavador
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	Formulario ventana= new Formulario();
    	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
