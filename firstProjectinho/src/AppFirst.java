//ÁREA DE IMPORTS _______________________________________
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class AppFirst{
    public static void main(String[] args) throws Exception {
        // number 01 - Hello, World
        //System.out.println("Hello, World!");

        // number 02 - Soma
        // int value1 = 5;
        // int value2 = 2;
        // int sumValues = value1 + value2;
        // System.out.println("A soma de " + value1 + " + " + value2 + " = " + sumValues + ".");

        // number 03 - Par ou Ímpar
        // Valor 1
        // if (isEven(value1)) {
        //     System.out.println(value1 + " is par.");
        // } else {
        //     System.out.println(value1 + " is impar.");
        // }
        // Valor 2
        // if (isEven(value2)) {
        //     System.out.println(value2 + " is par.");
        // } else {
        //     System.out.println(value2 + " is ímpar.");
        // }

        // number 04 - Fatorial --- FUNÇÃO RECURSIVA
        // int factorial = calculateFactorial(value1);
        // System.out.println("O fatorial de " + value1 + " is " + factorial + ".");

        // Extra - Fibonacci -- number 14
        // int fibonacci = 20;
        // printFibonacciSeries(fibonacci);

        // Extra - Array
        // int[] numbers = new int[5];
        // ArrayList<String> nomes = new ArrayList<>();

        // number 05 - positive, negative, equal zero
        // printNumberSign(value1);

        // number 06 - maior de 3
        // Random rand = new Random();
        // int number1 = rand.nextInt(100);
        // int number2 = rand.nextInt(100);
        // int number3 = rand.nextInt(100);
        // biggerThan(number1, number2, number3);

        // extra - input
        //String input = JOptionPane.showInputDialog("DIGITE::: ");
        //System.out.println("DIGITADO:::"+ input);

        // number 07 - ordem crescente
        // for(int i=0; i!=11; i++){
        //     System.out.print(i + " ");
        //     if(i==10){
        //         System.out.println("");
        //     }
        // }

        // number 08 - media 3 notas aprovado ou reprovado
        // DecimalFormat df = new DecimalFormat("#,##");
        // double note1 = Double.parseDouble(df.format(rand.nextDouble(10)));
        // double note2 = Double.parseDouble(df.format(rand.nextDouble(10)));
        // double note3 = Double.parseDouble(df.format(rand.nextDouble(10)));
        // mediumWinner(note1, note2, note3);

        // number 09 - quadrado de cada número
        // for(int j=0; j != 6; j++){
        //     System.out.println(j+"^2 => "+ j*j);
        // }

        // number 10 - celcius para fahrenheit
        // String input = JOptionPane.showInputDialog("GRAUS EM CELSIUS");
        // double celsius = Double.parseDouble(input);
        // double fahrenheit = ((celsius*9)/5) + 32;
        // System.out.println(celsius +" celsius  ===>  "+ fahrenheit +" fahrenheit");

        // number 11 - fatorial simples
        // int fatorialRecurse = 1;
        // for(int i=value1; i!=0; i--){
        //     fatorialRecurse *= i;
        //     if(i!=1){
        //         System.out.print(i + "*");
        //     }
        //     if(i==1){
        //         System.out.print(i + " = ");
        //         System.out.println(fatorialRecurse);
        //     }
        // }

        // number 12 - ano bissexto
        // boolean bissexto = false;
        // int leapYear = rand.nextInt(1500, 2023);
        // if (leapYear%100!=0 && leapYear%4==0){
        //     bissexto = true;
        // }else if(leapYear%100==0 && leapYear%4==0){
        //     bissexto = true;
        // }
        // System.out.println("ANO: "+leapYear+" -- Bissexto: "+bissexto);

        // number 13 MMC de dois números
        // Random rand = new Random();
        // int numberBase = rand.nextInt(2, 50);
        // int numberBase1 = rand.nextInt(2, 50);
        // int max = 0;
        // int min = 0;
        // if (numberBase > numberBase1){
        //     max = numberBase;
        //     min = numberBase1;
        // } else{
        //     max = numberBase1;
        //     min = numberBase;
        // }
        // int a = max;
        // int b = min;
        // int mdc = 0;
        // while(b != 0){
        //     mdc = b;
        //     b = a % b;
        //     a = b;
        //     System.out.print(mdc);
        // }
        // int mmc = (max * min) / mdc;
        // System.out.println("MMC de "+numberBase+" e "+numberBase1+" eh {"+mmc+"}");

        // função pronta MMC
        // public static int calcularMMC(int a, int b){
        //     int maX = 1;    
        //     while(true){
        //         if (maX % a == 0 && maX % b == 0){
        //             return max;
        //         }
        //     }
        // }
        

        // number 15 - palindromo
        // String palavra = "douglas";
        // String palindromo = "";

        // for (int i = palavra.length() -1; i>=0; i--){
        //     palindromo += palavra.charAt(i);
        // }

        // System.out.println(palavra + " - " + palindromo);
        // if (palindromo.equals(palavra)){
        //     System.out.println("Is a palindromo");
        // } else{
        //     System.out.println("Isn't palindromo");
        // }

        // number 16 - numeros primos
        
        
        // number 17 - inverter string
        // String reverse = "";
        // String palavraBase = "pneumoultramicroscopicossilicovulcanoconiotico";
        // for (int k=palavraBase.length() -1; k>=0; k--){
        //     reverse += palavraBase.charAt(k);
        // }
        // System.out.println(reverse);
        // System.out.println(palavraBase);

        // number 18 - media aritmetica de uma array
        // Random rand = new Random();
        // int[] numbers = new int[10];
        // int sum = 0;
        // for (int i=0; i!= 10; i++){
        //     numbers[i] = rand.nextInt(50) + 1;
        //     sum += numbers[i];
        //     System.out.print(numbers[i] + " ");
        //     if (i==9){
        //         System.out.println("");
        //     }
        // }
        // int medium = sum/numbers.length;
        // System.out.println("Media: "+medium);

    }

    //ÁREA DAS FUNÇÕES ________________________________________________________________

    // Função para verificar se um número é par
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Função para calcular o fatorial de um número -- FUNÇÃO RECURSIVA
    private static int calculateFactorial(int number) {
        if (number == 1) {
            return 1;
        }else 
        {
            return number * calculateFactorial(number - 1);
        }
    }

    // Função para imprimir a série de Fibonacci
    private static void printFibonacciSeries(int n) {
        int x = 0;
        int y = 1;
        int temp;
        System.out.println("Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            temp = x;
            x = y;
            y = temp + y;
        }
        System.out.println(" ");
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
