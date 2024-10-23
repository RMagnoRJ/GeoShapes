package Classes.GeoShapes.Entities;

import Classes.GeoShapes.Enum.Color;

public class Trapezio extends Shape {
    
    private Double baseMenor;
    private Double baseMaior;
    private Double altura;


    public Trapezio(Color cor, Double baseMenor, Double baseMaior, Double altura) {
        super(cor);
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
    }


    public Double getBaseMenor() {
        return baseMenor;
    }


    public void setBaseMenor(Double baseMenor) {
        this.baseMenor = baseMenor;
    }


    public Double getBaseMaior() {
        return baseMaior;
    }


    public void setBaseMaior(Double baseMaior) {
        this.baseMaior = baseMaior;
    }


    public Double getAltura() {
        return altura;
    }


    public void setAltura(Double altura) {
        this.altura = altura;
    }

    
    @Override
    public double area(){

        return ((baseMaior + baseMenor) * altura) / 2;
    }
    
}
