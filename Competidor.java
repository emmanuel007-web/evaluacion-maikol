import java.util.Scanner;
public class Competidor extends Competencia{
    private String invento;

    public Competidor(String nombre, int edad, String invento){
        super(nombre, edad);
        this.invento = invento;

    }

    public void crearInvento(){
        Scanner scam = new Scanner(System.in);


        System.out.println("tu invento es ?? ");
        String invento;
        System.out.println("mi invento es: ");
        invento = scam.nextLine();

        
        
    }

    @Override
    public void informacionPart(){
        super.informacionPart();
    }
}
