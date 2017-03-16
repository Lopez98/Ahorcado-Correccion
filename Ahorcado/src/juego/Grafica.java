/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class Grafica extends javax.swing.JFrame {
    
    
    Tablero juego = new Tablero();
    char letra[];
    
    /**
     * Creates new form Grafica
     */
    public Grafica() {
        initComponents();
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        textoPalabra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonJugar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelPalabra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textoLetra = new javax.swing.JTextField();
        botonLetra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textoPalabraJugador = new javax.swing.JTextField();
        botonPalabra = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoPalabra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setText("Inserte la palabra:");

        botonJugar.setText("Jugar");
        botonJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonJugarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("La palabra es:");

        labelPalabra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelPalabra.setText("palabra");

        jLabel3.setText("Ingrese una letra:");

        botonLetra.setText("Enviar Letra");
        botonLetra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonLetraMouseClicked(evt);
            }
        });

        jLabel4.setText("Ingresar palabra completa:");

        botonPalabra.setText("Enviar Palabra");
        botonPalabra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPalabraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPalabra)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botonLetra)
                                            .addComponent(textoLetra)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textoPalabraJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonJugar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(botonPalabra)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonJugar))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(labelPalabra)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textoLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonLetra)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textoPalabraJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonPalabra)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJugarMouseClicked
        // TODO add your handling code here:
        juego.stringPalabra = textoPalabra.getText();
        textoPalabra.setText("");
        
        textoPalabra.enable(false);
        botonJugar.setEnabled(false);
        
        juego.iniciar();
        
        labelPalabra.setText(juego.mostrarJuego());
        
        textoLetra.setEnabled(true);
        textoPalabraJugador.setEnabled(true);
        botonLetra.setEnabled(true);
        botonPalabra.setEnabled(true);
    }//GEN-LAST:event_botonJugarMouseClicked

    private void botonLetraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLetraMouseClicked
        // TODO add your handling code here:
        letra = textoLetra.getText().toCharArray();
        juego.letra = letra[0];
        
        switch (juego.analizarLetra()){
            case 0:
                JOptionPane.showMessageDialog(null, "Perdió\nLa palabra era:\n"+juego.stringPalabra);
                juego.iniciar();
                textoPalabra.setEnabled(true);
                botonJugar.setEnabled(true);
                
                JOptionPane.showMessageDialog(null, "Ingrese otra palabra");
                
                textoLetra.enable(false);
                textoPalabraJugador.setEnabled(false);
                botonLetra.setEnabled(false);
                botonPalabra.setEnabled(false);
                
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Ganó\nLa palabra era:\n"+juego.stringPalabra);
                labelPalabra.setText(juego.mostrarJuego());
                juego.iniciar();
                textoPalabra.setEnabled(true);
                botonJugar.setEnabled(true);
                
                JOptionPane.showMessageDialog(null, "Ingrese otra palabra");
                
                textoLetra.enable(false);
                textoPalabraJugador.setEnabled(false);
                botonLetra.setEnabled(false);
                botonPalabra.setEnabled(false);
                break;
            case 2:
                labelPalabra.setText(juego.mostrarJuego());
                break;
        }
        textoLetra.setText("");
    }//GEN-LAST:event_botonLetraMouseClicked

    private void botonPalabraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPalabraMouseClicked
        // TODO add your handling code here:
        juego.respuesta = textoPalabraJugador.getText();
    }//GEN-LAST:event_botonPalabraMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonJugar;
    private javax.swing.JButton botonLetra;
    private javax.swing.JButton botonPalabra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelPalabra;
    private javax.swing.JTextField textoLetra;
    private javax.swing.JTextField textoPalabra;
    private javax.swing.JTextField textoPalabraJugador;
    // End of variables declaration//GEN-END:variables
}