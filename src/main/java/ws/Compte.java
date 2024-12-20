package ws;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date datecretion;

    public Compte(int code, double solde, Date datecretion) {
        this.code = code;
        this.solde = solde;
        this.datecretion = datecretion;
    }

    public Compte() {
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

    public Date getDatecretion() {
        return datecretion;
    }

    public void setDatecretion(Date datecretion) {
        this.datecretion = datecretion;
    }
}
