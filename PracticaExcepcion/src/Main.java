import exception.MiException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static String calculo(int a, int b) throws Exception{
        int a1 = validar(a);
        int b1 = validar(b);
        return ("resultado: " + a1 / b1);
    }

    private static int validar(int a) throws MiException, Exception {
        if (a == 0){
            throw new MiException("El valor es cero");
        }
        return a;
    }

    public static void main(String[] args) {
        try {
            int a = 100;
            int b = 0;

            calculo(a, b);
            System.out.println("Resuelto es: " + a);

        }
        catch(Exception e){
            System.out.println("División entre zero");
        } finally{
            System.out.println("Términe");
        }
    }
}