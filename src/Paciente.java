import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Paciente extends Pessoa{
    private List<String> sintomas = new ArrayList<>();

    public List<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }


    @Override
    public void dadosPessoais(String nome, String CPF, String telefone, Double altura, Double peso) {
        this.setNome(nome);
        this.setCPF(CPF);
        this.setTelefone(telefone);
        this.setAltura(altura);
        this.setPeso(peso);
    }
        public List<String> sintomas(String sintoma) {
            sintomas.add(sintoma);
            return sintomas;
    }

}
