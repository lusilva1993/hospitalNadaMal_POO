public abstract class Pessoa {

    private String nome;
    private String CPF;
    private String telefone;
    private Double altura;
    private Double peso;
    private String imc;

    public static final String pesoIdeal(Double altura, Double peso){
        double imc = peso/(altura*altura);
        boolean pesoIdeal = false;
        if(imc >= 18.5 && imc <= 24.9){
            return "Paciente dentro do peso ideal";
        }
        return "Paciente fora do peso ideal";
    }

    public abstract void dadosPessoais(String nome, String CPF, String telefone, Double altura, Double peso);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Double getAltura() {

        return altura;
    }

    public void setAltura(Double altura) {

        this.altura = altura;
    }

    public String getCPF() {

        return CPF;
    }

    public void setCPF(String CPF) {

        this.CPF = CPF;
    }

    public Double getPeso() {

        return peso;
    }

    public void setPeso(Double peso) {

        this.peso = peso;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

}
