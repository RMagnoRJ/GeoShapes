package Classes.GeoShapes.Entities;


public class Trapezio extends Shape {
    
    private String id = "TRAPEZIO";
    private Double baseMenor;
    private Double baseMaior;
    private Double altura;
    

    public Trapezio() {
        super();
    }


    public Trapezio(Double baseMenor, Double baseMaior, Double altura) {
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
    }




    public Double getBaseMenor() {
        return baseMenor;
    }

    public String getId() {
        return id;
    }

    public Double getBaseMaior() {
        return baseMaior;
    }

    public Double getAltura() {
        return altura;
    }



    
    @Override
    public double area(){

        return ((baseMaior + baseMenor) * altura) / 2;
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
