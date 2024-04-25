/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salarioempleado;
import javax.swing.JOptionPane;
/**
 *
 * @author Omar Reinaldo
 */
public class SalarioEmpleado {
    public static void main(String[] args) {
        // Constantes
        final double SalarioMinimo = 1300000; 
        final double AuxilioDeTransporte = 160000; 
        final int DiasDelMes= 30;
        final double ComisionDeVentas = 0.02;

        // Input data using JOptionPane
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        double salarioBasico = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario básico:"));
        int diasLaborados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días laborados:"));
        double ventasMes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de ventas del mes:"));
        double prestamos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de préstamos:"));

        // Calculations
        double sueldoDevengado = salarioBasico * diasLaborados / DiasDelMes;
        double auxilioTransporte = (salarioBasico <= 2 * SalarioMinimo) ? AuxilioDeTransporte * diasLaborados / DiasDelMes: 0;
        double comisionVentas = ventasMes * ComisionDeVentas;
        double totalDevengado = sueldoDevengado + auxilioTransporte + comisionVentas;
        double totalDeducciones = prestamos;
        double salarioNeto = totalDevengado - totalDeducciones;

        // Output results using JOptionPane
        JOptionPane.showMessageDialog(null, "Cedula empleado: " + cedula +
                                            "\nNombre Empleado: " + nombre +
                                            "\nSalario Básico: " + salarioBasico +
                                            "\nAuxilio de Transporte: " + auxilioTransporte +
                                            "\nComisión de Ventas: " + comisionVentas +
                                            "\nPréstamos: " + prestamos +
                                            "\nSalario Neto a Recibir: " + salarioNeto);
    }
}

