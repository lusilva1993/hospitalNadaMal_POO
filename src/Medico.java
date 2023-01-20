import java.util.List;

public abstract class Medico extends Funcionario{

    private Integer sala ;

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public void realizarDiagnostico(List<String> sintomas, int opcao) {
        if (opcao == 1) {
            System.out.println("Você está apenas com uma gripe forte e vai precisar iniciar um tratamento com antibióticos.");
            System.out.println("Por favor, compre esses remédios e inicie o tratamento imediatamente.");
            System.out.println("Lhe desejo melhoras.");
            System.out.println();
        } else if (opcao == 2) {
            System.out.println("Acredito que esteja com meningite e vai precisar iniciar um tratamento com antibióticos imediatamente.");
            System.out.println("Iremos realizar uma punção lombar para confirmar o diagnósitco e você será internado para iniciar medicação na veia");
            System.out.println("Você está só? Se sim preciso que chame um acompanhante para realizarmos sua internação.");
            System.out.println();
        } else {
            System.err.println("Não foi possível realizar diagnóstico.");
        }
    }

}
