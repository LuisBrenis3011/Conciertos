/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author Gabriel
 */
public class seleccionZona extends javax.swing.JPanel {

    /**
     * Creates new form seleccionZona
     */
    public seleccionZona() {
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

        LblNombre = new javax.swing.JLabel();
        BtnNombre2 = new javax.swing.JButton();
        BtnNombre3 = new javax.swing.JButton();
        BtnNombre1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 620));

        LblNombre.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        LblNombre.setText("SELECCIONAR ZONA");

        BtnNombre2.setText("<html><center><b>ZONA PREFERENCIAL</b></center><br>Cantidad entradas: 200 | S/ 100</html>");
        BtnNombre2.setPreferredSize(new java.awt.Dimension(325, 90));

        BtnNombre3.setText("<html><center><b>ZONA GENERAL</b></center><br>Cantidad entradas: 300 | S/ 50</html>");
        BtnNombre3.setPreferredSize(new java.awt.Dimension(325, 90));

        BtnNombre1.setText("<html><center><b>ZONA VIP</b></center><br>Cantidad entradas: 100 | S/ 150</html>");
        BtnNombre1.setPreferredSize(new java.awt.Dimension(325, 90));
        BtnNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNombre1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(LblNombre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LblNombre)
                .addGap(48, 48, 48)
                .addComponent(BtnNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(BtnNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(BtnNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("PnlNombre");
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNombre1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNombre1;
    private javax.swing.JButton BtnNombre2;
    private javax.swing.JButton BtnNombre3;
    private javax.swing.JLabel LblNombre;
    // End of variables declaration//GEN-END:variables
}
