/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import Entidades.Profesor;
import Otros.TextPrompt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
/**
 *
 * @author mco_a
 */
public class ListaProfesores extends javax.swing.JFrame {

    private GestorCursos padre;
    
    private List<Profesor> profesores 
            = new ArrayList<>();
    
    private DefaultListModel listaProfesores 
            = new DefaultListModel();
    /**
     * Creates new form ListaProfesores
     */
    public ListaProfesores() {
        initComponents();
    }
    
    public ListaProfesores(GestorCursos padre) {
        initComponents();
        this.padre = padre;
        
        TextPrompt txtPrompt = new TextPrompt(
                "Buscar", txtBusqueda);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProfesores = new javax.swing.JList<>();
        txtBusqueda = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Profesores de: [Nombre del Curso]");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, 255, 37));

        btnEditar.setForeground(new java.awt.Color(153, 153, 153));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Btn-CelesteClaro.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 327, -1, -1));

        jScrollPane1.setBorder(null);

        lstProfesores.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(lstProfesores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 450, 180));

        txtBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        txtBusqueda.setBorder(null);
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 66, 300, 20));

        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Btn-RojoClaro2.png"))); // NOI18N
        btnEliminar.setText("-");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 327, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Btn-Verde.png"))); // NOI18N
        btnAgregar.setText("+");
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 327, -1, -1));

        btnRegresar.setForeground(new java.awt.Color(153, 153, 153));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Btn-Anaranjado.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 327, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Fondo-Lista.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 104, -1, -1));

        btnBuscar.setForeground(new java.awt.Color(153, 153, 153));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Btn-VerdeClaro.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 59, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Fondo-TextField.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 59, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Fondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        EditarProfesor pantalla = new EditarProfesor(this);
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarMouseClicked

    public void agregarProfesor(Profesor profe){
        
        profesores.add(profe);
        actualizarLista();
    }
    
    public void editarProfesor(Profesor profe, int index){
        
        Profesor profesorAnterior = profesores.get(index);
        
        profesorAnterior.setNombre(
                profe.getNombre());
 
        actualizarLista();
    }
    
    public void actualizarLista(){
        listaProfesores.removeAllElements();
        for(Profesor profe: this.profesores){
            listaProfesores.addElement(
                    profe.getTexto());
        }
        lstProfesores.setModel(listaProfesores);
    }
    
    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-VerdeIntenso.png"))
        );
        btnAgregar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-Verde.png"))
        );
        btnAgregar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int index = lstProfesores.getSelectedIndex();
        if(index == -1){
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor, seleccione un profesor"
                            + " de la lista para eliminar");
            return;
        }
        
        profesores.remove(index);
        listaProfesores.remove(index);
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-Rojo.png"))
        );
        btnEliminar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-RojoClaro2.png"))
        );
        btnEliminar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        
        txtBusqueda.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
            // No realizar búsqueda automática aquí
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            // Cuando se borra el texto, restaurar la lista completa
                if (txtBusqueda.getText().trim().isEmpty()) {
                    lstProfesores.setModel(listaProfesores);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            // No realizar búsqueda automática aquí
            }
        });
        
        // Obtener el texto de búsqueda en minúsculas
        String textoBusqueda = txtBusqueda.getText().trim().toLowerCase();

        if (textoBusqueda.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Por favor, ingresa un término de búsqueda "
                            + "antes de hacer clic en Buscar.", 
                    "Campo de búsqueda vacío", 
                    JOptionPane.WARNING_MESSAGE
            );
        } else {
            // Crea un modelo para los resultados
            DefaultListModel resultadosModel = new DefaultListModel(); 

            for (Profesor profe : profesores) {
                // Obtiene el nombre del profesor en minúsculas
                String nombreProfesor =
                        profe.getNombre().toLowerCase();
            
                // Agrega profesores al modelo de resultados
                if (nombreProfesor.contains(textoBusqueda))
                {
                    resultadosModel.addElement(
                            profe.getTexto()); 
                }
            }
        
            if (resultadosModel.isEmpty()) {
                // Muestra un mensaje si no se encontraron resultados
                JOptionPane.showMessageDialog(this, 
                        "No se encontraron resultados"
                                + " para la búsqueda.",
                        "Sin resultados", 
                        JOptionPane.INFORMATION_MESSAGE
                );
            
                // Restablece el modelo original
                lstProfesores.setModel(listaProfesores);
            } else {
                // Configura el modelo de resultados
                lstProfesores.setModel(resultadosModel);
            }
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-VerdeClaro2.png"))
        );
        btnBuscar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-VerdeClaro.png"))
        );
        btnBuscar.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        
        this.dispose();
        this.padre.setVisible(true);
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        btnRegresar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-AnaranjadoIntenso.png"))
        );
        btnRegresar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        btnRegresar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-Anaranjado.png"))
        );
        btnRegresar.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        int index = lstProfesores.getSelectedIndex();
        if(index == -1){
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor, seleccione un profesor "
                            + "de la lista para editar");
            return;
        }
        
        Profesor profesorSelec = profesores.get(index);
        
        EditarProfesor pantalla = new EditarProfesor(
                this, 
                profesorSelec,
                index);
        
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-Celeste.png"))
        );
        btnEditar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/Imgs/Btn-CelesteClaro.png"))
        );
        btnEditar.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnEditarMouseExited

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
            java.util.logging.Logger.getLogger(ListaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProfesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstProfesores;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
