import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcaoSintoma = 0;

        AtendenteEnfermagem rosanaMendes = new AtendenteEnfermagem();
        rosanaMendes.setNome("Rosana Mendes");
        rosanaMendes.setCPF("111.111.111-11");
        rosanaMendes.setTelefone("12345-1234");
        rosanaMendes.setAltura(1.68);
        rosanaMendes.setPeso(60.0);

        Paciente joaoPedro = new Paciente();
        joaoPedro.setNome("Joao Pedro Otto");
        joaoPedro.setCPF("222.222.222-22");
        joaoPedro.setTelefone("11111-1111");
        joaoPedro.setAltura(1.89);
        joaoPedro.setPeso(90.0);
        joaoPedro.setImc(joaoPedro.pesoIdeal(joaoPedro.getAltura(), joaoPedro.getPeso()));


        Paciente luciaMaria = new Paciente();
        luciaMaria.setNome("Lucia Maria Pereira");
        luciaMaria.setCPF("333.333.333-33");
        luciaMaria.setTelefone("33333-3333");
        luciaMaria.setAltura(1.60);
        luciaMaria.setPeso(50.0);
        luciaMaria.setImc(luciaMaria.pesoIdeal(luciaMaria.getAltura(), luciaMaria.getPeso()));


        Neuro neuro = new Neuro();
        neuro.setNome("Dr. Bruce Wayne");
        neuro.setSala(1);

        ClinicoGeral clinico = new ClinicoGeral();
        clinico.setNome("Dra. Amelie Poulain");
        clinico.setSala(2);

        boolean islogado = true;
        while (islogado) {
            System.out.println("Bem vindo ao Hospital Nada Mal, Aqui você sai legal!");
            System.out.println("Atendente: Meu nome é " + rosanaMendes.getNome() + " e vou te atender hoje.\nPor favor, me informe seu CPF:");

            String cpfPaciente = scanner.next();

            Atendimento atendimento = new Atendimento();
            if (cpfPaciente.equals(joaoPedro.getCPF())) {

                atendimento = new Atendimento(joaoPedro, "Pronturario Joao");
                System.out.println("Atendente: " + joaoPedro.getNome() + ", por favor, selecione uma das opções que representam seus sintomas: ");

                System.out.println("1 - Febre, Coriza, Dor de cabeça ou outros sintomas gripais");
                System.out.println("2 - Dores fortes na nuca, enxaqueca, sensibilidade a luz");

                opcaoSintoma = scanner.nextInt();
                if (opcaoSintoma == 1) {

                    joaoPedro.sintomas("Febre");
                    joaoPedro.sintomas("Coriza");
                    joaoPedro.sintomas("Dor de cabeça");
                    joaoPedro.sintomas("Sintomas gripais");

                    System.out.println("Atendente: Vá até a sala " + clinico.getSala() + ", " + clinico.getNome() + " já está te esperando!");
                    System.out.println("\n---Entrando na sala do médico---");
                    System.out.println("Médico: Olá " + joaoPedro.getNome() + ", sente-se aqui para que eu te examine por favor.\n");
                    System.out.println("\n---Médico vê a garganta , verifica ouvidos e olhos do paciente---\n");
                    System.out.println("Médico: Um minuto enquanto visualizo seu prontuário. \n");
                    System.out.println(atendimento.montarProntuario(joaoPedro, clinico, atendimento.getProntuario()));
                    System.out.println("---Paciente se senta na mesa do médico---\n");
                    clinico.realizarDiagnostico(luciaMaria.getSintomas(), opcaoSintoma);

                } else if (opcaoSintoma == 2) {

                    joaoPedro.sintomas("Dores fortes na nuca");
                    joaoPedro.sintomas("Enxaqueca");
                    joaoPedro.sintomas("Sensibilidade a luz");

                    System.out.println("Atendente: Vá até a sala " + neuro.getSala() + ", " + neuro.getNome() + " já está te esperando!");
                    System.out.println("\n---Entrando na sala do médico---");
                    System.out.println("Médico: Olá " + joaoPedro.getNome() + ", sente-se aqui para que eu te examine por favor.\n");
                    System.out.println("\n---Médico vê a garganta , verifica ouvidos e olhos do paciente---");
                    System.out.println("Médico: Um minuto enquanto visualizo seu prontuário. \n");
                    System.out.println(atendimento.montarProntuario(joaoPedro, neuro, atendimento.getProntuario()));
                    System.out.println("---Paciente se senta na mesa do médico---\n");
                    neuro.realizarDiagnostico(luciaMaria.getSintomas(), opcaoSintoma);

                } else {
                    System.err.println("Opção invalida!");
                }


            } else if (cpfPaciente.equals(luciaMaria.getCPF())) {
                atendimento = new Atendimento(luciaMaria, "Pronturario Lucia");
                System.out.println(luciaMaria.getNome() + ", por favor, informe os sintomas presentes nesse momento: ");

                System.out.println("1 - Febre, Coriza, Dor de cabeça ou outros sintomas gripais");
                System.out.println("2 - Dores fortes na nuca, enxaqueca, sensibilidade a luz");

                opcaoSintoma = scanner.nextInt();
                if (opcaoSintoma == 1) {
                    luciaMaria.sintomas("Febre");
                    luciaMaria.sintomas("Coriza");
                    luciaMaria.sintomas("Dor de cabeça");
                    luciaMaria.sintomas("Sintomas gripais");

                    System.out.println("Atendente: Vá até a sala " + clinico.getSala() + ", " + clinico.getNome() + " já está te esperando!");
                    System.out.println("\n---Entrando na sala do médico---");
                    System.out.println("Médico: Olá " + luciaMaria.getNome() + ", sente-se aqui para que eu te examine por favor.\n");
                    System.out.println("\n---Médico vê a garganta , verifica ouvidos e olhos do paciente---");
                    System.out.println("Médico: Um minuto enquanto visualizo seu prontuário.\n");
                    System.out.println(atendimento.montarProntuario(luciaMaria, clinico, atendimento.getProntuario()));
                    System.out.println("\n---Paciente se senta na mesa do médico---");
                    clinico.realizarDiagnostico(luciaMaria.getSintomas(), opcaoSintoma);

                } else if (opcaoSintoma == 2) {
                    luciaMaria.sintomas("Dores fortes na nuca");
                    luciaMaria.sintomas("Enxaqueca");
                    luciaMaria.sintomas("Sensibilidade a luz");


                    System.out.println("Atendente: Vá até a sala " + neuro.getSala() + ", " + neuro.getNome() + " já está te esperando!");
                    System.out.println("\n---Entrando na sala do médico---");
                    System.out.println("Médico: Olá " + luciaMaria.getNome() + ", sente-se aqui para que eu te examine por favor.\n");
                    System.out.println("\n---Médico vê a garganta , verifica ouvidos e olhos do paciente---");
                    System.out.println("Médico: Um minuto enquanto visualizo seu prontuário.\n");
                    System.out.println(atendimento.montarProntuario(luciaMaria, neuro, atendimento.getProntuario()));
                    System.out.println("\n---Paciente se senta na mesa do médico---");
                    neuro.realizarDiagnostico(luciaMaria.getSintomas(), opcaoSintoma);
                } else {
                    System.err.println("Opção invalida!");
                }
            }break;
        }
    }
}