/******************************************************************************
9. Construa um algoritmo para calcular o
valor a ser pago pelo período de estacionamento do automóvel (PAG). O usuário
entra com os seguintes dados: hora (HE) e minuto (ME) de entrada, hora (HS) e
minuto (MS) de saída. Sabe-se que este estacionamento cobra hora cheia, ou
seja, se passar um minuto ele cobra a hora inteira. O valor cobrado pelo
estacionamento é: •R$ 4,00 para 1 hora de estacionamento •R$ 6,00 para 2 horas
de estacionamento •R$ 1,00 por hora adicional (acima de 2 horas)
*******************************************************************************/
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        int horaEntrada, minutoEntrada, horaSaida, minutoSaida;
        int horasEstacionado, minutosEstacionado, valorFinal;
       
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite a hora de entrada (0-23): ");
        horaEntrada = scanner.nextInt();
        System.out.println("Digite o minuto de entrada (0-59): ");
        minutoEntrada = scanner.nextInt();
       
        System.out.println("Digite a hora de saída (0-23): ");
        horaSaida = scanner.nextInt();
        System.out.println("Digite o minuto de saída (0-59): ");
        minutoSaida = scanner.nextInt();
       
        int tempoEntradaEmMinutos = horaEntrada * 60 + minutoEntrada;
        int tempoSaidaEmMinutos = horaSaida * 60 + minutoSaida;
       
        if (tempoSaidaEmMinutos < tempoEntradaEmMinutos) {
            tempoSaidaEmMinutos += 24 * 60;
        }
       
        int tempoEstacionado = tempoSaidaEmMinutos - tempoEntradaEmMinutos;
       
        horasEstacionado = (tempoEstacionado + 59) / 60;
       
        if (horasEstacionado == 1) {
            valorFinal = 4;
        } else if (horasEstacionado == 2) {
            valorFinal = 6;
        } else {
            valorFinal = 6 + (horasEstacionado - 2);
        }
       
        System.out.println("O valor a ser pago pelo estacionamento é: R$ " + valorFinal);
       
        scanner.close();
    }
}