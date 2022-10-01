package br.com.matheus;

import javax.swing.*;

public class funcoesConversoras {

    //Convercões entre real e dólar//

    public void converterRealParaDolar(double valorRecebido) {
        double convercao = valorRecebido / 5.41 ;
        convercao = (double) Math.round(convercao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em dólar: " + convercao);
    }

    public void converterDolarParaReal(double valorRecebido) {
        double convercao = valorRecebido * 5.41 ;
        convercao = (double) Math.round(convercao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em real: " + convercao);
    }



    //Convercões entre real e euro//

    public void converterRealParaEuro(double valorRecebido) {
        double convercao = valorRecebido / 5.31 ;
        convercao = (double) Math.round(convercao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em euro: " + convercao);
    }

    public void converterEuroParaReal(double valorRecebido) {
        double convercao = valorRecebido * 5.31 ;
        convercao = (double) Math.round(convercao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em real: " + convercao);
    }



    //Convercões entre real e libra//

    public void converterRealParaLibra(double valorRecebido) {
        double convercao = valorRecebido / 6.05 ;
        convercao = (double) Math.round(convercao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em libra: " + convercao);
    }

    public void converterLibraParaReal(double valorRecebido) {
        double convercao = valorRecebido * 6.05 ;
        convercao = (double) Math.round(convercao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em real: " + convercao);
    }



    //Convercões entre real e peso argentino//

    public void converterRealParaPesoArgentino(double valorRecebido) {
        double convercao = valorRecebido / 0.037 ;
        convercao = (double) Math.round(convercao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em peso argentino: " + convercao);
    }

    public void converterPesoArgentinoParaReal(double valorRecebido) {
        double convercao = valorRecebido * 0.037 ;
        convercao = (double) Math.round(convercao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em real: " + convercao);
    }



    //Convercões entre real e peso mexicano//

    public void converterRealParaPesomexicano(double valorRecebido) {
        double convercao = valorRecebido / 0.27;
        convercao = (double) Math.round(convercao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em peso mexicano: " + convercao);
    }

    public void converterPesoMexicanoParaReal(double valorRecebido) {
        double convercao = valorRecebido * 0.27;
        convercao = (double) Math.round(convercao *100d )/100;
        JOptionPane.showMessageDialog(null, "Valor em real: " + convercao);
    }

}
