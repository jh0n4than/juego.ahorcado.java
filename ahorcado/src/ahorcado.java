import java.util.Scanner;

public class ahorcado  {
 public static void main(String[] args) throws Exception {
        // JUEGO DEL AHORCADO

        // SCANNER: es la entrada de datos proporcionados por el usuario

        Scanner scanner = new Scanner(System.in);
        // Declaraciones y asignaciones 
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //areglos o (matris)
        //En Java, "char" es un tipo de dato que se utiliza
        // para almacenar caracteres (letras, números, símbolos, etc.)
        //también puedes usarlo para asignar un número entero que
        // corresponde al código de un carácter en el sistema

        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        //estructura de control: interactiva (bucle) 
        //muestra los espacios de la palabra
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // estructura de control interactiva  (bucle)  
        while(!palabraAdivinada && intentos < intentosMaximos ){
                                                     // esto se usa cuando formamos una palabra de varios chars
            System.out.println("palabra a adivinar " + String.valueOf(letrasAdivinadas) + " (" +  palabraSecreta.length() + " letras)");
            System.out.println("introduce una letra, por favor ");
            //usamos la clase "scanner" para introducir una letra
            //"tolowerCase" para convertir mayudculas a minusculas "character" para convertir una variable
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false; 
            //for (bucle) para recorer la palabra 
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //estructura de control condicional
                //para recores una parabra usamos charAt por indice
                //letra por letra DONDE CADA LETRA TIENE UN PUESTO (1 , 2, 3)
                if(palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true ;
                }    
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("incorrecto te quedan " + (intentosMaximos - intentos ) + " intentos " );

            }
            //"ecuals" me indica si las dos variables son iguales
            //"valueOf" se utiliza para convertir diferentes tipos 
            //de datos en un objeto de su clase correspondiente
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true ;
                System.out.println("felicidades has adivinado la palabra secreta " + palabraSecreta); 
            }
        } 
        if(!palabraAdivinada){
                    System.out.println("lociento te has quedado sin intentos GAME OVER");
        } 
                scanner.close();
    }
}
