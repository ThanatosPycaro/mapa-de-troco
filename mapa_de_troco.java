package Teste01;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
 // Variaveis
 double salario = 0;
 double nt100 = 0;
 double nt50 = 0;
 double nt20 = 0;
 double nt10 = 0;
 double nt5 = 0;
 double nt2 = 0;
 double md1 = 0;
 double md50 = 0;
 double md25 = 0;
 double md10 = 0;
 double md5 = 0;
 double resto = 0;
 Scanner input = new Scanner(System.in);
 //Scanner do Salario
 System.out.print("Informe o salário: ");
 salario = input.nextDouble();
 // Começo do processamento das notas
 if (salario >= 100){
 nt100 = salario / 100;
 resto = salario % 100;
 }
 if (resto >= 50){
 nt50 = resto / 50;
 resto = resto % 50;
 }
 if (resto >= 20){
 nt20 = resto / 20;
 resto = resto % 20;
 }
 if (resto >= 10){
 nt10 = resto / 10;
 resto = resto % 10;
 }
 if (resto >= 5){
 nt5 = resto / 5;
 resto = resto % 5;
 }
 if (resto >= 2){
 nt2 = resto / 2;
 resto = resto % 2;
 }
 if (resto >= 1){
 md1 = resto / 1;
 resto = resto % 1;
 }
 // Fim do processamento das Notas
 // Transformando os centavos em valores inteiros
 resto = resto * 100;
 // Transformando os centavos em valores inteiros
 // Começo do processamento das Moedas
 if (resto >= 50){
 md50 = resto / 50;
 resto = resto % 50;
 }
 // função Math.ceil para arredondar o valor decimal para
inteiro
 resto = Math.ceil(resto);
 if (resto >= 25){
 md25 = resto / 25;
 resto = resto % 25;
 }
 if (resto >= 10){
 md10 = resto / 10;
 resto = resto % 10;
 }
 if (resto >= 5){
 md5 = resto / 5;
 resto = resto % 5;
 }
 // Fim do procesamento das moedas

 // Impressão dos resultados
 System.out.println("Vai ser necessario " + Math.floor(nt100)
+ " Notas de R$100,00" );
 System.out.println("Vai ser necessario " + Math.floor(nt50)
+ " Notas de R$50,00" );
 System.out.println("Vai ser necessario " + Math.floor(nt20)
+ " Notas de R$20,00" );
 System.out.println("Vai ser necessario " + Math.floor(nt10)
+ " Notas de R$10,00" );
 System.out.println("Vai ser necessario " + Math.floor(nt5) +
" Notas de R$5,00" );
 System.out.println("Vai ser necessario " + Math.floor(nt2) +
" Notas de R$2,00" );
 System.out.println("Vai ser necessario " + Math.floor(md1) +
" Moedas de R$1,00" );
 System.out.println("--------------------------");
 System.out.println("Vai ser necessario " + Math.floor(md50)
+ " Moedas de R$0,50" );
 System.out.println("Vai ser necessario " + Math.floor(md25)
+ " Moedas de R$0,25" );
 System.out.println("Vai ser necessario " + Math.floor(md10)
+ " Moedas de R$0,10" );
 System.out.println("Vai ser necessario " + Math.floor(md5) +
" Moedas de R$0,05" );

 System.out.println("faltou distribuir " + resto + "
Centavos");

 }
}
