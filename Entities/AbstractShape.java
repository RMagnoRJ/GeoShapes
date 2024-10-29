package Classes.GeoShapes.Entities;

import java.util.Random;

import Classes.GeoShapes.Enum.Color;

public abstract class AbstractShape implements Shape {

    /* Para solucionar conflitos no compilador, com relação
     * a implementar a interface SHAPE declaramos que esta é
     * uma classe ABSTRATA, assim, os métodos não precisarão
     * ser implementados NESTA CLASSE e sim, nas subclasses.
     */
    
    private String id;

    

    public AbstractShape() {
    }


    public AbstractShape(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
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
