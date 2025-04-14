/******************************************************************************

Exemplo: Utilizando Array e visualizando a saída de dados

*******************************************************************************/
public class Exemplo
{
public static void main(String[] args) {
int [] numeros= new int[5];


numeros [0]= 10;
numeros [1]= 20;
numeros [2]= 30;
numeros [3]= 40;
numeros [4]= 50;

for (int i=0; i<numeros.length; i++){
   System.out.println("o" + (i+1) + "º numeros é:"+  numeros [i]);
  }
 }
}
