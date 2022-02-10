package com.kairosds.cursospb2.perfiles;

public class ServicioImpresionConFormato implements ServicioImpresion {
    @Override
    public void imprimir(String mensaje) {
        System.out.println("*** " + mensaje + " ***");
    }
}
