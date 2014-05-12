/*
 * AddClosure.java
 *
 * Copyright: 2013-2014 Karell Bertet, France
 *
 * License: http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html CeCILL-B license
 *
 * This file is part of java-lattices-view, free package. You can redistribute it and/or modify
 * it under the terms of CeCILL-B license.
 */

package View;

import java.util.Arrays;
import java.util.TreeSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import lattice.Context;
import lattice.ImplicationalSystem;
import lattice.Rule;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.combobox.ListComboBoxModel;
/**
 *
 * @author Sylvain MORIN
 */
public class AddClosure extends javax.swing.JFrame {

    private hmi window;
    private Context context;
    private ImplicationalSystem is;
    private SComboBox comboConclusionIS;
    private SComboBox combopremiseIS;
    public static String NONE = "<< none >>";
    
    
    public AddClosure(hmi window) {
        this.window = window;
        
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

        jPanel6 = new javax.swing.JPanel();
        onglet = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btAddObservationC = new javax.swing.JButton();
        txtObservationC = new javax.swing.JTextField();
        lblObservation = new javax.swing.JLabel();
        lblAttribute = new javax.swing.JLabel();
        txtAttributeC = new javax.swing.JTextField();
        btAddAtttibuteC = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblIntent = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboObservation = new javax.swing.JComboBox();
        comboAttribut = new javax.swing.JComboBox();
        lblErrorObservation = new javax.swing.JLabel();
        btAddIntentC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtAttibuteIS = new javax.swing.JTextField();
        btAddAttributeIS = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePremiseIS = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableConclusionIS = new javax.swing.JTable();
        lblErrorIS = new javax.swing.JLabel();
        btAddRuleIS = new javax.swing.JButton();
        btValidate = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("Addition guided");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(100, 100));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        btAddObservationC.setText("Add");
        btAddObservationC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddObservationCActionPerformed(evt);
            }
        });

        txtObservationC.setNextFocusableComponent(btAddObservationC);
        txtObservationC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservationCActionPerformed(evt);
            }
        });

        lblObservation.setLabelFor(txtObservationC);
        lblObservation.setText("Observation :");

        lblAttribute.setLabelFor(txtAttributeC);
        lblAttribute.setText("Atttribut : ");
        lblAttribute.setFocusable(false);

        txtAttributeC.setNextFocusableComponent(btAddAtttibuteC);
        txtAttributeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttributeCActionPerformed(evt);
            }
        });

        btAddAtttibuteC.setText("Add");
        btAddAtttibuteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddAtttibuteCActionPerformed(evt);
            }
        });

        lblIntent.setLabelFor(comboObservation);
        lblIntent.setText("Intent :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setLabelFor(comboAttribut);
        jLabel1.setText(":");
        jLabel1.setFocusable(false);

        comboObservation.setNextFocusableComponent(comboAttribut);

        comboAttribut.setNextFocusableComponent(btValidate);

        lblErrorObservation.setForeground(new java.awt.Color(255, 0, 51));
        lblErrorObservation.setText("   ");
        lblErrorObservation.setFocusable(false);

        btAddIntentC.setText("Add new intent");
        btAddIntentC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddIntentCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblIntent)
                                .addGap(18, 18, 18)
                                .addComponent(comboObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblObservation)
                                    .addComponent(lblAttribute))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblErrorObservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAttributeC, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(txtObservationC))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btAddObservationC, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btAddAtttibuteC, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(btAddIntentC)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblObservation)
                    .addComponent(txtObservationC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddObservationC))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAttribute)
                    .addComponent(txtAttributeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddAtttibuteC))
                .addGap(18, 18, 18)
                .addComponent(lblErrorObservation)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIntent)
                    .addComponent(comboObservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(comboAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btAddIntentC)
                .addGap(34, 34, 34))
        );

        btAddAtttibuteC.getAccessibleContext().setAccessibleName("btAddAttribut");

        onglet.addTab("Context", jPanel4);

        jLabel3.setLabelFor(txtAttibuteIS);
        jLabel3.setText("Attribute :");

        txtAttibuteIS.setNextFocusableComponent(btAddAttributeIS);
        txtAttibuteIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttibuteISActionPerformed(evt);
            }
        });

        btAddAttributeIS.setText("Add");
        btAddAttributeIS.setNextFocusableComponent(tablePremiseIS);
        btAddAttributeIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddAttributeISActionPerformed(evt);
            }
        });

        jLabel2.setLabelFor(tablePremiseIS);
        jLabel2.setText("Rule :");

        tablePremiseIS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Premise"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePremiseIS.setNextFocusableComponent(tableConclusionIS);
        jScrollPane2.setViewportView(tablePremiseIS);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setLabelFor(tableConclusionIS);
        jLabel4.setText("->");

        tableConclusionIS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Conclusion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableConclusionIS.setNextFocusableComponent(btValidate);
        jScrollPane3.setViewportView(tableConclusionIS);

        lblErrorIS.setForeground(new java.awt.Color(255, 0, 51));
        lblErrorIS.setText("   ");

        btAddRuleIS.setText("Add new rule");
        btAddRuleIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddRuleISActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblErrorIS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAttibuteIS, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btAddAttributeIS, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAddRuleIS)
                .addGap(210, 210, 210))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAttibuteIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddAttributeIS))
                .addGap(27, 27, 27)
                .addComponent(lblErrorIS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(btAddRuleIS)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        onglet.addTab("      IS      ", jPanel1);

        btValidate.setText("Validate");
        btValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btValidateActionPerformed(evt);
            }
        });

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(onglet, javax.swing.GroupLayout.PREFERRED_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(btValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(onglet)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btValidate)
                    .addComponent(btCancel))
                .addContainerGap())
        );

        onglet.getAccessibleContext().setAccessibleName("Context");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAddRuleISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddRuleISActionPerformed
        TreeSet<Comparable> listPremise    = new TreeSet<Comparable>();
        TreeSet<Comparable> listConclusion = new TreeSet<Comparable>();

        for(int i = 0; i < tablePremiseIS.getRowCount(); i++)
            if(tablePremiseIS.getValueAt(i, 0) != NONE)
                listPremise.add((Comparable)tablePremiseIS.getValueAt(i, 0));
              
        for(int i = 0; i < tableConclusionIS.getRowCount(); i++)
            if(tableConclusionIS.getValueAt(i, 0) != NONE)
                listConclusion.add((Comparable)tableConclusionIS.getValueAt(i, 0));

        if(listPremise.size() > 0)
            if(listConclusion.size() > 0)
                if(is.addRule(new Rule(listPremise, listConclusion)))
                {
                    resetTable(tableConclusionIS);
                    resetTable(tablePremiseIS   );                    
                    lblErrorIS.setText("");
                }
                else
                    lblErrorIS.setText("This rule already exists");
            else
                lblErrorIS.setText("One conclusion is demand");
        else
            lblErrorIS.setText("One premise is demand");
                
    }//GEN-LAST:event_btAddRuleISActionPerformed

    private void btAddObservationCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddObservationCActionPerformed
         String observation = txtObservationC.getText();
        
        if(!observation.equals(""))
            if(context.addToObservations(observation))
            { 
                comboObservation.setModel(new ListComboBoxModel<Object>(Arrays.asList(context.getObservations().toArray())));
                comboObservation.setSelectedItem(observation);
                txtObservationC.requestFocus();
                txtObservationC.setText("");
                lblErrorObservation.setText("");
            }
            else
                lblErrorObservation.setText("This observation already exists");
    }//GEN-LAST:event_btAddObservationCActionPerformed

    private void btAddAtttibuteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddAtttibuteCActionPerformed
        String attribute = txtAttributeC.getText();
        
        if(!attribute.equals(""))
            if(context.addToAttributes(attribute))
            { 
                comboAttribut.setModel(new ListComboBoxModel<Object>(Arrays.asList(context.getAttributes().toArray())));
                comboAttribut.setSelectedItem(attribute);
                txtAttributeC.requestFocus();
                txtAttributeC.setText("");
                lblErrorObservation.setText("");
            }
            else
                lblErrorObservation.setText("This attribute already exists");
    }//GEN-LAST:event_btAddAtttibuteCActionPerformed

    private void btAddIntentCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddIntentCActionPerformed
        if(comboObservation.getSelectedIndex() != -1)
            if(comboAttribut.getSelectedIndex() != -1)
                if(context.addExtentIntent(comboObservation.getSelectedItem().toString(), comboAttribut.getSelectedItem().toString()))
                {
                    comboAttribut.setSelectedIndex(-1);
                    lblErrorObservation.setText("");
                }
                else
                    lblErrorObservation.setText("This intent already exists");
            else
                lblErrorObservation.setText("The attribute is not selected");
        else
            lblErrorObservation.setText("The observation is not selected");
    }//GEN-LAST:event_btAddIntentCActionPerformed

    private void btValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValidateActionPerformed
        if(onglet.getSelectedIndex() == 0)
        {
            this.btAddIntentCActionPerformed(evt);
            window.getContextInterface().setContext(context);
        }
        else
        {
            this.btAddRuleISActionPerformed(evt);
            window.getISInterface().setIS(is, true);
        }
         
        this.setVisible(false);
    }//GEN-LAST:event_btValidateActionPerformed

    private void btAddAttributeISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddAttributeISActionPerformed
        String attribute = txtAttibuteIS.getText();

        if(!attribute.equals(""))
            if(!attribute.equals(NONE))
                if(is.addElement(attribute))
                { 
                    comboConclusionIS.addItem(attribute);
                    combopremiseIS.addItem(attribute);
                    txtAttibuteIS.requestFocus();
                    txtAttibuteIS.setText("");
                    lblErrorIS.setText("");
                }
                else
                    lblErrorIS.setText("This attribute already exists");
            else
                lblErrorIS.setText("This attribute is not available");

    }//GEN-LAST:event_btAddAttributeISActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        lblErrorIS.setText("");
        txtAttibuteIS.setText("");
        txtAttributeC.setText("");
        resetTable(tablePremiseIS);  
        txtObservationC.setText("");
        resetTable(tableConclusionIS);
        lblErrorObservation.setText("");
        comboAttribut.setSelectedIndex(-1);
        comboObservation.setSelectedIndex(-1);
    }//GEN-LAST:event_formComponentHidden

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        initialise();
    }//GEN-LAST:event_formComponentShown

    private void txtObservationCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservationCActionPerformed
        btAddObservationCActionPerformed(evt);
    }//GEN-LAST:event_txtObservationCActionPerformed

    private void txtAttributeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttributeCActionPerformed
        btAddAtttibuteCActionPerformed(evt);
    }//GEN-LAST:event_txtAttributeCActionPerformed

    private void txtAttibuteISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttibuteISActionPerformed
        btAddAttributeISActionPerformed(evt);
    }//GEN-LAST:event_txtAttibuteISActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed
    
    private void resetTable(JTable table)
    {
        DefaultTableModel def = (DefaultTableModel) table.getModel();
        if(table.getRowCount() == 0)
             def.addRow(new Object[]{NONE});
        else
            while(table.getRowCount() > 1)
                def.removeRow(0);
    }
 
    private void initialise()
    {
        is      = window.getISInterface().getIS();
        context = window.getContextInterface().getContext();
         
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // initialisation des comboBox de l'onglet Context
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        comboObservation.setModel(new ListComboBoxModel<Object>(Arrays.asList(context.getObservations().toArray())));
        comboAttribut.setModel(new ListComboBoxModel<Object>(Arrays.asList(context.getAttributes().toArray())));
       
        AutoCompleteDecorator.decorate(comboObservation);
        AutoCompleteDecorator.decorate(comboAttribut);
        
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // initialisation des tableaux de l'onglet IS avec des comboBox
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        comboConclusionIS = new SComboBox(tableConclusionIS, is.getSet(), false);
        combopremiseIS = new SComboBox(tablePremiseIS, is.getSet(), false);   
        resetTable(tableConclusionIS);
        resetTable(tablePremiseIS);  
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddAttributeIS;
    private javax.swing.JButton btAddAtttibuteC;
    private javax.swing.JButton btAddIntentC;
    private javax.swing.JButton btAddObservationC;
    private javax.swing.JButton btAddRuleIS;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btValidate;
    private javax.swing.JComboBox comboAttribut;
    private javax.swing.JComboBox comboObservation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAttribute;
    private javax.swing.JLabel lblErrorIS;
    private javax.swing.JLabel lblErrorObservation;
    private javax.swing.JLabel lblIntent;
    private javax.swing.JLabel lblObservation;
    private javax.swing.JTabbedPane onglet;
    private javax.swing.JTable tableConclusionIS;
    private javax.swing.JTable tablePremiseIS;
    private javax.swing.JTextField txtAttibuteIS;
    private javax.swing.JTextField txtAttributeC;
    private javax.swing.JTextField txtObservationC;
    // End of variables declaration//GEN-END:variables
}
