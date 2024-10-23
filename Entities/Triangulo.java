package Classes.GeoShapes.Entities;

import Classes.GeoShapes.Enum.Color;

public class Triangulo extends Shape {
    
    private Double base;
    private double altura;


    public Triangulo(Color cor, Double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }


    public Double getBase() {
        return base;
    }


    public void setBase(Double base) {
        this.base = base;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    @Override
    public double area(){
        return (base * altura) / 2;
    }
    
}
