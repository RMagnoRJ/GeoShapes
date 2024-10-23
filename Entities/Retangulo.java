package Classes.GeoShapes.Entities;

import Classes.GeoShapes.Enum.Color;

public class Retangulo extends Shape {
    
    private Double altura;
    private double base;

    public Retangulo(Color cor, Double altura, double base) {
        super(cor);
        this.altura = altura;
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area(){
        return base * altura;
    }

}
