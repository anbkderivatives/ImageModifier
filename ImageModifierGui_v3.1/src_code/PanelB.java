
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelB extends javax.swing.JPanel{
    
    // Variables declaration                      
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    
    
    String Code = "";
    int ArF = 1;
    int Ps;
    
    JTable table;
    Frame fr;
    
    // End of variables declaration
    
    //Creates new form PanelB
    public PanelB() {}
    
    public PanelB(Frame frIn, int ps, int arf, String code)
    {
        Code = code;
        ArF = arf;
        Ps=ps;
        
        fr = frIn;
        
        table = new JTable(); //pgrammes = ps, sthles = 3
        
        Object[][] Data = new Object[ps][3];
        for(int i=0; i < ps; i++)
        {
            for(int j=0; j < 3; j++ )
            {
                if( j==0 ) Data[i][j] = i+1;
                else Data[i][j] = null;
            }
            
        }
        
        //table.getModel().setValueAt(i, i, 0);
        
        table.setModel(new DefaultTableModel(
        Data,    
        new String [] 
            {
                "", "Από", "Έως"
            }
        )
        {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        }
        );
        
        jScrollPane1 = new javax.swing.JScrollPane(table);
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "παράθυρο 2/2", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9), new java.awt.Color(102, 102, 102))); // NOI18N

        jButton1.setBackground(new java.awt.Color(230, 230, 230));
        jButton1.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Εκκίνηση");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        jButton1.setPreferredSize(new java.awt.Dimension(60, 24));
        jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                jButton1ActionPerformed(evt);
            } catch (IOException ex) {
                Logger.getLogger(PanelB.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        jButton2.setBackground(new java.awt.Color(230, 230, 230));
        jButton2.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("Πίσω");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        jButton2.setPreferredSize(new java.awt.Dimension(60, 24));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 320));

        jScrollPane1.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel1.setText("Πίνακας, όπου η κάθε γραμμή αντιστοιχεί σε φύλλο με πολλές σελίδες");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel9.setText("π.χ.: για την 1η γραμμή εάν έχουμε από σελ. 1 έως 3, τα αρχεία μεταονομάζονται ως εξής:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel10.setText("GRGSA-MAG_BLA013.01_00011A_0001_000001_000001");

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel11.setText("GRGSA-MAG_BLA013.01_00011A_0001_000001_000002");

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel12.setText("GRGSA-MAG_BLA013.01_00011A_0001_000001_000003");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)), "Αρχικός Φάκελος Εικόνων προ Επεξεργασίας", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 0, 102))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(230, 230, 230));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jTextField1.setEditable(false);

        jButton3.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("επιλογή:");
        jButton3.setPreferredSize(new java.awt.Dimension(70, 20));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Προορισμός Φακέλου Διαμορφωμένων Εικόνων:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 0, 102))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(0, 81));

        jPanel6.setBackground(new java.awt.Color(230, 230, 230));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jButton4.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 102));
        jButton4.setText("επιλογή:");
        jButton4.setPreferredSize(new java.awt.Dimension(70, 20));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Προσοχή: Στον αρχικό φάκελο επιλογής, πρέπει να περιέχονται μόνο εικόνες .jpg");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 25, Short.MAX_VALUE))))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }//end constructor                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
////////////////////////////////////////////////////////////////////////////////        
//---------------------       Eisagwgh Steixeiwn     -------------------------//
////////////////////////////////////////////////////////////////////////////////
        //Kwdikos Seiras Ari8mhshs
        //Code 
        //Seiras Ari8mhshs Fullou
        //int ArF;
        //Fulla me parapanw apo mia selida (fulla me polles selides)
        // p.x listFSel = [ 12 15, 23 24, 32 54 ]; Dhl 12 ews 15, 32 ews 54
        ArrayList<Integer> listFSel = new ArrayList<Integer>();  
