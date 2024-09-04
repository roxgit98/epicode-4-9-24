package davidegiliberti.epicode_4_9_24.entities;

import davidegiliberti.epicode_4_9_24.enums.StatoOrdine;

import java.time.LocalDateTime;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private Tavolo tavolo;
    private List<ElementoMenu> elementiMenu;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private double importoTotale;

    public Ordine(int numeroOrdine, Tavolo tavolo, List<ElementoMenu> elementiMenu, StatoOrdine stato, int numeroCoperti, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.elementiMenu = elementiMenu;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = LocalDateTime.now();
        this.importoTotale = calcolaImportoTotale(costoCoperto);
    }

    private double calcolaImportoTotale(double costoCoperto) {

        double totaleElementi = elementiMenu.stream()
                .mapToDouble(ElementoMenu::getPrezzo)
                .sum();
        return totaleElementi + (numeroCoperti * costoCoperto);
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(int numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public List<ElementoMenu> getElementiMenu() {
        return elementiMenu;
    }

    public void setElementiMenu(List<ElementoMenu> elementiMenu) {
        this.elementiMenu = elementiMenu;
    }

    public StatoOrdine getStato() {
        return stato;
    }

    public void setStato(StatoOrdine stato) {
        this.stato = stato;
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public LocalDateTime getOraAcquisizione() {
        return oraAcquisizione;
    }

    public void setOraAcquisizione(LocalDateTime oraAcquisizione) {
        this.oraAcquisizione = oraAcquisizione;
    }

    public double getImportoTotale() {
        return importoTotale;
    }

    public void setImportoTotale(double importoTotale) {
        this.importoTotale = importoTotale;
    }
}
