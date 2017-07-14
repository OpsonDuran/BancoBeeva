package com.beeva.banco.BancoBeeva.view;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import com.beeva.banco.BancoBeeva.dao.BancoDao;
import com.beeva.banco.BancoBeeva.dao.BancosClientesDao;
import com.beeva.banco.BancoBeeva.dao.ClienteDao;
import com.beeva.banco.BancoBeeva.dao.CuentaDao;
import com.beeva.banco.BancoBeeva.dao.CuentaDaoInter;
import com.beeva.banco.BancoBeeva.dao.TipoCuentaDao;
import com.beeva.banco.BancoBeeva.daoImpl.BancoDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.BancosClientesDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.ClienteDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.CuentaDaoImpl;
import com.beeva.banco.BancoBeeva.daoImpl.TipoCuentaDaoImpl;
import com.beeva.banco.BancoBeeva.entity.Banco;
import com.beeva.banco.BancoBeeva.entity.BancosClientes;
import com.beeva.banco.BancoBeeva.entity.Cliente;
import com.beeva.banco.BancoBeeva.entity.Cuenta;
import com.beeva.banco.BancoBeeva.entity.TipoCuenta;
import com.beeva.banco.BancoBeeva.factory.CuentaFactory;
import com.beeva.banco.BancoBeeva.singleton.ContextSing;

import java.util.*;
import java.util.List;
import java.io.*;
import java.sql.*;

/**
 * @author Armando Duran Salavador
 */


public class Formulario extends JFrame{

    //instancia singleton context
   private ContextSing con= ContextSing.getInstance();
   private TipoCuentaDao tipoCuentaDao=(TipoCuentaDao)con.getContext().getBean(TipoCuentaDaoImpl.class);
   private BancoDao bancoDao =(BancoDao) con.getContext().getBean(BancoDaoImpl.class);
   private CuentaDao cuentaDao = (CuentaDao)con.getContext().getBean(CuentaDaoImpl.class);
   private ClienteDao clienteDao = (ClienteDao) con.getContext().getBean(ClienteDaoImpl.class);
   private BancosClientesDao bancoClietesDao=(BancosClientesDao)con.getContext().getBean(BancosClientesDaoImpl.class);
	
   //text
   private JLabel etiquetaNombreBanco;
   private JLabel etiquetaNombreCliente;
   private JLabel etiquetaApellidoCliente;
   private JLabel etiquetaTipoCuenta;
   private JLabel etiquetaBalance;
   private JLabel etiquetaBalancetran;
   private JLabel cuentaet;
   private JLabel transacciones;
   //inputs
   private JComboBox bancoC;
   private JTextField nombreClienteC;
   private JTextField apellidoClienteC;
   private JTextField balanceC;
   private JTextField balancetran;
   private JComboBox tipoCuentaC;
   private JComboBox CuentaC;
   
