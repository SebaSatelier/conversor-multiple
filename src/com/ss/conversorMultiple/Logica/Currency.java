package com.ss.conversorMultiple.Logica;


public class Currency {
    
    private CurrencyValue currency1, currency2;
    private float quantity;

    public Currency(String currency1, String currency2, float quantity){
        this.currency1 = findCurrencyValue(currency1);
        this.currency2 = findCurrencyValue(currency2);
        this.quantity = quantity;
    }

    public float converter(){
        if(this.currency1.getNombre().compareTo("Pesos") == 0) {
            return quantity / this.currency2.getValor();
        } else{
            return quantity * this.currency1.getValor();
        }
    }
    
    private CurrencyValue findCurrencyValue(String currencyName) {
        for (CurrencyValue currency : CurrencyValue.values()) {
            if (currency.getNombre().equalsIgnoreCase(currencyName)) {
                return currency;
            }
        }
        throw new IllegalArgumentException("Moneda no encontrada: " + currencyName);
    }

}
