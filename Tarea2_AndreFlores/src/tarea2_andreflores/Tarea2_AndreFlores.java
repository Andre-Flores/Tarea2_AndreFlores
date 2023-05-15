package tarea2_andreflores;

import java.util.Scanner;

public class Tarea2_AndreFlores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc;

        do {
            System.out.println("Bienvenido a mi programa, las opciones son: ");
            System.out.println("1) Replace");
            System.out.println("2) Factorial");
            System.out.println("3) Mensajes");
            System.out.println("4) Promedios");
            System.out.println("5) Aprobado o reprobado");
            System.out.println("6) Contains");
            System.out.println("7) Salir");
            opc = entrada.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("escogio la opcion 1) Replace");
                    replace();
                } // fin case 1
                break;
                case 2: {
                    System.out.println(" escogio la opcion 2) Factorial");
                    probfactorial();
                } // fin case 24
                break;
                case 3: {
                    System.out.println("escogio la opcion 3) Mensajes");
                    mensajes();
                }
                break;
                case 4: {
                    System.out.println("escogio la opcion 4) Promedio");
                    promedionot();

                }
                break;
                case 5: {

                    System.out.println("escogio la opcion 5) aprobado o reprobado");
                    System.out.println("ingrese su nota");
                    int nota = entrada.nextInt();
                    boolean aprob = aprobadooreprobado(nota);
                    if (aprob) {
                        System.out.println(" usted aprobo");
                    } else {
                        System.out.println("usted reprobo");
                    }
                }
                break;
                case 6: {
                    boolean sicont = metcontains();
                    if (sicont){
                        System.out.println(" La cadena original si contiene lo que busca");
                    } else{
                        System.out.println("La cadena original no contiene lo que busca");
                    }
                } // fin case 6
                break;
                case 7: {
                    System.out.println(" Usted escogio 7) Salir. gracias por utilizar mi programa");
                }
            }// fin switch
        } while (opc != 7);// fin do while
    } // fin main

    public static int probfactorial() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el numero del que quiere saber el factorial: ");
        int numero = entrada.nextInt();
        int factorial = 1;
        int contador = 1;
        while (numero < 1 || numero > 15) {
            System.out.println("ingrese un numero correcto, mayor que 1 y menor que 15 ");
            numero = entrada.nextInt();
        } // fin while
        while (contador <= numero) {
            factorial = factorial * contador;
            contador++;
        }
        System.out.println(" el factorial de " + numero + " es: " + factorial);
        return factorial;
    } // fin metodo

    public static void mensajes() {
        Scanner entrada = new Scanner(System.in);
        String cad;
        System.out.println("ingrese lo que quiere imprimir");
        cad = entrada.nextLine();
        System.out.println("su cadena es: " + cad);
    } // fin metodo mensajes

    public static double promedionot() {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ingrese la primera nota");
        int nota1 = entrada.nextInt();
        System.out.println(" ingrese la segunda nota");
        int nota2 = entrada.nextInt();
        System.out.println(" ingrese la tercera nota");
        int nota3 = entrada.nextInt();
        System.out.println(" ingrese la cuarta nota");
        int nota4 = entrada.nextInt();
        int promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("el promedio es: " + promedio);
        return promedio;
    }

    public static boolean aprobadooreprobado(int nota) {
        Scanner entrada = new Scanner(System.in);

        if (nota >= 60) {
            return true;
        } else {
            return false;
        }

    }

    public static String replace() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cadena a reemplazar: ");
        String cad = entrada.nextLine();
        System.out.println("Ingrese el caracter que quiere reemplazar: ");
        char charviejo = entrada.next().charAt(0);
        System.out.println("Ingrese el caracter por el que va a cambiar: ");
        char charnuevo = entrada.next().charAt(0);
        String newcad = "";
        for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if (c == charviejo) {
                c = charnuevo;
            } // fin if
            newcad += c;
        } // fin for
        System.out.println(" su nueva cadena es: " + newcad);
        return newcad;
    }

    public static boolean metcontains() {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println(" usted escogio 6) contains");
        System.out.println("ingrese la cadena principal");

         String cadoriginal = entrada.nextLine();
        System.out.println("Ingrese la cadena que quiere buscar: ");
         String cadnew = entrada.nextLine();

        for (int i = 0; i <= cadoriginal.length() - cadnew.length(); i++) {
            boolean lotiene = true;
            for (int j = 0; j < cadnew.length(); j++) {
                if (cadoriginal.charAt(i + j) != cadnew.charAt(j)) {
                    lotiene = false;
                    break;
                }
            }
            if (lotiene) {
                return true;
            }
        }
        return false;
    }

} // fin class
