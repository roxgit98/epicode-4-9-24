package davidegiliberti.epicode_4_9_24.entities;

public class Tavolo {
    private int numeroTavolo;
    private int numeroCopertiMax;
    private boolean occupato;

    public Tavolo(int numeroTavolo, int numeroCopertiMax) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCopertiMax = numeroCopertiMax;
        this.occupato = false;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public int getNumeroCopertiMax() {
        return numeroCopertiMax;
    }

    public void setNumeroCopertiMax(int numeroCopertiMax) {
        this.numeroCopertiMax = numeroCopertiMax;
    }

    public boolean isOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroTavolo=" + numeroTavolo +
                ", numeroCopertiMax=" + numeroCopertiMax +
                ", occupato=" + occupato +
                '}';
    }
}
