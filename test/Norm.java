

import java.text.DecimalFormat;

public class Norm extends javax.swing.JFrame {
   
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
 
    public Norm() {
        
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frVvod = new javax.swing.JTextField();
        frRez = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tokVvod = new javax.swing.JTextField();
        tokRez = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        yVvod = new javax.swing.JTextField();
        yRez = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tokc = new javax.swing.JTextField();
        frc = new javax.swing.JTextField();
        yс = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        obs = new javax.swing.JButton();
        obRez = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        frVvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frVvodActionPerformed(evt);
            }
        });

        frRez.setEditable(false);

        jLabel1.setText("время,н/мин");

        jLabel2.setText("стоимость услуги, р");

        jLabel3.setText("Фрезеровка");

        tokVvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tokVvodActionPerformed(evt);
            }
        });

        tokRez.setEditable(false);

        jLabel4.setText("токарка");

        yVvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yVvodActionPerformed(evt);
            }
        });

        yRez.setEditable(false);

        jLabel5.setText("уневерсал");

        tokc.setText("1200");

        frc.setText("1200");

        yс.setText("400");

        jLabel6.setText("цена за н/ч , р");

        jLabel7.setText("общая стоимость услуги");

        obs.setText("вычеслить");
        obs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obsActionPerformed(evt);
            }
        });

        obRez.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yVvod, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frVvod, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(tokVvod, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tokc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(frc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yс, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(obs)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yRez)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frRez)
                    .addComponent(tokRez)
                    .addComponent(obRez))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(frRez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tokRez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(yRez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(frc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tokc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(yс, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(frVvod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tokVvod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(yVvod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(obs))
                    .addComponent(obRez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frVvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frVvodActionPerformed
     Double a = Double.parseDouble(frVvod.getText().replace(',', '.'));
     Double b = Double.parseDouble(frc.getText().replace(',', '.'));//читаем с текстового поля текст, преобразуем в Double
a = a/60*b ; //тут я прибавляю a = a + 2

        String mas = decimalFormat.format(a);
frRez.setText(mas);   // TODO add your handling code here:
    }//GEN-LAST:event_frVvodActionPerformed

    private void tokVvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tokVvodActionPerformed
     Double a = Double.parseDouble(tokVvod.getText().replace(',', '.'));
     Double b = Double.parseDouble(tokc.getText().replace(',', '.'));//читаем с текстового поля текст, преобразуем в Double
a = a/60*b ;

        String mas = decimalFormat.format(a);//тут я прибавляю a = a + 2
tokRez.setText(mas);    // TODO add your handling code here:
    }//GEN-LAST:event_tokVvodActionPerformed

    private void yVvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yVvodActionPerformed
     Double a = Double.parseDouble(yVvod.getText().replace(',', '.'));
     Double b = Double.parseDouble(yс.getText().replace(',', '.'));//читаем с текстового поля текст, преобразуем в Double, меняем запятую на точку
a = a/60*b ;

        String mas = decimalFormat.format(a);//преобразуем число в текст, без лишних цифр после запятой
yRez.setText(mas);   
    }//GEN-LAST:event_yVvodActionPerformed

    private void obsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obsActionPerformed
       Double f = Double.parseDouble(frRez.getText().replace(',', '.'));
       Double t = Double.parseDouble(tokRez.getText().replace(',', '.'));
       Double y = Double.parseDouble(yRez.getText().replace(',', '.')) ;  
       Double r ;
       r = f + t + y ;
     
        String rez = decimalFormat.format(r);
obRez.setText(rez);    
    }//GEN-LAST:event_obsActionPerformed

       public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Norm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new Norm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField frRez;
    private javax.swing.JTextField frVvod;
    private javax.swing.JTextField frc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField obRez;
    private javax.swing.JButton obs;
    private javax.swing.JTextField tokRez;
    private javax.swing.JTextField tokVvod;
    private javax.swing.JTextField tokc;
    private javax.swing.JTextField yRez;
    private javax.swing.JTextField yVvod;
    private javax.swing.JTextField yс;
    // End of variables declaration//GEN-END:variables
}
