package vallegrande.edu.pe.view;

import javax.swing.*;
import java.awt.*;

public class CalculadoraVista extends JFrame {
    public JTextField txtNum1 = new JTextField(10);
    public JTextField txtNum2 = new JTextField(10);
    public JTextField txtResultado = new JTextField(10);

    public JButton btnSumar = new JButton("Sumar");
    public JButton btnRestar = new JButton("Restar");
    public JButton btnMultiplicar = new JButton("Multiplicar");
    public JButton btnDividir = new JButton("Dividir");

    public CalculadoraVista() {
        setTitle("Calculadora MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(5, 2, 5, 5));
        setLocationRelativeTo(null);

        add(new JLabel("Número 1:"));
        add(txtNum1);
        add(new JLabel("Número 2:"));
        add(txtNum2);
        add(new JLabel("Resultado:"));
        add(txtResultado);
        txtResultado.setEditable(false);

        add(btnSumar);
        add(btnRestar);
        add(btnMultiplicar);
        add(btnDividir);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
