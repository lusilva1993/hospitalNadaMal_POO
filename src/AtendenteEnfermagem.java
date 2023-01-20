public final class AtendenteEnfermagem extends Funcionario{

    @Override
    public void dadosPessoais(String nome, String CPF, String telefone, Double altura, Double peso) {
        this.setNome(nome);
        this.setCPF(CPF);
        this.setTelefone(telefone);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    @Override
    public String getNome() {

        return super.getNome();
    }

    @Override
    public Double getAltura() {

        return super.getAltura();
    }

    @Override
    public String getCPF() {

        return super.getCPF();
    }

    @Override
    public Double getPeso() {

        return super.getPeso();
    }

    @Override
    public String getTelefone() {

        return super.getTelefone();
    }

}
