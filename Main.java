public class Main {

    public static void main(String[] args) {
        
        Competidor competidor1 = new Competidor("emmanuel", 14, 60, "");
        Competidor competidor2 = new Competidor("isabela", 13, 75, "");
        Competidor competidor3 = new Competidor("santiago", 15, 78, "");

        competidor1.crearInvento();
        competidor1.informacionPart();
        competidor2.crearInvento();
        competidor2.informacionPart();
        competidor3.crearInvento();
        competidor3.informacionPart();    }
    
}
