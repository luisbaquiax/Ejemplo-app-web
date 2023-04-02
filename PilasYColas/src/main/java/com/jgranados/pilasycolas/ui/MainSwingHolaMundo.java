package com.jgranados.pilasycolas.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author jose
 */
public class MainSwingHolaMundo {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainSwingHolaMundo main = new MainSwingHolaMundo();
        main.iniciarInterfaz();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                iniciarInterfaz();
            }
        });

    }

    private static void iniciarInterfaz() {
        JFrame frame = new JFrame("Hola Mundo Swing!!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        frame.setMinimumSize(new Dimension(500, 500));

        // nueva etiqueta
        JLabel etiqueta = new JLabel("Hola Mundo dese Swing!!!!");
        JLabel etiquetaHola2 = new JLabel("Otro Hola Mundo desde Swing!!!!");
        JButton boton1 = new JButton("Presioname");
        container.add(etiqueta);
        container.add(etiquetaHola2);
        container.add(boton1);

        javax.swing.BoxLayout layout = new BoxLayout(container, BoxLayout.LINE_AXIS);
        container.setLayout(layout);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Presionado!!");
                etiquetaHola2.setText("Presionado");
            }
        });

        boton1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                etiquetaHola2.setText("Mouse entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                etiquetaHola2.setText("Mouse exited");
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

}
