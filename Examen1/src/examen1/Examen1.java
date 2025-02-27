/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //En el main se realizan todos las preguntas siguiendo las reglas conforme a la clase "cliente" 
        //Se utilizan transformadores de String a double y int y boolean para preguntas de "Si" y "No" y en caso de que lo ignore se deduce la respuesta a "Si"
        String nombre = JOptionPane.showInputDialog("Nombre del cliente:");
        String cedula = JOptionPane.showInputDialog("Cédula:");
        String codigo = JOptionPane.showInputDialog("Código de factura:");
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Monto de la factura:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Número de mes (1-12):"));
        boolean electricos = JOptionPane.showInputDialog("¿La factura contiene productos eléctricos? (Si/No)").equalsIgnoreCase("Si");
        boolean automotrices = JOptionPane.showInputDialog("¿La factura contiene productos automotrices? (Si/No)").equalsIgnoreCase("Si");
        boolean construccion = JOptionPane.showInputDialog("¿La factura contiene productos de construcción? (Si/No)").equalsIgnoreCase("Si");
        //Aqui se llama a la clase desde main y se imprime la informacion solicitida en el archivo del enunciado
        cliente cliente = new cliente(nombre, cedula, codigo, monto, mes, electricos, automotrices, construccion);
        cliente.mostrarFactura();
    }
}
