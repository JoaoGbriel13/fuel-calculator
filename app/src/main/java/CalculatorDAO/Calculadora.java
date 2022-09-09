/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatorDAO;

public class Calculadora {
    private double tempoCorrida;
    private double numVoltas;
    private double consumoPorVolta;
    private double tempoMedioVolta;

    public Calculadora() {
        this.tempoCorrida = tempoCorrida;
        this.numVoltas = numVoltas;
        this.consumoPorVolta = consumoPorVolta;
        this.tempoMedioVolta = tempoMedioVolta;
    }
    
    public double calcularTanqueTempo(double tempoCorrida, double consumoPorVolta, double tempoMedioVolta){
        double tempoConvertido = tempoCorrida * 60;
        double numeroDeVoltas = tempoConvertido / tempoMedioVolta;
        double combustivelTotal = numeroDeVoltas * consumoPorVolta;
        return combustivelTotal;
        
    }
    
    public void calcularPorVoltas(double numVoltas, double consumoPorVolta){
        double combustivelTotal = numVoltas * consumoPorVolta;
    }

    public double getTempoCorrida() {
        return tempoCorrida;
    }

    public void setTempoCorrida(double tempoCorrida) {
        this.tempoCorrida = tempoCorrida;
    }

    public double getNumVoltas() {
        return numVoltas;
    }

    public void setNumVoltas(double numVoltas) {
        this.numVoltas = numVoltas;
    }

    public double getConsumoPorVolta() {
        return consumoPorVolta;
    }

    public void setConsumoPorVolta(double consumoPorVolta) {
        this.consumoPorVolta = consumoPorVolta;
    }

    public double getTempoMedioVolta() {
        return tempoMedioVolta;
    }

    public void setTempoMedioVolta(double tempoMedioVolta) {
        this.tempoMedioVolta = tempoMedioVolta;
    }
    
    
}