////////////////////////////////////////////////////////////////////////////////
        try
        {
        for(int i = 0; i < Ps; i++)
            for(int j = 1; j < 3; j++)
            {
                listFSel.add( Integer.parseInt( table.getModel().getValueAt(i, j).toString() ) );
                if( Integer.parseInt( table.getModel().getValueAt(i, j).toString() ) <= 0 )
                {
                    JOptionPane.showMessageDialog(this,
                    "Στον πίνακα, πρέπει να δωθούν ακέραιοι θετικοί αριθμοί (>0).", 
                    "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,
                    "Ο πίνακας πρέπει να συμπληρωθεί και να δωθούν ακέραιοι θετικοί αριθμοί. Δεν επιτρέπονται αλφαριθμητικά.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (jTextField1.getText().toString().equals(""))
        {
            JOptionPane.showMessageDialog(this,
                    "Δώστε τον αρχικό φάκελο, ο οποίος περιέχει τις αρχικές εικόνες για επεξεργασία.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (jTextField2.getText().toString().equals(""))
        {
            JOptionPane.showMessageDialog(this,
                    "Δώστε τον φάκελο προορισμού, στον οποίο θα αποθηκευτούν οι διαμορφωμένες εικόνες.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        ////////////////////////////////////////////////////////////////////////
        
        File folder = new File(jTextField1.getText()+"//"); //current directory
        File[] listOfFiles = folder.listFiles();
        
        ///////////////////     Check if is all .jpg     ///////////////////////
        int counter=0;
        for (int ch = 0; ch < listOfFiles.length; ch++)
            if(listOfFiles[ch].getName().endsWith(".jpg")) counter++;
        
        if(counter != listOfFiles.length)
        {
            JOptionPane.showMessageDialog(this,
                    "Ο φάκελος: "+jTextField1.getText()+
                            ",\nπεριέχει άλλους φακέλους ή διαφορετικά αρχεία."+
                            "\nΘα πρέπει να ορίζεται φάκελος ο οποίος περιλαμβάνει μόνο αρχεία της μορφής .jpg για την επεξεργασία τους."
                    +"\nΔοκιμάστε ξανά!", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ////////////////////////////////////////////////////////////////////////
        
        Arrays.sort(listOfFiles);// taksinomisi listas by name
        
        BufferedImage ReadedImage = null;
        BufferedImage tempImage=null;
        
        ImageWriter writer = null;
        FileImageOutputStream output = null;
        
        //--------Arxikopoihseis-----------------------
        
        String FileName=null; //Onomasia telikou tropopoimenou arxeiou
        double logos; //phliko height/width
        int i;
        int LengthArF;
        int LengthArS;
        
        int ArS=1; //ari8mhshh selidwn
        //metablhtes opou stamatoun thn roh aru8mhshs twn fyllwn kai selidwn antistoixa
        int StopArF=0;
        int StopArS=1;
        int modifySel=0;
        //----------------------------------------------   
        
        for ( i = 0; i < listOfFiles.length; i++)
        {
            //Analoga me to mhkos ths ari8mhshs prosarmozetai to teliko FileName
            LengthArF = String.valueOf(ArF).length();
            if(LengthArF == 1)      FileName =  Code + "_00000" + ArF;
            else if(LengthArF == 2) FileName =  Code + "_0000" + ArF;
            else if(LengthArF == 3) FileName =  Code + "_000" + ArF;
            else if(LengthArF == 4) FileName =  Code + "_00" + ArF;
            else if(LengthArF == 5) FileName =  Code + "_0" + ArF;
            else if(LengthArF == 6) FileName =  Code + "_" + ArF;
            //-------------------------------------------------------------------------

//---------------------       Periptwsh opou exoume ari8mhsh selidwn     -------------------------//
            if (listFSel.isEmpty() == false)
                if((i+1) == listFSel.get(0))
                {
                    StopArF = 1; //Stamataei h ari8mhsh twn fullwn
                    StopArS = 0; //Ksekinaei h ari8mhsh twn selidwn
                    ArS=1;
                    modifySel  = 1;
                }
            
            if(modifySel == 1)
            {
                LengthArS = String.valueOf(ArS).length();
                if(LengthArS == 1) FileName = FileName + "_0000" + ArS;
                else if(LengthArS == 2)FileName = FileName + "_000" + ArS;
                else if(LengthArS == 3)FileName = FileName + "_00" + ArS;
                else if(LengthArS == 4)FileName = FileName + "_0" + ArS;
                else if(LengthArS == 5)FileName = FileName + "_" + ArS;
            }
            
            if (listFSel.isEmpty() == false)
                if((i+1) == listFSel.get(1))
                {
                    StopArF = 0; //Ksekinaei h ari8mhsh twn fullwn
                    StopArS = 1; //Stamataei h ari8mhsh twn selidwn
                    modifySel  = 0;
                    // Diagrafi twn duo protwn stoixeiwn apo to pinaka listFSel
                    listFSel.remove(0); //1o stoixeio
                    listFSel.remove(0); //2o stoixeio
                }
//------------------------------------------------------------------------------------------------//
            try 
            {
                ReadedImage = ImageIO.read(new File(jTextField1.getText()+"//"+listOfFiles[i].getName()));
            } catch (IOException ex) 
            {
                Logger.getLogger(PanelB.class.getName()).log(Level.SEVERE, null, ex);
            }
            logos = (double) ReadedImage.getHeight() / (double) ReadedImage.getWidth();
            
            //prosarmogh eikonas stis analoges diastaseis twn 1280 pixels antistoixa gia ypsos k platos
            //(width / height) = (new_width / new_height)
            
            if(logos >= 1) //ypsos eikonas megalutero apo to platos
            {  
                tempImage = resizeImage(ReadedImage, (int) ((double)1280/(double)logos), 1280 );
            }
            else  //platos eikonas megalutero apo ypsos
            {
                tempImage = resizeImage(ReadedImage, 1280, (int) (1280 * logos) );
            }

            
            try 
            {
                writer = ImageIO.getImageWritersByFormatName("jpeg").next();
                ImageWriteParam param = writer.getDefaultWriteParam();
                param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                param.setCompressionQuality(0.89f);
                output = new FileImageOutputStream(new File(jTextField2.getText()+"//"+FileName+".jpg"));
                writer.setOutput(output);
                IIOImage iioImage = new IIOImage(tempImage, null, null);
                writer.write(null, iioImage, param);
                
                //ImageIO.write(tempImage, "jpg", new File(jTextField2.getText()+"//"+FileName+".jpg"));
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(PanelB.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally 
            {
                if (writer != null) {writer.dispose();}
                if (output != null) { output.close();}
            }
            
            if(StopArF == 0) ArF = ArF + 1;
            else if(StopArS == 0 ) ArS = ArS + 1;
        }
        
        folder.delete();
        
        JOptionPane.showMessageDialog(this,
                    "Η διαδικασία ολοκληρώθηκε!!", 
                    "Ολοκλήρωση", JOptionPane.INFORMATION_MESSAGE);
        
        fr.ChangeJPanelfromBtoA_2();
        fr.WindowVisibility();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        fr.ChangeJPanelfromBtoA();
        fr.WindowVisibility();
    }                                        

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int response = fc.showOpenDialog(PanelB.this);
        if(response == JFileChooser.APPROVE_OPTION)
            jTextField1.setText(fc.getSelectedFile().toString());
        
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int response = fc.showOpenDialog(PanelB.this);
        if(response == JFileChooser.APPROVE_OPTION)
            jTextField2.setText(fc.getSelectedFile().toString());
    }                                        
    
    public void SetjTextFieldsjTable()
    {
        jTextField1.setText("");
        jTextField2.setText("");
    }
    
    
    public BufferedImage resizeImage(Image image, int width, int height) {
    
        /*
        Image scaled = image.getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
        BufferedImage bufferedImage = new BufferedImage(scaled.getWidth(null), scaled.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        graphics2D.drawImage(image, 0, 0, width, height, null);
        graphics2D.dispose();
        return bufferedImage;*/
        
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING,RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,RenderingHints.VALUE_STROKE_NORMALIZE);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        
        graphics2D.drawImage(image, 0, 0, width, height, null);
        graphics2D.dispose();
        return bufferedImage;
        
        /*
        final BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        final Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(image, 0, 0, width, height, null);
        graphics2D.dispose();
        graphics2D.setComposite(AlphaComposite.Src);
        //below lines are for RenderingHints for better image quality at cost of higher processing time
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING,RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,RenderingHints.VALUE_STROKE_NORMALIZE);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        
        return bufferedImage;
        */
    }
                  
}