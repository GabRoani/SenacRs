package org.example.model;

public class Usuario {

    private String tipoConta;
    private String numeroConta;
    private double saldoConta;
    private String extratoConta;

    public Usuario(String tipoConta, String numeroConta, double saldoConta) {
        this.tipoConta = tipoConta;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String getExtratoConta() {
        return extratoConta;
    }

    public void setExtratoConta(String extratoConta) {
        this.extratoConta = extratoConta;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "tipoConta='" + tipoConta + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldoConta=" + saldoConta +
                '}';
    }
}