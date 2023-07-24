package com.ss.conversorMultiple.Logica;

public class Temperature {
    
    private float quantity;
    
    public Temperature (float quantity){
        this.quantity = quantity;
    }
    
    public float CelsiusToKelvin(){
        if(quantity >= -273.15F){
        return quantity + 273.15F;
        }
        throw new IllegalArgumentException("La cantidad no puede ser menor a -273.15ºC");
    }
    
    public float KelvinToCelsius(){
        if(quantity >= 0.00F){
        return quantity - 273.15F;
        }
        throw new IllegalArgumentException("La cantidad no puede ser menor a 0.00 K");
    }
    
    public float CelsiusToFahrenheit(){
        
        return (quantity * (9.00F/5.00F)) + 32.00F;
    }
    
    public float FahrenheitToCelsius(){
        return (quantity - 32.00F) * (5.00F/9.00F);
    }
    
    public float KelvinToFahrenheit(){
        return (KelvinToCelsius() * (9.00F/5.00F)) + 32.00F;
    }
    
    public float FahrenheitToKelvin(){
        if(quantity >= -459.67F){
        return FahrenheitToCelsius() + 273.15F;
        }
        throw new IllegalArgumentException("La cantidad no puede ser menor a -459.67 K");
    }
}
