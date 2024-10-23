package Classes.GeoShapes.Entities;

import Classes.GeoShapes.Enum.Color;

public class Losango extends Shape {

    private Double diagonalMaior;
    private Double diagonalMenor;


    public Losango(Color cor, Double diagonalMaior, Double diagonalMenor) {
        super(cor);
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }


    public Double getDiagonalMaior() {
        return diagonalMaior;
    }


    public void setDiagonalMaior(Double diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }


    public Double getDiagonalMenor() {
        return diagonalMenor;
    }


    public void setDiagonalMenor(Double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double area(){
        return (diagonalMaior * diagonalMenor) / 2;
    }
    
}
