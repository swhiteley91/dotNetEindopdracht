/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import client.Client;
import java.util.List;

/**
 *
 * @author Nawid N
 */
public class PracticumClientUI extends javax.swing.JFrame {
    Client client = new Client();
    final String[] stringetjes = new String[80];

    /**
     * Creates new form PracticumClientUI
     */
    public PracticumClientUI() {
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

        RegisterView = new javax.swing.JFrame();
        registerLabel = new javax.swing.JLabel();
        usernameLabel1 = new javax.swing.JLabel();
        usernameField1 = new javax.swing.JTextField();
        registerButton1 = new javax.swing.JButton();
        responseLabel = new javax.swing.JLabel();
        ProductView = new javax.swing.JFrame();
        productScrollPane = new javax.swing.JScrollPane();
        productTextPane = new javax.swing.JTextPane();
        productButton = new javax.swing.JButton();
        purchaseButton1 = new javax.swing.JButton();
        saldoLabel = new javax.swing.JLabel();
        productScrollPane1 = new javax.swing.JScrollPane();
        productList = new javax.swing.JList();
        purchaseButton = new javax.swing.JButton();
        purchaseTextField = new javax.swing.JFormattedTextField();
        purchaseLabel = new javax.swing.JLabel();
        PurchasesView = new javax.swing.JFrame();
        purchaseScrollPane = new javax.swing.JScrollPane();
        purchaseTextPane = new javax.swing.JTextPane();
        headLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        loginValidLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();

        RegisterView.setMinimumSize(new java.awt.Dimension(284, 170));
        RegisterView.setResizable(false);

        registerLabel.setText("Register a new account.");

        usernameLabel1.setText("Username:");

        usernameField1.setText("Peter");
        usernameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameField1ActionPerformed(evt);
            }
        });

        registerButton1.setText("Register");
        registerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButton1ActionPerformed(evt);
            }
        });

        responseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        responseLabel.setText("...");

        javax.swing.GroupLayout RegisterViewLayout = new javax.swing.GroupLayout(RegisterView.getContentPane());
        RegisterView.getContentPane().setLayout(RegisterViewLayout);
        RegisterViewLayout.setHorizontalGroup(
            RegisterViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterViewLayout.createSequentialGroup()
                .addGroup(RegisterViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegisterViewLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(registerLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegisterViewLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(RegisterViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(responseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(RegisterViewLayout.createSequentialGroup()
                                .addComponent(usernameLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegisterViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameField1)
                                    .addGroup(RegisterViewLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(registerButton1)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(20, 20, 20))
        );
        RegisterViewLayout.setVerticalGroup(
            RegisterViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegisterViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(responseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerButton1)
                .addContainerGap())
        );

        ProductView.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ProductView.setMinimumSize(new java.awt.Dimension(304, 270));
        ProductView.setResizable(false);

        productScrollPane.setViewportView(productTextPane);

        productButton.setText("Refresh");
        productButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productButtonActionPerformed(evt);
            }
        });

        purchaseButton1.setText("My Purchases");
        purchaseButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButton1ActionPerformed(evt);
            }
        });

        saldoLabel.setText("Uw Saldo: ?");

        productList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = stringetjes;
            //String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        productScrollPane1.setViewportView(productList);

        purchaseButton.setText("Purchase");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        purchaseTextField.setText("0");
        purchaseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseTextFieldActionPerformed(evt);
            }
        });

        purchaseLabel.setText("...");

        javax.swing.GroupLayout ProductViewLayout = new javax.swing.GroupLayout(ProductView.getContentPane());
        ProductView.getContentPane().setLayout(ProductViewLayout);
        ProductViewLayout.setHorizontalGroup(
            ProductViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(purchaseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productScrollPane)
                    .addComponent(productScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductViewLayout.createSequentialGroup()
                        .addComponent(purchaseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(purchaseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(purchaseButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProductViewLayout.createSequentialGroup()
                        .addComponent(productButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saldoLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ProductViewLayout.setVerticalGroup(
            ProductViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productButton)
                    .addComponent(saldoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(ProductViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseButton1)
                    .addComponent(purchaseButton)
                    .addComponent(purchaseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(purchaseLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PurchasesView.setMinimumSize(new java.awt.Dimension(284, 240));

        purchaseTextPane.setEditable(false);
        purchaseScrollPane.setViewportView(purchaseTextPane);

        javax.swing.GroupLayout PurchasesViewLayout = new javax.swing.GroupLayout(PurchasesView.getContentPane());
        PurchasesView.getContentPane().setLayout(PurchasesViewLayout);
        PurchasesViewLayout.setHorizontalGroup(
            PurchasesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PurchasesViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );
        PurchasesViewLayout.setVerticalGroup(
            PurchasesViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PurchasesViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(243, 132));
        setResizable(false);

        headLabel.setText("Log hier in met uw persoonlijke gegevens.");

        passwordField.setText("reteP");

        usernameField.setText("Peter");
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        usernameLabel.setText("Username:");

        passwordLabel.setText("Password:");

        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        loginValidLabel.setText("...");

        registerButton.setText("No account?");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginValidLabel))
                    .addComponent(headLabel))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(loginValidLabel)
                    .addComponent(registerButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        boolean logInValid = client.logIn("" + usernameField.getText(), passwordField.getPassword());
        
        if (logInValid) {
            setProductView();
            productTextPane.setEditable(false);
            ProductView.setLocationRelativeTo(null);
            ProductView.setVisible(true);
            //loginValidLabel.setText("Success!");
            this.setVisible(false);
        }
        else {
            loginValidLabel.setText("Failure!");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void setProductView() {
        int i = 0;
        for (String[] sArray : client.getProducts()) {
            String s2 = "";
            for (String s : sArray) {
                s2 += " | " + s;
            }
            stringetjes[i] = s2;
            i++;
        }
        productList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = stringetjes;
            //String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        productScrollPane1.setViewportView(productList);
        
        /*
        List<String[]> productListList = client.getProducts();
        String viewString = "ID | Naam | Prijs | Aantal";
        for (String[] sArray : productListList) {
            viewString += "\n" + sArray[0] + " | " + sArray[1] + " | " + sArray[2] + " | " + sArray[3];
        }
        productTextPane.setText(viewString);
        */
        
        Double saldo = client.getSaldo();
        String formatSaldo = "" + String.format("%1$,.2f", saldo);
        if (!formatSaldo.equals("")) {
            saldoLabel.setText("Uw Saldo: " + formatSaldo);
        }
        else {
            saldoLabel.setText("Uw Saldo: " + saldo);
        }
    }
    
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        RegisterView.setLocationRelativeTo(null);
        RegisterView.setVisible(true);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void usernameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameField1ActionPerformed

    private void registerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButton1ActionPerformed
        String response = client.register("" + usernameField1.getText());
        responseLabel.setText("<html>"+ response +"</html>");
    }//GEN-LAST:event_registerButton1ActionPerformed

    private void productButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productButtonActionPerformed
        setProductView();
    }//GEN-LAST:event_productButtonActionPerformed

    private void purchaseButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButton1ActionPerformed
        List<String[]> purchaseList = client.getPurchases();
        String viewString = "ID | ProductID | UserID | Aantal";

        for (String[] sArray : purchaseList) {
            viewString += "\n" + sArray[0] + " | " + sArray[1] + " | " + sArray[2] + " | " + sArray[3];
        }
        purchaseTextPane.setText(viewString);
        productTextPane.setEditable(false);
        PurchasesView.setLocationRelativeTo(null);
        PurchasesView.setVisible(true);
    }//GEN-LAST:event_purchaseButton1ActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        String purchaseAmount = "" + purchaseTextField.getText();
        String purchaseSelected = "" + productList.getSelectedValue();
        int purchaseAmountInt = -1;
        int purchaseSelectedInt = -1;
        
        if (!purchaseAmount.equals("") && !purchaseSelected.equals("")) {
            
            purchaseSelected = purchaseSelected.split("\\s+")[2];
            
            try{
                purchaseAmountInt = Integer.parseInt(purchaseAmount);
                purchaseSelectedInt = Integer.parseInt(purchaseSelected);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        if (purchaseSelectedInt != -1 && purchaseAmountInt != -1) {
            String response = client.buyProduct(purchaseSelectedInt, purchaseAmountInt);
            purchaseLabel.setText("<html>"+ response +"</html>");
        }
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void purchaseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(PracticumClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PracticumClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PracticumClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PracticumClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PracticumClientUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ProductView;
    private javax.swing.JFrame PurchasesView;
    private javax.swing.JFrame RegisterView;
    private javax.swing.JLabel headLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginValidLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton productButton;
    private javax.swing.JList productList;
    private javax.swing.JScrollPane productScrollPane;
    private javax.swing.JScrollPane productScrollPane1;
    private javax.swing.JTextPane productTextPane;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JButton purchaseButton1;
    private javax.swing.JLabel purchaseLabel;
    private javax.swing.JScrollPane purchaseScrollPane;
    private javax.swing.JFormattedTextField purchaseTextField;
    private javax.swing.JTextPane purchaseTextPane;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton registerButton1;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel responseLabel;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField usernameField1;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    // End of variables declaration//GEN-END:variables
}