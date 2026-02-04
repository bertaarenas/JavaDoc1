import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usuarios = {"pepegarcia", "bertaarenas", "noelia2344", "mariogomez333"};
        String[] contrasenas = {"Sol1234Luna", "berta2007", "123456789", "Mario_5896"};

        boolean accesoPrograma = false;

        while (!accesoPrograma) {
            try {
                System.out.println("-------------------------");
                System.out.println("Ingrese el nombre del usuario: ");
                String u = scanner.next();
                System.out.println("Ingrese la contraseña: ");
                String p = scanner.next();
                System.out.println("-------------------------");

                accesoPrograma = validar(u, p, usuarios, contrasenas);
                System.out.println("Acceso correcto.");

            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        }
    }
    /**
     * @author Berta
     * @param u
     * @param p
     * @param usuarios
     * @param contrasenas
     * @return Devuelve true si el usuario y la contraseña coincide
     * @throws Exception si el usuario o la contraseña no coinciden
     */
    public static boolean validar(String u, String p, String[] usuarios, String[] contrasenas) throws Exception {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(u) && contrasenas[i].equals(p)) {
                return true;
            }
        }
        throw new Exception("Usuario o contraseña incorrecta.");
    }
}




