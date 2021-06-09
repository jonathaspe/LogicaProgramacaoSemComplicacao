package br.com.ChronosAcademy;

public class LeiOhm {
    public static void main(String[] args) {
        /*Calcular e exibir a tensão de um determinado circuito eletrônico
        a partir dos valores da resistência e corrente elétrica.
        Dica: Fórmula de Ohm // R = U / I
                                U = I * R

         */
    int r = 100;
    int i = 2;
    int u = r * i;

        System.out.println("O resultado é "+u+" volts");
    }
}
