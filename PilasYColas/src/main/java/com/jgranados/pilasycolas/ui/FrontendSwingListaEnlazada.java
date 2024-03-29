/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.pilasycolas.ui;

import com.jgranados.listaenlazada.ListaEnzalada;
import com.jgranados.listaenlazada.Nodo;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class FrontendSwingListaEnlazada extends javax.swing.JFrame {

    private ListaEnzalada<String> lista;

    /**
     * Creates new form FrontendSwing
     */
    public FrontendSwingListaEnlazada() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLista = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        pnlValor = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtValores = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLista.setText("Crear una Lista");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        lblMenu.setBackground(new java.awt.Color(0, 153, 255));
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("MENU");
        lblMenu.setOpaque(true);

        pnlValor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAgregar.setText("Agregar valor");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtValor.setEnabled(false);

        javax.swing.GroupLayout pnlValorLayout = new javax.swing.GroupLayout(pnlValor);
        pnlValor.setLayout(pnlValorLayout);
        pnlValorLayout.setHorizontalGroup(
            pnlValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlValorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtValor)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap())
        );
        pnlValorLayout.setVerticalGroup(
            pnlValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        txtValores.setColumns(20);
        txtValores.setRows(5);
        txtValores.setEnabled(false);
        jScrollPane1.setViewportView(txtValores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                    .addComponent(pnlValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnLista)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLista)
                .addGap(99, 99, 99)
                .addComponent(pnlValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        lista = new ListaEnzalada<>();
        JOptionPane.showMessageDialog(this, "lista creada exitosamente.", "Exito!!", JOptionPane.INFORMATION_MESSAGE);
        btnAgregar.setEnabled(true);
        txtValor.setEnabled(true);
    }//GEN-LAST:event_btnListaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        lista.insertar(txtValor.getText());
        txtValores.setText("");
        Nodo<String> nodoActual = lista.getPrimerNodo();
        while (nodoActual != null) {
            txtValores.append(nodoActual.getContenido() + "\n");
            nodoActual = nodoActual.getSiguiente();
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontendSwingListaEnlazada().setVisible(true);
            }
        });
        System.out.println("algo mas a ejecutar");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JPanel pnlValor;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextArea txtValores;
    // End of variables declaration//GEN-END:variables

}
