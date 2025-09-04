public class Competencia {
    String nombre;
    int edad;

    public Competencia(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad; 
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }


    public void setEdad(int edad){
        this.edad = edad;
    }

    
    public void informacionPart(){
        System.out.println("---------------------Informacion de los participantes----------------------");
        System.out.println("Nombre del participante:  " + nombre );
        System.out.println("Edad del participante: " + edad);
        System.out.println("-------------------------------------------------------------");
    }
}
