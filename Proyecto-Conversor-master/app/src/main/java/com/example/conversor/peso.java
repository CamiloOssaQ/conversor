package com.example.conversor;

public class peso extends Conversor{
    public peso(String unidadOrigen, String unidadDestino) {
        super(unidadOrigen, unidadDestino);
    }
    @Override
    public double convertir(double cantidad) {
        if(unidadOrigen.equals("Kilogramos") && unidadDestino.equals("Libras")){
            return (cantidad * 2.20462);
        }else if (unidadOrigen.equals("Libras") && unidadDestino.equals("Kilogramos")){
            return (cantidad * 0.453592);
        }else if (unidadOrigen.equals("Gramos") && unidadDestino.equals("Libras")){
            return (cantidad * 0.00220462);
        }else if (unidadOrigen.equals("Libras") && unidadDestino.equals("Gramos")){
            return (cantidad * 453.592);
        }else if (unidadOrigen.equals("Kilogramos") && unidadDestino.equals("Gramos")){
            return (cantidad * 1000);
        }else if (unidadOrigen.equals("Gramos") && unidadDestino.equals("Kilogramos")){
            return (cantidad * 0.001);
        }else if (unidadOrigen.equals("Toneladas") && unidadDestino.equals("Kilogramos")){
            return (cantidad * 1000);
        }else if (unidadOrigen.equals("Kilogramos") && unidadDestino.equals("Toneladas")){
            return (cantidad * 0.001);
        }else if (unidadOrigen.equals("Libras") && unidadDestino.equals("Onzas")){
            return (cantidad * 16);
        }else if (unidadOrigen.equals("Onzas") && unidadDestino.equals("Libras")){
            return (cantidad * 0.0625);
        }else if (unidadOrigen.equals("Gramos ") && unidadDestino.equals("Onzas")){
            return (cantidad * 0.035274);
        }else if (unidadOrigen.equals("Onzas") && unidadDestino.equals("Gramos")){
            return (cantidad * 28.3495);
        }else if (unidadOrigen.equals("Toneladas") && unidadDestino.equals("Libras")){
            return (cantidad * 2204.62);
        }else if (unidadOrigen.equals("Libras") && unidadDestino.equals("Toneladas")){
            return (cantidad * 0.000453592);
        }else if (unidadOrigen.equals("Toneladas") && unidadDestino.equals("Gramos")){
            return (cantidad * 1000000);
        }else if (unidadOrigen.equals("Gramos") && unidadDestino.equals("Toneladas")){
            return (cantidad * 0.000001);
        }else if (unidadOrigen.equals("Toneladas") && unidadDestino.equals("Miligramos")){
            return (cantidad * 1000000000);
        }else if (unidadOrigen.equals("Miligramos") && unidadDestino.equals("Toneladas")){
            return (cantidad * 0.000000001);
        }else if (unidadOrigen.equals("Kilogramos") && unidadDestino.equals("Miligramos")){
            return (cantidad * 1000000);
        }else if (unidadOrigen.equals("Miligramos") && unidadDestino.equals("Kilogramos")){
            return (cantidad * 0.000001);
        }else{
            throw new IllegalArgumentException("Pesos no compatibles");
        }
    }
}
