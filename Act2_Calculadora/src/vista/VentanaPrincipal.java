package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.ManejadorEventos;

public class VentanaPrincipal extends JFrame{
	
	private JLabel logo;
	private JLabel etiqueta;
	private JLabel etiqueta2;
	private JTextField cajatexto;
	private JTextField cajatexto2;
	private JButton botonSumar;
	private JButton botonRestar;
	private JButton botonMult;
	private JButton botonDiv;
	private JButton botonRaizDos;
	private JButton botonRaizTres;
	private JLabel etiquetaResultado;
	private JLabel resultado;
	
	/**
	 * Getters and Setters ETIQUETAS
	 */

	public JLabel getResultado() {
		return resultado;
	}
	
	public JTextField getCajatexto() {
		return cajatexto;
	}

	public void setCajatexto(JTextField cajatexto) {
		this.cajatexto = cajatexto;
	}

	public JTextField getCajatexto2() {
		return cajatexto2;
	}

	public void setCajatexto2(JTextField cajatexto2) {
		this.cajatexto2 = cajatexto2;
	}

	public void setResultado(JLabel resultado) {
		this.resultado = resultado;
	}

	/**
	 * Getters and Setters Botones
	 */
	

	public VentanaPrincipal() {
		setSize(320, 470);
		setLocationRelativeTo(null);  //setBounds(x, y, ancho, alto) x-y ->Son las coordenadas
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Calculadora");
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagenes/calculator-variant.png"));
		setLayout(null);
		iniciarComponentes();
		setVisible(true);
	}
	
	public JButton getBotonSumar() {
		return botonSumar;
	}

	public void setBotonSumar(JButton botonSumar) {
		this.botonSumar = botonSumar;
	}

	public JButton getBotonRestar() {
		return botonRestar;
	}

	public void setBotonRestar(JButton botonRestar) {
		this.botonRestar = botonRestar;
	}

	public JButton getBotonMult() {
		return botonMult;
	}

	public void setBotonMult(JButton botonMult) {
		this.botonMult = botonMult;
	}

	public JButton getBotonDiv() {
		return botonDiv;
	}

	public void setBotonDiv(JButton botonDiv) {
		this.botonDiv = botonDiv;
	}

	public JButton getBotonRaizDos() {
		return botonRaizDos;
	}

	public void setBotonRaizDos(JButton botonRaizDos) {
		this.botonRaizDos = botonRaizDos;
	}

	public JButton getBotonRaizTres() {
		return botonRaizTres;
	}

	public void setBotonRaizTres(JButton botonRaizTres) {
		this.botonRaizTres = botonRaizTres;
	}

	/**
	 * Método encargado de inicializar todos los componentes de la aplicación
	 */
	private void iniciarComponentes() {
		
		getContentPane().setBackground(new Color(0,93,193));
		
		Image img = new ImageIcon("src/imagenes/calculadora_grande.png").getImage();
		logo = new JLabel(new ImageIcon(img.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
		logo.setBounds(115, 15, 80, 80);
		add(logo);
		
		etiqueta = new JLabel("Número 1");
		etiqueta.setForeground(new Color(255,255,255));
		etiqueta.setBounds(60, 115, 90, 30);
		add(etiqueta);
		
		etiqueta2 = new JLabel("Número 2");
		etiqueta2.setForeground(new Color(255,255,255));
		etiqueta2.setBounds(60, 165, 90, 30);
		add(etiqueta2);
		
		cajatexto = new JTextField();
		etiqueta.setFocusable(false);
		cajatexto.setBounds(125, 115, 120, 30);
		cajatexto.setBorder(null);
		cajatexto.setFont(new Font("Dialog", Font.BOLD, 14));
		cajatexto.setForeground(new Color(0,93,193));
		add(cajatexto);
		
		cajatexto2 = new JTextField();
		cajatexto2.setBounds(125, 165, 120, 30);
		cajatexto2.setBorder(null);
		cajatexto2.setFont(new Font("Dialog", Font.BOLD, 14));
		cajatexto2.setForeground(new Color(0,93,193));
		add(cajatexto2);
		
		botonSumar = new JButton("Sumar");
		botonSumar.setBounds(30, 225, 110, 30);
		botonSumar.setFont(new Font("Dialog", Font.BOLD, 14));
		botonSumar.setForeground(new Color(0,93,193));
		botonSumar.setBackground(Color.WHITE);
		add(botonSumar);
		
		botonRestar = new JButton("Restar");
		botonRestar.setBounds(165, 225, 110, 30);
		botonRestar.setFont(new Font("Dialog", Font.BOLD, 14));
		botonRestar.setForeground(new Color(0,93,193));
		botonRestar.setBackground(Color.WHITE);
		add(botonRestar);
		
		
		botonMult = new JButton("Mult");
		botonMult.setBounds(30, 270, 110, 30);
		botonMult.setFont(new Font("Dialog", Font.BOLD, 14));
		botonMult.setForeground(new Color(0,93,193));
		botonMult.setBackground(Color.WHITE);
		add(botonMult);
		
		botonDiv = new JButton("Dividir");
		botonDiv.setBounds(165, 270, 110, 30);
		botonDiv.setFont(new Font("Dialog", Font.BOLD, 14));
		botonDiv.setForeground(new Color(0,93,193));
		botonDiv.setBackground(Color.WHITE);
		add(botonDiv);
		
		botonRaizDos = new JButton("Raiz 2");
		botonRaizDos.setBounds(30, 315, 110, 30);
		botonRaizDos.setFont(new Font("Dialog", Font.BOLD, 14));
		botonRaizDos.setForeground(new Color(0,93,193));
		botonRaizDos.setBackground(Color.WHITE);
		add(botonRaizDos);
		
		botonRaizTres = new JButton("Raiz 3");
		botonRaizTres.setBounds(165, 315, 110, 30);
		botonRaizTres.setFont(new Font("Dialog", Font.BOLD, 14));
		botonRaizTres.setForeground(new Color(0,93,193));
		botonRaizTres.setBackground(Color.WHITE);
		add(botonRaizTres);
		
		etiquetaResultado = new JLabel("Resultado: ");
		etiquetaResultado.setFont(new Font("Dialog", Font.BOLD, 14));
		etiquetaResultado.setForeground(new Color(255,255,255));
		etiquetaResultado.setBounds(30, 370, 90, 30);
		add(etiquetaResultado);
		
		resultado = new JLabel();
		resultado.setBounds(120, 370, 155, 30);
		resultado.setBorder(null);
		resultado.setFont(new Font("Dialog", Font.BOLD, 14));
		resultado.setForeground(new Color(255,255,255));
		add(resultado);
	}
	
	/**
	 * Método encargado de establecer el manejador de eventos
	 * @param manejador
	 */
	public void establecerManejador(ManejadorEventos manejador) {
		botonSumar.addActionListener(manejador);
		botonRestar.addActionListener(manejador);
		botonMult.addActionListener(manejador);
		botonDiv.addActionListener(manejador);
		botonRaizDos.addActionListener(manejador);
		botonRaizTres.addActionListener(manejador);
	}
}
