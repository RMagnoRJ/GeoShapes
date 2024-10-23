package Classes.GeoShapes.Entities;


public class Triangulo extends Shape {
    
    private String id = "TRIANGULO";
    private Double base;
    private double altura;


    public Triangulo() {
        super();
    }

    public Triangulo(Double base, double altura) {
        this.base = base;
        this.altura = altura;
    }




    public Double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getId() {
        return id;
    }

    
    
    @Override
    public double area(){
        return (base * altura) / 2;
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
