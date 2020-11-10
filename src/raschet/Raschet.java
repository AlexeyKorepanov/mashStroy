package raschet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static raschet.Raschet.tab;

public class Raschet extends javax.swing.JFrame {

    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    public static int x;
    public static String tab[][] = new String [10][100] ;
    public static String ima1 = null;
   
    
  
    public Raschet() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bz = new javax.swing.JButton();
        Bn = new javax.swing.JButton();
        nomer = new javax.swing.JLabel();
        nomVvod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        kol = new javax.swing.JTextField();
        mem = new javax.swing.JButton();
        vuvod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Расчет цены изделия");

        Bz.setText("заготовка");
        Bz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BzMouseClicked(evt);
            }
        });

        Bn.setText("нормировка");
        Bn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BnMouseClicked(evt);
            }
        });

        nomer.setText("наименование детали");

        jLabel1.setText("колличество");

        mem.setText("записать");
        mem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memMouseClicked(evt);
            }
        });

        vuvod.setText("вывести таблицу");
        vuvod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vuvodMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bz)
                        .addGap(18, 18, 18)
                        .addComponent(Bn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomer)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomVvod, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kol, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(vuvod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .addComponent(mem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bz)
                    .addComponent(Bn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomer)
                    .addComponent(nomVvod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vuvod)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Расчет");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BzMouseClicked
       Zag zag = new Zag();
       zag.setVisible(true);
     
    }//GEN-LAST:event_BzMouseClicked

    private void BnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BnMouseClicked
       Norm norm = new Norm();
       norm.setVisible(true);
        
    }//GEN-LAST:event_BnMouseClicked

    private void memMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memMouseClicked
     Double a, b, c, d, e ;
     String ima ;
     ima = nomVvod.getText() ;
     if (!ima.equals(ima1)) {
      
          x++ ;
      tab[x][0] = ima ;
      tab[x][1] = kol.getText() ;
         a =Double.parseDouble(Zag.cena.getText( ).replace(',', '.'));
         b =Double.parseDouble(Norm.obRez.getText( ).replace(',', '.'));
         c = a + b ;
         d =Double.parseDouble(kol.getText( ).replace(',', '.'));
         e = d*c ;
         String summ = decimalFormat.format(e) ;
      tab[x][2] = a.toString();
      tab[x][3] = b.toString();
      tab[x][4] = c.toString();
      tab[x][5] = summ;
      
      
      System.out.println(tab[x][0]);
      System.out.println(tab[x][1]);
      System.out.println(tab[x][2]);
      System.out.println(tab[x][3]);
      System.out.println(tab[x][4]);
      System.out.println(tab[x][5]);
      System.out.println(x);
      
      ima1 = ima ;}
     else {
     System.out.println("номер не поменялся");
          }
        // TODO add your handling code here:
    }//GEN-LAST:event_memMouseClicked

    private void vuvodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vuvodMouseClicked
        String[][] xl = tab ;// TODO add your handling code here:
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("Стоимость");
         int rowNum = 0 ;
         for(String[]str : xl){
             Row row = sheet.createRow(rowNum++) ;
            int colNum = 0 ;
            for (String field : str) {
                 Cell cell = row.createCell(colNum++) ;
                cell.setCellValue(field);
            }
         }
         
          try {
           FileOutputStream out = new FileOutputStream("d:/Xldemo.xlsx");
            wb.write(out);
            wb.close(); 
            
            JOptionPane.showMessageDialog(null, "фаил записан!");
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Raschet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Raschet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
         
    }//GEN-LAST:event_vuvodMouseClicked

 
    public static void main(String args[]) throws ParseException {
    
        x=0  ;
        tab[x][0] = "наименование" ;
        tab[x][1] = "кол-во";
        tab[x][2] = "заг." ;
        System.out.println(tab[1][0]);
        tab[x][3] = "обр-ка" ;
        tab[x][4] = "цена, без НДС" ;
        tab[x][5] = "цена заказа" ;   
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Raschet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            java.awt.EventQueue.invokeLater(() -> {
            new Raschet().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bn;
    private javax.swing.JButton Bz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField kol;
    private javax.swing.JButton mem;
    private javax.swing.JTextField nomVvod;
    private javax.swing.JLabel nomer;
    private javax.swing.JButton vuvod;
    // End of variables declaration//GEN-END:variables

 

   
}
