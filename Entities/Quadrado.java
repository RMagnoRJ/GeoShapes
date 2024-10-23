package Classes.GeoShapes.Entities;

import Classes.GeoShapes.Enum.Color;

public class Quadrado extends Shape {
    
    private Double lado;

    public Quadrado(Color cor, Double lado) {
        super(cor);
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double area(){
        return lado * lado;
    }
}
