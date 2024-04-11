/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class Menu extends javax.swing.JPanel {

    
    public Menu() {
        initComponents();
        configureButtons();
    }
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jButtonAgendar = new javax.swing.JButton();
        jButtonReservas = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/img/logo (1).png"))); // NOI18N

        jButtonAgendar.setBackground(new java.awt.Color(56, 56, 56));
        jButtonAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/img/icons/encontro (1).png"))); // NOI18N
        jButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarActionPerformed(evt);
            }
        });

        jButtonReservas.setBackground(new java.awt.Color(56, 56, 56));
        jButtonReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/img/icons/calendario.png"))); // NOI18N
        jButtonReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservasActionPerformed(evt);
            }
        });

        jButtonClientes.setBackground(new java.awt.Color(56, 56, 56));
        jButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/img/icons/perfil.png"))); // NOI18N
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelLogo))
                    .addComponent(jButtonClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReservas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAgendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo)
                .addGap(58, 58, 58)
                .addComponent(jButtonAgendar)
                .addGap(55, 55, 55)
                .addComponent(jButtonReservas)
                .addGap(55, 55, 55)
                .addComponent(jButtonClientes)
                .addContainerGap(241, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarActionPerformed
        this.getTopLevelAncestor().setVisible(false);
        Agendar agendar = new Agendar();
        agendar.setVisible(true);
    }//GEN-LAST:event_jButtonAgendarActionPerformed

    private void jButtonReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservasActionPerformed
        this.getTopLevelAncestor().setVisible(false);
        Reservas reservas = new Reservas();
        reservas.setVisible(true);
    }//GEN-LAST:event_jButtonReservasActionPerformed

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        this.getTopLevelAncestor().setVisible(false);
        Clientes cliente = new Clientes();
        cliente.setVisible(true);
    }//GEN-LAST:event_jButtonClientesActionPerformed

private void configureButtons() {
    configureButton(jButtonAgendar);
    configureButton(jButtonReservas);
    configureButton(jButtonClientes);
}

private void configureButton(JButton button) {
    button.setBorderPainted(false); // Remover a borda   
}



    
    
    @Override
    protected void paintChildren(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint (0, 0, Color.decode("#383838"), 0, getHeight(), Color.decode("#383838"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendar;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonReservas;
    private javax.swing.JLabel jLabelLogo;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
