

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Control = new javax.swing.JPanel();
        InfoVela = new javax.swing.JLabel();
        ControlVela = new javax.swing.JSlider();
        InfoTimón = new javax.swing.JLabel();
        ControlTimón = new javax.swing.JSlider();
        Panel2D = new javax.swing.JPanel();
        Lienzo = new panelGrafico();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sailing");
        setIconImage(new javax.swing.ImageIcon("icon.png").getImage());

        Control.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        InfoVela.setText("Vela");

        ControlVela.setMaximum(90);
        ControlVela.setMinimum(-90);
        ControlVela.setToolTipText("Control de la vela");
        ControlVela.setValue(0);
        ControlVela.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ControlVelaStateChanged(evt);
            }
        });
        ControlVela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ControlVelaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ControlVelaMouseExited(evt);
            }
        });

        InfoTimón.setText("Timón");

        ControlTimón.setMaximum(90);
        ControlTimón.setMinimum(-90);
        ControlTimón.setToolTipText("Control del timón");
        ControlTimón.setValue(0);
        ControlTimón.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ControlTimónStateChanged(evt);
            }
        });
        ControlTimón.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ControlTimónMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ControlTimónMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ControlLayout = new javax.swing.GroupLayout(Control);
        Control.setLayout(ControlLayout);
        ControlLayout.setHorizontalGroup(
            ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ControlVela, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(ControlTimón, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ControlLayout.createSequentialGroup()
                        .addGroup(ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoVela)
                            .addComponent(InfoTimón))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ControlLayout.setVerticalGroup(
            ControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(InfoVela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ControlVela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(InfoTimón)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ControlTimón, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Panel2D.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout LienzoLayout = new javax.swing.GroupLayout(Lienzo);
        Lienzo.setLayout(LienzoLayout);
        LienzoLayout.setHorizontalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );
        LienzoLayout.setVerticalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel2DLayout = new javax.swing.GroupLayout(Panel2D);
        Panel2D.setLayout(Panel2DLayout);
        Panel2DLayout.setHorizontalGroup(
            Panel2DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel2DLayout.setVerticalGroup(
            Panel2DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Control, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel2D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel2D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Control, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(105, 105, 105)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ControlVelaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ControlVelaStateChanged
        Lienzo.anguloVela = ControlVela.getValue()*Math.PI/180.0;
        Lienzo.repaint();
    }//GEN-LAST:event_ControlVelaStateChanged

    private void ControlTimónStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ControlTimónStateChanged
        Lienzo.anguloTimon = ControlTimón.getValue()*Math.PI/180.0;
        Lienzo.repaint();
    }//GEN-LAST:event_ControlTimónStateChanged

    private void ControlVelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ControlVelaMouseEntered
        Lienzo.focusVela = true;
        Lienzo.repaint();
    }//GEN-LAST:event_ControlVelaMouseEntered

    private void ControlVelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ControlVelaMouseExited
        Lienzo.focusVela = false;
        Lienzo.repaint();
    }//GEN-LAST:event_ControlVelaMouseExited

    private void ControlTimónMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ControlTimónMouseEntered
        Lienzo.focusTimon = true;
        Lienzo.repaint();
    }//GEN-LAST:event_ControlTimónMouseEntered

    private void ControlTimónMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ControlTimónMouseExited
        Lienzo.focusTimon = false;
        Lienzo.repaint();
    }//GEN-LAST:event_ControlTimónMouseExited

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Control;
    private javax.swing.JSlider ControlTimón;
    private javax.swing.JSlider ControlVela;
    private javax.swing.JLabel InfoTimón;
    private javax.swing.JLabel InfoVela;
    private panelGrafico Lienzo;
    private javax.swing.JPanel Panel2D;
    // End of variables declaration//GEN-END:variables
}
