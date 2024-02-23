import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    int numAlarmasRevisar;

    public RevisionAlarma(String trabajador, LocalDate fechaInicio, String cliente, int numAlarmasRevisar) {
        super(cliente);
        this.numAlarmasRevisar = numAlarmasRevisar;
        this.Trabajador = "Revisor Especialista Contraincendios";
    }
}
