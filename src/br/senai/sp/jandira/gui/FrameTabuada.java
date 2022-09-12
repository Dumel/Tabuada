package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
		
		ImageIcon imagem = new ImageIcon(getClass().getResource("aprendendo.png"));
		JLabel labelImagem = new JLabel(imagem);

		labelImagem.setBounds(80, 30, 50, 50);
		
		Image icon = new ImageIcon(this.getClass().getResource("aprendendo.png")).getImage();
		tela.setIconImage(icon);
		

		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada 1.0");
		labelTitulo.setBounds(183, 15, 300, 30);
		labelTitulo.setForeground(Color.red);
		labelTitulo.setFont(new Font("Arial", Font.BOLD, 30));

		JLabel labelDescricao = new JLabel();
		labelDescricao.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule");
		labelDescricao.setBounds(183, 50, 1000, 30);
		labelDescricao.setForeground(Color.black);
		labelDescricao.setFont(new Font("Arial", 0, 15));

		JLabel labelDescricao1 = new JLabel();
		labelDescricao1.setText("a tabuada que desejar em segundos!");
		labelDescricao1.setBounds(183, 70, 1000, 30);
		labelDescricao1.setForeground(Color.black);
		labelDescricao1.setFont(new Font("Arial", 0, 15));

		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(183, 150, 1000, 30);
		labelMultiplicando.setFont(new Font("Arial", 0, 25));

		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBounds(350, 150, 200, 30);

		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo Multiplicador:");
		labelMinMultiplicador.setBounds(100, 200, 1000, 30);
		labelMinMultiplicador.setFont(new Font("Arial", 0, 25));

		JTextField textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(350, 200, 200, 30);

		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador");
		labelMaxMultiplicador.setBounds(100, 250, 1000, 30);
		labelMaxMultiplicador.setFont(new Font("Arial", 0, 25));

		JTextField textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(350, 250, 200, 30);

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(100, 320, 200, 50);
		buttonCalcular.setBackground(new Color(0, 179, 0));
		buttonCalcular.setForeground(new Color(255, 255, 255));
		buttonCalcular.setFont(new Font("Arial", 0, 25));

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(350, 320, 200, 50);
		buttonLimpar.setBackground(new Color(251, 181, 51));
		buttonLimpar.setForeground(new Color(255, 255, 255));
		buttonLimpar.setFont(new Font("Arial", 0, 25));

		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(100, 400, 200, 50);
		labelResultado.setFont(new Font("Arial", 0, 25));

		JList<String> lista = new JList<String>();
		JScrollPane scroll = new JScrollPane(lista);

		scroll.setBounds(100, 450, 450, 250);
		lista.setBackground(Color.GRAY);
		lista.setForeground(Color.white);

		Container painel = tela.getContentPane();

		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (textMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Digite o multiplicando!!");
				}

				else if (textMinMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Digite o mínimo multiplicador!!");
				}

				else if (textMaxMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Digite o máximo multiplicador!!");
				}

				else {
					Tabuada tabuada = new Tabuada();

					tabuada.multiplicando = Integer.parseInt(textMultiplicando.getText());
					tabuada.minimoMultiplicador = Integer.parseInt(textMinMultiplicador.getText());
					tabuada.maximoMultiplicador = Integer.parseInt(textMaxMultiplicador.getText());

					String[] resultado = tabuada.getTabuada();
					lista.setListData(resultado);
				}

			
			
			}
		});

		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textMultiplicando.setText("");
				textMinMultiplicador.setText("");
				textMaxMultiplicador.setText("");
				lista.setVisible(false);

			}
		});
		
		textMultiplicando.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				textMultiplicando.setText(textMultiplicando.getText().replaceAll("[^0-9]", ""));
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		textMinMultiplicador.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				textMinMultiplicador.setText(textMinMultiplicador.getText().replaceAll("[^0-9]", ""));
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		textMaxMultiplicador.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				textMaxMultiplicador.setText(textMaxMultiplicador.getText().replaceAll("[^0-9]", ""));
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		painel.add(labelTitulo);
		painel.add(labelDescricao);
		painel.add(labelMultiplicando);
		painel.add(textMultiplicando);
		painel.add(labelMinMultiplicador);
		painel.add(labelDescricao1);
		painel.add(textMinMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textMaxMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);
		painel.add(labelImagem);

		tela.setVisible(true);

	}

}
