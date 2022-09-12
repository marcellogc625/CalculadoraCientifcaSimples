package view;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import model.Calculadora;

public class FrmCalculadora extends javax.swing.JFrame {

    public FrmCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jVisor = new javax.swing.JTextArea();
        jBotao7 = new javax.swing.JButton();
        jBotao8 = new javax.swing.JButton();
        jBotao9 = new javax.swing.JButton();
        jBotao4 = new javax.swing.JButton();
        jBotao5 = new javax.swing.JButton();
        jBotao6 = new javax.swing.JButton();
        jBotao1 = new javax.swing.JButton();
        jBotao2 = new javax.swing.JButton();
        jBotao3 = new javax.swing.JButton();
        jBotao0 = new javax.swing.JButton();
        jMultiply = new javax.swing.JButton();
        jPlus = new javax.swing.JButton();
        jDivide = new javax.swing.JButton();
        jMinus = new javax.swing.JButton();
        jDot = new javax.swing.JButton();
        jEquals = new javax.swing.JButton();
        jBotaoMplus = new javax.swing.JButton();
        jBotaoMR = new javax.swing.JButton();
        jBotaoMC = new javax.swing.JButton();
        jBotaoAC = new javax.swing.JButton();
        jBotaoMminus = new javax.swing.JButton();
        jSeno = new javax.swing.JButton();
        jCosseno = new javax.swing.JButton();
        jTangente = new javax.swing.JButton();
        jLogaritimo = new javax.swing.JButton();
        jExponencial = new javax.swing.JButton();
        jPi = new javax.swing.JButton();
        jEuler = new javax.swing.JButton();
        jPlusOrMinus = new javax.swing.JButton();
        jBotaoMStorage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jVisor.setEditable(false);
        jVisor.setFont(jVisor.getFont().deriveFont(jVisor.getFont().getSize()+12f));
        jVisor.setLineWrap(true);
        jVisor.setTabSize(0);
        jVisor.setAlignmentX(35.0F);
        jVisor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jVisor);

        jBotao7.setText("7");
        jBotao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao7ActionPerformed(evt);
            }
        });

        jBotao8.setText("8");
        jBotao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao8ActionPerformed(evt);
            }
        });

        jBotao9.setText("9");
        jBotao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao9ActionPerformed(evt);
            }
        });

        jBotao4.setText("4");
        jBotao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao4ActionPerformed(evt);
            }
        });

        jBotao5.setText("5");
        jBotao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao5ActionPerformed(evt);
            }
        });

        jBotao6.setText("6");
        jBotao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao6ActionPerformed(evt);
            }
        });

        jBotao1.setText("1");
        jBotao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao1ActionPerformed(evt);
            }
        });

        jBotao2.setText("2");
        jBotao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao2ActionPerformed(evt);
            }
        });

        jBotao3.setText("3");
        jBotao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao3ActionPerformed(evt);
            }
        });

        jBotao0.setText("0");
        jBotao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotao0ActionPerformed(evt);
            }
        });

        jMultiply.setText("x");
        jMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMultiplyActionPerformed(evt);
            }
        });

        jPlus.setText("+");
        jPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlusActionPerformed(evt);
            }
        });

        jDivide.setText("÷");
        jDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDivideActionPerformed(evt);
            }
        });

        jMinus.setText("-");
        jMinus.setToolTipText("");
        jMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMinusActionPerformed(evt);
            }
        });

        jDot.setText(".");
        jDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDotActionPerformed(evt);
            }
        });

        jEquals.setText("=");
        jEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEqualsActionPerformed(evt);
            }
        });

        jBotaoMplus.setBackground(new java.awt.Color(132, 45, 45));
        jBotaoMplus.setFont(jBotaoMplus.getFont().deriveFont((float)10));
        jBotaoMplus.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoMplus.setText("M+");
        jBotaoMplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoMplusActionPerformed(evt);
            }
        });

        jBotaoMR.setBackground(new java.awt.Color(132, 45, 45));
        jBotaoMR.setFont(jBotaoMR.getFont().deriveFont((float)10));
        jBotaoMR.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoMR.setText("MR");
        jBotaoMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoMRActionPerformed(evt);
            }
        });

        jBotaoMC.setBackground(new java.awt.Color(132, 45, 45));
        jBotaoMC.setFont(jBotaoMC.getFont().deriveFont((float)10));
        jBotaoMC.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoMC.setText("MC");
        jBotaoMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoMCActionPerformed(evt);
            }
        });

        jBotaoAC.setBackground(new java.awt.Color(132, 45, 45));
        jBotaoAC.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoAC.setText("AC");
        jBotaoAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoACActionPerformed(evt);
            }
        });

        jBotaoMminus.setBackground(new java.awt.Color(132, 45, 45));
        jBotaoMminus.setFont(jBotaoMminus.getFont().deriveFont((float)10));
        jBotaoMminus.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoMminus.setText("M-");
        jBotaoMminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoMminusActionPerformed(evt);
            }
        });

        jSeno.setBackground(new java.awt.Color(31, 44, 95));
        jSeno.setFont(jSeno.getFont().deriveFont((float)10));
        jSeno.setForeground(new java.awt.Color(255, 255, 255));
        jSeno.setText("sin");
        jSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSenoActionPerformed(evt);
            }
        });

        jCosseno.setBackground(new java.awt.Color(31, 44, 95));
        jCosseno.setFont(jCosseno.getFont().deriveFont((float)10));
        jCosseno.setForeground(new java.awt.Color(255, 255, 255));
        jCosseno.setText("cos");
        jCosseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCossenoActionPerformed(evt);
            }
        });

        jTangente.setBackground(new java.awt.Color(31, 44, 95));
        jTangente.setFont(jTangente.getFont().deriveFont((float)10));
        jTangente.setForeground(new java.awt.Color(255, 255, 255));
        jTangente.setText("tan");
        jTangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTangenteActionPerformed(evt);
            }
        });

        jLogaritimo.setBackground(new java.awt.Color(31, 44, 95));
        jLogaritimo.setFont(jLogaritimo.getFont().deriveFont((float)10));
        jLogaritimo.setForeground(new java.awt.Color(255, 255, 255));
        jLogaritimo.setText("log");
        jLogaritimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogaritimoActionPerformed(evt);
            }
        });

        jExponencial.setBackground(new java.awt.Color(31, 44, 95));
        jExponencial.setFont(jExponencial.getFont().deriveFont((float)10));
        jExponencial.setForeground(new java.awt.Color(255, 255, 255));
        jExponencial.setText("exp");
        jExponencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExponencialActionPerformed(evt);
            }
        });

        jPi.setBackground(new java.awt.Color(31, 44, 95));
        jPi.setFont(jPi.getFont().deriveFont((float)10));
        jPi.setForeground(new java.awt.Color(255, 255, 255));
        jPi.setText("𝛑");
        jPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPiActionPerformed(evt);
            }
        });

        jEuler.setBackground(new java.awt.Color(31, 44, 95));
        jEuler.setFont(jEuler.getFont().deriveFont((float)10));
        jEuler.setForeground(new java.awt.Color(255, 255, 255));
        jEuler.setText("e");
        jEuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEulerActionPerformed(evt);
            }
        });

        jPlusOrMinus.setText("+/-");
        jPlusOrMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlusOrMinusActionPerformed(evt);
            }
        });

        jBotaoMStorage.setBackground(new java.awt.Color(132, 45, 45));
        jBotaoMStorage.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoMStorage.setText("MS");
        jBotaoMStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoMStorageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLogaritimo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jExponencial, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jEuler, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBotaoMC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBotaoMR, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBotaoMminus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBotao7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBotao8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBotao9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBotaoMplus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCosseno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTangente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBotaoMStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBotao1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBotao2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBotao0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBotao3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(jPlusOrMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBotao4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBotao5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBotao6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotaoAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jExponencial)
                            .addComponent(jEuler)
                            .addComponent(jPi))
                        .addComponent(jLogaritimo, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jBotaoAC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSeno)
                            .addComponent(jCosseno)
                            .addComponent(jTangente)
                            .addComponent(jBotaoMStorage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBotaoMplus)
                            .addComponent(jBotaoMR)
                            .addComponent(jBotaoMC)
                            .addComponent(jBotaoMminus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBotao7)
                            .addComponent(jBotao8)
                            .addComponent(jBotao9)
                            .addComponent(jMultiply))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBotao4)
                            .addComponent(jBotao5)
                            .addComponent(jBotao6)
                            .addComponent(jPlus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBotao1)
                            .addComponent(jBotao2)
                            .addComponent(jBotao3)
                            .addComponent(jDivide))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBotao0)
                            .addComponent(jDot)
                            .addComponent(jMinus)
                            .addComponent(jPlusOrMinus))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao7ActionPerformed
        String EntradaNumero = jVisor.getText() + jBotao7.getText();
        jVisor.setText(EntradaNumero);
    }//GEN-LAST:event_jBotao7ActionPerformed

    private void jBotao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao8ActionPerformed
        String EntradaNumero = jVisor.getText() + jBotao8.getText();
        jVisor.setText(EntradaNumero);
    }//GEN-LAST:event_jBotao8ActionPerformed

    private void jBotao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao9ActionPerformed
        String EntradaNumero = jVisor.getText() + jBotao9.getText();
        jVisor.setText(EntradaNumero);
    }//GEN-LAST:event_jBotao9ActionPerformed

    private void jBotao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao4ActionPerformed
        String EntradaNumero = jVisor.getText() + jBotao4.getText();
        jVisor.setText(EntradaNumero);
    }//GEN-LAST:event_jBotao4ActionPerformed

    private void jBotao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao5ActionPerformed
        String EntradaNumero = jVisor.getText() + jBotao5.getText();
        jVisor.setText(EntradaNumero);
    }//GEN-LAST:event_jBotao5ActionPerformed

    private void jBotao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao6ActionPerformed
        String EntradaNumero = jVisor.getText() + jBotao6.getText();
        jVisor.setText(EntradaNumero);        
    }//GEN-LAST:event_jBotao6ActionPerformed

    private void jBotao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao1ActionPerformed
        String EntradaNumero = jVisor.getText() + jBotao1.getText();
        jVisor.setText(EntradaNumero);     
    }//GEN-LAST:event_jBotao1ActionPerformed

    private void jBotao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao2ActionPerformed
        String EntradaNumero = jVisor.getText() + jBotao2.getText();
        jVisor.setText(EntradaNumero);       
    }//GEN-LAST:event_jBotao2ActionPerformed

    private void jBotao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao3ActionPerformed
        String EntradaNumero = jVisor.getText() + jBotao3.getText();
        jVisor.setText(EntradaNumero);       
    }//GEN-LAST:event_jBotao3ActionPerformed

    private void jBotao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotao0ActionPerformed
        String EntradaNumero = jVisor.getText() + jBotao0.getText();
        jVisor.setText(EntradaNumero);      
    }//GEN-LAST:event_jBotao0ActionPerformed

    private void jMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMultiplyActionPerformed
        try{
            Calculadora.setValor1(Double.parseDouble(jVisor.getText()));
            jVisor.setText("");
            Calculadora.setOperador("*");
        }
        catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_jMultiplyActionPerformed

    private void jPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlusActionPerformed
        try{
            Calculadora.setValor1(Double.parseDouble(jVisor.getText()));
            jVisor.setText("");
            Calculadora.setOperador("+");
        }
        catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_jPlusActionPerformed

    private void jDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDivideActionPerformed
        try{
            Calculadora.setValor1(Double.parseDouble(jVisor.getText()));
            jVisor.setText("");
            Calculadora.setOperador("/");
        }
        catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_jDivideActionPerformed

    private void jMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinusActionPerformed
        try{
            Calculadora.setValor1(Double.parseDouble(jVisor.getText()));
            jVisor.setText("");
            Calculadora.setOperador("-");
        }
        catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_jMinusActionPerformed

    private void jDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDotActionPerformed
        String EntradaNumero = jVisor.getText() + jDot.getText();
        jVisor.setText(EntradaNumero); 
    }//GEN-LAST:event_jDotActionPerformed

    private void jEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEqualsActionPerformed
        try{
            String resposta;
            Calculadora.setValor2(Double.parseDouble(jVisor.getText()));     
                if (Calculadora.getOperador()!= null)switch (Calculadora.getOperador()) {
                case "+":
                    Calculadora.setResultado(Calculadora.getValor1() + Calculadora.getValor2());
                    resposta = Double.toString(Calculadora.getResultado());
                    jVisor.setText(resposta);
                    break;
                case "-":
                    Calculadora.setResultado(Calculadora.getValor1() - Calculadora.getValor2());
                    resposta = Double.toString(Calculadora.getResultado());
                    jVisor.setText(resposta);
                    break;
                case "*":
                    Calculadora.setResultado(Calculadora.getValor1() * Calculadora.getValor2());
                    resposta = Double.toString(Calculadora.getResultado());
                    jVisor.setText(resposta);
                    break;
                case "/":
                    Calculadora.setResultado(Calculadora.getValor1() / Calculadora.getValor2());
                    resposta = Double.toString(Calculadora.getResultado());
                    jVisor.setText(resposta);
                    break;
                default:
                    break;
            }
        }
        catch(NumberFormatException e){
        }
    }//GEN-LAST:event_jEqualsActionPerformed

    private void jBotaoMplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoMplusActionPerformed
        try{
            Calculadora.setValorMemoria((Calculadora.getValorMemoria()) + Double.parseDouble(jVisor.getText()));
        }
        catch(NumberFormatException e){
        }
    }//GEN-LAST:event_jBotaoMplusActionPerformed

    private void jBotaoMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoMRActionPerformed
        try{
            jVisor.setText(Double.toString(Calculadora.getValorMemoria()));
        }
        catch(NumberFormatException e){
        }
    }//GEN-LAST:event_jBotaoMRActionPerformed

    private void jBotaoMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoMCActionPerformed
        Calculadora.setValorMemoria(0);
    }//GEN-LAST:event_jBotaoMCActionPerformed

    private void jBotaoACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoACActionPerformed
        Calculadora.setValor1(Double.parseDouble("0"));
        Calculadora.setValor2(Double.parseDouble("0"));
        jVisor.setText("");
    }//GEN-LAST:event_jBotaoACActionPerformed

    private void jBotaoMminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoMminusActionPerformed
        try{
            Calculadora.setValorMemoria((Calculadora.getValorMemoria()) - Double.parseDouble(jVisor.getText()));
        }
        catch(NumberFormatException e){
        }
    }//GEN-LAST:event_jBotaoMminusActionPerformed

    private void jSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSenoActionPerformed
        try{
            double ops = Double.parseDouble((jVisor.getText()));
            ops = Math.sin(ops);
            jVisor.setText(Double.toString(ops));
        }
        catch(NumberFormatException e){
            jVisor.setText("Erro");
        }
    }//GEN-LAST:event_jSenoActionPerformed

    private void jCossenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCossenoActionPerformed
        try{
            double ops = Double.parseDouble((jVisor.getText()));
            ops = Math.cos(ops);
            jVisor.setText(Double.toString(ops));    
        }
        catch(NumberFormatException e){
            jVisor.setText("Erro");
        }
        
    }//GEN-LAST:event_jCossenoActionPerformed

    private void jTangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTangenteActionPerformed
        try{
            double ops = Double.parseDouble((jVisor.getText()));
            ops = Math.tan(ops);
            jVisor.setText(Double.toString(ops));       
        }
        catch(NumberFormatException e){
            jVisor.setText("Erro");
        }
    }//GEN-LAST:event_jTangenteActionPerformed

    private void jLogaritimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogaritimoActionPerformed
        try{
            double ops = Double.parseDouble((jVisor.getText()));
            ops = Math.log(ops);
            jVisor.setText(Double.toString(ops));
        }
        catch(NumberFormatException e){
            jVisor.setText("Erro");
        }
    }//GEN-LAST:event_jLogaritimoActionPerformed

    private void jExponencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExponencialActionPerformed
        try{
            double ops = Double.parseDouble((jVisor.getText()));
            ops = Math.exp(ops);
            jVisor.setText(Double.toString(ops));
        }
        catch(NumberFormatException e){
            jVisor.setText("Erro");
        }
    }//GEN-LAST:event_jExponencialActionPerformed

    private void jPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPiActionPerformed
        jVisor.setText(Double.toString(Math.PI));        
    }//GEN-LAST:event_jPiActionPerformed

    private void jEulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEulerActionPerformed
        jVisor.setText(Double.toString(Math.E));
    }//GEN-LAST:event_jEulerActionPerformed

    private void jPlusOrMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlusOrMinusActionPerformed
        try{
            double ops = Double.parseDouble((jVisor.getText()));
            ops = ops * - 1;
            jVisor.setText(Double.toString(ops));
        }
        catch(NumberFormatException e){
        }
    }//GEN-LAST:event_jPlusOrMinusActionPerformed

    private void jBotaoMStorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoMStorageActionPerformed
        try{
            Calculadora.setValorMemoria(Double.parseDouble(jVisor.getText()));
        }
        catch(NumberFormatException e){
        }
    }//GEN-LAST:event_jBotaoMStorageActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCalculadora calculatorScreen = new FrmCalculadora();
                calculatorScreen.setVisible(true);
                calculatorScreen.setLocationRelativeTo(null);
                try{
                    UIManager.setLookAndFeel(new FlatLightLaf());
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotao0;
    private javax.swing.JButton jBotao1;
    private javax.swing.JButton jBotao2;
    private javax.swing.JButton jBotao3;
    private javax.swing.JButton jBotao4;
    private javax.swing.JButton jBotao5;
    private javax.swing.JButton jBotao6;
    private javax.swing.JButton jBotao7;
    private javax.swing.JButton jBotao8;
    private javax.swing.JButton jBotao9;
    private javax.swing.JButton jBotaoAC;
    private javax.swing.JButton jBotaoMC;
    private javax.swing.JButton jBotaoMR;
    private javax.swing.JButton jBotaoMStorage;
    private javax.swing.JButton jBotaoMminus;
    private javax.swing.JButton jBotaoMplus;
    private javax.swing.JButton jCosseno;
    private javax.swing.JButton jDivide;
    private javax.swing.JButton jDot;
    private javax.swing.JButton jEquals;
    private javax.swing.JButton jEuler;
    private javax.swing.JButton jExponencial;
    private javax.swing.JButton jLogaritimo;
    private javax.swing.JButton jMinus;
    private javax.swing.JButton jMultiply;
    private javax.swing.JButton jPi;
    private javax.swing.JButton jPlus;
    private javax.swing.JButton jPlusOrMinus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSeno;
    private javax.swing.JButton jTangente;
    private javax.swing.JTextArea jVisor;
    // End of variables declaration//GEN-END:variables
}
