package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.CalculadoraModelo;
import vallegrande.edu.pe.view.CalculadoraVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraControlador {
    private CalculadoraModelo modelo;
    private CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.btnSumar.addActionListener(new Operacion("+"));
        this.vista.btnRestar.addActionListener(new Operacion("-"));
        this.vista.btnMultiplicar.addActionListener(new Operacion("*"));
        this.vista.btnDividir.addActionListener(new Operacion("/"));
    }

    class Operacion implements ActionListener {
        private String operador;

        public Operacion(String operador) {
            this.operador = operador;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(vista.txtNum1.getText());
                double num2 = Double.parseDouble(vista.txtNum2.getText());
                double resultado = 0;

                switch (operador) {
                    case "+" -> resultado = modelo.sumar(num1, num2);
                    case "-" -> resultado = modelo.restar(num1, num2);
                    case "*" -> resultado = modelo.multiplicar(num1, num2);
                    case "/" -> resultado = modelo.dividir(num1, num2);
                }

                vista.txtResultado.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                vista.mostrarError("Debe ingresar números válidos");
            } catch (ArithmeticException ex) {
                vista.mostrarError(ex.getMessage());
            }
        }
    }
}
