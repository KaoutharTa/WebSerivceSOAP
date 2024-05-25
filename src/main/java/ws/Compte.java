package ws;

import java.time.LocalDate;
import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date localDate;

    public Compte(int code, double solde, Date localDate) {
        this.code = code;
        this.solde = solde;
        this.localDate = localDate;
    }
    public Compte(){

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getLocalDate() {
        return localDate;
    }

    public void setLocalDate(Date localDate) {
        this.localDate = localDate;
    }
}
