

import java.text.DecimalFormat;

public class Zag extends javax.swing.JFrame {

  
    public Zag() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        material = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        diam = new javax.swing.JLabel();
        sten = new javax.swing.JLabel();
        vus = new javax.swing.JLabel();
        dlin = new javax.swing.JLabel();
        shur = new javax.swing.JLabel();
        dx = new javax.swing.JTextField();
        sx = new javax.swing.JTextField();
        vx = new javax.swing.JTextField();
        dlx = new javax.swing.JTextField();
        shx = new javax.swing.JTextField();
        raschet = new javax.swing.JButton();
        massa = new javax.swing.JTextField();
        cena = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        material.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "алюминий", "сталь", "нержавейка", "латунь", "не металл" }));
        material.setToolTipText("123");
        material.setAlignmentX(10.0F);
        material.setAutoscrolls(true);
        getContentPane().add(material, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 14, -1, -1));

        jLabel1.setText("материал");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 14, -1, 20));

        diam.setText("диаметр");
        getContentPane().add(diam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 51, -1));

        sten.setText("стенка");
        getContentPane().add(sten, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, 51, -1));

        vus.setText("высота");
        getContentPane().add(vus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 51, -1));

        dlin.setText("длина");
        getContentPane().add(dlin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 51, -1));

        shur.setText("ширина");
        getContentPane().add(shur, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, 51, -1));
        getContentPane().add(dx, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 14, 43, -1));
        getContentPane().add(sx, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 40, 43, -1));
        getContentPane().add(vx, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 66, 43, -1));
        getContentPane().add(dlx, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 92, 43, -1));
        getContentPane().add(shx, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 118, 43, -1));

        raschet.setText("расчитать");
        raschet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raschetActionPerformed(evt);
            }
        });
        getContentPane().add(raschet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, -1, -1));

        massa.setEditable(false);
        getContentPane().add(massa, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 163, 58, -1));

        cena.setEditable(false);
        getContentPane().add(cena, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 163, 65, -1));

        jLabel2.setText("масса, кг");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 147, 58, -1));

        jLabel3.setText("стоимость, р");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 147, -1, -1));

        getAccessibleContext().setAccessibleName("zagotovka");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void raschetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raschetActionPerformed
     String a, mas , cmac ;
     Double b ,b1 , c,d = null, m = null, e = null, f, v, s;
     
      if (dx.getText().equals("")){ b = 0.0;}
      else{ b = Double.parseDouble(dx.getText().replace(',', '.'));}
     
      if (sx.getText().equals("")){ b1 = 0.0;}
      else{ b1 = Double.parseDouble(sx.getText().replace(',', '.'));}
        
      if (vx.getText().equals("")){ v = 0.0;}
      else{v = Double.parseDouble(vx.getText().replace(',', '.'));}
     
      if (shx.getText().equals("")){ s = 0.0;} 
      else {s = Double.parseDouble(shx.getText().replace(',', '.'));}
      
      if (dlx.getText().equals("")){ c = 0.0;}  
      else {c = Double.parseDouble(dlx.getText().replace(',', '.'));}
      
     
      a = (String) material.getSelectedItem(); 
      
if (    null != a)switch (a) {
            case "алюминий":
                d = 2700.0 ;
                e = 400.0 ;
                break;
            case "сталь":
                d = 7800.0 ;
                e = 50.0 ;
                break;
            case "нержавейка":
                d = 7900.0 ;
                e = 200.0 ;
                break;
            case "латунь":
                d = 8500.0 ;
                e = 500.0 ;
                break;
            case "не металл":
                d = 1700. ;
                e = 500.0 ;
                break;
            default:
                break;
        }
if (b1==0 && v==0 && s==0 && b!=0 && c!=0 ){
    m = d*((b/2/1000)*(b/2/1000)*3.14*c/1000) ;
    }
if (b1==0 && v!=0 && s!=0 && b==0 && c!=0 ){
    m = v/1000.0*s/1000*c/1000*d ;
    }
if (b1!=0 && v==0 && s==0 && b!=0 && c!=0 ){
    m = d*((((b/2)*(b/2)*3.14/1000000)-(((b-b1*2)/2)*((b-b1*2)/2)*3.14/1000000))*c/1000);
    } 
if (b1==0 && v==0 && s==0 && b==0 && c==0 ){
   m = 0.0 ; 
}
DecimalFormat decimalFormat = new DecimalFormat("#.##");
mas = decimalFormat.format(m);
massa.setText(mas ); 
f = m*e ;
cmac = decimalFormat.format(f) ;
cena.setText(cmac );

        
// TODO add your handling code here:v
    }//GEN-LAST:event_raschetActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Zag().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cena;
    private javax.swing.JLabel diam;
    private javax.swing.JLabel dlin;
    private javax.swing.JTextField dlx;
    private javax.swing.JTextField dx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField massa;
    private javax.swing.JComboBox<String> material;
    private javax.swing.JButton raschet;
    private javax.swing.JLabel shur;
    private javax.swing.JTextField shx;
    private javax.swing.JLabel sten;
    private javax.swing.JTextField sx;
    private javax.swing.JLabel vus;
    private javax.swing.JTextField vx;
    // End of variables declaration//GEN-END:variables
}
