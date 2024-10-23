package Classes.GeoShapes.Entities;

import java.util.Random;

import Classes.GeoShapes.Enum.Color;

public class ColorPalette {
    
    private Color cor;
    private String resultado;

    

    public ColorPalette() {
    }

    public ColorPalette(Color cor, String resultado) {
        this.cor = cor;
        this.resultado = resultado;
    }

    

    public Color getCor() {
        return cor;
    }

    public String getResultado() {
        return resultado;
    }


    public void resultadoColorido(){

        String code = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[34m";
        String magenta = "\u001B[35m";
        String ciano = "\u001B[36m";
        String white = "\u001B[37m";
        String codeColor = "";

        if (getCor() == Color.RED){
           codeColor = red;
        } else if (getCor() == Color.GREEN){
            codeColor = green;
        } else if (getCor() == Color.YELLOW){
            codeColor = yellow;
        } else if (getCor() == Color.BLUE){
            codeColor = blue;
        } else if (getCor() == Color.MAGENTA){
            codeColor = magenta;
        } else if (getCor() == Color.CIANO){
            codeColor = ciano;
        } else if (getCor() == Color.WHITE) {
            codeColor = white;
        }

        System.out.println(codeColor + resultado + code);
    }


    public Color mix(){

        Random geraNum = new Random();
        int num = 0;

        for (int i = 1; i < 4; i++){
            num = geraNum.nextInt(1,7);
        }

        if (num == 1){
            return Color.RED;
        } else if (num == 2){
            return Color.GREEN;
        } else if (num == 3){
            return Color.YELLOW;
        } else if (num == 4 ){
            return Color.BLUE;
        } else if (num == 5){
            return Color.MAGENTA;
        } else if (num == 6){
            return Color.CIANO;
        } else {
            return Color.WHITE;
        }
       
    }





    

    

}
