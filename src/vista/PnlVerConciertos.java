/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author Gabriel
 */
public class PnlVerConciertos extends javax.swing.JPanel {

    /**
     * Creates new form verConciertos
     */
    public PnlVerConciertos() {
        setSize(450, 620);
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

        BtnConcierto2 = new javax.swing.JButton();
        BtnConcierto3 = new javax.swing.JButton();
        BtnConcierto1 = new javax.swing.JButton();
        LblConciertos = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(450, 620));

        BtnConcierto2.setText("CONCIERTO 2");
        BtnConcierto2.setPreferredSize(new java.awt.Dimension(325, 90));
        BtnConcierto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConcierto2ActionPerformed(evt);
            }
        });

        BtnConcierto3.setText("CONCIERTO 3");
        BtnConcierto3.setPreferredSize(new java.awt.Dimension(325, 90));

        BtnConcierto1.setText("CONCIERTO 1");
        BtnConcierto1.setPreferredSize(new java.awt.Dimension(325, 90));
        BtnConcierto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConcierto1ActionPerformed(evt);
            }
        });

        LblConciertos.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        LblConciertos.setText("CONCIERTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnConcierto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnConcierto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnConcierto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(LblConciertos)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(LblConciertos)
                .addGap(68, 68, 68)
                .addComponent(BtnConcierto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(BtnConcierto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(BtnConcierto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        BtnConcierto2.getAccessibleContext().setAccessibleName("BtnNombre2");
        BtnConcierto3.getAccessibleContext().setAccessibleName("BtnNombre3");
        BtnConcierto1.getAccessibleContext().setAccessibleName("BtnNombre1");
        LblConciertos.getAccessibleContext().setAccessibleName("LblNombre");
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConcierto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConcierto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnConcierto2ActionPerformed

    private void BtnConcierto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConcierto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnConcierto1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnConcierto1;
    public javax.swing.JButton BtnConcierto2;
    public javax.swing.JButton BtnConcierto3;
    private javax.swing.JLabel LblConciertos;
    // End of variables declaration//GEN-END:variables
}
