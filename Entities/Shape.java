package Classes.GeoShapes.Entities;


public interface Shape {
    
    double area();

    String titulo();

    String resultado();

    /* 
     * Não há necessidade de declarar PUBLIC ABSTRACT nos métodos, pois, em
     * se tratando de INTERFACES, presume-de que seus métodos já serão
     * todos PÚBLICOS e ABSTRATOS.
     */
}
