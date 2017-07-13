package com.beeva.banco.BancoBeeva.view;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Armando Duran Salavador
 */

public class Formulario extends JFrame{
	public Formulario(){
		super("Banco");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp= getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel etiqueta = new JLabel("Nombre: ");
		JTextField texto = new JTextField(20);
		JButton boton = new JButton("Buscar usuario");
		JLabel crear = new JLabel("Crear nuevo cliente: ");
		JButton nuevo = new JButton("Nuevo Cliente");
		
		cp.add(etiqueta);
		cp.add(texto);
		cp.add(boton);
		cp.add(crear);
		cp.add(nuevo);
	}
	
}
