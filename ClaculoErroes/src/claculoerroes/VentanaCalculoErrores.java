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
public class VentanaCalculoErrores extends JFrame {

    JButton btnErrores;
    CalculoErrores ventanaCalculo = new CalculoErrores("Venatna errores");

    public VentanaCalculoErrores(String titulo) {
        super(titulo);
        this.setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 200);
        btnErrores = new JButton("ERRORES");

        btnErrores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                ventanaCalculo.setVisible(true);
            }
        });

        JPanel panel1 = new JPanel();
        GridLayout grid1 = new GridLayout(3, 1, 0, 5);
        panel1.setLayout(grid1);

        panel1.add(btnErrores);

        Container cp2 = getContentPane();
        cp2.add(panel1);

        setVisible(false);
    }
}
