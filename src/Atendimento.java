public class Atendimento {
    private Paciente paciente;
    private String prontuario;

    public Atendimento(Paciente paciente, String prontuario) {
        this.paciente = paciente;
        this.prontuario = prontuario;
    }

    public Atendimento() {
    }

    public static String montarProntuario(Paciente paciente, Medico medico, String prontuario){
        return prontuario +
                "\nPaciente: " + paciente.getNome() +
                "\nCPF: " + paciente.getCPF() +
                "\nTelefone: " +  paciente.getTelefone() +
                "\nAltura: "+ paciente.getAltura() +
                "\nPeso: " + paciente.getPeso() +
                "\nIMC: " + paciente.getImc() +
                "\nMedico: " + medico.getNome() +
                "\nSala: " + medico.getSala() +
                "\nSintomas: " + paciente.getSintomas();
    }

    public Paciente getPaciente() {

        return paciente;
    }

    public String getProntuario() {

        return prontuario;
    }

}
