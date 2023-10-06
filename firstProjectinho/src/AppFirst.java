import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class AppFirst{
    public static void main(String[] args) throws Exception {
        // number 01 - Hello, World
        System.out.println("Hello, World!");

        // number 02 - Soma
        int value1 = 5;
        int value2 = 2;
        int sumValues = value1 + value2;
        System.out.println("A soma de " + value1 + " + " + value2 + " = " + sumValues + ".");

        // number 03 - Par ou Ímpar
        // Valor 1
        if (isEven(value1)) {
            System.out.println(value1 + " is par.");
        } else {
            System.out.println(value1 + " is impar.");
        }
        // Valor 2
        if (isEven(value2)) {
            System.out.println(value2 + " is par.");
        } else {
            System.out.println(value2 + " is ímpar.");
        }

        // number 04 - Fatorial
        int factorial = calculateFactorial(value1);
        System.out.println("O fatorial de " + value1 + " is " + factorial + ".");

        // Extra - Fibonacci
        int fibonacci = 20;
        printFibonacciSeries(fibonacci);

        // Extra - Array
        // int[] numbers = new int[5];
        // ArrayList<String> nomes = new ArrayList<>();

        // number 05 - positive, negative, equal zero
        printNumberSign(value1);

        // number 06 - maior de 3
        Random rand = new Random();
        int number1 = rand.nextInt(100);
        int number2 = rand.nextInt(100);
        int number3 = rand.nextInt(100);
        biggerThan(number1, number2, number3);

        // extra - input
        //String input = JOptionPane.showInputDialog("DIGITE::: ");
        //System.out.println("DIGITADO:::"+ input);

        // number 07 - ordem crescente
        for(int i=0; i!=11; i++){
            System.out.print(i + " ");
            if(i==10){
                System.out.println("");
            }
        }

        // number 08 - media 3 notas aprovado ou reprovado
        DecimalFormat df = new DecimalFormat("#,##");
        double note1 = Double.parseDouble(df.format(rand.nextDouble(10)));
        double note2 = Double.parseDouble(df.format(rand.nextDouble(10)));
        double note3 = Double.parseDouble(df.format(rand.nextDouble(10)));
        mediumWinner(note1, note2, note3);

        // number 09 - quadrado de cada número
        for(int j=0; j != 6; j++){
            System.out.println(j+"^2 => "+ j*j);
        }

        // number 10 - celcius para fahrenheit
        String input = JOptionPane.showInputDialog("GRAUS EM CELSIUS");
        double celsius = Double.parseDouble(input);
        double fahrenheit = ((celsius*9)/5) + 32;
        System.out.println(celsius +"°C  ===>  "+ fahrenheit +"°F");

        // number 11 - fatorial em funções recursiva
        int fatorialRecurse = 1;
        for(int i=value1; i!=0; i--){
            fatorialRecurse *= i;
            if(i!=1){
                System.out.print(i + "*");
            }
            if(i==1){
                System.out.print(i + " = ");
                System.out.println(fatorialRecurse);
            }
        }

        // number 12 - ano bissexto
        boolean bissexto = false;
        int leapYear = rand.nextInt(1500, 2023);
        if (leapYear%100!=0 && leapYear%4==0){
            bissexto = true;
        }else if(leapYear%100==0 && leapYear%4==0){
            bissexto = true;
        }
        System.out.println("ANO: "+leapYear+" -- Bissexto: "+bissexto);
    }

    // public class student {
    //     private String nome;

    //         public student(String nome){
    //             this.nome = nome;
    //         }

    //         public void setNome(String nome){
    //             this.nome = nome;
    //         }

    //         public int getMedium(int note1, int note2, int note3){
    //             int medium = (note1+note2+note3)/3;
    //             return medium;
    //         }
    //     }

    // Função para verificar se um número é par
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Função para calcular o fatorial de um número
    private static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    // Função para imprimir a série de Fibonacci
    private static void printFibonacciSeries(int n) {
        int x = 0;
        int y = 1;
        int temp;
        System.out.println("Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.println(x);
            temp = x;
            x = y;
            y = temp + y;
        }
    }

    // Função para imprimir o sinal de um número
    private static void printNumberSign(int number) {
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is equal zero.");
        }
    }

    // Função para encontrar o maior de 3
    private static void biggerThan(int number1, int number2, int number3){
        System.out.println(number1+ " --- "+ number2 +" --- "+number3);
        if (number1>number2 && number1>number3){
            System.out.println(number1);
        } else if (number2>number1 && number2>number3){
            System.out.println(number2);
        } else if(number3>number1 && number3>number2){
            System.out.println(number3);
        }

    }

    // Função para calcular a média de 3 notas e determine aprovado ou reprovado
    private static void mediumWinner(double note1, double note2, double note3){
        String inputStudent = JOptionPane.showInputDialog("ALUNO: ");
        double medium = (note1+note2+note3)/3;
        String winner = "";
        if (medium>=7){
            winner = "aprovado";
        } else{
            winner = "reprovado";
        }
        System.out.println(note1+" - "+ note2 +" - "+ note3);
        System.out.println("O aluno: "+ inputStudent +" foi "+winner);
    }
          
}
