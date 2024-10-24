package Classes.GeoShapes.Application;

import java.util.Scanner;

import Classes.GeoShapes.Entities.Circulo;
import Classes.GeoShapes.Entities.ColorPalette;
import Classes.GeoShapes.Entities.Losango;
import Classes.GeoShapes.Entities.Quadrado;
import Classes.GeoShapes.Entities.Retangulo;
import Classes.GeoShapes.Entities.Shape;
import Classes.GeoShapes.Entities.Trapezio;
import Classes.GeoShapes.Entities.Triangulo;


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
        boolean on = true;
        ColorPalette trocaCor = new ColorPalette();


        while (on == true){

            System.out.println("\n      **********");
            System.out.println(  "      |  MENU  |");
            System.out.println(  "      **********");

            System.out.print("\nEscolha uma figura geométrica\npara calcular a área:\n" +
            "[1] Quadrado\n" +
            "[2] Retângulo\n" +
            "[3] Trapézio\n" +
            "[4] Círculo\n" +
            "[5] Triângulo\n" +
            "[6] Losango\n" +
            "[7] Encerrar programa\n" +
            "\n> ");

            int menu = inn.nextInt();
            Double num1 = 0.0;
            Double num2 = 0.0;
            Double num3 = 0.0;
            ColorPalette colorido;

            switch (menu) {
                
                case 1:
                    // quadrado
                    Shape quadrado = new Quadrado();
                    quadrado.titulo();
                    System.out.print("Digite o tamanho do lado: ");
                    num1 = inn.nextDouble(); inn.nextLine();
                    quadrado = new Quadrado(num1);
                    colorido = new ColorPalette(trocaCor.mix(), quadrado.resultado());
                    colorido.resultadoColorido();
                    break;

                case 2:
                    // retângulo
                    Shape retangulo = new Retangulo();
                    retangulo.titulo();
                    System.out.print("Digite o tamanho da base: ");
                    num1 = inn.nextDouble(); inn.nextLine();
                    System.out.print("Digite o tamanho da altura: ");
                    num2 = inn.nextDouble(); inn.nextLine();
                    retangulo = new Retangulo(num1, num2);
                    colorido = new ColorPalette(trocaCor.mix(), retangulo.resultado());
                    colorido.resultadoColorido();
                    break;

                case 3:
                    // trapézio
                    Shape trapezio = new Trapezio();
                    trapezio.titulo();
                    System.out.print("Digite o tamanho da base menor: ");
                    num1 = inn.nextDouble(); inn.nextLine();
                    System.out.print("Digite o tamanho da base maior: ");
                    num2 = inn.nextDouble(); inn.nextLine();
                    System.out.print("Digite o tamanho da altura: ");
                    num3 = inn.nextDouble(); inn.nextLine();
                    trapezio = new Trapezio(num1, num2, num3);
                    colorido = new ColorPalette(trocaCor.mix(), trapezio.resultado());
                    colorido.resultadoColorido();
                    break;

                case 4:
                    // circulo
                    Shape circulo = new Circulo();
                    circulo.titulo();
                    System.out.print("Digite o tamanho do raio: ");
                    num1 = inn.nextDouble(); inn.nextLine();
                    circulo= new Circulo(num1);
                    colorido = new ColorPalette(trocaCor.mix(), circulo.resultado());
                    colorido.resultadoColorido();
                    break;

                case 5:
                    // triangulo
                    Shape triangulo = new Triangulo();
                    triangulo.titulo();
                    System.out.print("Digite o tamanho da base: ");
                    num1 = inn.nextDouble(); inn.nextLine();
                    System.out.print("Digite o tamanho da altura: ");
                    num2 = inn.nextDouble(); inn.nextLine();
                    triangulo = new Triangulo(num1, num2);
                    colorido = new ColorPalette(trocaCor.mix(), triangulo.resultado());
                    colorido.resultadoColorido();
                    break;

                case 6:
                    // losango
                    Shape losango = new Losango();
                    losango.titulo();
                    System.out.print("Digite o tamanho da diagonal maior: ");
                    num1 = inn.nextDouble(); inn.nextLine();
                    System.out.print("Digite o tamanho da diagonal menor: ");
                    num2 = inn.nextDouble(); inn.nextLine();
                    losango = new Losango(num1, num2);
                    colorido = new ColorPalette(trocaCor.mix(), losango.resultado());
                    colorido.resultadoColorido();
                    break;

                case 7:
                    // sair
                    on = false;
                    break;
            }
        }












        inn.close();
    }

}
