
import javax.swing.JOptionPane;

public class PanelA extends javax.swing.JPanel {
    
    // Variables declaration                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    
    Frame fr;
    int jtableforpanelB = 0;
    // End of variables declaration
    
    public PanelA(Frame frIn) {
        fr = frIn;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "παράθυρο 1/2", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9), new java.awt.Color(102, 102, 102))); // NOI18N

        jButton1.setBackground(new java.awt.Color(230, 230, 230));
        jButton1.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Επόμενο");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        jButton1.setPreferredSize(new java.awt.Dimension(60, 24));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel2.setPreferredSize(new java.awt.Dimension(282, 45));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Ξεκίνημα Αρίθμησης Φύλλων:");

        jTextField2.setText("1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(230, 230, 230));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel3.setPreferredSize(new java.awt.Dimension(284, 45));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Αριθμός Πολλαπλών Σελίδων:");

        jTextField3.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(230, 230, 230));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel4.setPreferredSize(new java.awt.Dimension(393, 45));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Κωδικός Σειράς:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(75, 75, 75));
        jLabel4.setText("Image Modifier για Γενικά Αρχεία του Κράτους , Βόλος ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("Καταχώριση Δεδομένων");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel6.setText("π.χ.: για φάκελο --> GRGSA-MAG_BLA013.01_00011A");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel7.setText("Τοποθετούμε μέχρι την ονομασία του φακέλου ή του υποφακέλου");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel8.setText("   για υποφάκελο --> GRGSA-MAG_BLA013.01_00011A_0001");

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel9.setText("π.χ.: για αρχική αρίθμηση φύλλου = 4 για κάποιον υποφάκελο 0001, το πρόγραμμα θα ονομάζει τα αρχεία ως εξής:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel10.setText("GRGSA-MAG_BLA013.01_00011A_0001_000004");

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel11.setText("GRGSA-MAG_BLA013.01_00011A_0001_000005");

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel12.setText("GRGSA-MAG_BLA013.01_00011A_0001_000006  κ.τ.λ.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel13.setText("Ο Αριθμός πολλαπλών σελίδων αντιστοιχεί στο πλήθος των φύλλων, όπου έχουν παραπάνω απο μία σελίδα");

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>                        
    
    int n1,n2,temp = -1;
    String s="";
    String field1="";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        try
        {
            n1 = Integer.parseInt(this.jTextField2.getText());
            n2 = Integer.parseInt(this.jTextField3.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,
                    "Στα πεδία Αρίθμησης Φύλλων και Πολλαπλών Σελίδων, πρέπει να δωθούν ακέραιοι θετικοί αριθμοί.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if ( n1 <= 0 || n1 > 99999 )
        {
            JOptionPane.showMessageDialog(this,
                    "Στο πεδίο Αρίθμησης Φύλλων, πρέπει να δωθεί ακέραιος θετικός αριθμός (>0) με μέγιστο μήκος 5 ψηφία.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if ( n2 < 0 || n2 > 999)
        {
            JOptionPane.showMessageDialog(this,
                    "Στο πεδίο Πολλαπλών Σελίδων, πρέπει να δωθεί ακέραιος θετικός αριθμός (>=0) με μέγιστο μήκος 3 ψηφία.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        if( this.jTextField1.getText().equals("") )
        {
            JOptionPane.showMessageDialog(this,
                    "Είναι απαραίτητο να σημπληρωθεί το πεδίο Κωδικός Σειράς.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        field1 = this.jTextField1.getText();
        
        if(     field1.contains("/")  || 
                field1.contains("\\") ||
                field1.contains(":")  ||
                field1.contains("*")  ||
                field1.contains("?")  ||
                field1.contains("\"") ||
                field1.contains("<")  ||
                field1.contains(">")  ||
                field1.contains("|") 
                )
        {
            JOptionPane.showMessageDialog(this,
                    "Στο πεδίο Κωδικός Σειράς, δεν επιτρέπονται οι χαρακτήρες / \\ : * ? \" < > |", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        //Otan pliktrologoume kainourgio ari8mo sto pedio Pollaplwn Selidwn,
        //prepei na ksanadhmiourghsoume to PanelB me kainourgio pinaka JTable
        if(n2 != temp)
        {
            fr.CreatePanelB(fr,n2,n1,this.jTextField1.getText());
            fr.ChangeJPanelfromAtoB();
            fr.WindowVisibility();
            jtableforpanelB = 0;
        }
        else if(jtableforpanelB == 1)
        {
            fr.CreatePanelB(fr,n2,n1,this.jTextField1.getText());
            fr.ChangeJPanelfromAtoB();
            fr.WindowVisibility();
            jtableforpanelB = 0;
        }
        else
        {
            fr.ChangeJPanelfromAtoB();
            fr.WindowVisibility();
        }
        
        temp = n2;
    }                                        
    
    public void SetjTextField3()
    {
        jTextField3.setText("0");
    }
    
    public String getjTextField1(){ return jTextField1.getText().toString();}
    public int getjTextField2(){return Integer.parseInt(this.jTextField2.getText());}
    public int getjTextField3(){return Integer.parseInt(this.jTextField3.getText());}
}
