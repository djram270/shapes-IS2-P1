package com.unicauca.figures.domain.presentation;

import com.unicauca.figures.domain.model.Square;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class GUISquare extends javax.swing.JFrame {
    
    private Square square;

    /**
     * Creates new form GUISquare
     */
    public GUISquare() {
        initComponents();
        square = new Square(1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        pnlButtons = new javax.swing.JPanel();
        btnCalculate = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        pnlForm = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSide = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPerimeter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SQUARE");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        pnlButtons.setPreferredSize(new java.awt.Dimension(400, 33));

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        pnlButtons.add(btnCalculate);

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pnlButtons.add(btnClose);

        getContentPane().add(pnlButtons, java.awt.BorderLayout.PAGE_END);

        pnlForm.setLayout(new java.awt.GridLayout(3, 2));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Side");
        pnlForm.add(jLabel3);

        txtSide.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlForm.add(txtSide);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Area:");
        jLabel4.setPreferredSize(new java.awt.Dimension(54, 16));
        pnlForm.add(jLabel4);

        lblArea.setForeground(new java.awt.Color(204, 0, 0));
        lblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArea.setText("-");
        pnlForm.add(lblArea);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Perimeter:");
        pnlForm.add(jLabel5);

        lblPerimeter.setForeground(new java.awt.Color(0, 153, 153));
        lblPerimeter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerimeter.setText("-");
        pnlForm.add(lblPerimeter);

        getContentPane().add(pnlForm, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        try
        {
            if((txtSide.getText().isEmpty()))
            {
                JOptionPane.showMessageDialog(this, "No deben quedar espacios en blanco.", "Error", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                if((Double.parseDouble(txtSide.getText()) > 0))
                {
                    double side = Double.parseDouble(txtSide.getText());
                    square.setSquare1(side);
                    lblArea.setText("" + square.calculateArea());
                    lblPerimeter.setText("" + square.calculatePerimeter());
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Los valores no pueden ser cero ni un valor negativo.", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Ingrese un valor valido.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(GUISquare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISquare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISquare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISquare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISquare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblPerimeter;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JTextField txtSide;
    // End of variables declaration//GEN-END:variables
}
