import java.util.Scanner;
public class Competidor extends Competencia{
    private String invento;

    public Competidor(String nombre, int edad, int nvCreatividad, String invento){
        super(nombre, edad, nvCreatividad);
        this.invento = invento;

    }

    public void crearInvento(){
        Scanner scam = new Scanner(System.in);

        String invento;
        System.out.println("tu invento es: ");
        invento = scam.nextLine();

        System.out.println("mi invento es: " + invento);
        
    }

    @Override
    public void informacionPart(){
        super.informacionPart();
    }
}
