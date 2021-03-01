package exceptions;

import java.util.Scanner;

public class ExceptionExemploUm {

    public static void main(String[] args) {
        Boolean sair = Boolean.FALSE;
        while (Boolean.FALSE.equals(sair)) {
            Scanner entradaPeloTeclado = new Scanner(System.in);
            try{

                System.out.print("Digite o primeiro valor: ");
                Integer entradaUm = entradaPeloTeclado.nextInt();
                System.out.print("Digite o segundo valor: ");
                Integer entradaDois = entradaPeloTeclado.nextInt();

                System.out.println("A soma das entradas é: " + (entradaUm+entradaDois));


                System.out.print("Deseja sair? Digite Sim ou Não: ");
                String desejaSair = entradaPeloTeclado.next();

                if(desejaSair.equalsIgnoreCase("Sim")) {
                    sair = Boolean.TRUE;
                }


            }catch (Exception exception){
                System.out.print("É permitido somente números inteiros de até 10 casas!");
                entradaPeloTeclado = new Scanner(System.in);



                System.out.print("Deseja sair? Digite Sim ou Não: ");
                String desejaSair = entradaPeloTeclado.next();

                if(desejaSair.equalsIgnoreCase("Sim")) {
                    sair = Boolean.TRUE;
                }
            }
        }

    }

}
