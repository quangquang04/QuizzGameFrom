package Ori;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class QuizzGameClient extends javax.swing.JFrame {

    public static List<Question> listQuest = new ArrayList<>();
    Question x;
    public static int index = 0;
    public static boolean isInput = false;
    public static String typeGame = "";

    public QuizzGameClient() {
        initComponents();
        btnPlayGame.setBackground(Color.GREEN);
        setLocationRelativeTo(null);
        //set full screen
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtAnswerA = new javax.swing.JTextField();
        txtAnswerB = new javax.swing.JTextField();
        txtAnswerC = new javax.swing.JTextField();
        txtAnswerD = new javax.swing.JTextField();
        txtQuestion = new javax.swing.JTextField();
        txtTrueAnswer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuestion = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnPlayGame = new javax.swing.JButton();
        btnAddQuestion = new javax.swing.JButton();
        btnChangeTypeGameOlympia = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnRemoveData = new javax.swing.JButton();
        btnViewTable = new javax.swing.JButton();
        btnChangeTypeGameTiengAnh = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Huy Nguyễn Dev v1.0.0");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Câu hỏi");

        jLabel2.setText("Đáp án A");

        jLabel3.setText("Đáp án B");

        jLabel4.setText("Đáp án C");

        jLabel5.setText("Đáp án D");

        jLabel6.setText("Đáp án đúng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        txtAnswerA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtAnswerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerAActionPerformed(evt);
            }
        });

        txtAnswerB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txtAnswerC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txtAnswerD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txtQuestion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel7.setText("(A, B, C, D)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                    .addComponent(txtAnswerA)
                    .addComponent(txtAnswerB)
                    .addComponent(txtAnswerC)
                    .addComponent(txtAnswerD)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTrueAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(txtAnswerA, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAnswerB, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAnswerC, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAnswerD, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrueAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        tblQuestion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Câu hỏi"
            }
        ));
        tblQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuestionMouseClicked(evt);
            }
        });
        tblQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblQuestionKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuestion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        btnPlayGame.setText("Play Game");
        btnPlayGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayGameActionPerformed(evt);
            }
        });

        btnAddQuestion.setText("Thêm");
        btnAddQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddQuestionMouseEntered(evt);
            }
        });
        btnAddQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddQuestionActionPerformed(evt);
            }
        });

        btnChangeTypeGameOlympia.setText("Olympia");
        btnChangeTypeGameOlympia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTypeGameOlympiaActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setText("Làm mới");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnRemoveData.setText("Xóa dữ liệu");
        btnRemoveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDataActionPerformed(evt);
            }
        });

        btnViewTable.setText("Xem dữ liệu");
        btnViewTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTableActionPerformed(evt);
            }
        });

        btnChangeTypeGameTiengAnh.setText("Tiếng Anh");
        btnChangeTypeGameTiengAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTypeGameTiengAnhActionPerformed(evt);
            }
        });

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnChangeTypeGameOlympia, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(btnAddQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnChangeTypeGameTiengAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoveData, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnExit)
                .addGap(18, 18, 18)
                .addComponent(btnPlayGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPlayGame, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddQuestion)
                            .addComponent(btnEdit)
                            .addComponent(btnDelete)
                            .addComponent(btnRefresh))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnChangeTypeGameOlympia)
                            .addComponent(btnViewTable)
                            .addComponent(btnChangeTypeGameTiengAnh)
                            .addComponent(btnRemoveData))
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnswerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswerAActionPerformed

    private void tblQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuestionMouseClicked
        // TODO add your handling code here:
        index = getMouseClickIndex();
        view();
    }//GEN-LAST:event_tblQuestionMouseClicked

    private void tblQuestionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblQuestionKeyPressed
        // TODO add your handling code here:
        index = getMouseClickIndex();
        view();
    }//GEN-LAST:event_tblQuestionKeyPressed

    private void btnRemoveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDataActionPerformed
        // TODO add your handling code here:
        QuizzGameClient.listQuest.clear();
        viewTable();
        clearView();
    }//GEN-LAST:event_btnRemoveDataActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        clearView();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        index = getMouseClickIndex();
        listQuest.remove(index);
        viewTable();
        view();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        index = getMouseClickIndex();
        listQuest.get(index).setQuestion(txtQuestion.getText());
        listQuest.get(index).setAnswerA(txtAnswerA.getText());
        listQuest.get(index).setAnswerB(txtAnswerB.getText());
        listQuest.get(index).setAnswerC(txtAnswerC.getText());
        listQuest.get(index).setAnswerD(txtAnswerD.getText());
        setTrueAnswer(index);
        view();
        viewTable();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnChangeTypeGameOlympiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeTypeGameOlympiaActionPerformed
        // TODO add your handling code here:
        typeGame = "Olympia";
    }//GEN-LAST:event_btnChangeTypeGameOlympiaActionPerformed

    private void btnAddQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddQuestionActionPerformed
        // TODO add your handling code here:
        Question newQuestion = new Question(txtQuestion.getText(), txtAnswerA.getText(), txtAnswerB.getText(), txtAnswerC.getText(), txtAnswerD.getText(),
                txtTrueAnswer.getText());
        setTrueAnswer(newQuestion);

        listQuest.add(newQuestion);
        viewTable();
        clearView();
    }//GEN-LAST:event_btnAddQuestionActionPerformed

    private void btnAddQuestionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddQuestionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddQuestionMouseEntered

    private void btnPlayGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayGameActionPerformed
        // TODO add your handling code here:
        if (inputData()) {
            QuizzGame quizzGame = new QuizzGame();
            quizzGame.setVisible(true);
            quizzGame.displayRandomQuestion();
        }
    }//GEN-LAST:event_btnPlayGameActionPerformed

    private void btnViewTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTableActionPerformed
        // TODO add your handling code here:
        inputData();
        view();
        viewTable();
        clearView();
    }//GEN-LAST:event_btnViewTableActionPerformed

    private void btnChangeTypeGameTiengAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeTypeGameTiengAnhActionPerformed
        // TODO add your handling code here:
        typeGame = "TiengAnh";
    }//GEN-LAST:event_btnChangeTypeGameTiengAnhActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    public static int getRandomNumberZeroTo(int max) {
        int randomNumber = new Random().nextInt(max);
        QuizzGame.indexQuestion = randomNumber;
        return randomNumber;
    }

    public static boolean inputData() {
        if (isInput == true && QuizzGameClient.listQuest.size() != 0) {
            QuizzGame.displayMessage("Đã nhập dữ liệu rồi", 2);
            return false;
        }
        if (typeGame.equals("")) {
            QuizzGame.displayMessage("Chưa chọn loại game kìa cha nọi", 3);
            return false;
        }
        switch (typeGame) {
            case "Olympia":
                //listQuest.add(new Question("Loài chim nào có thể bay ngược?", "Chim én", "Chim bồ câu", "Chim ruồi", "Chim sẻ", "Chim ruồi"));
                listQuest.add(new Question("Thành phần chính của khí quyển Trái Đất là gì?", "Oxy", "Carbon Dioxide", "Nitơ", "Heli", "Nitơ"));
                listQuest.add(new Question("Sông dài nhất Việt Nam là sông nào?", "Sông Hồng", "Sông Đồng Nai", "Sông Mekong", "Sông Lam", "Sông Đồng Nai"));
                //listQuest.add(new Question("Ai là tác giả của tác phẩm \"Truyện Kiều\"?", "Nguyễn Du", "Nguyễn Trãi", "Lê Thánh Tông", "Hồ Xuân Hương", "Nguyễn Du"));
                listQuest.add(new Question("Nhà khoa học nào đã phát minh ra định luật vạn vật hấp dẫn?", "Albert Einstein", "Isaac Newton", "Galileo Galilei", "Nikola Tesla", "Isaac Newton"));
                listQuest.add(new Question("Quốc gia nào có diện tích lớn nhất thế giới?", "Canada", "Hoa Kỳ", "Nga", "Trung Quốc", "Nga"));
                listQuest.add(new Question("Bức tranh \"Mona Lisa\" được vẽ bởi ai?", "Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Michelangelo", "Leonardo da Vinci"));
                //listQuest.add(new Question("Bản giao hưởng số 9 \"Định mệnh\" là tác phẩm của nhà soạn nhạc nào?", "Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Johann Sebastian Bach", "Franz Schubert", "Ludwig van Beethoven"));
                listQuest.add(new Question("Kim tự tháp nổi tiếng Giza nằm ở quốc gia nào?", "Hy Lạp", "Mexico", "Peru", "Ai Cập", "Ai Cập"));
                listQuest.add(new Question("Sông Amazon chảy qua lục địa nào?", "Châu Á", "Châu Phi", "Châu Âu", "Châu Nam Mỹ", "Châu Nam Mỹ"));
                listQuest.add(new Question("Ai là người sáng lập ra thuyết tương đối?", "Isaac Newton", "Albert Einstein", "Galileo Galilei", "Nikola Tesla", "Albert Einstein"));
                listQuest.add(new Question("Chất nào là thành phần chính của xương và răng?", "Sắt", "Canxi", "Magiê", "Kẽm", "Canxi"));
                listQuest.add(new Question("Đại dương nào lớn nhất trên Trái Đất?", "Đại Tây Dương", "Thái Bình Dương", "Ấn Độ Dương", "Bắc Băng Dương", "Thái Bình Dương"));
                listQuest.add(new Question("Nhà thơ nào được mệnh danh là \"Bà chúa thơ Nôm\"?", "Xuân Quỳnh", "Hồ Xuân Hương", "Đoàn Thị Điểm", "Bà Huyện Thanh Quan", "Hồ Xuân Hương"));
                listQuest.add(new Question("Ngọn núi nào cao nhất thế giới?", "Núi Kilimanjaro", "Núi Everest", "Núi Fuji", "Núi Elbrus", "Núi Everest"));
                listQuest.add(new Question("Vi khuẩn nào có vai trò quan trọng trong việc lên men sữa chua?", "Lactobacillus", "Escherichia coli", "Salmonella", "Streptococcus", "Lactobacillus"));
                listQuest.add(new Question("Loại nhạc cụ nào được coi là biểu tượng của âm nhạc cổ điển?", "Guitar", "Piano", "Trống", "Violin", "Piano"));
                listQuest.add(new Question("Hành tinh nào gần Mặt Trời nhất?", "Sao Kim", "Sao Thủy", "Sao Hỏa", "Sao Mộc", "Sao Thủy"));
                listQuest.add(new Question("Kim loại nào dẫn điện tốt nhất?", "Vàng", "Đồng", "Bạc", "Nhôm", "Bạc"));
                //listQuest.add(new Question("Ai là người viết tiểu thuyết \"Những người khốn khổ\"?", "Charles Dickens", "Victor Hugo", "Lev Tolstoy", "Mark Twain", "Victor Hugo"));
                listQuest.add(new Question("Tế bào nào trong cơ thể người có khả năng vận chuyển oxy?", "Bạch cầu", "Tiểu cầu", "Hồng cầu", "Lympho", "Hồng cầu"));
                listQuest.add(new Question("Tỉnh nào có diện tích lớn nhất Việt Nam?", "Gia Lai", "Nghệ An", "Thanh Hóa", "Sơn La", "Nghệ An"));
                listQuest.add(new Question("Nhiệt độ nào được coi là nhiệt độ nóng chảy của nước đá?", "0°C", "100°C", "-1°C", "50°C", "0°C"));
                listQuest.add(new Question("Vị vua nào của nhà Nguyễn lên ngôi vào năm 1802, thống nhất đất nước Việt Nam?", "Gia Long", "Minh Mạng", "Tự Đức", "Duy Tân", "Gia Long"));
                break;
            case "TiengAnh":
                //listQuest.add(new Question("Which word is a synonym of \"big\"?", "Small", "Huge", "Tiny", "Narrow", "Huge"));
                //listQuest.add(new Question("What is the plural form of the word \"child\"?", "Childes", "Childs", "Children", "Childrens", "Children"));
                //listQuest.add(new Question("What is the past tense of the verb \"go\"?", "Gone", "Goed", "Went", "Goes", "Went"));
                listQuest.add(new Question("Which one is the correct question form?", "Where you are from?", "Where are you from?", "You are from where?", "From where are you?", " Where are you from?"));
                listQuest.add(new Question("Which word is a synonym of \"happy\"?", "Angry", "Sad", "Cheerful", "Tired", "Cheerful"));
                listQuest.add(new Question("Which word is spelled correctly?", "Recieve", "Receive", "Receve", "Receave", "Receive"));
                listQuest.add(new Question("What is the correct form of the verb in this sentence: \"She ___ to the store every Saturday.\"", "go", "going", "goes", "gone", "goes"));
                listQuest.add(new Question("Which sentence uses the correct order of adjectives?", "She has a red, big, beautiful car.", "She has a beautiful, big, red car.", "She has a big, red, beautiful car.", "She has a beautiful, red, big car.", "She has a beautiful, big, red car."));
                listQuest.add(new Question("Which of these sentences is in the past perfect tense?", "She has visited the museum.", "She had visited the museum before it closed.", "She visited the museum yesterday.", "She is visiting the museum now.", "She had visited the museum before it closed."));
                listQuest.add(new Question("What is the meaning of the word \"exhausted\"?", "Very tired", "Very happy", "Very angry", "Very excited", "Very tired"));
                listQuest.add(new Question("Which word means \"to make something smaller\"?", "Increase", "Reduce", "Enlarge", "Expand", "Reduce"));
                listQuest.add(new Question("Which word has a different vowel sound?", "Cat", "Bat", "Hat", "Late", "Late"));
                listQuest.add(new Question("Where is the stress in the word \"photography\"?", "On the first syllable", "On the second syllable", "On the third syllable", "On the fourth syllable", "On the third syllable"));
                listQuest.add(new Question("What does the idiom \"break the ice\" mean?", "To start a conversation in a social situation", "To physically break ice", "To end an argument", "To become cold", "To start a conversation in a social situation"));
                listQuest.add(new Question("What does the idiom \"a piece of cake\" mean?", "Something difficult", "Something expensive", "Something easy", "Something delicious", "Something easy"));
                listQuest.add(new Question("You are at a restaurant, and you need to get the waiter’s attention. What do you say?", "\"Hey! Come here!\"", "\"Excuse me!\"", "\"Yo!\"", "\"What's up?\"", "\"Excuse me!\""));
                listQuest.add(new Question("How would you respond to someone saying, \"Thank you for your help\"?", "\"No problem!\"", "\"See you!\"", "\"That's nice.\"", "\"You're welcome!\"", "\"You're welcome!\""));
                listQuest.add(new Question("If you don’t understand what someone said, what is the polite way to ask them to repeat?", "\"What?\"", "\"Huh?\"", "\"Could you please repeat that?\"", "\"Say it again!\"", "\"Could you please repeat that?\""));
                listQuest.add(new Question("Which sentence is correct?", "I have a few money.", "I have few friends.", "I have many milk.", "I have much friends.", "I have few friends."));
                listQuest.add(new Question("Which preposition is correct in this sentence: \"He is good ___ playing guitar.\"", "at", "on", "in", "to", "at"));
                listQuest.add(new Question("Which word fits in this sentence: \"I usually go to work ___ car.\"", "in", "on", "by", "with", "by"));
                listQuest.add(new Question("What is the main idea of this sentence: \"The dog barked loudly because it saw a stranger approaching the house.\"", "The dog was sleeping.", "The dog was hungry.", "The dog barked at a stranger.", "The dog is friendly.", "The dog barked at a stranger."));
                listQuest.add(new Question("What does the word \"approaching\" mean in this sentence: \"The car is approaching the stop sign.\"", "Moving away", "Getting closer", "Stopping", "Passing by", "Getting closer"));
                break;
            case "darkMode":
                listQuest.add(new Question("Tại sao người đi bộ lại không bao giờ thắng trong cuộc đua?", "Vì họ không có sức mạnh", "Vì họ bị chậm lại bởi những giấc mơ không thực hiện", "Vì họ đã chết từ lâu rồi", "Vì họ không đủ kiên nhẫn để chờ đợi", "Vì họ đã chết từ lâu rồi"));
                listQuest.add(new Question("Tại sao cái bàn lại không thích nói chuyện?", "Vì nó bận làm việc", "Vì nó không có miệng", "Vì nó cảm thấy không cần thiết", "Vì nó đã nghe đủ câu chuyện đau khổ", "Vì nó không có miệng"));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                listQuest.add(new Question("", "", "", "", "", ""));
                break;
            default:
                throw new AssertionError();
        }

        return true;
    }

    public void setTrueAnswer(Question newQuestion) {
        switch (txtTrueAnswer.getText()) {
            case "a":
            case "A":
                newQuestion.setTrueAnswer(listQuest.get(index).getAnswerA());
                break;
            case "b":
            case "B":
                newQuestion.setTrueAnswer(listQuest.get(index).getAnswerB());
                break;
            case "c":
            case "C":
                newQuestion.setTrueAnswer(listQuest.get(index).getAnswerC());
                break;
            case "d":
            case "D":
                newQuestion.setTrueAnswer(listQuest.get(index).getAnswerD());
                break;
            default:
                throw new AssertionError();
        }
    }

    public void setTrueAnswer(int index) {
        switch (txtTrueAnswer.getText()) {
            case "a":
            case "A":
                listQuest.get(index).setTrueAnswer(listQuest.get(index).getAnswerA());
                break;
            case "b":
            case "B":
                listQuest.get(index).setTrueAnswer(listQuest.get(index).getAnswerB());
                break;
            case "c":
            case "C":
                listQuest.get(index).setTrueAnswer(listQuest.get(index).getAnswerC());
                break;
            case "d":
            case "D":
                listQuest.get(index).setTrueAnswer(listQuest.get(index).getAnswerD());
                break;
            default:
                throw new AssertionError();
        }
    }

    public int getMouseClickIndex() {
        return this.tblQuestion.getSelectedRow();
    }

    public void clearView() {
        txtQuestion.setText("");
        txtAnswerA.setText("");
        txtAnswerB.setText("");
        txtAnswerC.setText("");
        txtAnswerD.setText("");
        txtTrueAnswer.setText("");
    }

    public void view() {
        x = listQuest.get(index);
        txtQuestion.setText(x.getQuestion());
        txtAnswerA.setText(x.getAnswerA());
        txtAnswerB.setText(x.getAnswerB());
        txtAnswerC.setText(x.getAnswerC());
        txtAnswerD.setText(x.getAnswerD());

        if (x.getTrueAnswer().equals(x.getAnswerA())) {
            txtTrueAnswer.setText("A");
        } else if (x.getTrueAnswer().equals(x.getAnswerB())) {
            txtTrueAnswer.setText("B");
        } else if (x.getTrueAnswer().equals(x.getAnswerC())) {
            txtTrueAnswer.setText("C");
        } else if (x.getTrueAnswer().equals(x.getAnswerD())) {
            txtTrueAnswer.setText("D");
        } else {
            txtTrueAnswer.setText("Error");
        }
    }

    public void viewTable() {
        DefaultTableModel model = (DefaultTableModel) this.tblQuestion.getModel();
        model.setNumRows(0);
        int n = 0;
        //Hiện câu hỏi từ listQuestion
        for (Question i : listQuest) {
            model.addRow(new Object[]{n++, i.getQuestion()});
        }
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
            java.util.logging.Logger.getLogger(QuizzGameClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizzGameClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizzGameClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizzGameClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuizzGameClient myGame = new QuizzGameClient();
                myGame.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddQuestion;
    private javax.swing.JButton btnChangeTypeGameOlympia;
    private javax.swing.JButton btnChangeTypeGameTiengAnh;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPlayGame;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemoveData;
    private javax.swing.JButton btnViewTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblQuestion;
    private javax.swing.JTextField txtAnswerA;
    private javax.swing.JTextField txtAnswerB;
    private javax.swing.JTextField txtAnswerC;
    private javax.swing.JTextField txtAnswerD;
    private javax.swing.JTextField txtQuestion;
    private javax.swing.JTextField txtTrueAnswer;
    // End of variables declaration//GEN-END:variables
}
