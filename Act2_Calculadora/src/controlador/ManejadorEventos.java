package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import vista.VentanaPrincipal;

public class ManejadorEventos implements ActionListener{
	private VentanaPrincipal ventana;
	
	public ManejadorEventos(VentanaPrincipal ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double num1;
		double num2;
		double resultado;
		
		try {
			if(e.getSource() == ventana.getBotonSumar()) {
				num1 = Double.parseDouble(ventana.getCajatexto().getText().toString());
				num2 = Double.parseDouble(ventana.getCajatexto2().getText().toString());
				resultado = num1 + num2;
				ventana.getResultado().setText(String.valueOf(resultado));
			}
			
			if(e.getSource() == ventana.getBotonRestar()) {
				num1 = Double.parseDouble(ventana.getCajatexto().getText().toString());
				num2 = Double.parseDouble(ventana.getCajatexto2().getText().toString());
				resultado = num1 - num2;
				ventana.getResultado().setText(String.valueOf(resultado));
			}
			
			if(e.getSource() == ventana.getBotonMult()) {
				num1 = Double.parseDouble(ventana.getCajatexto().getText().toString());
				num2 = Double.parseDouble(ventana.getCajatexto2().getText().toString());
				resultado = num1 * num2;
				ventana.getResultado().setText(String.valueOf(resultado));
			}
			
			if(e.getSource() == ventana.getBotonDiv()) {
				num1 = Double.parseDouble(ventana.getCajatexto().getText().toString());
				num2 = Double.parseDouble(ventana.getCajatexto2().getText().toString());
				resultado = num1 / num2;
				ventana.getResultado().setText(String.valueOf(resultado));
			}
			
			if(e.getSource() == ventana.getBotonRaizDos()) {
				JOptionPane.showMessageDialog(ventana, "Función no disponible");
			}
			
			if(e.getSource() == ventana.getBotonRaizTres()) {
				String pin = "1234";
				String question = JOptionPane.showInputDialog("Escriba la contraseña:");
				
				if(question.equals(pin)) {
					num1 = Double.parseDouble(ventana.getCajatexto().getText().toString());
					resultado = Math.cbrt(num1);
					ventana.getResultado().setText(String.valueOf(resultado));
					
				}else {
					JOptionPane.showMessageDialog(ventana, "Contraseña incorrecta, pruebe de nuevo.");
				}
			}
		}catch (NumberFormatException except) {
			JOptionPane.showMessageDialog(ventana, "Debes escribir los números a operar.");
		}catch (NullPointerException except) {
			JOptionPane.showMessageDialog(ventana, "Operación cancelada");
		}
	}
}