   //buttons
   private JButton agregaCliente;
   private JButton depositar;
   private JButton retirar;
   private JButton aceptar;
   private JButton limpiar;
    
   
   public Formulario()
   {
	  
      super("Beeva Banco");
      Container contenedor = getContentPane();
      contenedor.setLayout(null);
      
      setSize(500,800);
      setVisible(true);
      
      /*
       * Instancia de catalogos
       */
    
    Banco bancoinit= new Banco();
  	bancoinit.setNombre("Banorte 2");
  	bancoDao.saveBanco(bancoinit);
  	TipoCuenta tipoCuentainit= new TipoCuenta();
  	tipoCuentainit.setNombre("Ahorros");
  	tipoCuentaDao.saveTipoCuenta(tipoCuentainit);
  	TipoCuenta tipoCuenta2= new TipoCuenta();
  	tipoCuenta2.setNombre("Cheques");
  	tipoCuentaDao.saveTipoCuenta(tipoCuenta2);
  	
  	
            
      //Labels
      transacciones=new JLabel("_________________TRANSACCIONES CAJERO______________");
      etiquetaNombreBanco = new JLabel("Banco: ");
      etiquetaNombreCliente = new JLabel("Nombre del cliente: ");
      etiquetaApellidoCliente = new JLabel("Apellido del cliente: ");
      etiquetaTipoCuenta = new JLabel("Tipo de cuenta: ");
      etiquetaBalance = new JLabel("Saldo de apertura: ");
      etiquetaBalancetran = new JLabel(" Cantidad $: ");
      cuentaet = new JLabel(" Cuenta id: ");
      
      //inputs
      bancoC = new JComboBox();
      nombreClienteC = new JTextField(20);
      apellidoClienteC = new JTextField(20);
      tipoCuentaC = new JComboBox();
      balanceC = new JTextField(20);
      balancetran = new JTextField(20);
      CuentaC = new JComboBox();
      
      //Anexo a contenedor
      
      contenedor.add(etiquetaNombreBanco);
      etiquetaNombreBanco.setBounds(10,50,160,45);
      contenedor.add(bancoC);
      bancoC.setBounds(130,50,200,45);
      
       List<Banco> listBanco= bancoDao.listBanco();
  	   for (Banco banco : listBanco) {
  		bancoC.addItem(banco.getIdBanco());
		}
      
      contenedor.add(etiquetaNombreCliente);
      etiquetaNombreCliente.setBounds(10,110,160,45);
      contenedor.add(nombreClienteC);
      nombreClienteC.setBounds(130,110,200,45);
      
      contenedor.add(etiquetaApellidoCliente);
      etiquetaApellidoCliente.setBounds(10,170,160,45);
      contenedor.add(apellidoClienteC);
      apellidoClienteC.setBounds(130,170,200,45);
      
      contenedor.add(etiquetaTipoCuenta);
      etiquetaTipoCuenta.setBounds(10,230,160,45);
      contenedor.add(tipoCuentaC);
      tipoCuentaC.setBounds(130,230,200,45);
      List<TipoCuenta> listTipoCuenta= tipoCuentaDao.listTipoCuenta();
    	for (TipoCuenta tipoCuenta : listTipoCuenta) {
    	      tipoCuentaC.addItem(tipoCuenta.getIdtipocuenta());
  		}
   
      contenedor.add(etiquetaBalance);
      etiquetaBalance.setBounds(10,290,160,45);
      contenedor.add(balanceC);
      balanceC.setBounds(130,290,200,45);
      
      
      // buttons
      agregaCliente = new JButton("Agregar");
      contenedor.add(agregaCliente);
      agregaCliente.setBounds(130,350,200,45);
      
      
      contenedor.add(transacciones);
      transacciones.setBounds(10,400,400,45);
      
      contenedor.add(cuentaet);
      cuentaet.setBounds(10,460,160,45);
      contenedor.add(CuentaC);
      CuentaC.setBounds(130,460,200,45);
      List<Cuenta> Cuenta= cuentaDao.listCuenta();
    	for (Cuenta cuenta : Cuenta) {
    	      CuentaC.addItem(cuenta.getIdCuenta());
  		}
   
      contenedor.add(etiquetaBalancetran);
      etiquetaBalancetran.setBounds(10,510,160,45);
      contenedor.add(balancetran);
      balancetran.setBounds(130,510,200,45);
      
      
      
      retirar = new JButton("Retirar");
      contenedor.add(retirar);
      retirar.setBounds(130,570,100,45);
      
      depositar = new JButton("Depositar");
      contenedor.add(depositar);
      depositar.setBounds(230,570,100,45);
      
      limpiar = new JButton("Limpiar campos");
      contenedor.add(limpiar);
      limpiar.setBounds(90,630,300,45);
      
    
      //actions
      agregaCliente.addActionListener(
    	         new ActionListener() {
    	            public void actionPerformed(ActionEvent ev)
    	            {  
    	            	Cliente cliente = new Cliente();
    	            	
    	            	cliente.setNombre(nombreClienteC.getText());
    	            	cliente.setApellido(apellidoClienteC.getText());
    	            	int id= clienteDao.saveCliente(cliente).getIdCliente();
    	            	double dinero=Double.parseDouble(balanceC.getText());
    	            	
    	            	BancosClientes bancosClientes= new BancosClientes();
    	            	int bank= (Integer)bancoC.getSelectedItem();
    	            	bancosClientes.setIdBanco(bank);
    	            	bancosClientes.setIdCliente(id);
    	            	bancoClietesDao.saveBancosCLientes(bancosClientes);
    	            	
    	            	Cuenta cuenta = new Cuenta();
    	            	cuenta.setBalance(dinero);
    	            	cuenta.setIdcliente(id);
    	            	int tipo = (Integer)tipoCuentaC.getSelectedItem();
    	            	cuenta.setIdTipoCuenta(tipo);
    	            	cuentaDao.saveCuenta(cuenta);
    	            	
    	            	
    	            	nombreClienteC.setText("");
    	            	apellidoClienteC.setText("");
    	            	balanceC.setText("");
    	            	
    	            }
    	         }
    	      );
      
      depositar.addActionListener(
    	         new ActionListener() {
    	            public void actionPerformed(ActionEvent ev)
    	            {
    	            	
    	            	CuentaDao cuentaDao = (CuentaDao)con.getContext().getBean(CuentaDaoImpl.class);
    	            	int idCuenta = (Integer)CuentaC.getSelectedItem();
    	            	double dinero=Double.parseDouble(balancetran.getText());
    	 	           	Cuenta cuenta = cuentaDao.getCuenta(idCuenta);
    	 	           	Cliente consult= clienteDao.getCliente(cuenta.getIdcliente());
    	 	           	CuentaFactory cuentaFactory = new CuentaFactory();
    	 	            CuentaDaoInter cuentaDAO =  cuentaFactory.getImplements(cuenta);
    	 	           	cuentaDAO.Deposito(cuenta, dinero); 
    	 	           	nombreClienteC.setText(""+consult.getNombre());
    	 	           	apellidoClienteC.setText(""+consult.getApellido());
    	            	balanceC.setText("$"+cuenta.getBalance());
    	 	           	balancetran.setText("");
    	            }
    	         }
    	      ); 
      retirar.addActionListener(
 	         new ActionListener() {
 	            public void actionPerformed(ActionEvent ev)
 	            {
 	            CuentaDao cuentaDao = (CuentaDao)con.getContext().getBean(CuentaDaoImpl.class);
            	int idCuenta = (Integer)CuentaC.getSelectedItem();
            	double dinero=Double.parseDouble(balancetran.getText());
 	           	Cuenta cuenta = cuentaDao.getCuenta(idCuenta);
 	           	Cliente consult= clienteDao.getCliente(cuenta.getIdcliente());
 	           	CuentaFactory cuentaFactory = new CuentaFactory();
 	            CuentaDaoInter cuentaDAO =  cuentaFactory.getImplements(cuenta);
 	           	cuentaDAO.Retiro(cuenta, dinero);
 	           	nombreClienteC.setText(""+consult.getNombre());
 	           	apellidoClienteC.setText(""+consult.getApellido());
            	balanceC.setText("$"+cuenta.getBalance());
 	           	balancetran.setText("");
 	            }
 	         }
 	      ); 
   	 
      limpiar.addActionListener(
    		  new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					// Limpiar campos
					nombreClienteC.setText("");
	            	apellidoClienteC.setText("");
	            	balanceC.setText("");
					balancetran.setText("");
				}
			});

   			
	}              
}