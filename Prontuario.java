import java.util.Date;

public class Prontuario {
    private Paciente paciente;
    private Date date;
    private boolean tratado;
    private boolean quarentena;
    private boolean liberado;


    public Prontuario(Paciente paciente, Date date, boolean tratado, boolean quarentena, boolean liberado) {
        this.paciente = paciente;
        this.date = date;
        this.tratado = tratado;
        this.quarentena = quarentena;
        this.liberado = liberado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isTratado() {
        return tratado;
    }

    public void setTratado(boolean tratado) {
        this.tratado = tratado;
    }

    public boolean isQuarentena() {
        return quarentena;
    }

    public void setQuarentena(boolean quarentena) {
        this.quarentena = quarentena;
    }

    public boolean isLiberado() {
        return liberado;
    }

    public void setLiberado(boolean liberado) {
        this.liberado = liberado;
    }

    public void analisar() {
        if ()
    }
}
