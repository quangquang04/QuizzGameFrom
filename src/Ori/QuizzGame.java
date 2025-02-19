/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ori;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class QuizzGame extends javax.swing.JFrame {

    public static int score = 0;
    public static boolean isCorrect = false;
    static int indexQuestion = 0;

    public QuizzGame() {
        initComponents();
        //set full screen
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtQuestion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAnswerA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAnswerB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAnswerC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAnswerD = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnReplay = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnGiveUp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtScore = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTienThuong = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Câu hỏi");

        txtQuestion.setEditable(false);
        txtQuestion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel2.setText("Đáp án A");

        txtAnswerA.setEditable(false);
        txtAnswerA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtAnswerA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAnswerAMouseClicked(evt);
            }
        });
        txtAnswerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerAActionPerformed(evt);
            }
        });

        jLabel3.setText("Đáp án B");

        txtAnswerB.setEditable(false);
        txtAnswerB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtAnswerB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAnswerBMouseClicked(evt);
            }
        });

        jLabel4.setText("Đáp án C");

        txtAnswerC.setEditable(false);
        txtAnswerC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtAnswerC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAnswerCMouseClicked(evt);
            }
        });

        jLabel5.setText("Đáp án D");

        txtAnswerD.setEditable(false);
        txtAnswerD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtAnswerD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAnswerDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtQuestion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(txtAnswerA)
                            .addComponent(txtAnswerC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtAnswerD)
                            .addComponent(txtAnswerB))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnswerA, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnswerC, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnswerB)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnswerD)))
                .addContainerGap())
        );

        btnReplay.setText("Chơi lại");
        btnReplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplayActionPerformed(evt);
            }
        });

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnGiveUp.setText("Bỏ Cuộc");
        btnGiveUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveUpActionPerformed(evt);
            }
        });

        jLabel6.setText("Điểm");

        txtScore.setEditable(false);
        txtScore.setText("0");

        jLabel7.setText("Tiền thưởng");

        txtTienThuong.setEditable(false);
        txtTienThuong.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnGiveUp, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(125, 125, 125)
                        .addComponent(btnReplay, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(103, 103, 103)
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGiveUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnswerAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnswerAMouseClicked
        // TODO add your handling code here:
        if (QuizzGameClient.listQuest.get(indexQuestion).getAnswerA().equals(QuizzGameClient.listQuest.get(indexQuestion).getTrueAnswer())) {
            displayCorrectMessage();

            QuizzGameClient.listQuest.remove(indexQuestion);
            score += 10;
            txtScore.setText("" + score);
            displayRandomQuestion();
        } else {
            displayNotCorrectMessage();
            QuizzGameClient.listQuest.remove(indexQuestion);
            score = 0;
            txtScore.setText("" + score);
            displayRandomQuestion();
        }
    }//GEN-LAST:event_txtAnswerAMouseClicked

    private void txtAnswerBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnswerBMouseClicked
        // TODO add your handling code here:
        if (QuizzGameClient.listQuest.get(indexQuestion).getAnswerB().equals(QuizzGameClient.listQuest.get(indexQuestion).getTrueAnswer())) {
            displayCorrectMessage();

            QuizzGameClient.listQuest.remove(indexQuestion);
            score += 10;
            txtScore.setText("" + score);
            displayRandomQuestion();
        } else {
            displayNotCorrectMessage();
            QuizzGameClient.listQuest.remove(indexQuestion);
            score = 0;
            txtScore.setText("" + score);
            displayRandomQuestion();
        }
    }//GEN-LAST:event_txtAnswerBMouseClicked

    private void txtAnswerCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnswerCMouseClicked
        // TODO add your handling code here:
        if (QuizzGameClient.listQuest.get(indexQuestion).getAnswerC().equals(QuizzGameClient.listQuest.get(indexQuestion).getTrueAnswer())) {
            displayCorrectMessage();

            QuizzGameClient.listQuest.remove(indexQuestion);
            score += 10;
            txtScore.setText("" + score);
            displayRandomQuestion();
        } else {
            displayNotCorrectMessage();
            QuizzGameClient.listQuest.remove(indexQuestion);
            score = 0;
            txtScore.setText("" + score);
            displayRandomQuestion();
        }
    }//GEN-LAST:event_txtAnswerCMouseClicked

    private void txtAnswerDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnswerDMouseClicked
        // TODO add your handling code here:
        if (QuizzGameClient.listQuest.get(indexQuestion).getAnswerD().equals(QuizzGameClient.listQuest.get(indexQuestion).getTrueAnswer())) {
            displayCorrectMessage();

            QuizzGameClient.listQuest.remove(indexQuestion);
            score += 10;
            txtScore.setText("" + score);
            displayRandomQuestion();
        } else {
            displayNotCorrectMessage();
            QuizzGameClient.listQuest.remove(indexQuestion);
            score = 0;
            txtScore.setText("" + score);
            displayRandomQuestion();
        }
    }//GEN-LAST:event_txtAnswerDMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplayActionPerformed
        // TODO add your handling code here:
        QuizzGameClient.listQuest.clear();
        QuizzGameClient.inputData();
        displayRandomQuestion();
        score = 0;
        txtTienThuong.setText("0 VNĐ");
        txtScore.setText("" + score);
    }//GEN-LAST:event_btnReplayActionPerformed

    private void txtAnswerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerAActionPerformed

    }//GEN-LAST:event_txtAnswerAActionPerformed

    private void btnGiveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveUpActionPerformed
        // TODO add your handling code here:
        cleanQuestion();
        displayScoreMessage();
    }//GEN-LAST:event_btnGiveUpActionPerformed

    public boolean displayRandomQuestion() {
        if (QuizzGameClient.listQuest.size() == 0) {
            cleanQuestion();
            displayScoreMessage();
            return false;
        }

        setScore();
        indexQuestion = QuizzGameClient.getRandomNumberZeroTo(QuizzGameClient.listQuest.size());
        txtQuestion.setText(QuizzGameClient.listQuest.get(indexQuestion).getQuestion());
        txtAnswerA.setText(QuizzGameClient.listQuest.get(indexQuestion).getAnswerA());
        txtAnswerB.setText(QuizzGameClient.listQuest.get(indexQuestion).getAnswerB());
        txtAnswerC.setText(QuizzGameClient.listQuest.get(indexQuestion).getAnswerC());
        txtAnswerD.setText(QuizzGameClient.listQuest.get(indexQuestion).getAnswerD());
        return true;
    }

    public void cleanQuestion() {
        txtAnswerA.setText("");
        txtAnswerB.setText("");
        txtAnswerC.setText("");
        txtAnswerD.setText("");
        txtQuestion.setText("");
    }

    public static void displayMessage(String message, int displayTimeInSeconds) {
        // Tạo JDialog từ JOptionPane với thông báo
        JOptionPane pane = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = pane.createDialog(null, "Thông báo");

        // Đảm bảo hộp thoại hiển thị được gọi trên luồng sự kiện chính
        SwingUtilities.invokeLater(() -> {
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);  // Hiển thị dialog
        });

        // Sử dụng javax.swing.Timer để tắt dialog sau một khoảng thời gian
        javax.swing.Timer timer = new javax.swing.Timer(displayTimeInSeconds * 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();  // Đóng thông báo sau thời gian đã định
            }
        });

        timer.setRepeats(false);  // Đảm bảo Timer chỉ chạy một lần
        timer.start();  // Bắt đầu Timer
    }

    public void displayCorrectMessage() {
        displayMessage("Chính xác !", 1);
    }

    public void displayNotCorrectMessage() {
        // Gọi phương thức chung để hiển thị thông báo "Sai rồi !"
        displayMessage("Sai rồi !\nĐáp án đúng: " + QuizzGameClient.listQuest.get(indexQuestion).getTrueAnswer(), 2);
    }

    public void displayScoreMessage() {
        QuizzGameClient.inputData();
        displayMessage("Tổng điểm của bạn: " + score + "/" + QuizzGameClient.listQuest.size() * 10 + "\nTiền thưởng nhận được: " + txtTienThuong.getText(), 30);
        QuizzGameClient.listQuest.clear();
    }

    public void setScore() {
        if (score < 50) {
            txtTienThuong.setText(score * 10000 + " VNĐ");
        } else if (score < 100) {
            txtTienThuong.setText(score * 100000 + " VNĐ");
        } else if (score < 150) {
            txtTienThuong.setText(score * 100000 + " VNĐ");
        } else if (score < 200) {
            txtTienThuong.setText(score * 1000000 + " VNĐ");
        } else {
            txtTienThuong.setText("50000000 VNĐ");
        }
    }

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(QuizzGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(QuizzGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(QuizzGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(QuizzGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new QuizzGame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGiveUp;
    private javax.swing.JButton btnReplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAnswerA;
    private javax.swing.JTextField txtAnswerB;
    private javax.swing.JTextField txtAnswerC;
    private javax.swing.JTextField txtAnswerD;
    private javax.swing.JTextField txtQuestion;
    private javax.swing.JTextField txtScore;
    private javax.swing.JTextField txtTienThuong;
    // End of variables declaration//GEN-END:variables
}
