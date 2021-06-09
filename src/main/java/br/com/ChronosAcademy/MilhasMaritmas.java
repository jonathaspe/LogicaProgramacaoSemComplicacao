package br.com.ChronosAcademy;

public class MilhasMaritmas {
/*    Sabendo que uma milha marítima equivale a um mil, oitocentos e cinqüenta e dois metros e que um quilômetro possui mil metros, fazer um programa para converter milhas marítimas em quilômetros.
            Dica: 1milha = 1852m
        		  1milha = 1.852km
        		  (outra forma de comentar) */

    public static void main(String[] args) {
        int qtdMilhas = 4;
        float milha = 1852;
//        usamos o "float" porque o resultado não é um número inteiro

        milha = milha / 1000;
        System.out.println(milha);

        float km = qtdMilhas * milha;
        System.out.println("Resultado: "+km+" km");
    }
}
