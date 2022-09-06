package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JLabel;

import javax.swing.JFrame;

public class FrameTabuada {
  
	
	public String titulo;
	   public int largura;
	   public int altura;
	   public Color corDoTextoDoBotao;
	   public Color corDaCaixa;
	   public Color corDaCaixa2;
	   
	   public void criarTela() {
		   
		   JFrame tela = new JFrame();
		   
		   tela.setTitle(titulo);
		   tela.setSize(largura, altura);
		   tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   tela.setLayout(null);
		   tela.getContentPane().setBackground(Color.WHITE);
		
		   JLabel labelTitulo = new JLabel();
		   labelTitulo.setText("Tabuada 1.0");
		   labelTitulo.setBounds(30, 15, 300, 30);
		   labelTitulo.setForeground(Color.red);
		   labelTitulo.setFont(new Font("Arial", Font.BOLD,30));
		   
		   JLabel labelDescricao = new JLabel();
		   labelDescricao.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule \r\n"
		   		+ "a tabuada que desejar em segundos!");
		   labelDescricao.setBounds(30, 50, 1000, 30);
		   labelDescricao.setForeground(Color.black);
		   labelDescricao.setFont(new Font("Arial", Font.BOLD,15));
		   
			  
		   
		  
		   Container painel = tela.getContentPane();
		
		   
		   painel.add(labelTitulo);
		   painel.add(labelDescricao);
		   
	   
		   
		   
		   
		   
		 
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   tela.setVisible(true);
		   
	   }

}
