package Classes.GeoShapes.Entities;


public class Circulo extends Shape {
    
    private String id = "CIRCULO";
    private Double raio;



    public Circulo() {
        super();
    }

    public Circulo(Double raio) {
        this.raio = raio;
    }






    public Double getRaio() {
        return raio;
    }
    public String getId() {
        return id;
    }




    @Override
    public double area(){
        return Math.PI * (raio * raio);
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
