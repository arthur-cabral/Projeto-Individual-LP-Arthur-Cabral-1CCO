/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur.projetoindivual.continuada01;

import java.io.Console;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author marti
 */
public class Tela extends javax.swing.JFrame {

    Random rand = new Random();

    public Tela() {
        initComponents();
    }

    Double CPU = 0.0;
    Double Disco = 0.0;
    Double Memoria = 0.0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prbCpu = new javax.swing.JProgressBar();
        prbDisco = new javax.swing.JProgressBar();
        prbMemoria = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLeitura = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblMinCpu = new javax.swing.JLabel();
        lblMinDisco = new javax.swing.JLabel();
        lblMinMemoria = new javax.swing.JLabel();
        lblMaxDisco = new javax.swing.JLabel();
        lblMaxCpu = new javax.swing.JLabel();
        lblMaxMemoria = new javax.swing.JLabel();
        lblMediaMemoria = new javax.swing.JLabel();
        lblMediaDisco = new javax.swing.JLabel();
        lblMediaCpu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(prbCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 28));
        getContentPane().add(prbDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 161, 28));
        getContentPane().add(prbMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, 28));

        jLabel1.setText("Cpu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Disco");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel3.setText("Memória");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        btnLeitura.setText("Fazer leitura de dados");
        btnLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeituraActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeitura, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 240, 80));

        jLabel4.setText("Valor mínimo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setText("Valor mínimo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel6.setText("Valor mínimo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        jLabel7.setText("Valor máximo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jLabel8.setText("Valor máximo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel9.setText("Valor máximo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel10.setText("Média");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel11.setText("Média");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel12.setText("Média");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        lblMinCpu.setText("0");
        getContentPane().add(lblMinCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        lblMinDisco.setText("0");
        getContentPane().add(lblMinDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        lblMinMemoria.setText("0");
        getContentPane().add(lblMinMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        lblMaxDisco.setText("0");
        getContentPane().add(lblMaxDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        lblMaxCpu.setText("0");
        getContentPane().add(lblMaxCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        lblMaxMemoria.setText("0");
        getContentPane().add(lblMaxMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));
        getContentPane().add(lblMediaMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 70, 19));
        getContentPane().add(lblMediaDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 75, 21));
        getContentPane().add(lblMediaCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 73, 21));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeituraActionPerformed
        Double randomCpu = ThreadLocalRandom.current().nextDouble(0, 4);
        Double randomDisco = ThreadLocalRandom.current().nextDouble(0, 1000);
        Double randomMemoria = ThreadLocalRandom.current().nextDouble(0, 12);
        Double valorRandCpu1 = ThreadLocalRandom.current().nextDouble(0, 4);
        Double valorRandDisco1 = ThreadLocalRandom.current().nextDouble(0, 1000);
        Double valorRandMemoria1 = ThreadLocalRandom.current().nextDouble(0, 12);
        Double valorRandCpu2 = ThreadLocalRandom.current().nextDouble(0, 4);
        Double valorRandDisco2 = ThreadLocalRandom.current().nextDouble(0, 1000);
        Double valorRandMemoria2 = ThreadLocalRandom.current().nextDouble(0, 12);

        if (CPU > 0) {
            if (CPU > Double.parseDouble(lblMaxCpu.getText())) {
                lblMaxCpu.setText(CPU.toString());
            } else if (CPU < Double.parseDouble(lblMinCpu.getText())) {
                lblMinCpu.setText(CPU.toString());
            }
            if (Disco > Double.parseDouble(lblMaxDisco.getText())) {
                lblMaxDisco.setText(Disco.toString());
            } else if (Disco < Double.parseDouble(lblMinDisco.getText())) {
                lblMinDisco.setText(Disco.toString());
            }
            if (Memoria > Double.parseDouble(lblMaxMemoria.getText())) {
                lblMaxMemoria.setText(Memoria.toString());
            } else if (Memoria < Double.parseDouble(lblMinMemoria.getText())) {
                lblMinMemoria.setText(Memoria.toString());
            } else {
                if (valorRandCpu1 > valorRandCpu2) {
                    lblMaxCpu.setText(valorRandCpu1.toString());
                    lblMinCpu.setText(valorRandCpu2.toString());
                } else {
                    lblMinCpu.setText(valorRandCpu1.toString());
                    lblMaxCpu.setText(valorRandCpu2.toString());
                }

                if (valorRandMemoria1 > valorRandMemoria2) {
                    lblMaxMemoria.setText(valorRandMemoria1.toString());
                    lblMinMemoria.setText(valorRandMemoria2.toString());
                } else {
                    lblMinMemoria.setText(valorRandMemoria1.toString());
                    lblMaxMemoria.setText(valorRandMemoria2.toString());
                }

                if (valorRandDisco1 > valorRandDisco2) {
                    lblMaxDisco.setText(valorRandDisco1.toString());
                    lblMinDisco.setText(valorRandDisco2.toString());
                } else {
                    lblMinDisco.setText(valorRandDisco1.toString());
                    lblMaxDisco.setText(valorRandDisco2.toString());
                }
            }
        } else {
            if (valorRandCpu1 > valorRandCpu2) {
                lblMaxCpu.setText(valorRandCpu1.toString());
                lblMinCpu.setText(valorRandCpu2.toString());
            } else {
                lblMinCpu.setText(valorRandCpu1.toString());
                lblMaxCpu.setText(valorRandCpu2.toString());
            }

            if (valorRandMemoria1 > valorRandMemoria2) {
                lblMaxMemoria.setText(valorRandMemoria1.toString());
                lblMinMemoria.setText(valorRandMemoria2.toString());
            } else {
                lblMinMemoria.setText(valorRandMemoria1.toString());
                lblMaxMemoria.setText(valorRandMemoria2.toString());
            }

            if (valorRandDisco1 > valorRandDisco2) {
                lblMaxDisco.setText(valorRandDisco1.toString());
                lblMinDisco.setText(valorRandDisco2.toString());
            } else {
                lblMinDisco.setText(valorRandDisco1.toString());
                lblMaxDisco.setText(valorRandDisco2.toString());
            }
        }

        CPU = randomCpu;
        Disco = randomDisco;
        Memoria = randomMemoria;

        Double dMaxCpu = Double.parseDouble(lblMaxCpu.getText());
        Double dMinCpu = Double.parseDouble(lblMinCpu.getText());
        Double dMaxDisco = Double.parseDouble(lblMaxDisco.getText());
        Double dMinDisco = Double.parseDouble(lblMinDisco.getText());
        Double dMaxMemoria = Double.parseDouble(lblMaxMemoria.getText());
        Double dMinMemoria = Double.parseDouble(lblMinMemoria.getText());
        Double mediaCpu = ((dMaxCpu + dMinCpu) / 2);
        Double mediaDisco = ((dMaxDisco + dMinDisco) / 2);
        Double mediaMemoria = ((dMaxMemoria + dMinMemoria) / 2);

        String msgCpuMedia = String.format("%.2f", mediaCpu);
        String msgDiscoMedia = String.format("%.2f", mediaDisco);
        String msgMemoriaMedia = String.format("%.2f", mediaMemoria);

        lblMediaCpu.setText(msgCpuMedia);
        lblMediaDisco.setText(msgDiscoMedia);
        lblMediaMemoria.setText(msgMemoriaMedia);

        Double porcCpu = (mediaCpu * 100) / 4;
        Double porcDisco = (mediaDisco * 100) / 1000;
        Double porcMemoria = (mediaMemoria * 100) / 12;
        prbCpu.setStringPainted(true);
        prbDisco.setStringPainted(true);
        prbMemoria.setStringPainted(true);
        prbCpu.setValue(porcCpu.intValue());
        prbDisco.setValue(porcDisco.intValue());
        prbMemoria.setValue(porcMemoria.intValue());

        /*
        String msgCpuMin = String.format("%.2f", dMinCpu);
        String msgCpuMax = String.format("%.2f", dMaxCpu);
        String msgDiscoMin = String.format("%.2f", mediaCpu);
        String msgDiscoMax = String.format("%.2f", mediaCpu);
        String msgMemoriaMin = String.format("%.2f", mediaCpu);
        String msgMemoriaMax = String.format("%.2f", mediaCpu);
         */
    }//GEN-LAST:event_btnLeituraActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeitura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMaxCpu;
    private javax.swing.JLabel lblMaxDisco;
    private javax.swing.JLabel lblMaxMemoria;
    private javax.swing.JLabel lblMediaCpu;
    private javax.swing.JLabel lblMediaDisco;
    private javax.swing.JLabel lblMediaMemoria;
    private javax.swing.JLabel lblMinCpu;
    private javax.swing.JLabel lblMinDisco;
    private javax.swing.JLabel lblMinMemoria;
    private javax.swing.JProgressBar prbCpu;
    private javax.swing.JProgressBar prbDisco;
    private javax.swing.JProgressBar prbMemoria;
    // End of variables declaration//GEN-END:variables
}
