
package VueloH;

import javax.swing.JOptionPane;
import java.util.Stack;
public class frm_vuelohuman extends javax.swing.JFrame {
    //PILA NIÑOS
     Stack<String> pila_niño = new Stack<String>();
     //PILA ADULTOS
     Stack<String> pila_adulto = new Stack<String>();
     //PILA ANCIANOS
     Stack<String> pila_anciano = new Stack<String>();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_añadir = new javax.swing.JButton();
        btn_niños = new javax.swing.JButton();
        btn_niñosb = new javax.swing.JButton();
        btn_adultos = new javax.swing.JButton();
        btn_ancianos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_adultosb = new javax.swing.JButton();
        btn_ancianosb = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_edad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel1.setText("VUELOS HUMANITARIOS");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel2.setText("Nombre*:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel3.setText("Edad*:");

        txt_nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        btn_añadir.setBackground(new java.awt.Color(204, 255, 204));
        btn_añadir.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        btn_añadir.setForeground(new java.awt.Color(0, 0, 51));
        btn_añadir.setText("Añadir");
        btn_añadir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), java.awt.Color.lightGray, null, new java.awt.Color(153, 153, 255)));
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
            }
        });

        btn_niños.setBackground(new java.awt.Color(204, 255, 204));
        btn_niños.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        btn_niños.setForeground(new java.awt.Color(0, 0, 51));
        btn_niños.setText("Niños");
        btn_niños.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), java.awt.Color.lightGray, null, new java.awt.Color(153, 153, 255)));
        btn_niños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_niñosActionPerformed(evt);
            }
        });

        btn_niñosb.setBackground(new java.awt.Color(204, 255, 204));
        btn_niñosb.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        btn_niñosb.setForeground(new java.awt.Color(0, 0, 51));
        btn_niñosb.setText("Niños");
        btn_niñosb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), java.awt.Color.lightGray, null, new java.awt.Color(153, 153, 255)));
        btn_niñosb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_niñosbActionPerformed(evt);
            }
        });

        btn_adultos.setBackground(new java.awt.Color(204, 255, 204));
        btn_adultos.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        btn_adultos.setForeground(new java.awt.Color(0, 0, 51));
        btn_adultos.setText("Adultos");
        btn_adultos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), java.awt.Color.lightGray, null, new java.awt.Color(153, 153, 255)));
        btn_adultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adultosActionPerformed(evt);
            }
        });

        btn_ancianos.setBackground(new java.awt.Color(204, 255, 204));
        btn_ancianos.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        btn_ancianos.setForeground(new java.awt.Color(0, 0, 51));
        btn_ancianos.setText("Ancianos");
        btn_ancianos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), java.awt.Color.lightGray, null, new java.awt.Color(153, 153, 255)));
        btn_ancianos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ancianosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel4.setText("Mostrar registros de:");

        btn_salir.setBackground(new java.awt.Color(204, 255, 204));
        btn_salir.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 51));
        btn_salir.setText("SALIR");
        btn_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), java.awt.Color.lightGray, null, new java.awt.Color(153, 153, 255)));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel6.setText("Borrar ultimo registro de: ");

        btn_adultosb.setBackground(new java.awt.Color(204, 255, 204));
        btn_adultosb.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        btn_adultosb.setForeground(new java.awt.Color(0, 0, 51));
        btn_adultosb.setText("Adultos");
        btn_adultosb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), java.awt.Color.lightGray, null, new java.awt.Color(153, 153, 255)));
        btn_adultosb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adultosbActionPerformed(evt);
            }
        });

        btn_ancianosb.setBackground(new java.awt.Color(204, 255, 204));
        btn_ancianosb.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        btn_ancianosb.setForeground(new java.awt.Color(0, 0, 51));
        btn_ancianosb.setText("Ancianos");
        btn_ancianosb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), java.awt.Color.lightGray, null, new java.awt.Color(153, 153, 255)));
        btn_ancianosb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ancianosbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_niñosb, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_adultosb, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ancianosb, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_niños, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_adultos, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ancianos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_añadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_niñosb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_adultosb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ancianosb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_niños, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_adultos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ancianos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 255, 51));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel5.setText("Salvando vidas.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        txt_edad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed
    //FUNCION AÑADIR
    public frm_vuelohuman() {
        initComponents();
    }
    protected void fnt_añadir(String nombre, String edad) {
    if (txt_nombre.getText().equals("") || txt_edad.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Debe llenar los campos");
    } else {
        try {
            int edadInt = Integer.parseInt(txt_edad.getText());

            if (edadInt >= 2 && edadInt <= 12) {
                pila_niño.push(nombre + " - Edad: " + edad);
                JOptionPane.showMessageDialog(null, "La persona: " + nombre + " de " + edad + " años ha sido registrada como niño con éxito");
            } else if (edadInt >= 15 && edadInt <= 25) {
                pila_adulto.push(nombre + " - Edad: " + edad);
                JOptionPane.showMessageDialog(null, "La persona: " + nombre + " de " + edad + " años ha sido registrada como adulto con éxito");
            } else if (edadInt >= 60 && edadInt <= 80) {
                pila_anciano.push(nombre + " - Edad: " + edad);
                JOptionPane.showMessageDialog(null, "La persona: " + nombre + " de " + edad + " años ha sido registrada como anciano con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "La edad no cumple con los requisitos para ningún grupo");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una edad válida");
        }
    }
}
    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
        fnt_añadir(txt_nombre.getText(), txt_edad.getText());
    }//GEN-LAST:event_btn_añadirActionPerformed
    //MOSTRAR PILA NIÑOS
   protected void mostrarRegistrosNiños() {
    JOptionPane.showMessageDialog(null, "Registros de Niños: " + pila_niño.toString());
}
    private void btn_niñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_niñosActionPerformed
       mostrarRegistrosNiños();
    }//GEN-LAST:event_btn_niñosActionPerformed
    //MOSTRAR PILA ADULTOS
    protected void mostrarRegistrosAdultos() {
    JOptionPane.showMessageDialog(null, "Registros de Adulto: " + pila_adulto.toString());
}
    private void btn_adultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adultosActionPerformed
         mostrarRegistrosAdultos();
    }//GEN-LAST:event_btn_adultosActionPerformed
    //MOSTRAR PILA ANCIANOS
      protected void mostrarRegistrosAncianos() {
    JOptionPane.showMessageDialog(null, "Registros de Ancianos: " + pila_anciano.toString());
}
    private void btn_ancianosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ancianosActionPerformed
        mostrarRegistrosAncianos();
    }//GEN-LAST:event_btn_ancianosActionPerformed
    //Eliminar ultimo reg. de la pila de niños
    protected void eliminarUltimoRegistroNiños() {
    if (!pila_niño.isEmpty()) {
        pila_niño.pop();
        JOptionPane.showMessageDialog(null, "Se ha eliminado el último registro de Niños");
    } else {
        JOptionPane.showMessageDialog(null, "La pila de Niños está vacía");
    }
}
    private void btn_niñosbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_niñosbActionPerformed
       eliminarUltimoRegistroNiños();
    }//GEN-LAST:event_btn_niñosbActionPerformed
    //Eliminar ultimo reg. de la pila de adultos
    protected void eliminarUltimoRegistroAdultos() {
    if (!pila_adulto.isEmpty()) {
        pila_adulto.pop();
        JOptionPane.showMessageDialog(null, "Se ha eliminado el último registro de Adultos");
    } else {
        JOptionPane.showMessageDialog(null, "La pila de Adultos está vacía");
    }
}
    private void btn_adultosbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adultosbActionPerformed
        eliminarUltimoRegistroAdultos();
    }//GEN-LAST:event_btn_adultosbActionPerformed
  //Eliminar ultimo reg. de la pila de ancianos
    protected void eliminarUltimoRegistroAnciano() {
    if (!pila_anciano.isEmpty()) {
        pila_anciano.pop();
        JOptionPane.showMessageDialog(null, "Se ha eliminado el último registro de Ancianos");
    } else {
        JOptionPane.showMessageDialog(null, "La pila de Ancianos está vacía");
    }
}
    private void btn_ancianosbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ancianosbActionPerformed
        eliminarUltimoRegistroAnciano();
    }//GEN-LAST:event_btn_ancianosbActionPerformed

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
            java.util.logging.Logger.getLogger(frm_vuelohuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_vuelohuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_vuelohuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_vuelohuman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_vuelohuman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adultos;
    private javax.swing.JButton btn_adultosb;
    private javax.swing.JButton btn_ancianos;
    private javax.swing.JButton btn_ancianosb;
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_niños;
    private javax.swing.JButton btn_niñosb;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
