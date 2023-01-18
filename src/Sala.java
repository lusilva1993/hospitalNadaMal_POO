public class Sala {

    private Integer numero;
    private Medico medico;

    public Sala(Integer numero, Medico medico) {
        this.numero = numero;
        this.medico = medico;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}

