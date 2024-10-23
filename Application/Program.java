package Classes.GeoShapes.Application;

import java.util.Scanner;

import Classes.GeoShapes.Entities.ColorPalette;
import Classes.GeoShapes.Entities.Quadrado;
import Classes.GeoShapes.Entities.Shape;


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

            System.out.print("\nEscolha uma figura geomátrica\npara calcular a área:\n" +
            "[1] Quadrado\n" +
            "[2] Retangulo\n" +
            "[3] Trapezio\n" +
            "[4] Círculo\n" +
            "[5] Triângulo\n" +
            "[6] Losango\n" +
            "[7] Encerrar programa\n" +
            "\n> ");

            int menu = inn.nextInt();
            Double num1 = 0.0;
            //Double num2;

            switch (menu) {
                case 1:
                    // quadrado
                    Shape quadrado = new Quadrado();
                    quadrado.titulo();
                    System.out.print("Digite o tamanho do lado: ");
                    num1 = inn.nextDouble(); inn.nextLine();
                    quadrado = new Quadrado(num1);
                    ColorPalette colorido = new ColorPalette(trocaCor.mix(), quadrado.resultado());
                    colorido.resultadoColorido();
                    break;

                case 2:
                    // retangulo
                    break;

                case 3:
                    // trapezio
                    break;

                case 4:
                    // circulo
                    break;

                case 5:
                    // triangulo
                    break;

                case 6:
                    // losango
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
