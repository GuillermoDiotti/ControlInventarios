package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaRegistrarDron extends javax.swing.JFrame implements Observer {

    public VentanaRegistrarDron(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        modelo.addObserver(this);
        definirTabla();
        agregarEnTablaDron();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ModeloDron = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDron = new javax.swing.JTable();
        IdentificacionDron = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TipoCamaraDron = new javax.swing.JTextField();
        AgregarDron = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dron");
        getContentPane().setLayout(null);

        jLabel3.setText("Identificación");

        jLabel4.setText("Modelo");

        TablaDron.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Modelo", "Tipo cámara"
            }
        ));
        jScrollPane1.setViewportView(TablaDron);

        jLabel5.setText("Tipo cámara");

        AgregarDron.setText("Agregar");
        AgregarDron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDronActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ModeloDron, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(TipoCamaraDron)
                            .addComponent(IdentificacionDron))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AgregarDron, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdentificacionDron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ModeloDron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TipoCamaraDron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(AgregarDron)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 920, 240);

        setBounds(0, 0, 939, 265);
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarDronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarDronActionPerformed
        //agregar un dron
        String identificacion = IdentificacionDron.getText();
        String modeloDron = ModeloDron.getText();
        String tipoCam = TipoCamaraDron.getText();
        
        if (!incompleto()) {
            if (modelo.identificacionDronRepetido(identificacion)) {
                JOptionPane.showMessageDialog(null, "Error: Identificacion dron repetido",
                        "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            } else if (modelo.esEntero(tipoCam, "Tipo Camara") && rango(Integer.parseInt(tipoCam), "Tipo Camara", 1, 6)) {
                Dron dron = new Dron(identificacion, modeloDron, Integer.parseInt(tipoCam));
                modelo.agregarDron(dron);
                modelo.agregarDronSinVuelos(dron);
                agregarEnTablaDron();
                vaciar();
            }
        }  
    }//GEN-LAST:event_AgregarDronActionPerformed

    public void definirTabla(){
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Identificacion");
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Tipo Camara");
        TablaDron.setModel(modeloTabla);
    }
    
    public boolean incompleto(){
        //si algun campo esta vacio, avisa
        boolean ok = false;
        if (IdentificacionDron.getText().equals("") || ModeloDron.getText().equals("") || TipoCamaraDron.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Error: Faltan datos por ingresar",
                    "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            ok = true;
        }
        return ok;
    }
    
    public void agregarEnTablaDron() {
        //agrega el dron creado en la tabla
        modelo.limpiarTabla(TablaDron);
        for (int i = 0; i < modelo.getListaDrones().size(); i++) {
            Dron dron = modelo.getListaDrones().get(i);
            agregarFila();
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        TablaDron.setValueAt(dron.getIdentificacionDron(), i, j);
                        break;
                    case 1:
                        TablaDron.setValueAt(dron.getModeloDron(), i, j);
                        break;
                    default:
                        TablaDron.setValueAt(dron.getTipoCamaraDron(), i, j);
                        break;
                }
            }
        }
    }

    public void agregarFila() {
        //agregar una fila a la tabla
        String fil[] = {"", "",""};
        modeloTabla.addRow(fil);
    }


    public void vaciar() {
        //vaciar los campor de texto
        IdentificacionDron.setText("");
        ModeloDron.setText("");
        TipoCamaraDron.setText("");
    }

    public boolean rango(int num, String elem, int min, int max) {
        //verifica que la variable se encuentre dentro del rango dado
        boolean ok = true;
        if (num < min || num > max) {
            JOptionPane.showMessageDialog(null, "Error: " + elem + " fuera de rango",
                    "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            ok = false;
        }
        return ok;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarDron;
    private javax.swing.JTextField IdentificacionDron;
    private javax.swing.JTextField ModeloDron;
    private javax.swing.JTable TablaDron;
    private javax.swing.JTextField TipoCamaraDron;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private DefaultTableModel modeloTabla;

    @Override
    public void update(Observable o, Object arg) {
        agregarEnTablaDron();
    }
}
