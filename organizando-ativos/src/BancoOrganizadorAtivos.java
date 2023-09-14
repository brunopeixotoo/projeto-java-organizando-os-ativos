import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class BancoOrganizadorAtivos {

    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        ArrayList < String > ativos = new ArrayList < > ();

        //Entrada da quantidade de ativos.
        System.out.println("Qual a quantidade de ativos? ");
        int quantidadeAtivos = entradaDados.nextInt();
        quantidadeAtivos+=1;

        //Entrada do nome dos ativos e colocando na Array.
        System.out.println("Digite o nome dos ativos: ");
        for(int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = entradaDados.nextLine();
            String listOrdem = codigoAtivo.toUpperCase();
            ativos.add(listOrdem);
        }
        Collections.sort(ativos);
        for(String ativo : ativos){
            System.out.println(ativo);
       }
        
    }

}