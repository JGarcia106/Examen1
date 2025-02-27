/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class cliente {

    //Atributos Privados
    private String nombre;
    private String cedula;
    private String codigoFactura;
    private double montoFactura;
    private int mes;
    private boolean electricos;
    private boolean automotrices;
    private boolean construccion;

    //Setters and getters para que retorne y guarde los atributos privados de la parte superior, y realice el "public cliente" para no tener que ir uno por uno
    public cliente(String nombre, String cedula, String codigoFactura, double montoFactura, int mes, boolean electricos, boolean automotrices, boolean construccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.electricos = electricos;
        this.automotrices = automotrices;
        this.construccion = construccion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean isElectricos() {
        return electricos;
    }

    public void setElectricos(boolean electricos) {
        this.electricos = electricos;
    }

    public boolean isAutomotrices() {
        return automotrices;
    }

    public void setAutomotrices(boolean automotrices) {
        this.automotrices = automotrices;
    }

    public boolean isConstruccion() {
        return construccion;
    }

    public void setConstruccion(boolean construccion) {
        this.construccion = construccion;
    }

    //Switch para que el usuario digite el numero y se le desglose en pantalla el mes correspondiente
    //El switch fue escrito conforme a las clases anteriores, aunque la maquina sugiere usar otro metodo que se utiliza con "->" en el warning
    public String getMesNombre() {
        switch (this.mes) {
            case 1:
                JOptionPane.showMessageDialog(null, "Enero");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Febrero");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Marzo");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Abril");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Mayo");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Junio");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Julio");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Septiembre");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Octubre");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Noviembre");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Diciembre");
                break;
            default:
                return "Mes no valido";
        }
        return null;
    }

    // Calculo de comision
    //Dependiendo del producto se da una comision diferente
    public double calcularComision() {
        double comision = 0;
        if (electricos) {
            comision += montoFactura * 0.02;
        }
        if (automotrices) {
            comision += montoFactura * 0.02;
        }
        if (construccion) {
            comision += montoFactura * 0.08;
        }
        if (montoFactura > 50000) {
            comision += montoFactura * 0.05;
        }
        return comision;
    }

    //Calculo de puntos
    //Segun las instrucciones del archivo cada producto brinda diferentes puntos
    public int calcularPuntos() {
        int puntos = 0;
        if (electricos) {
            puntos += 1;
        }
        if (automotrices) {
            puntos += 1;
        }
        if (construccion) {
            puntos += 2;
        }
        if (montoFactura > 50000) {
            puntos += 1;
        }
        return puntos;
    }

    //Calculo del bono extra que depende de calculo de puntos en la parte superior
    public boolean obtieneBonoExtra() {
        return calcularPuntos() > 5;
    }

    //String para desglosar el mensaje y se llama a todos los publics int double o string 
    public void mostrarFactura() {
        String mensaje = "Cliente: " + nombre + "\n"
                + "Cédula: " + cedula + "\n"
                + "Código Factura: " + codigoFactura + "\n"
                + "Monto: $" + montoFactura + "\n"
                + "Mes: " + getMesNombre() + "\n"
                + "Comisión: $" + calcularComision() + "\n"
                + "Puntos obtenidos: " + calcularPuntos() + "\n"
                + (obtieneBonoExtra() ? "Obtuvo el BONO EXTRA" : "No obtuvo el BONO EXTRA");
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
