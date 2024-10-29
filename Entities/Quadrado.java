package Classes.GeoShapes.Entities;


public class Quadrado extends AbstractShape {
    
    private String id = "QUADRADO";
    private Double lado;

    

    public Quadrado() {
        super();
    }

    public Quadrado(Double lado) {
        this.lado = lado;
    }





    public Double getLado() {
        return lado;
    }

    public String getId() {
        return id;
    }
    

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double area(){
        return lado * lado;
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
