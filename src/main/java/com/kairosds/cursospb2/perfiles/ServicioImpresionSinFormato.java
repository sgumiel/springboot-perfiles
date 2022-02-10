package com.kairosds.cursospb2.perfiles;

public class ServicioImpresionSinFormato implements ServicioImpresion {
    @Override
    public void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
