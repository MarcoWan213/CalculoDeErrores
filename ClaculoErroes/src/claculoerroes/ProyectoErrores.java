/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claculoerroes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author usuario
 */
public class ProyectoErrores extends JFrame {

    JButton btnTema1;
    VentanaCalculoErrores ventanaErrores = new VentanaCalculoErrores("Calculo de errores opciones");

    public ProyectoErrores(String titulo) {
        super(titulo);
        this.setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 200);
        btnTema1 = new JButton("TEMA 1");

        btnTema1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                ventanaErrores.setVisible(true);
            }
        });

        JPanel panel1 = new JPanel();
        GridLayout grid1 = new GridLayout(3, 1, 0, 5);
        panel1.setLayout(grid1);

        panel1.add(btnTema1);

        Container cp = getContentPane();
        cp.add(panel1);

        setVisible(true);
    }

    public static void main(String[] args) {
        ProyectoErrores ventana1 = new ProyectoErrores("Ventana Principal");
    }

}
