package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerTxt = new Scanner(System.in);
        int n, m = 1;
        String a = "";
        boolean seguir = true;
        
        while (seguir){
            
        
        System.out.println("Lista de Ejercicios:");
        System.out.println("1- Convertir número décimal en una su valor hexadecimal.");
        System.out.println("2- Sumar el numero ingresado una n cantidad de veces.");
        System.out.println("3- Encontrar número en la posición n de la secuencia fibonacci (Comenzando por la posición 0), mostrando todos los procesos necesarios.");
        System.out.println("4- Encontrar la determinante de una matriz nxn.");
        System.out.println("5- Mostrar la tabla de multiplicar de n hasta que el resultado sea 12.");
        System.out.println("6- Ingresar nombres de ciudades y mostrarlas de la última a la primera.");
        System.out.println("7- Calcular factorial o potenciación.");
        System.out.println("8- Verificar si un número es palindromo.");
        System.out.println("9- Invertir una cadena de texto.");
        System.out.println("10- Ingresar una n cantidad de numeros, mostrar suma de positivos y negativos, y contar pares e impares.");
        System.out.println("Cualquier otro- Salir del sistema.");
        System.out.println("");
        System.out.print("Ingrese el numero del ejercicio que desea probar: ");
        int eleccion = scanner.nextInt();
        
        switch (eleccion){
            case 1:
                System.out.print("Ingrese el numero a convertir (Por ejemplo 65029): ");
                n = scanner.nextInt();
                System.out.print("Ingrese la base del sistema (Por ejemplo 16): ");
                m = scanner.nextInt();
                ejercicio1(n,m);
                break;
            case 2:
                System.out.print("Ingrese el numero (Por ejemplo 5): ");
                n = scanner.nextInt();
                System.out.print("Ingrese la cantidad de veces a sumar (Por ejemplo 3): ");
                m = scanner.nextInt();
                ejercicio2(n,m);
                break;
            case 3:
                System.out.print("Ingrese la posición del numero (Por ejemplo 5) (La primera posición es 0): ");
                n = scanner.nextInt();
                ejercicio3(n);
                break;
            case 4:
                System.out.print("Ingrese la dimension de la matriz: ");
                n = scanner.nextInt();
                int[][] matriz = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.println("Ingrese el elemento " + "["+i+"]" + "["+j+"]:");
                        matriz[i][j] = scanner.nextInt();
                    }
                }
                ejercicio4(matriz);
                break;
            case 5:
                System.out.print("Ingrese el numero (Por ejemplo 5): ");
                n = scanner.nextInt();
                System.out.print("Ingrese el maximo (Por ejemplo 12): ");
                m = scanner.nextInt();
                ejercicio5(n,m);
                break;
            case 6:
                System.out.print("Ingrese la cantidad de ciudades (Por ejemplo 3): ");
                n = scanner.nextInt();
                ejercicio6(n);
                break;
            case 7:
                System.out.print("Ingrese la accion que desea realizar (1: Factorial 2:Potencia): ");
                int accion = scanner.nextInt();
                if (accion == 1) {
                    System.out.print("Ingrese el numero (Por ejemplo 5): ");
                    n = scanner.nextInt();
                    ejercicio7(accion,n,m);
                } else if (accion == 2) {
                    System.out.print("Ingrese la base (Por ejemplo 5): ");
                    n = scanner.nextInt();
                    System.out.print("Ingrese el exponente (Por ejemplo 2): ");
                    m = scanner.nextInt();
                    ejercicio7(accion,n,m);
                } 
                break;
            case 8:
                System.out.print("Ingrese el numero a verificar (Por ejemplo 1001): ");
                a = scannerTxt.nextLine();
                ejercicio8(a);
                break;
            case 9:
                System.out.print("Ingrese la palabra (Por ejemplo JAVA): ");
                a = scannerTxt.nextLine();
                ejercicio9(a);
                break;
            case 10:
                System.out.print("Ingrese la cantidad de numeros (Por ejemplo 5): ");
                n = scanner.nextInt();
                ejercicio10(n);
                break;
            default:
                System.out.println("Chao");
                seguir = false;
                break;
        }   
            System.out.println("Enter para continuar");
            scannerTxt.nextLine();
        }
    }
    

    //Metodos Ejercicio 1
    public static void ejercicio1(int n, int base){
//        1- Convertir número décimal en una su valor hexadecimal
        System.out.println(n + " en base " + base + " es: " + hexadecimal(n,base));
    }
    public static String digitoHex(int n){
        switch(n){
            case 10: 
                return "A";
            case 11: 
                return "B";
            case 12: 
                return "C";
            case 13: 
                return "D";
            case 14: 
                return "E";
            case 15:
                return "F";
            default:
                return Integer.toString(n);
        }
    }
    public static String hexadecimal(int numero, int base){
        if (numero<base){
            return digitoHex(numero%base);
        }
        else {
            return hexadecimal(numero/base, base) + digitoHex(numero%base);
        } 
    }
    //Metodos Ejercicio 1
    
    
    //Metodos Ejercicio 2
    public static void ejercicio2(int n, int m){
//        2- Sumar el numero ingresado una n cantidad de veces
        sumaNveces(n,m);
    }
    public static void sumaNveces(int numero, int cantidad){
        if (cantidad == 1){
            System.out.println(numero);
        }
        else {
            sumaNveces(numero, cantidad-1);
            System.out.println(numero*cantidad);
        } 
    }
    //Metodos Ejercicio 2
    
    
    //Metodos Ejercicio 3
    public static void ejercicio3(int n){
//        3- Encontrar número en la posición n de la secuencia fibonacci (Comenzando por la posición 0), mostrando todos los procesos necesarios
        fibonacci(n, 0, 0, 1);
    }
    public static void fibonacci(int n, int contador, int primero, int segundo){
        if (contador < 2){
            System.out.println(contador);
            if (n != 0) {
                fibonacci(n, contador + 1, primero, segundo);
            }
        }
        else if (contador <= n){
            System.out.println(primero + " + " + segundo + " = " + (primero+segundo));
            fibonacci(n, contador + 1, segundo, primero+segundo);
        }
    }
    //Metodos Ejercicio 3
    
    
    //Metodos Ejercicio 4
    public static void ejercicio4(int[][] matriz){
//        4- Encontrar la determinante de una matriz nxn
        System.out.println("La determinante es: " + determinante(matriz));;
    }
    public static int[][] calcularCofactor(int[][] matriz, int n){
        int nColumna = 0;
        int[][] cofactor = new int[matriz.length-1][matriz.length-1];
        
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j != n){
                    cofactor[i-1][nColumna] = matriz[i][j];
                    nColumna += 1;
                }
            }
            nColumna = 0;
        }
        return cofactor;
    }
    public static int determinante(int[][] matriz){
        int resultado = 0;
        int a = 1;
        
        if (matriz.length == 1){
            return matriz[0][0];
        }
        else{
            for (int i = 0; i < matriz.length; i++) {
                resultado += a * (matriz[0][i] * determinante(calcularCofactor(matriz, i)));
                a = a * (-1);
            }
            return resultado;
        }
    }
    //Metodos Ejercicio 4
    
    
    //Metodos Ejercicio 5
    public static void ejercicio5(int n, int max){
//        5- Mostrar la tabla de multiplicar de n hasta que el resultado sea 12
        tabla(n, max, max);
    }
    public static void tabla(int n, int m, int aux){
        int max = aux;
        if (n*m > max){
            m--;
            tabla(n,m,max);
        }
        else if (m > 0){
            m--;
            tabla(n,m, max);
            System.out.println(n + " x " + (m+1) + " = " + (n*(m+1)));
        } 
    }
    //Metodos Ejercicio 5
    
    
    //Metodos Ejercicio 6
    public static void ejercicio6(int n){
//        6- Ingresar nombres de ciudades y mostrarlas de la última a la primera
        ciudades(n);
    }
    public static void ciudades(int n){
        Scanner scanner = new Scanner(System.in);
        if (n > 0) {
            System.out.print("Ingrese la ciudad: ");
            String ciudad = scanner.nextLine();
            ciudades(n-1);
            System.out.println(ciudad);
        }
    }
    //Metodos Ejercicio 6
    
    
    //Metodos Ejercicio 7
    public static void ejercicio7(int eleccion, int n,int m){
//        7- Calcular factorial o potenciación
        if (eleccion == 1) {
            System.out.println(factorial(n));
        }
        if (eleccion == 2) {
            System.out.println(potencia(n,m));
        }
    }
    public static int factorial(int n){
        if (n == 1) {
            return n;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static int potencia(int base, int expo){
        if (expo == 1) {
            return base;
        }
        else {
            return base * potencia(base, expo-1);
        }
    }
    //Metodos Ejercicio 7
    
    
    //Metodos Ejercicio 8
    public static void ejercicio8(String num){
//        8- Verificar si un número es palindromo
        boolean respuesta = palindromo(num);
        if (respuesta) {
            System.out.println("Es palindromo");
        }
        else {
            System.out.println("No es palindromo");
        }
    }
    public static boolean palindromo(String n){
        if (n.length() == 1) {
            return true;
        }
        else {
            if (n.charAt(0) == n.charAt(n.length()-1)) {
                if (n.length() > 2) {
                    palindromo(n.substring(1, n.length()-1));
                }
                return true;
            }
            else {
                return false;
            }
        }
    }
    //Metodos Ejercicio 8
    
    
    //Metodos Ejercicio 9
    public static void ejercicio9(String num){
//        9- Invertir una cadena de texto
        System.out.println(invertir(num));
    }
    public static String invertir(String texto){
        if (texto.length() == 1) {
            return texto;
        }
        else {
            return texto.charAt(texto.length()-1) + invertir(texto.substring(0,texto.length()-1));
        }
    }
    //Metodos Ejercicio 9
    
    
    //Metodos Ejercicio 10
    public static void ejercicio10(int n){
//        10- Ingresar una n cantidad de numeros, mostrar suma de positivos y negativos, y contar pares e impares
        posNegParImp(n,0,0,0,0);
    }
    public static void posNegParImp(int n, int sPositivos, int sNegativos, int nPares, int nImpares){
        Scanner scanner = new Scanner(System.in);
        if (n == 0) {
            System.out.println("Los positivos ingresados suman: " + sPositivos);
            System.out.println("Los negativos ingresados suman: " + sNegativos);
            System.out.println("La cantidad de pares ingresados es: " + nPares);
            System.out.println("La cantidad de impares ingresados es: " + nImpares);
        }
        else if (n > 0) {
            System.out.print("Ingrese el numero: ");
            int num = scanner.nextInt();

            if (num > 0) {
                sPositivos+=num;
            } else {
                sNegativos+=num;
            }
            if ((num % 2) == 0) {
                nPares+=1;
            } else {
                nImpares+=1;
            }
            posNegParImp(n-1, sPositivos, sNegativos, nPares, nImpares);
        }
    }
    //Metodos Ejercicio 10
    
    
    public static void limpiarConsola(){
        for(int i = 0; i < 50; i++) { 
            System.out.println(""); 
        }
    }
}
