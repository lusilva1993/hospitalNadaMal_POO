public class Funcionario extends Pessoa{
    
    @Override
    public void dadosPessoais(String nome, String CPF, String telefone, Double altura, Double peso) {
        this.setNome(nome);
        this.setCPF(CPF);
        this.setTelefone(telefone);
        this.setAltura(altura);
        this.setPeso(peso);
    }


}
