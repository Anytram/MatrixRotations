/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.matrixrotation.panels;

import java.awt.Font;
import pl.edu.utp.operations.Formatter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import pl.edu.utp.operations.MatrixRotation;
import pl.edu.utp.operations.Transposition;

/**
 *
 * @author tarcz
 */
public class Matrixnxn extends javax.swing.JPanel {

    private Formatter ioParser = new Formatter();
    private Transposition transposition = new Transposition();
    private MatrixRotation matrixRotation = new MatrixRotation();

    /**
     * Creates new form Matrix2x2
     */
    public Matrixnxn() {
        initComponents();
        jTextPane5.setText("Transposition");
        jTextPane5.setFont(new Font("Calibri", Font.BOLD, 22));
        jTextPane5.setEditable(false);

        jTextPane4.setText("Multiplication by the rotation matrix");
        jTextPane4.setFont(new Font("Calibri", Font.BOLD, 22));
        jTextPane4.setEditable(false);

        jTextPane1.setText("\n" + "\n" + "\n" + "Hello! Enter the matrix you want to rotate with the chosen method.");
        jTextPane1.setFont(new Font("Calibri", Font.PLAIN, 16));
        jTextPane1.setEditable(false);

        jTextPane2.setEditable(false);
        jTextPane2.setFont(new Font("Calibri", Font.PLAIN, 16));

        jTextPane3.setEditable(false);
        jTextPane3.setFont(new Font("Calibri", Font.PLAIN, 16));
        
        jTextArea1.setText("1,2,3,4,5,6,7,8,"+"\n"+"9,10,11,12,13,14,15,16");
        jTextArea2.setText("1,2,3,4,5,6,7,8,"+"\n"+"9,10,11,12,13,14,15,16");

        jTextPane6.setText("How many degrees do you want to rotate the matrix: 90");

        StyledDocument doc = jTextPane1.getStyledDocument();
        StyledDocument doc2 = jTextPane2.getStyledDocument();
        StyledDocument doc3 = jTextPane3.getStyledDocument();
        StyledDocument doc4 = jTextPane4.getStyledDocument();
        StyledDocument doc5 = jTextPane5.getStyledDocument();
        StyledDocument doc6 = jTextPane5.getStyledDocument();

        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        doc2.setParagraphAttributes(0, doc2.getLength(), center, false);
        doc3.setParagraphAttributes(0, doc3.getLength(), center, false);
        doc4.setParagraphAttributes(0, doc4.getLength(), center, false);
        doc5.setParagraphAttributes(0, doc5.getLength(), center, false);
        doc6.setParagraphAttributes(0, doc6.getLength(), center, false);

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
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();

        jButton1.setText("Rotate!");
        jButton1.setPreferredSize(new java.awt.Dimension(1000, 800));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Rotate!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(5);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(5);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jScrollPane5.setViewportView(jTextPane1);

        jScrollPane4.setViewportView(jTextPane2);

        jScrollPane6.setViewportView(jTextPane3);

        jScrollPane3.setViewportView(jTextPane4);

        jScrollPane7.setViewportView(jTextPane5);

        jScrollPane8.setViewportView(jTextPane6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane7)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane8)
                            .addComponent(jScrollPane3))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addGap(35, 35, 35)))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String text = jTextArea2.getText();

        String[] items = text.replaceAll("\\s", "").split(",");
        if (Math.sqrt(items.length) % 1 == 0) {
            if (ioParser.formatInput(items) == null) {
                jTextPane1.setText("\n" + "\n" + "\n" + "Wrong character.");
            } else {
                jTextPane3.setText("Matrix after rotation: " + "\n" + "\n" + transposition.rotate(ioParser.formatInput(items)));
                jTextPane1.setText("Input matrix: " + "\n" + "\n" + ioParser.formatOutput(ioParser.formatInput(items)));

            }
        } else {
            jTextPane3.setText("");
            jTextPane1.setText("\n" + "\n" + "\n" + "Wrong number of elements.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String text = jTextArea1.getText();
        String text2 = jTextPane6.getText();

        double degrees = 0;

        try {
            degrees = Double.parseDouble(text2.substring(51));
            System.out.println(degrees);

        } catch (NumberFormatException e) {
            jTextPane1.setText("\n" + "\n" + "\n" + "Wrong degrees number.");
        }

        if (degrees != 0) {
            String[] items = text.replaceAll("\\s", "").split(",");
            if (Math.sqrt(items.length) % 1 == 0) {
                if (ioParser.formatInput(items) == null) {
                    jTextPane2.setText("");
                    jTextPane1.setText("\n" + "\n" + "\n" + "Wrong character.");
                } else {
           
                    jTextPane2.setText("Matrix after rotation: " + "\n" + "\n" +  matrixRotation.rotate(ioParser.formatInput(items), degrees));
                    jTextPane1.setText("Input matrix: " + "\n" + "\n" + ioParser.formatOutput(ioParser.formatInput(items)));

                }
            } else {
                jTextPane2.setText("");
                jTextPane1.setText("\n" + "\n" + "\n" + "Wrong number of elements.");
            }
        } else {
            jTextPane2.setText("");

        }


    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    // End of variables declaration//GEN-END:variables
}
