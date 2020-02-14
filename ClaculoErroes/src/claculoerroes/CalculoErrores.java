/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claculoerroes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 *
 * @author usuario
 */
public class CalculoErrores extends JFrame {

    JLabel lblVAproximado, lblVVerdadero, lblEAbsoluto, lblERelativo, txtEAbsoluto, txtERelativo;
    JTextField txtVAproximado, txtVVerdadero;
    JButton btnCalcular, btnCancelar;
    int desicion;
    String str1;

    double errorAbsoluto, errorRelativo;

    emergenteTruncarORedondear vEmergente = new emergenteTruncarORedondear("Truncar o Redondear");
    //VentanaCalculoErrores vn = new VentanaCalculoErrores("Calculo de errores opciones");

    public CalculoErrores(String titulo) {
        super(titulo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 250);

        btnCalcular = new JButton("Truncar o Redondear");
        btnCancelar = new JButton("Calcular");
        lblVAproximado = new JLabel("Valor aproximado: ");
        lblVVerdadero = new JLabel("Valor verdadero: ");
        lblEAbsoluto = new JLabel("Error absoluto= ");
        lblERelativo = new JLabel("Error Relativo= ");
        txtEAbsoluto = new JLabel();
        txtERelativo = new JLabel();
        txtVAproximado = new JTextField();
        txtVVerdadero = new JTextField();

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                desicion = vEmergente.getRespuesta();
                str1 = Integer.toString(desicion);

                double valorAprox = Double.parseDouble(txtVAproximado.getText());
                double valoVerdadero = Double.parseDouble(txtVVerdadero.getText());

                if (desicion == 1) {

                    //Calculo de error absoluto
                    errorAbsoluto = valoVerdadero - valorAprox;                    
                    errorRelativo = errorAbsoluto/valoVerdadero;
                    
                    //Truncamiento
                    errorAbsoluto*=100;
                    errorAbsoluto=(int)errorAbsoluto;                    
                    errorAbsoluto= errorAbsoluto/100;
                    
                    txtEAbsoluto.setText(Double.toString(errorAbsoluto));
                    
                    //Calculo
                    
                    
                    //Truncamiento
                    errorRelativo*=10000;
                    errorRelativo=(int)errorRelativo;
                    errorRelativo=errorRelativo/100;
                    
                    txtERelativo.setText(Double.toString(errorRelativo)+"%");
                }
                if (desicion == 2) {
                    //Calculo de error absoluto
                    errorAbsoluto = valoVerdadero - valorAprox;                    
                    errorRelativo = errorAbsoluto/valoVerdadero;
                                        
                    txtEAbsoluto.setText(Double.toString(Math.round(errorAbsoluto)));
                    
                    errorRelativo*=10000;
                    errorRelativo=(int)errorRelativo;
                    errorRelativo=errorRelativo/100;
                    
                    txtERelativo.setText(Double.toString(Math.round(errorRelativo))+"%");
                }

            }
        });

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                vEmergente.setVisible(true);

            }
        });

        JPanel panel1 = new JPanel();
        GridLayout grid1 = new GridLayout(5, 2, 0, 5);
        panel1.setLayout(grid1);

        panel1.add(lblVVerdadero);
        panel1.add(txtVVerdadero);

        panel1.add(lblVAproximado);
        panel1.add(txtVAproximado);

        panel1.add(btnCalcular);
        panel1.add(btnCancelar);

        panel1.add(lblEAbsoluto);
        panel1.add(txtEAbsoluto);

        panel1.add(lblERelativo);
        panel1.add(txtERelativo);

        Container cp3 = getContentPane();
        cp3.add(panel1);

        setVisible(false);
    }

}
