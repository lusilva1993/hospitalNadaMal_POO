import java.time.LocalDate;

public class Sala {

    private Integer numero;
    private Medico medico;
    private Boolean isReservada;

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

    public Boolean getReservada() {
        return isReservada;
    }

    public void setReservada(Boolean reservada) {
        isReservada = reservada;
    }

    public void reservar(int dia, int mes, int ano){
        if(dia != 0 && mes != 0 && ano != 0){
            this.medico.getSala();
            this.medico.getNome();

        }

    }
}

