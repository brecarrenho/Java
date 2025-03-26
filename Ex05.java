/******************************************************************************

5. Implemente um código para aprovar
empréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante.

*******************************************************************************/
import java.util.Scanner;
public class Ex05
{
    public static void main(String[] args) {
       
        double valoremprestimo, parcelas, salario, parcelasfinais;
       
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Qual o valor do empréstimo:  ");
        valoremprestimo = scanner.nextInt();
       
        System.out.println("Quantas parcelas:  ");
        parcelas = scanner.nextInt();
       
        System.out.println("Qual é o seu salário:  ");
        salario = scanner.nextInt();
       
        parcelasfinais = valoremprestimo / parcelas;
       
        if(parcelasfinais <= salario * 0.3){
            System.out.println("Empréstimo aprovado");
        }else{
            System.out.println("Empréstimo reprovado");
        }
       
        scanner.close();
    }
}