/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author isi6
 */
public class facturas {
    
    private int n, i=0, j, opcion; //Variables
    private String op;
    public String nombre[] = new String[30]; //Clientes
    public String domicilio[] = new String[50]; 
    public String codigo[] = new String[10]; //Productos
    public String descripcion[] = new String[50];
    public int cantidad[] = new int[20];
    public String cant;
    public double preciounitario[] = new double[20];
    public String preciouni;
    public double subtotal[] = new double[20], igv = 0.15, descuento = 0.10;
    public double total[] = new double[20];
    
    public void menu()
    {
        do
        {
            op = JOptionPane.showInputDialog("Menú\n1. Capturar Datos\n2. Facturas\n3. Salir");
            opcion = Integer.parseInt(op);
            switch(opcion)
            {
                case 1:
                    capturarDatos();
                    calculoFacturas();
                    i++;
                     break;
                case 2:
                    imprimirFacturas();
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por su compra");
                    System.exit(0);
                            
                    break;
                default:
                    JOptionPane.showInputDialog(null, "Digite una opcion válida");
                    break;      
            }
        } 
        while(opcion!=3);
    }

    public void capturarDatos() {
        JOptionPane.showMessageDialog(null, "Datos del cliente");
        nombre[i] = JOptionPane.showInputDialog("Digite el nombre del cliente #" + (i+1) + ": ");
        domicilio[i] = JOptionPane.showInputDialog("Digite el domicilio del cliente #" + (i+1) + ": ");
        JOptionPane.showMessageDialog(null, "Datos del Prodcuto");
        codigo[i] = JOptionPane.showInputDialog("Digite el código del producto #" + (i+1) + ": ");
        descripcion[i] = JOptionPane.showInputDialog("Digite una breve descrpción del producto #" + (i+1) + ": ");
        cant = JOptionPane.showInputDialog("Digite la cantidad de productos #" + (i+1) + ": ");
        cantidad[i] = Integer.parseInt(cant);
        preciouni = JOptionPane.showInputDialog("Digite el precio del producto #" + (i+1) + ": ");
        preciounitario[i] = Double.parseDouble(preciouni);
    }

    public double calculoFacturas() {
        double tot = (preciounitario[i] * cantidad[i]);
        double impuesto = (tot * igv);
        subtotal[i] =  tot + impuesto;
        if (subtotal[i] > 1000)
        {
            double descuent = (subtotal[i] * descuento);
            total[i] = subtotal[i] - descuent;
        }
        else
        {
            total[i] = (subtotal[i]);
        }
        return total[i];
    }

    public void imprimirFacturas() {
        DecimalFormat dos = new DecimalFormat("0.00");
        for(j = 0; j < i; j++)
        {
            JOptionPane.showMessageDialog(null, "\nCliente\nNombre: " + nombre[j] + "\nDomicilio: " + domicilio[j] +
                    "\nProductos\nCódigo: " + codigo[j] + "\nDescripcion: " + descripcion[j] + "\nSubtotal: " + dos.format(subtotal[j]) +
                    "\nTotal\n(-10% si compró más de C$ 1,000\n)" + dos.format(total[j]));
        }
    }
}
