package vallegrande.edu.pe;

import vallegrande.edu.pe.model.CalculadoraModelo;
import vallegrande.edu.pe.view.CalculadoraVista;
import vallegrande.edu.pe.controller.CalculadoraControlador;

public class App {
    public static void main(String[] args) {
        CalculadoraModelo modelo = new CalculadoraModelo();
        CalculadoraVista vista = new CalculadoraVista();
        new CalculadoraControlador(modelo, vista);

        vista.setVisible(true);
    }
}
