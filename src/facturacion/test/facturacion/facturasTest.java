/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author isi6
 */
public class facturasTest {
    
    public facturasTest() {
    }

   
    /*@Test
    public void testCalculoFacturas() {
        double valorEsperado = 3000;
        double valorReal = 0.00;
        
        System.out.println("calculoFacturas");
        facturas objeto = new facturas();
        objeto.capturarDatos();
        valorReal = objeto.calculoFacturas();
        
        assertEquals(valorEsperado, valorReal, 0.05);
        System.out.println("Valor real: "+ valorReal);
        System.out.println("Valor esperado: " + valorEsperado);
        System.out.println(valorReal);
        System.out.println(valorEsperado);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
 /*@Test
    public void nombreTest() {
        facturas objeto = new facturas();
        objeto.nombre[0] = "Juan López";
        objeto.domicilio[0] = "Masaya";
        objeto.codigo[0] = "C001";
        objeto.descripcion[0] = "Camisetas deportivas";
        objeto.cantidad[0]= 2;
        objeto.preciounitario[0] = 500;
        
        assertEquals("Juan López", objeto.nombre[0]);
        
        System.out.println("Valor real: "+ "Juan López");
        System.out.println("Valor esperado: " + objeto.nombre[0]);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
  
    /*@Test
    public void codigoTest() {
        facturas objeto = new facturas();
        objeto.nombre[0] = "Juan López";
        objeto.domicilio[0] = "Managua";
        objeto.codigo[0] = "P001";
        objeto.descripcion[0] = "Pantalones Blue Jeans ";
        objeto.cantidad[0]= 1;
        objeto.preciounitario[0] = 800;
        
        assertNotEquals("P002", objeto.codigo[0]);
        
        System.out.println("Valor real: "+ "P002");
        System.out.println("Valor esperado: " + objeto.codigo[0]);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
    /*@Test
    public void testCalculoFactura1() {
        double valorEsperado = 1035;
        double valorReal = 1035;
        
        System.out.println("calculoFacturas");
        facturas objeto = new facturas();
        objeto.capturarDatos();
        valorReal = objeto.calculoFacturas();
        
        assertEquals(valorEsperado, valorReal, 0.05);
        System.out.println("Valor real: "+ valorReal);
        System.out.println("Valor esperado: " + valorEsperado);
        System.out.println(valorReal);
        System.out.println(valorEsperado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
    /*@Test
    public void testCalculoFactura2() {
        double valorEsperado = 920;
        double valorReal = 920;
        
        System.out.println("calculoFacturas");
        facturas objeto = new facturas();
        objeto.capturarDatos();
        valorReal = objeto.calculoFacturas();
        
        assertEquals(valorEsperado, valorReal, 0.05);
        System.out.println("Valor real: "+ valorReal);
        System.out.println("Valor esperado: " + valorEsperado);
        System.out.println(valorReal);
        System.out.println(valorEsperado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
    /*@Test
    public void testImpMayorDesc() {
        double calcImpuesto = 0.0;
        double calcDescuento = 0.0;
        
        facturas objeto = new facturas();
        objeto.cantidad[0]= 1;
        objeto.preciounitario[0] = 200;
        
        calcImpuesto= objeto.calculoFacturas();
        System.out.println("calculo: "+ calcImpuesto);
        
        objeto.cantidad[0]= 2;
        objeto.preciounitario[0] = 500;
        calcDescuento= objeto.calculoFacturas();
        System.out.println("calculo: "+ calcDescuento);
        boolean condition = calcImpuesto > calcDescuento;
        System.out.println(condition);
        assertTrue(calcImpuesto > calcDescuento);
        
        //System.out.println("Valor real: "+ valorReal);
        //System.out.println("Valor esperado: " + valorEsperado);
      
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
    @Test
    public void testElMismoObjeto() {
        double calcImpuesto = 0.0;
        double calcDescuento = 0.0;
        
        facturas objeto = new facturas();
        objeto.cantidad[0]= 1;
        objeto.preciounitario[0] = 200;
        
        calcImpuesto= objeto.calculoFacturas();
        System.out.println("calculo: "+ calcImpuesto);
        
        objeto.cantidad[0]= 2;
        objeto.preciounitario[0] = 500;
        calcDescuento= objeto.calculoFacturas();
        System.out.println("calculo: "+ calcDescuento);
        boolean condition = calcImpuesto > calcDescuento;
        System.out.println(condition);
        assertTrue(calcImpuesto > calcDescuento);
        
        //System.out.println("Valor real: "+ valorReal);
        //System.out.println("Valor esperado: " + valorEsperado);
      
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
