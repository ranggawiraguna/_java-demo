package com.belajar.MateriKuliah.KuisSejarah;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dimas Subhan
 */
public class Formkuis extends javax.swing.JFrame {
    
    private static final long serialVersionUID = 1L;
    static boolean flag = false;

    /**
     * Creates new form Formkuis
     */
    public Formkuis() {
        initComponents();
        Thread t = new Thread(new Timer());
        Thread j = new Thread(new jam());
        t.start(); j.start();
    }

   public class Timer implements Runnable{
        
        @Override
        public void run() {
                
            try{
                A1box.setActionCommand("1");B1box.setActionCommand("Abu Bakar");
                A2box.setActionCommand("Komunisme"); B2box.setActionCommand("2");
                A3box.setActionCommand("Sekulerisme");B3box.setActionCommand("2");
                A4box.setActionCommand("1");B4box.setActionCommand("Thariq bin Ziyad");
                Thread.sleep(120000);
                Jawaban answer=new Jawaban(buttonGroup1.getSelection().getActionCommand(),buttonGroup2.getSelection().getActionCommand(),
                buttonGroup3.getSelection().getActionCommand(),buttonGroup4.getSelection().getActionCommand());
                FileOutputStream fos = new FileOutputStream("F:\\Serialisasi\\"+jTextField1.getText()+".obj");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(answer);oos.flush();oos.close();fos.close();
                dispose();
                if (flag==false){
                JOptionPane.showMessageDialog(null,"Waktu Anda habis, Jawaban terjawab akan tetap kami kumpulkan ke Bu Rabiatul");
                }
                } catch (InterruptedException ex){
                    Logger.getLogger(Formkuis.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {    
                Logger.getLogger(Formkuis.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                Logger.getLogger(Formkuis.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
    }
        public class jam extends Thread{
            @Override
            public void run(){
                for(int i=119;i>=0;i--){
                    try{
                Thread.sleep(1000);
                jLabel8.setText("Waktu anda tersisa "+i+" detik");
                    } catch (InterruptedException ex){
                        Logger.getLogger(Formkuis.class.getName()).log(Level.SEVERE, null, ex);
                        quizTimeIsUp();
                    }
                }
            }
    }
        
//    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        A1box = new javax.swing.JRadioButton();
        B1box = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        A2box = new javax.swing.JRadioButton();
        B2box = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        A3box = new javax.swing.JRadioButton();
        B3box = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        A4box = new javax.swing.JRadioButton();
        B4box = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kuis Sejarah Islam");

        jLabel2.setText("Nama :");

        jLabel3.setText("Jawablah soal pilihan ganda berikut :");

        jLabel4.setText("1. Siapakah Kholifah pertama pengganti Rasulullah ?");

        buttonGroup1.add(A1box);
        A1box.setText("Umar bin Khattab");

        buttonGroup1.add(B1box);
        B1box.setText("Abu Bakar");

        jLabel5.setText("2. Karl Marx adalah salah satu pemikir pada ideologi ?");

        buttonGroup2.add(A2box);
        A2box.setText("Komunisme");

        buttonGroup2.add(B2box);
        B2box.setText("Kapitalisme");

        jLabel6.setText("3. Ide pemisahan agama dari aturan publik ?");

        buttonGroup3.add(A3box);
        A3box.setText("Sekulerisme");

        buttonGroup3.add(B3box);
        B3box.setText("Materialisme");

        jLabel7.setText("4. Siapakah panglima muslim pembebas spanyol ?");

        buttonGroup4.add(A4box);
        A4box.setText("Muhammad Al Fatih");

        buttonGroup4.add(B4box);
        B4box.setText("Thariq bin Ziyad");

        jLabel8.setText("Waktu anda tersisa 2:00");

        jButton1.setText("Finish");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(A1box)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(B1box))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(A2box)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(B2box))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(A3box)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(B3box))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(A4box)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(B4box)))))))))))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1box)
                    .addComponent(B1box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A2box)
                    .addComponent(B2box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A3box)
                    .addComponent(B3box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A4box)
                    .addComponent(B4box))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_jButton1ActionPerformed
                A1box.setActionCommand("A");B1box.setActionCommand("B");
                A2box.setActionCommand("A"); B2box.setActionCommand("B");
                A3box.setActionCommand("A");B3box.setActionCommand("B");
                A4box.setActionCommand("A");B4box.setActionCommand("B");
                
        Jawaban answer=new Jawaban(buttonGroup1.getSelection().getActionCommand(),buttonGroup2.getSelection().getActionCommand(),
        buttonGroup3.getSelection().getActionCommand(),buttonGroup4.getSelection().getActionCommand());        
         try{
            FileOutputStream fos = new FileOutputStream("F:\\Serialisasi\\"+jTextField1.getText()+".obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(answer);oos.flush();oos.close();fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Formkuis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Formkuis.class.getName()).log(Level.SEVERE, null, ex);
        }
        flag=true;
        dispose();
        JOptionPane.showMessageDialog(null, "Terimakasih telah mengerjakan, jawaban anda kami kirim ke Bu Rabiatul");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void quizTimeIsUp(){
        // GEN-FIRST:event_jButton1ActionPerformed
        A1box.setActionCommand("A");
        B1box.setActionCommand("B");
        A2box.setActionCommand("A");
        B2box.setActionCommand("B");
        A3box.setActionCommand("A");
        B3box.setActionCommand("B");
        A4box.setActionCommand("A");
        B4box.setActionCommand("B");

        String[] jawaban = new String[4];
        if(buttonGroup1.getSelection().getActionCommand() == null){ jawaban[0] = ""; }
        else { jawaban[0] = buttonGroup1.getSelection().getActionCommand();}

        if(buttonGroup2.getSelection().getActionCommand() == null){ jawaban[1] = ""; }
        else { jawaban[1] = buttonGroup2.getSelection().getActionCommand(); }

        if(buttonGroup3.getSelection().getActionCommand() == null){ jawaban[2] = ""; }
        else { jawaban[2] = buttonGroup2.getSelection().getActionCommand(); }

        if(buttonGroup4.getSelection().getActionCommand() == null){ jawaban[3] = ""; }
        else { jawaban[3] = buttonGroup3.getSelection().getActionCommand(); }

        Jawaban answer = new Jawaban(jawaban[0], jawaban[1], jawaban[2], jawaban[3]);
        try {
            FileOutputStream fos = new FileOutputStream("F:\\Serialisasi\\" + jTextField1.getText() + ".obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(answer);
            oos.flush();
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Formkuis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Formkuis.class.getName()).log(Level.SEVERE, null, ex);
        }
        flag = true;
        dispose();
        JOptionPane.showMessageDialog(null, "Waktu Anda Habis, jawaban terjawab akan tetap dikumpulkan ke Bu Rabiatul");
    }

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
            java.util.logging.Logger.getLogger(Formkuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formkuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formkuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formkuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Formkuis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A1box;
    private javax.swing.JRadioButton A2box;
    private javax.swing.JRadioButton A3box;
    private javax.swing.JRadioButton A4box;
    private javax.swing.JRadioButton B1box;
    private javax.swing.JRadioButton B2box;
    private javax.swing.JRadioButton B3box;
    private javax.swing.JRadioButton B4box;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
