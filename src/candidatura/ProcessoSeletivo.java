package candidatura;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {


    public static void imprimirSelecionados(ArrayList<String> selecionados){
        System.out.println("A lista de candidatos selecionados: ");
        for (String selecionado: selecionados) {
            System.out.println(selecionado);
        }
    }
    public static void selecaoCandidatos(){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        ArrayList<String> selecionados = new ArrayList<String>();

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendito = valorPretendito();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendito);
            if(salarioBase >= salarioPretendito){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                selecionados.add(candidato);
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }

        imprimirSelecionados(selecionados);

    }
    public static double valorPretendito(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
