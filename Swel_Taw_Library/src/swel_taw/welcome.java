/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swel_taw;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Khin Thandar Kyaw
 */
public class welcome extends javax.swing.JFrame {

    /**
     * Creates new form welcome
     */
    public welcome() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
         member = new javax.swing.JToggleButton();
         info = new javax.swing.JToggleButton();
         book = new javax.swing.JToggleButton();
         borrow = new javax.swing.JToggleButton();
         ret =new javax.swing.JToggleButton();
         //blacklist = new javax.swing.JToggleButton();
         exit = new javax.swing.JToggleButton();
         pack();
    }

    welcome(String ans) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        stllabel = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        member = new javax.swing.JToggleButton();
        info = new javax.swing.JToggleButton();
        book = new javax.swing.JToggleButton();
        borrow = new javax.swing.JToggleButton();
        ret = new javax.swing.JToggleButton();
        //blacklist = new javax.swing.JToggleButton();
        exit = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setBackground(new java.awt.Color(255, 255, 0));
        p1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51))));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stllabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        stllabel.setForeground(new java.awt.Color(51, 255, 0));
        stllabel.setText("Swel Taw Library");
        stllabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p1.add(stllabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 75));

        p2.setBackground(java.awt.SystemColor.activeCaptionBorder);
        p2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 0), new java.awt.Color(0, 255, 0)));
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        member.setBackground(new java.awt.Color(255, 255, 0));
        member.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        member.setText("Member");
        member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberActionPerformed(evt);
            }
        });
        p2.add(member, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 24, 180, 26));

        info.setBackground(new java.awt.Color(255, 255, 0));
        info.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        info.setText("Info(book)");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        p2.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 56, 180, 28));

        book.setBackground(new java.awt.Color(255, 255, 0));
        book.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        book.setText("Book");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        p2.add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 90, 180, 25));

        borrow.setBackground(new java.awt.Color(255, 255, 0));
        borrow.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        borrow.setText("Borrow");
        borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowActionPerformed(evt);
            }
        });
        p2.add(borrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 121, 180, 27));

        ret.setBackground(new java.awt.Color(255, 255, 0));
        ret.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ret.setText("Return");
        ret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retActionPerformed(evt);
            }
        });
        p2.add(ret, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 154, 180, 23));

        /*blacklist.setBackground(new java.awt.Color(255, 255, 0));
        blacklist.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        blacklist.setText("BlackList");
        blacklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blacklistActionPerformed(evt);
            }
        });
        p2.add(blacklist, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 183, 180, 26));*/

        exit.setBackground(new java.awt.Color(255, 255, 0));
        exit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        //p2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 215, 180, 25));
p2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 183, 180, 26));

        /*jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swel_taw/leaf.jpeg"))); // NOI18N
        p2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 260));*/

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    /*private void blacklistActionPerformed(java.awt.event.ActionEvent evt) {                                          
      dispose();
      blacklist blacklist=new blacklist();
      blacklist.setLocationRelativeTo(null);
      blacklist.setVisible(true);
    } */                                        

    private void memberActionPerformed(java.awt.event.ActionEvent evt) {                                       
        dispose();
        member member=new member();
        member.setLocationRelativeTo(null);
        member.setVisible(true);
    }                                      

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            database db=new database();
            String binfo=db.book_info();
            dispose();
            book_info info=new book_info();
            info.booklist(binfo);
            info.setLocationRelativeTo(null);
            info.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                    

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {                                     
        
        dispose();
        Book book=new Book();
        book.setLocationRelativeTo(null);
        book.setVisible(true);
    }                                    

    private void borrowActionPerformed(java.awt.event.ActionEvent evt) {                                       
       dispose();
       borrow borrow=new borrow();
       borrow.setLocationRelativeTo(null);
       borrow.setVisible(true);
    }                                      

    private void retActionPerformed(java.awt.event.ActionEvent evt) {                                    
       dispose();
       Return ret=new Return();
       ret.setLocationRelativeTo(null);
       ret.setVisible(true);
    }                                   

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     

     System.exit(0);
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
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    //private javax.swing.JToggleButton blacklist;
    private javax.swing.JToggleButton book;
    private javax.swing.JToggleButton borrow;
    private javax.swing.JToggleButton exit;
    private javax.swing.JToggleButton info;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton member;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JToggleButton ret;
    private javax.swing.JLabel stllabel;
    // End of variables declaration                   
}
