package com.ss.conversorMultiple.Logica;

/**
 *
 * @author sebasatelier
 */
public enum CurrencyValue {
    
    USD("USD", 267.61F),
    EURO("Euros", 300.22F),
    LIBRA("Libras esterlinas", 348.92F),
    YEN("Yenes japoneses", 1.91F),
    PESO("Pesos", 1.00F);

    private String nombre;
    private float valor;

    private CurrencyValue(String nombre, float valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public float getValor() {
        return valor;
    }
    
}
