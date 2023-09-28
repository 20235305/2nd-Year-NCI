package vaccinationprogramme;

/**
 *
 * @author Paolo Junior Costarelli - 20235305 - HCCOMP2
 */
public class VaccinationProgrammeGUI extends javax.swing.JFrame {

    /**
     * Creates new form VaccinationProgrammeGUI
     */
    
    private PriorityQueueInterface myPQueue;
    
    public VaccinationProgrammeGUI() {
        myPQueue = new MyPriorityQueue();
        initComponents();
        noMedicalConditionRbtn.setSelected(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        fullNameLbl = new javax.swing.JLabel();
        dobLbl = new javax.swing.JLabel();
        medicalConditionLbl = new javax.swing.JLabel();
        fullNameTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        yesMedicalConditionRBtn = new javax.swing.JRadioButton();
        noMedicalConditionRbtn = new javax.swing.JRadioButton();
        addPatienceBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        listOfPatientsBtn = new javax.swing.JButton();
        nextPatientBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fullNameLbl.setText("Full name:");

        dobLbl.setText("Age:");

        medicalConditionLbl.setText("Medical conditions:");

        fullNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTxtActionPerformed(evt);
            }
        });

        ageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtActionPerformed(evt);
            }
        });

        buttonGroup1.add(yesMedicalConditionRBtn);
        yesMedicalConditionRBtn.setText("Yes");
        yesMedicalConditionRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesMedicalConditionRBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(noMedicalConditionRbtn);
        noMedicalConditionRbtn.setText("No");
        noMedicalConditionRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noMedicalConditionRbtnActionPerformed(evt);
            }
        });

        addPatienceBtn.setText("Add patients");
        addPatienceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatienceBtnActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        listOfPatientsBtn.setText("List of patients");
        listOfPatientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfPatientsBtnActionPerformed(evt);
            }
        });

        nextPatientBtn.setText("Next patient");
        nextPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPatientBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Vaccination Programme App");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addPatienceBtn)
                                .addGap(45, 45, 45)
                                .addComponent(listOfPatientsBtn)
                                .addGap(41, 41, 41)
                                .addComponent(nextPatientBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(medicalConditionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dobLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yesMedicalConditionRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(noMedicalConditionRbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicalConditionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yesMedicalConditionRBtn)
                    .addComponent(noMedicalConditionRbtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPatienceBtn)
                    .addComponent(listOfPatientsBtn)
                    .addComponent(nextPatientBtn))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameTxtActionPerformed

    private void ageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtActionPerformed

    private void yesMedicalConditionRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesMedicalConditionRBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_yesMedicalConditionRBtnActionPerformed

    private void noMedicalConditionRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noMedicalConditionRbtnActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_noMedicalConditionRbtnActionPerformed

    private void addPatienceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatienceBtnActionPerformed
        // TODO add your handling code here:
        if(fullNameTxt.getText().matches("") || ageTxt.getText().matches("")){
            textArea.setText("Insert the full name and age.");
            return;
        }
        String fullName;
        int age;
        int Priority;
        boolean mediacalCondition;
        
        PatientCA newPatient = new PatientCA();
        fullName = fullNameTxt.getText();
        age = Integer.parseInt(ageTxt.getText());
        newPatient.setFullName(fullName);
        newPatient.setAge(age);
        
        if(yesMedicalConditionRBtn.isSelected()){
            newPatient.setSymptoms(true);
        }
        else{
            textArea.setText(myPQueue.enqueue(newPatient));
        }
        fullNameTxt.setText("");
        ageTxt.setText("");
        
        
    }//GEN-LAST:event_addPatienceBtnActionPerformed

    private void listOfPatientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfPatientsBtnActionPerformed
        // TODO add your handling code here:
        if(myPQueue.isEmpty()){
            textArea.append("The list of patients is empty. \n");
        }else{
        textArea.append("The patients on the waiting list are:\n");
        textArea.append(myPQueue.printPriorityQueue());
        }
    }//GEN-LAST:event_listOfPatientsBtnActionPerformed

    private void nextPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPatientBtnActionPerformed
        // TODO add your handling code here:
        if(!myPQueue.isEmpty()){
            textArea.append(myPQueue.next());
        }
        else
            textArea.append("There are no patients waiting!\n");
    }//GEN-LAST:event_nextPatientBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VaccinationProgrammeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VaccinationProgrammeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VaccinationProgrammeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaccinationProgrammeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VaccinationProgrammeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatienceBtn;
    private javax.swing.JTextField ageTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JLabel fullNameLbl;
    private javax.swing.JTextField fullNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listOfPatientsBtn;
    private javax.swing.JLabel medicalConditionLbl;
    private javax.swing.JButton nextPatientBtn;
    private javax.swing.JRadioButton noMedicalConditionRbtn;
    private javax.swing.JTextArea textArea;
    private javax.swing.JRadioButton yesMedicalConditionRBtn;
    // End of variables declaration//GEN-END:variables
}
