import java.util.ArrayList;

public class appFirst {
    public static void main(String[] args) throws Exception {
        // number 01 - hello, world
        System.out.println("Hello, World!");

        // number 02 - soma
        int value1 = 10;
        int value2 = 2;
        int sumValues = value1 + value2;
        System.out.println("A soma de " + value1 + "+" + value2 + "= " + sumValues + ".");

        // number 03 - par ou impar
        //valor 1
        if (value1%2==0){
            System.out.println(value1+" is par.");
        }else{
            System.out.println(value1+" is impar.");
        }
        //valor 2
        if (value2%2==0){
            System.out.println(value2+" is par.");
        }else{
            System.out.println(value2+" is impar.");
        }

        //number 04 - fatorial
        int factorial = 1;
        for(int i=value1; i!=0; i--){
           factorial =  i * factorial;
        }
        System.out.println(factorial);

        //extra - fibonacci
        int fibonacci = 20;
        int x = 0;
        int y = 1;
        int temp = 0;
        for(int i=0; i < fibonacci; i++){
            temp = x;
            System.out.println(x);
            x = y;
            y = temp+y;
        }

        //extra - array
        int[] numbers = new int[5];
        ArrayList<String> nomes = new ArrayList<>();

    }
}
