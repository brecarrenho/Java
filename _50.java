/******************************************************************************

50. Desenvolva um algoritmo que leia um vetor de 10 elementos com valores de uma compra no final mostre o valor gasto e o imposto.
a) Se a compra foi acima de R1.200,00 colocar imposto de 2.5% senão colocar imposto de 0.8%.
b) Mostrar os valores finais com e sem imposto.

*******************************************************************************/
import java.util.Scanner;
public class _50
{
    public static void main(String[] args) {
       
        double valor, valorfinal, valorfinalfinal;
       
        Scanner ler = new Scanner(System.in);
       
        valorfinal = 0;
        valor = 0;
       
            double[] compra = new double[10];
   
    compra[0] = 0;
    compra[1] = 0;
    compra[2] = 0;
    compra[3] = 0;
    compra[4] = 0;
    compra[5] = 0;
    compra[6] = 0;
    compra[7] = 0;
    compra[8] = 0;
    compra[9] = 0;

    for(int i=0; i<compra.length; i++){
        System.out.println("O " + (i + 1) + "º iten custa? ");
        valor = ler.nextDouble();
        valorfinal += valor;
        }
   
        if(valorfinal > 1200){
            valorfinalfinal = valorfinal * 1.025;
        }else{
            valorfinalfinal = valorfinal * 1.008;
        }
        System.out.println("O valor final da compra será: " + valorfinal);
        System.out.println("Incluindo ao nosso imposto ficara: " + valorfinalfinal);
    }
}