package Classes.GeoShapes.Entities;


public class Losango extends AbstractShape {

    private String id = "LOSANGO";
    private Double diagonalMaior;
    private Double diagonalMenor;



    public Losango() {
        super();
    }

    public Losango(Double diagonalMaior, Double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }




    public Double getDiagonalMaior() {
        return diagonalMaior;
    }

    public String getId() {
        return id;
    }

    public Double getDiagonalMenor() {
        return diagonalMenor;
    }




    @Override
    public double area(){
        return (diagonalMaior * diagonalMenor) / 2;
    }
    
    @Override
    public String titulo(){

        String abertura = "# CALCULANDO A AREA DO ";
        String fechamento = " #";
        return abertura + id + fechamento;
    }

    @Override
    public String resultado(){
        return "Área do " + id + " = " + String.format("%.2f" , area());
    }
}
