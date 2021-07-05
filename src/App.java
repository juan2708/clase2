import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese la fecha en formato DD/MM/YYYY: ");
        String fecha = sca.nextLine();
        sca.close();
        int nro_suerte = nroSuerte(fecha);
        System.out.println("Tu numero de la suerte es " + nro_suerte);
    }

    public static Integer nroSuerte(String fecha){
        //fechas en formato DD/MM/YYYY
        int part1 = Integer.parseInt(fecha.substring(0,2));//devuelve los 2 primeros digitos de la fecha
        int part2 = Integer.parseInt(fecha.substring(3,5));//devuelve los digitos 4 y 5 de la fecha
        int part3 = Integer.parseInt(fecha.substring(6,10));//devuelve los ultimos 4 digitos de la fecha
        int suma = part1 + part2 + part3; //calcula la suma de las 3 partes de la fecha
        int nro_suerte = 0;
        while(suma!=0){
            nro_suerte += (suma%10); //devuelve el cociente de la division entre 10
            //lo que sirve para ir sacando digito a digito los valores contenidos en suma
            //desde el ultimo hasta el primero
            suma /= 10;//va reduciendo los digitos que tiene la variable suma
        }
        return nro_suerte;
    }
}
