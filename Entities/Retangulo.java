package Classes.GeoShapes.Entities;


public class Retangulo extends AbstractShape {
    
    private String id = "RETANGULO";
    private Double altura;
    private double base;




    public Retangulo() {
        super();
    }

    public Retangulo(Double base, double altura) {
        this.base = base;
        this.altura = altura;
    }





    public Double getAltura() {
        return altura;
    }

    public String getId() {
        return id;
    }

    public double getBase() {
        return base;
    }

 

    @Override
    public double area(){
        return base * altura;
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
