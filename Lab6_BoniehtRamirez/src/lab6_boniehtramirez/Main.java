package lab6_boniehtramirez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        jPanel4 = new javax.swing.JPanel();
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Proyecto", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Clases", jPanel2);

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
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Info Personal", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Alumnos", jPanel4);

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
            tf_nombreM.setText(usuarios.get(loged).getNombre());
            tf_apellidoM.setText(usuarios.get(loged).getApellido());
            tf_numM.setText(usuarios.get(loged).getNumeroRegistro());
            tf_usuarioM.setText(usuarios.get(loged).getUsuario());
            tf_contraseña.setText(usuarios.get(loged).getContraseña());
            tf_facultadM.setText(usuarios.get(loged).getFacultad());
            
            jDialog1.pack();
            jDialog1.setModal(true);
            jDialog1.setLocationRelativeTo(this);
            jDialog1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this,"Datos no válidos!");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        usuarios.get(loged).setNombre(tf_nombreM.getText());
        usuarios.get(loged).setApellido(tf_apellidoM.getText());
        usuarios.get(loged).setNumeroRegistro(tf_numM.getText());
        usuarios.get(loged).setUsuario(tf_usuarioM.getText());
        usuarios.get(loged).setContraseña(tf_contraseñaM.getText());
        usuarios.get(loged).setFacultad(tf_facultadM.getText());
        
        JOptionPane.showMessageDialog(jDialog1, "Información modificada!");
    }//GEN-LAST:event_jButton6MouseClicked

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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_registro;
    private javax.swing.JDialog jd_registroAlumno;
    private javax.swing.JDialog jd_registroDocente;
    private javax.swing.JPasswordField pf_contraseña;
    private javax.swing.JSpinner sp_año;
    private javax.swing.JSpinner sp_clasesImpartidas;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JSpinner sp_promedio;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_apellidoM;
    private javax.swing.JTextField tf_carrera;
    private javax.swing.JTextField tf_contraseña;
    private javax.swing.JTextField tf_contraseñaM;
    private javax.swing.JTextField tf_facultadM;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombreM;
    private javax.swing.JTextField tf_numM;
    private javax.swing.JTextField tf_numRegistro;
    private javax.swing.JTextField tf_tituloP;
    private javax.swing.JTextField tf_tituloU;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JTextField tf_usuarioM;
    private javax.swing.JTextField tf_usuarioRegistro;
    // End of variables declaration//GEN-END:variables
    ArrayList<Usuario> usuarios = new ArrayList();
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
}
