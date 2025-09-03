public class Competencia {
    String nombre;
    int edad;
    private int nvCreatividad;

    public Competencia(String nombre, int edad, int nvCreatividad){
        this.nombre = nombre;
        this.edad = edad;
        this.nvCreatividad = nvCreatividad; 
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

    public int getNvCreatividad(){
        return nvCreatividad;
    }

    public void setNvCreatividad(int nvCreatividad){
        this.nvCreatividad = nvCreatividad;
    }


    public void informacionPart(){
        System.out.println("---------------------Informacion de los participantes----------------------");
        System.out.println("Nombre del participante:  " + nombre );
        System.out.println("Edad del participante: " + edad);
        System.out.println("nivel de creatividad: " + nvCreatividad);
        System.out.println("-------------------------------------------------------------");
    }
}
