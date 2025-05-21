package br.edu.unespar.calculadora.altura.predio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraAlturaPredio extends JFrame {

    public CalculadoraAlturaPredio() {
        setTitle("Altura do Edifício - Física");
        setSize(450, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblAlturaJanela = new JLabel("Altura da janela (m):");
        lblAlturaJanela.setBounds(20, 20, 200, 25);
        JTextField tfAlturaJanela = new JTextField("1.20");
        tfAlturaJanela.setBounds(220, 20, 100, 25);

        JLabel lblTempoJanela = new JLabel("Tempo p/ atravessar a janela (s):");
        lblTempoJanela.setBounds(20, 60, 200, 25);
        JTextField tfTempoJanela = new JTextField("0.125");
        tfTempoJanela.setBounds(220, 60, 100, 25);

        JLabel lblTempoAbaixo = new JLabel("Tempo abaixo da janela (s):");
        lblTempoAbaixo.setBounds(20, 100, 200, 25);
        JTextField tfTempoAbaixo = new JTextField("2.00");
        tfTempoAbaixo.setBounds(220, 100, 100, 25);

        JLabel lblGravidade = new JLabel("Gravidade (m/s²):");
        lblGravidade.setBounds(20, 140, 200, 25);
        JTextField tfGravidade = new JTextField("9.8");
        tfGravidade.setBounds(220, 140, 100, 25);

        JButton btnCalcular = new JButton("Calcular Altura");
        btnCalcular.setBounds(140, 180, 150, 30);

        JLabel lblResultado = new JLabel("");
        lblResultado.setBounds(20, 230, 400, 25);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double hJanela = Double.parseDouble(tfAlturaJanela.getText());
                    double tJanela = Double.parseDouble(tfTempoJanela.getText());
                    double tAbaixo = Double.parseDouble(tfTempoAbaixo.getText());
                    double g = Double.parseDouble(tfGravidade.getText());

                    double vMedia = hJanela / tJanela;

                    double v1 = (2 * vMedia - g * tJanela) / 2;
                    double v2 = v1 + g * tJanela;

                    double t1 = v1 / g;

                    double h1 = 0.5 * g * t1 * t1;

                    double tDescida = tAbaixo / 2;
                    double h3 = v2 * tDescida + 0.5 * g * tDescida * tDescida;

                    double hTotal = h1 + hJanela + h3;

                    lblResultado.setText("Altura do edifício: " + String.format("%.2f", hTotal) + " metros");

                } catch (NumberFormatException ex) {
                    lblResultado.setText("Por favor, preencha todos os campos corretamente.");
                }
            }
        });

        add(lblAlturaJanela); add(tfAlturaJanela);
        add(lblTempoJanela); add(tfTempoJanela);
        add(lblTempoAbaixo); add(tfTempoAbaixo);
        add(lblGravidade); add(tfGravidade);
        add(btnCalcular);
        add(lblResultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculadoraAlturaPredio();
    }
}
