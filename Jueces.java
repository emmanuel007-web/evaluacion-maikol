import java.util.Scanner;

public class Jueces{
    private int nvCreatividad;

    public Jueces(int nvCreatividad){
        this.nvCreatividad = nvCreatividad;
    }

    public void calificacion(){
        Scanner scam = new Scanner(System.in);

        int nvCreatividad;
        System.out.println("El nivel de creatividad de tu invento es de:  ");
        nvCreatividad = scam.nextInt();

        if (nvCreatividad <= 40) {
            System.out.println("el nivel de creatividad es regular, tu puntaje de creatividad es de:  " + nvCreatividad);
        }else if(nvCreatividad >= 41 && nvCreatividad <= 70) {
            System.out.println("el nivel de creatividad es buena, tu puntaje de creatividad es de:  " + nvCreatividad);
        }else if(nvCreatividad >= 71 && nvCreatividad <= 100) {
            System.out.println("el nivel de creatividad es excelente, tu puntaje de creatividad es de:  " + nvCreatividad);
        } else {
         System.out.println("espere su turno, GRACIAS................");   
        }
    }
}
