package Classes.GeoShapes.Entities;

import Classes.GeoShapes.Enum.Color;

public class Circulo extends Shape {
    
    private Double raio;

    public Circulo(Color cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area(){
        return Math.PI * (raio * raio);
    }
}
