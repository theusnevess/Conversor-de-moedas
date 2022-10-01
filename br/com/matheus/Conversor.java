package br.com.matheus;

import javax.swing.*;

public class Conversor {

    public static void main(String[] args) {

        funcoesConversoras converte = new funcoesConversoras();

        while(true) {

            String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Converter de real para moedas estrangeiras", "Conversor de moedas estrangeiras para real"}, "Escolha").toString();

            if(opcoes == "Converter de real para moedas estrangeiras") {

                String opcoesConvercaoDeMoeda = JOptionPane.showInputDialog(null, "Escolha uma opção de converção de moeda", "Casa de câmbio do theusin", JOptionPane.PLAIN_MESSAGE, null, new Object[]
                                {"Converter de real para dólar",
                                        "Converter de real para euro",
                                        "Converter de real para libra",
                                        "Converter de real para peso argetino",
                                        "Converter de real para peso mexicano"},
                        "Escolha").toString();

                switch(opcoesConvercaoDeMoeda) {

                    case "Converter de real para dólar":
                        String realParaDolar = JOptionPane.showInputDialog("Insira o valor em reais");
                        double valorRecebido1 = Double.parseDouble(realParaDolar);
                        converte.converterRealParaDolar(valorRecebido1);
                        break;

                    case "Converter de real para euro":
                        String realParaEuro = JOptionPane.showInputDialog("Insira o valor em reais");
                        double valorRecebido3 = Double.parseDouble(realParaEuro);
                        converte.converterRealParaEuro(valorRecebido3);
                        break;

                    case "Converter de real para libra":
                        String realParaLibra = JOptionPane.showInputDialog("Insira o valor em reais");
                        double valorRecebido5 = Double.parseDouble(realParaLibra);
                        converte.converterRealParaLibra(valorRecebido5);
                        break;

                    case "Converter de real para peso argetino":
                        String realParaPesoArgentino = JOptionPane.showInputDialog("Insira o valor em reais");
                        double valorRecebido7 = Double.parseDouble(realParaPesoArgentino);
                        converte.converterRealParaPesoArgentino(valorRecebido7);
                        break;

                    case "Converter de real para peso mexicano":
                        String realParaPesoMexicano = JOptionPane.showInputDialog("Insira o valor em reais");
                        double valorRecebido9 = Double.parseDouble(realParaPesoMexicano);
                        converte.converterRealParaPesomexicano(valorRecebido9);
                        break;
                    }

              } else if(opcoes == "Conversor de moedas estrangeiras para real") {

                    String opcoesConvercaoDeMoedaParaReal = JOptionPane.showInputDialog(null, "Escolha uma opção de converção de moeda", "Casa de câmbio do theusin", JOptionPane.PLAIN_MESSAGE, null, new Object[]
                                {"Converter de dólar para real",
                                        "Converter de euro para real",
                                        "Converter de libra para real",
                                        "Converter de peso argentino para real",
                                        "Converter de peso mexicano para real"},
                        "Escolha").toString();

                    switch(opcoesConvercaoDeMoedaParaReal) {

                        case "Converter de dólar para real":
                            String dolarParaReal = JOptionPane.showInputDialog("Insira o valor em dólar");
                            double valorRecebido2 = Double.parseDouble(dolarParaReal);
                            converte.converterDolarParaReal(valorRecebido2);
                            break;

                        case "Converter de euro para real":
                            String euroParaReal = JOptionPane.showInputDialog("Insira o valor em euros");
                            double valorRecebido4 = Double.parseDouble(euroParaReal);
                            converte.converterEuroParaReal(valorRecebido4);
                            break;

                        case "Converter de libra para real":
                            String libraParaReal = JOptionPane.showInputDialog("Insira o valor em libras");
                            double valorRecebido6 = Double.parseDouble(libraParaReal);
                            converte.converterLibraParaReal(valorRecebido6);
                            break;

                        case "Converter de peso argentino para real":
                            String pesoArgentinoParaReal = JOptionPane.showInputDialog("Insira o valor em pesos argentinos");
                            double valorRecebido8 = Double.parseDouble(pesoArgentinoParaReal);
                            converte.converterPesoArgentinoParaReal(valorRecebido8);
                            break;

                        case "Converter de peso mexicano para real":
                            String pesoMexicanoParaReal = JOptionPane.showInputDialog("Insira o valor em pesos mexicanos");
                            double valorRecebido10 = Double.parseDouble(pesoMexicanoParaReal);
                            converte.converterPesoMexicanoParaReal(valorRecebido10);
                            break;
                }
            }
        }
    }
}
