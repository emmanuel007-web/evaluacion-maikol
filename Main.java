public class Main {

    public static void main(String[] args) {
        Competidor competidor1 = new Competidor("emmanuel", 14, "");
        Competidor competidor2 = new Competidor("isabela", 13, "");
        Competidor competidor3 = new Competidor("santiago", 15, "");
        
        int calificacio = 100;
        Jueces juez = new Jueces(0);

        competidor1.informacionPart();
        competidor1.crearInvento();
        juez.calificacion();
        competidor2.informacionPart();
        competidor2.crearInvento();
        juez.calificacion();
        competidor3.informacionPart();
        competidor3.crearInvento();
        juez.calificacion();
       
    }
    
}
