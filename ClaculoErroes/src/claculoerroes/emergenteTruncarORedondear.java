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
public class emergenteTruncarORedondear extends JFrame {

    JButton btnTruncar, btnRedondear;
    int respuesta = 1;

    public emergenteTruncarORedondear(String titulo) {
        super(titulo);
        this.setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 150);
        btnTruncar = new JButton("TRUNCAR");
        btnRedondear = new JButton("REDONDEAR");

        btnTruncar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                respuesta = 1;
                setVisible(false);
            }
        });

        btnRedondear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                respuesta = 2;
                setVisible(false);
            }
        });

        Container cp = getContentPane();
        cp.add(btnTruncar, BorderLayout.EAST);
        cp.add(btnRedondear, BorderLayout.WEST);

        setVisible(false);
    }

    public int getRespuesta() {
        return respuesta;
    }
}
