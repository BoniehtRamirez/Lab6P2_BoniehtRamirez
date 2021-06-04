package lab6_boniehtramirez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        usuarios.add(new Usuario("Admin","Admin","0801","admin","1234","Licenciatura"));
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_registro = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_contraseña = new javax.swing.JTextField();
        tf_numRegistro = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_usuarioRegistro = new javax.swing.JTextField();
        cb_facultad = new javax.swing.JComboBox<>();
        cb_tipoUsuario = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jd_registroDocente = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_tituloP = new javax.swing.JTextField();
        tf_tituloU = new javax.swing.JTextField();
        sp_clasesImpartidas = new javax.swing.JSpinner();
        jButton4 = new javax.swing.JButton();
        jd_registroAlumno = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_carrera = new javax.swing.JTextField();
        tf_id = new javax.swing.JTextField();
        sp_edad = new javax.swing.JSpinner();
        sp_promedio = new javax.swing.JSpinner();
        sp_año = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf_apellidoM = new javax.swing.JTextField();
        tf_numM = new javax.swing.JTextField();
        tf_usuarioM = new javax.swing.JTextField();
        tf_facultadM = new javax.swing.JTextField();
        tf_nombreM = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        tf_contraseñaM = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_proyectos = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_clases = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jd_proyecto = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tf_descripcion = new javax.swing.JTextField();
        tf_puntuacion = new javax.swing.JTextField();
        tf_duracion = new javax.swing.JTextField();
        tf_titulo = new javax.swing.JTextField();
        tf_fecha = new javax.swing.JTextField();
        sp_dificultad = new javax.swing.JSpinner();
        sp_cant = new javax.swing.JSpinner();
        jButton10 = new javax.swing.JButton();
        jd_alumnos = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jd_clases = new javax.swing.JDialog();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        tf_nombreClase = new javax.swing.JTextField();
        tf_seccion = new javax.swing.JTextField();
        tf_codigoCarrera = new javax.swing.JTextField();
        tf_codigo = new javax.swing.JTextField();
        sp_maxalumnos = new javax.swing.JSpinner();
        sp_aula = new javax.swing.JSpinner();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        pf_contraseña = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Numero Registro:");

        jLabel6.setText("Usuario:");

        jLabel7.setText("Contraseña:");

        jLabel8.setText("Facultad:");

        jLabel9.setText("¿Usted es?:");

        cb_facultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salud", "Ingenieria", "Licenciatura" }));

        cb_tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docente", "Alumno" }));

        jButton3.setText("Siguiente");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_registroLayout = new javax.swing.GroupLayout(jd_registro.getContentPane());
        jd_registro.getContentPane().setLayout(jd_registroLayout);
        jd_registroLayout.setHorizontalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_nombre)
                        .addComponent(tf_usuarioRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(tf_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(tf_numRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(tf_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(cb_facultad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_tipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jd_registroLayout.setVerticalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_numRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_usuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cb_facultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(24, 24, 24))
        );

        jLabel10.setText("Titulo Universitario:");

        jLabel11.setText("Titulo Postgrado:");

        jLabel12.setText("Clases Impartidas:");

        sp_clasesImpartidas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jButton4.setText("Registrarse");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_registroDocenteLayout = new javax.swing.GroupLayout(jd_registroDocente.getContentPane());
        jd_registroDocente.getContentPane().setLayout(jd_registroDocenteLayout);
        jd_registroDocenteLayout.setHorizontalGroup(
            jd_registroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroDocenteLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jd_registroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_registroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(tf_tituloP, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tituloU, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_clasesImpartidas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jd_registroDocenteLayout.setVerticalGroup(
            jd_registroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroDocenteLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jd_registroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_tituloU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_tituloP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sp_clasesImpartidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(25, 25, 25))
        );

        jLabel13.setText("ID:");

        jLabel14.setText("Carrera:");

        jLabel15.setText("Edad:");

        jLabel16.setText("Año de Carrera:");

        jLabel17.setText("Promedio:");

        sp_edad.setModel(new javax.swing.SpinnerNumberModel(17, 17, null, 1));

        sp_promedio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 100.0d, 1.0d));

        sp_año.setModel(new javax.swing.SpinnerNumberModel(2021, 2021, null, 1));

        jButton5.setText("Registrarse");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_registroAlumnoLayout = new javax.swing.GroupLayout(jd_registroAlumno.getContentPane());
        jd_registroAlumno.getContentPane().setLayout(jd_registroAlumnoLayout);
        jd_registroAlumnoLayout.setHorizontalGroup(
            jd_registroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroAlumnoLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jd_registroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_registroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(tf_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_registroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sp_promedio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sp_edad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sp_año, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jd_registroAlumnoLayout.setVerticalGroup(
            jd_registroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroAlumnoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jd_registroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(sp_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(sp_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel18.setText("Nombre:");

        jLabel19.setText("Apellido:");

        jLabel20.setText("Numero de Registro:");

        jLabel21.setText("Usuario:");

        jLabel22.setText("Contraseña:");

        jLabel23.setText("Facultad:");

        jButton6.setText("Modificar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(204, 0, 0));
        jButton14.setForeground(new java.awt.Color(0, 0, 0));
        jButton14.setText("Cerrar Sesión");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_usuarioM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_apellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_numM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel23)
                                .addComponent(jLabel22))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton6)
                                .addComponent(tf_facultadM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_contraseñaM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(319, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(80, 80, 80))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_nombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_apellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_numM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf_usuarioM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tf_contraseñaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf_facultadM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(42, 42, 42)
                .addComponent(jButton14)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Info Personal", jPanel3);

        jt_proyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Descripcion", "Duracion", "Fecha Entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_proyectos);

        jButton7.setText("Crear");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("Modificar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("Eliminar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(65, 65, 65)
                .addComponent(jButton8)
                .addGap(61, 61, 61)
                .addComponent(jButton9)
                .addGap(160, 160, 160))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proyecto", jPanel1);

        jt_clases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Seccion", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_clases);

        jButton11.setText("Crear");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setText("Ver Alumnos");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addGap(134, 134, 134))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(68, 68, 68))
        );

        jTabbedPane1.addTab("Clases", jPanel2);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jLabel24.setText("Titulo");

        jLabel25.setText("Descripcion:");

        jLabel26.setText("Puntuación:");

        jLabel27.setText("Duracion:");

        jLabel28.setText("Fecha de Entrega:");

        jLabel29.setText("Dificultad:");

        jLabel30.setText("Cantidad maxima:");

        sp_dificultad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        sp_cant.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jButton10.setText("Crear");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_proyectoLayout = new javax.swing.GroupLayout(jd_proyecto.getContentPane());
        jd_proyecto.getContentPane().setLayout(jd_proyectoLayout);
        jd_proyectoLayout.setHorizontalGroup(
            jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_proyectoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jd_proyectoLayout.createSequentialGroup()
                        .addGroup(jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_duracion, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(tf_puntuacion, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(tf_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(tf_descripcion)
                            .addComponent(tf_fecha)
                            .addComponent(sp_dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_proyectoLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10)
                            .addComponent(sp_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jd_proyectoLayout.setVerticalGroup(
            jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_proyectoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tf_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(sp_dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_proyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(sp_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jd_alumnosLayout = new javax.swing.GroupLayout(jd_alumnos.getContentPane());
        jd_alumnos.getContentPane().setLayout(jd_alumnosLayout);
        jd_alumnosLayout.setHorizontalGroup(
            jd_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_alumnosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jd_alumnosLayout.setVerticalGroup(
            jd_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_alumnosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel31.setText("Nombre:");

        jLabel32.setText("Seccion:");

        jLabel33.setText("Código:");

        jLabel34.setText("Código Carrera:");

        jLabel35.setText("Max. Alumnos:");

        jLabel36.setText("Número de aula:");

        sp_maxalumnos.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        sp_aula.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jButton13.setText("Crear");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_clasesLayout = new javax.swing.GroupLayout(jd_clases.getContentPane());
        jd_clases.getContentPane().setLayout(jd_clasesLayout);
        jd_clasesLayout.setHorizontalGroup(
            jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_clasesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel32)
                        .addComponent(jLabel31)
                        .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13)
                    .addComponent(tf_nombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codigoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_seccion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sp_aula, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sp_maxalumnos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jd_clasesLayout.setVerticalGroup(
            jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_clasesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tf_nombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_seccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tf_codigoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(sp_maxalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(sp_aula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre de Usuario:");

        jLabel2.setText("Contraseña:");

        jButton1.setText("Iniciar Sesión");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Registrarse");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(tf_usuario)
                    .addComponent(pf_contraseña))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pf_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jd_registro.pack();
        jd_registro.setModal(true);
        jd_registro.setLocationRelativeTo(this);
        jd_registro.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if(cb_tipoUsuario.getSelectedIndex()==0){
            jd_registroDocente.pack();
            jd_registroDocente.setModal(true);
            jd_registroDocente.setLocationRelativeTo(jd_registro);
            jd_registroDocente.setVisible(true);
        } else {
            jd_registroAlumno.pack();
            jd_registroAlumno.setModal(true);
            jd_registroAlumno.setLocationRelativeTo(jd_registro);
            jd_registroAlumno.setVisible(true);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        String nombre, apellido, numeroRegistro, usuario, contraseña, facultad, tituloU, tituloP;
        int clasesImpartidas;
        
        nombre = tf_nombre.getText();
        apellido = tf_apellido.getText();
        numeroRegistro = tf_numRegistro.getText();
        usuario = tf_usuarioRegistro.getText();
        contraseña = tf_contraseña.getText();
        facultad = (String)cb_facultad.getSelectedItem();
        tituloU = tf_tituloU.getText();
        tituloP = tf_tituloP.getText();
        clasesImpartidas = (int)sp_clasesImpartidas.getValue();
        
        usuarios.add(new Docente(tituloU,tituloP,clasesImpartidas,nombre,apellido,numeroRegistro,usuario,contraseña,facultad));
        JOptionPane.showMessageDialog(jd_registroDocente, "¡Docente registrado!");
        
        jd_registroDocente.setVisible(false);
        jd_registro.setVisible(false);
        
        tf_nombre.setText("");
        tf_apellido.setText("");
        tf_numRegistro.setText("");
        tf_usuarioRegistro.setText("");
        tf_contraseña.setText("");
        cb_facultad.setSelectedIndex(0);
        tf_tituloU.setText("");
        tf_tituloP.setText("");
        sp_clasesImpartidas.setValue(0);
        
        try {
            guardarDocentes();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
         String nombre, apellido, numeroRegistro, usuario, contraseña, facultad, ID, carrera;
         int edad, año;
         double promedio;
        
        nombre = tf_nombre.getText();
        apellido = tf_apellido.getText();
        numeroRegistro = tf_numRegistro.getText();
        usuario = tf_usuarioRegistro.getText();
        contraseña = tf_contraseña.getText();
        facultad = (String)cb_facultad.getSelectedItem();
        ID = tf_id.getText();
        carrera = tf_carrera.getText();
        edad = (int)sp_edad.getValue();
        año = (int)sp_año.getValue();
        promedio = (double)sp_promedio.getValue();
        
        usuarios.add(new Alumno(ID,carrera,edad,año,promedio,nombre,apellido,numeroRegistro,usuario,contraseña,facultad));
        JOptionPane.showMessageDialog(jd_registroAlumno, "¡Alumno registrado!");
        
        jd_registroAlumno.setVisible(false);
        jd_registro.setVisible(false);
        
        tf_nombre.setText("");
        tf_apellido.setText("");
        tf_numRegistro.setText("");
        tf_usuarioRegistro.setText("");
        tf_contraseña.setText("");
        cb_facultad.setSelectedIndex(0);
        tf_id.setText("");
        tf_carrera.setText("");
        sp_edad.setValue(17);
        sp_año.setValue(2021);
        sp_promedio.setValue(0);
        
        
        try {
            guardarAlumnos();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        boolean logIn = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if(tf_usuario.getText().equals(usuarios.get(i).getUsuario()) && pf_contraseña.getText().equals(usuarios.get(i).getContraseña())){
                logIn = true;
                loged = i;
                break;
            }
        }
        
        if(logIn){
            DefaultTableModel modelo = (DefaultTableModel) jt_proyectos.getModel();
            int n = jt_proyectos.getRowCount();
            for (int i = 0; i < n; i++) {
                modelo.removeRow(0);
            }
            for (int i = 0; i < proyectos.size(); i++) {
                Object[] row = {proyectos.get(i).getTitulo(),proyectos.get(i).getDescripcion(),proyectos.get(i).getDuración(),proyectos.get(i).getFechaEntrega()};
                modelo.addRow(row);
            }
            jt_proyectos.setModel(modelo);
            
            n = jt_clases.getRowCount();
            for (int i = 0; i < n; i++) {
                modelo.removeRow(0);
            }
            for (int i = 0; i < clases.size(); i++) {
                Object[] row = {clases.get(i).getNombre(),clases.get(i).getSeccion(),clases.get(i).getCodigo()};
                modelo.addRow(row);
            }
            jt_clases.setModel(modelo);
            
            tf_nombreM.setText(usuarios.get(loged).getNombre());
            tf_apellidoM.setText(usuarios.get(loged).getApellido());
            tf_numM.setText(usuarios.get(loged).getNumeroRegistro());
            tf_usuarioM.setText(usuarios.get(loged).getUsuario());
            tf_contraseñaM.setText(usuarios.get(loged).getContraseña());
            tf_facultadM.setText(usuarios.get(loged).getFacultad());
            
            if(usuarios.get(loged) instanceof Alumno){
                jTabbedPane1.setEnabledAt(1, false);
                jButton11.setEnabled(false);
            } else if(usuarios.get(loged) instanceof Docente){
                jTabbedPane1.setEnabledAt(1, true);
                jButton11.setEnabled(false);
            } else {
                jTabbedPane1.setEnabledAt(1, true);
                jButton11.setEnabled(true);
            }
            jTabbedPane1.setSelectedIndex(0);
            jDialog1.pack();
            jDialog1.setModal(true);
            jDialog1.setLocationRelativeTo(this);
            jDialog1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this,"Datos no válidos!");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        String titulo, descripcion, puntuacion, duración, fechaEntrega;
        int dificultad, maxParticipantes;
        
        titulo = tf_titulo.getText();
        descripcion = tf_descripcion.getText();
        puntuacion = tf_puntuacion.getText();
        duración = tf_duracion.getText();
        fechaEntrega = tf_fecha.getText();
        dificultad = (int)sp_dificultad.getValue();
        maxParticipantes = (int)sp_cant.getValue();
        
        proyectos.add(new Proyecto(titulo,descripcion,puntuacion,duración,fechaEntrega,dificultad,maxParticipantes));
        JOptionPane.showMessageDialog(jd_proyecto, "Proyecto creado exitosamente!");
        
        DefaultTableModel modelo = (DefaultTableModel) jt_proyectos.getModel();
        Object[] row = {tf_titulo.getText(),tf_descripcion.getText(),tf_duracion.getText(),tf_fecha.getText()};
        modelo.addRow(row);
        jt_proyectos.setModel(modelo);
        
        jd_proyecto.setVisible(false);
        
        tf_titulo.setText("");
        tf_descripcion.setText("");
        tf_puntuacion.setText("");
        tf_duracion.setText("");
        tf_fecha.setText("");
        sp_dificultad.setValue(1);
        sp_cant.setValue(1);
        
        try {
            guardarProyectos();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        if(jt_proyectos.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(jDialog1, "No ha seleccionado ningun proyecto.");
        } else {
            proyectos.remove(jt_proyectos.getSelectedRow());
            DefaultTableModel modelo = (DefaultTableModel) jt_proyectos.getModel();
            modelo.removeRow(jt_proyectos.getSelectedRow());
            jt_proyectos.setModel(modelo);
            JOptionPane.showMessageDialog(jDialog1, "Proyecto eliminado!");

            try {
                guardarProyectos();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        if(jt_proyectos.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(jDialog1, "No ha seleccionado ningun proyecto.");
        } else {
            proyectos.get(jt_proyectos.getSelectedRow()).setTitulo((String)jt_proyectos.getValueAt(jt_proyectos.getSelectedRow(),0));
            proyectos.get(jt_proyectos.getSelectedRow()).setDescripcion((String)jt_proyectos.getValueAt(jt_proyectos.getSelectedRow(),1));
            proyectos.get(jt_proyectos.getSelectedRow()).setDuración((String)jt_proyectos.getValueAt(jt_proyectos.getSelectedRow(),2));
            proyectos.get(jt_proyectos.getSelectedRow()).setFechaEntrega((String)jt_proyectos.getValueAt(jt_proyectos.getSelectedRow(),3));
            JOptionPane.showMessageDialog(jDialog1, "Proyecto modificado!");

            try {
                guardarProyectos();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        jd_proyecto.pack();
        jd_proyecto.setModal(true);
        jd_proyecto.setLocationRelativeTo(this);
        jd_proyecto.setVisible(true);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        usuarios.get(loged).setNombre(tf_nombreM.getText());
        usuarios.get(loged).setApellido(tf_apellidoM.getText());
        usuarios.get(loged).setNumeroRegistro(tf_numM.getText());
        usuarios.get(loged).setUsuario(tf_usuarioM.getText());
        usuarios.get(loged).setContraseña(tf_contraseñaM.getText());
        usuarios.get(loged).setFacultad(tf_facultadM.getText());

        JOptionPane.showMessageDialog(jDialog1, "Información modificada!");
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        jd_alumnos.pack();
        jd_alumnos.setModal(true);
        jd_alumnos.setLocationRelativeTo(jDialog1);
        jd_alumnos.setVisible(true);
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        String nombre, seccion, codigo, codigoCarrera;
        int maxAlumnos, numeroAula;
        
        nombre = tf_nombreClase.getText();
        seccion = tf_seccion.getText();
        codigo = tf_codigo.getText();
        codigoCarrera = tf_codigoCarrera.getText();
        maxAlumnos = (int) sp_maxalumnos.getValue();
        numeroAula = (int) sp_aula.getValue();
        
        clases.add(new Clase(nombre,seccion,codigo,codigoCarrera,maxAlumnos,numeroAula));
        JOptionPane.showMessageDialog(jd_clases, "Clase creada!");
            
        DefaultTableModel modelo = (DefaultTableModel) jt_clases.getModel();
        Object[] row = {nombre,seccion,codigo};
        modelo.addRow(row);
        jt_clases.setModel(modelo);
        
        jd_clases.setVisible(false);
        tf_nombreClase.setText("");
        tf_seccion.setText("");
        tf_codigo.setText("");
        tf_codigoCarrera.setText("");
        sp_maxalumnos.setValue(1);
        sp_aula.setValue(1);
        
        try {
            guardarClases();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        jd_clases.pack();
        jd_clases.setModal(true);
        jd_clases.setLocationRelativeTo(jDialog1);
        jd_clases.setVisible(true);
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton14MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_facultad;
    private javax.swing.JComboBox<String> cb_tipoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JDialog jd_alumnos;
    private javax.swing.JDialog jd_clases;
    private javax.swing.JDialog jd_proyecto;
    private javax.swing.JDialog jd_registro;
    private javax.swing.JDialog jd_registroAlumno;
    private javax.swing.JDialog jd_registroDocente;
    private javax.swing.JTable jt_clases;
    private javax.swing.JTable jt_proyectos;
    private javax.swing.JPasswordField pf_contraseña;
    private javax.swing.JSpinner sp_aula;
    private javax.swing.JSpinner sp_año;
    private javax.swing.JSpinner sp_cant;
    private javax.swing.JSpinner sp_clasesImpartidas;
    private javax.swing.JSpinner sp_dificultad;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JSpinner sp_maxalumnos;
    private javax.swing.JSpinner sp_promedio;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_apellidoM;
    private javax.swing.JTextField tf_carrera;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_codigoCarrera;
    private javax.swing.JTextField tf_contraseña;
    private javax.swing.JTextField tf_contraseñaM;
    private javax.swing.JTextField tf_descripcion;
    private javax.swing.JTextField tf_duracion;
    private javax.swing.JTextField tf_facultadM;
    private javax.swing.JTextField tf_fecha;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombreClase;
    private javax.swing.JTextField tf_nombreM;
    private javax.swing.JTextField tf_numM;
    private javax.swing.JTextField tf_numRegistro;
    private javax.swing.JTextField tf_puntuacion;
    private javax.swing.JTextField tf_seccion;
    private javax.swing.JTextField tf_titulo;
    private javax.swing.JTextField tf_tituloP;
    private javax.swing.JTextField tf_tituloU;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JTextField tf_usuarioM;
    private javax.swing.JTextField tf_usuarioRegistro;
    // End of variables declaration//GEN-END:variables
    ArrayList<Usuario> usuarios = new ArrayList();
    ArrayList<Proyecto> proyectos = new ArrayList();
    ArrayList<Clase> clases = new ArrayList();
    
    int loged;
    
    public void guardarDocentes() throws IOException{
        FileWriter fw = new FileWriter("./Docentes.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i) instanceof Docente){
                bw.write(usuarios.get(i).getNombre()+",");
                bw.write(usuarios.get(i).getApellido()+",");
                bw.write(usuarios.get(i).getNumeroRegistro()+",");
                bw.write(usuarios.get(i).getUsuario()+",");
                bw.write(usuarios.get(i).getContraseña()+",");
                bw.write(((Docente)usuarios.get(i)).getTituloU()+",");
                bw.write(((Docente)usuarios.get(i)).getTituloP()+",");
                bw.write(((Docente)usuarios.get(i)).getClasesImpartidas());
            }
            bw.flush();
        }
        
        bw.close();
        fw.close();
        
    }
    
    public void guardarAlumnos() throws IOException{
        FileWriter fw = new FileWriter("./Alumnos.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i) instanceof Alumno){
                bw.write(usuarios.get(i).getNombre()+",");
                bw.write(usuarios.get(i).getApellido()+",");
                bw.write(usuarios.get(i).getNumeroRegistro()+",");
                bw.write(usuarios.get(i).getUsuario()+",");
                bw.write(usuarios.get(i).getContraseña()+",");
                bw.write(((Alumno)usuarios.get(i)).getID()+",");
                bw.write(((Alumno)usuarios.get(i)).getCarrera()+",");
                bw.write(((Alumno)usuarios.get(i)).getEdad()+",");
                bw.write(((Alumno)usuarios.get(i)).getAño()+",");
                bw.write((int) ((Alumno)usuarios.get(i)).getPromedio());
            }
            bw.flush();
        }
        
        bw.close();
        fw.close();
        
    }
    
    public void guardarProyectos() throws IOException{
        FileWriter fw = new FileWriter("./Proyectos.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (int i = 0; i < proyectos.size(); i++) {
            bw.write(proyectos.get(i).getTitulo()+",");
            bw.write(proyectos.get(i).getDescripcion()+",");
            bw.write(proyectos.get(i).getPuntuacion()+",");
            bw.write(proyectos.get(i).getDuración()+",");
            bw.write(proyectos.get(i).getFechaEntrega()+",");
            bw.write(proyectos.get(i).getDificultad()+",");
            bw.write(proyectos.get(i).getMaxParticipantes());
            bw.flush();
        }
        
        bw.close();
        fw.close();
        
    }
    
    public void guardarClases() throws IOException{
        FileWriter fw = new FileWriter("./Clases.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (int i = 0; i < clases.size(); i++) {
            bw.write(clases.get(i).getNombre()+",");
            bw.write(clases.get(i).getSeccion()+",");
            bw.write(clases.get(i).getCodigo()+",");
            bw.write(clases.get(i).getCodigoCarrera()+",");
            bw.write(clases.get(i).getMaxAlumnos()+",");
            bw.write(clases.get(i).getNumeroAula());
            
            bw.flush();
        }
        
        bw.close();
        fw.close();
        
    }
}
