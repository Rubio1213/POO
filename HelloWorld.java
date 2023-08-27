import java.util.*;

public class Practica01 {
    public static void main (String []args){
        int a,b;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Programa para conversion de bases numericas");
        System.out.println("Ingresa la cantidad que deseas convertir");
        a=Integer.parseInt(scanner.nextLine());//Pasar de string a entero
        System.out.println("1.-Decimal a binario\n2.-Decimal a Octadecimal\n3.-Decimal a Hexadecimal");
        System.out.println("Ingresa la opcion a convertir");
        b=Integer.parseInt(scanner.nextLine());
        switch (b){
            case 1:
                System.out.println("|| Decimal a binario ||");
            break; 
            case 2:
                System.out.println("|| Decimal a Octadecimal ||");
            break; 
            case 3:
                System.out.println("|| Decimal a Hexadecimal ||");
            break; 
            

        }
        
    }
}
