public abstract class Pessoa {

    private String nome;
    private String CPF;
    private String telefone;
    private String altura;
    private Double peso;

    public static final boolean pesoIdeal(Double altura, Double peso){
        double imc = peso*altura;
        boolean pesoIdeal = false;
        if(imc >= 18.5 ||imc <= 24.9){
            return pesoIdeal = true;
        }
        return pesoIdeal;
    }

    public abstract void dadosPessoais(String nome, String CPF, String telefone, Double altura, Double peso);
    public Pessoa(String nome, String altura, String CPF, Double peso, String telefone) {
        this.nome = nome;
        this.altura = altura;
        this.CPF = CPF;
        this.peso = peso;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
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

}
