/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import Entidades.Curso;
import Otros.TextPrompt;
import javax.swing.JOptionPane;

/**
 *
 * @author mco_a
 */
public class EditarCurso extends javax.swing.JFrame {

    private GestorCursos padre;
    private int cursoSelecIndex;
    private boolean isCreando;
    /**
     * Creates new form EditarCurso
     */
    public EditarCurso() {
        initComponents();
    }
    
    public EditarCurso(GestorCursos padre) {
        initComponents();
        this.padre = padre;
        isCreando = true;
        
        TextPrompt txtPrompt = new TextPrompt(
                "Código", txtCodigo);
        TextPrompt txtPrompt1 = new TextPrompt(
                "Créditos", txtCreditos);
        TextPrompt txtPrompt2 = new TextPrompt(
                "Nombre", txtNombre);
    }
    
    public EditarCurso(GestorCursos padre, 
            Curso curso,
            int cursoSelecIndex){
        initComponents();
        this.padre = padre;
        this.cursoSelecIndex = cursoSelecIndex;
        isCreando = false;
        txtCodigo.setText(curso.getCodigo());
        txtNombre.setText(curso.getNombre());
        txtCreditos.setText(curso.getCreditos() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        txtCreditos = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("[Nombre del curso]");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, 165, 30));

        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Btn-RojoClaro.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 257, -1, -1));

        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Btn-AzulClaro.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 257, 90, 32));

        txtCreditos.setBackground(new java.awt.Color(255, 255, 255));
        txtCreditos.setBorder(null);
        jPanel1.add(txtCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 154, 240, 20));

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 240, 20));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 240, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/TxtField-2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 102, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/TxtField-2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 194, 260, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/TxtField-2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 148, 260, 32));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Fondo-EditarCurso.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 329, 329));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
      
        String codigo = txtCodigo.getText();
        String creditos = txtCreditos.getText();
        String nombre = txtNombre.getText();
        
        if (codigo.isEmpty() || creditos.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Completa todos los campos");
            return; // No continuamos si los campos están vacíos
        }
        
        Curso curso = getCursoDesdePantalla();
        if(isCreando){
            this.padre.agregarCurso(curso);
        }else{
            this.padre.editarCurso(curso, 
                    this.cursoSelecIndex);
        }
        Cerrar();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private Curso getCursoDesdePantalla() throws NumberFormatException {
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String creditosTexto
                = txtCreditos.getText();
        int creditos
                = Integer.parseInt(
                        creditosTexto);
        Curso curso =
                new Curso(codigo, creditos, nombre);
        return curso;
    }

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-AzulOscuro.png"))
        );
        btnGuardar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-AzulClaro.png"))
        );
        btnGuardar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        Cerrar();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-RojoOscuro.png"))
        );
        btnCancelar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-RojoClaro.png"))
        );
        btnCancelar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void Cerrar(){
        this.padre.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(EditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}