/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**

 @author Adrian
 */
public class JavaApplication9 {
    public static void main(String[] args)
    {
        //llamada para obtener la suma de 5
        //imprimir(10);
//        tabla(3, 12, 12);
//        System.out.println(hex(65029,16));
    }
    //método que devuelve la suma de los elementos desde n hasta 1
    //ejemplo: n = 4 -> 4+3+2+1=10
    
//    public static void imprimir(int n) {
//        if(n > 0) {
//            imprimir(n - 1);
//            System.out.print(n + " -> ");
//        }
//    }
    
//    public static int contar(int n) {
//        if (n < 10) {
//            return 1;
//        } else {
//            return 1 + (contar(n/10));
//        }
//    }
        
//    
//    public static void fibonacci(int n, int m){
//        if (m==1){
//            System.out.println(n);
//        }
//        else {
////            n=(n*m) - (n*(m-1));
//            m--;
//            fibonacci(n,m);
//            System.out.println(n+n*m);
//        }
//    }
//    public static String digitoHex(int n){
//        switch(n){
//            case 0: 
//                System.out.println("0");
//                return "0";
//            case 1: 
//                System.out.println("1");
//                return "1";
//            case 2: 
//                System.out.println("2");
//                return "2";
//            case 3: 
//                System.out.println("3");
//                return "3";
//            case 4: 
//                System.out.println("4");
//                return "4";
//            case 5: 
//                System.out.println("5");
//                return "5";
//            case 6: 
//                System.out.println("6");
//                return "6";
//            case 7: 
//                System.out.println("7");
//                return "7";
//            case 8: 
//                System.out.println("8");
//                return "8";
//            case 9: 
//                System.out.println("9");
//                return "9";
//            case 10: 
//                System.out.println("10");
//                return "A";
//            case 11: 
//                System.out.println("11");
//                return "B";
//            case 12: 
//                System.out.println("12");
//                return "C";
//            case 13: 
//                System.out.println("13");
//                return "D";
//            case 14: 
//                System.out.println("14");
//                return "E";
//            case 15: 
//                System.out.println("15");
//                return "F";
//            default:
//                return "";
//        }
//    }
    
//    public static String hex(int n, int m){
////        int digitoHex;
//        
//        if (n<m){
//            return digitoHex(n%m);
//        }
//        else {
//            return hex(n/m, 16) + digitoHex(n%m);
//        } 
//    }
    
    public static void tabla(int n, int m, int aux){
        int max = aux;
        if (n*m > max){
            m--;
            tabla(n,m,max);
        }
        else if (m > 0){
            m--;
            tabla(n,m, max);
            System.out.println(n*(m+1));
        } 
    }
}
