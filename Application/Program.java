package Classes.GeoShapes.Application;

import java.util.Scanner;

import Classes.GeoShapes.Entities.Shape;
import Classes.GeoShapes.Entities.Circulo;
import Classes.GeoShapes.Entities.Retangulo;
import Classes.GeoShapes.Enum.Color;


public class Program {
    public static void main(String[] args) {
        // 173 - Combinando Interface e Herança

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("                    GeoShapes v 1.0                  ");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        Scanner inn = new Scanner (System.in);
        
        Shape redondo = new Circulo(Color.GREEN, 2.0);
        Shape quadro = new Retangulo(Color.MAGENTA, 3.0, 4.0);

        System.out.println("Cor do circulo: " + redondo.getCor());
        System.out.println("Area do circulo: " + String.format("%.2f", redondo.area()));
        System.out.println("Cor do retangulo: " + quadro.getCor());
        System.out.println("Area do retangulo: " + String.format("%.2f", quadro.area()));












        inn.close();
    }
}
