package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaRegistrarFuncionario extends javax.swing.JFrame implements Observer{

    public VentanaRegistrarFuncionario(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        modelo.addObserver(this);
        definirTabla();
        agregarEnTablaFuncionario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EdadFuncionario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaFuncionario = new javax.swing.JTable();
        NombreFuncionario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NumeroFuncionario = new javax.swing.JTextField();
        AgregarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionarios");
        getContentPane().setLayout(null);

        jLabel3.setText("Nombre:");

        jLabel4.setText("Edad");

        TablaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Edad", "Numero"
            }
        ));
        jScrollPane1.setViewportView(TablaFuncionario);

        jLabel5.setText("Numero");

        AgregarFuncionario.setText("Agregar");
        AgregarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdadFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AgregarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NombreFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(EdadFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(NumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AgregarFuncionario))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 858, 240);

        setBounds(0, 0, 871, 247);
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarFuncionarioActionPerformed
        //agrega un funcioanrio
        String nombre = NombreFuncionario.getText();
        String edad = EdadFuncionario.getText();
        String numero = NumeroFuncionario.getText();
        
        if (!incompleto()){
            if (modelo.esEntero(numero, "Numero de Funcionario")) {
                if (modelo.numFuncionarioRepetido(Integer.parseInt(numero))) {
                    JOptionPane.showMessageDialog(null, "Error: Numero Funcionario repetido",
                            "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                } else if (modelo.esEntero(edad, "Edad") && rango(Integer.parseInt(edad), "Edad", 18, 99)) {
                    Funcionario funcionario = new Funcionario(nombre, Integer.parseInt(edad), Integer.parseInt(numero));
                    modelo.agregarFuncionario(funcionario);
                    agregarEnTablaFuncionario();
                    vaciar();
                }
            }
        }
    }//GEN-LAST:event_AgregarFuncionarioActionPerformed

    public void definirTabla(){
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Numero");
        TablaFuncionario.setModel(modeloTabla);
    }
    
    public boolean incompleto(){
        //si algun campo esta vacio, avisa
        boolean ok = false;
        if (NombreFuncionario.getText().equals("") || EdadFuncionario.getText().equals("") || NumeroFuncionario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Error: Faltan datos por ingresar",
                    "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            ok = true;
        }
        return ok;
    }
    
    public void agregarEnTablaFuncionario() {
        //agrega el funcionario creado a la tabla
        modelo.limpiarTabla(TablaFuncionario);
        for (int i = 0; i < modelo.getListaFuncionarios().size(); i++) {
            Funcionario func = modelo.getListaFuncionarios().get(i);
            agregarFila();
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        TablaFuncionario.setValueAt(func.getNombreFuncionario(), i, j);
                        break;
                    case 1:
                        TablaFuncionario.setValueAt(func.getEdadFuncionario(), i, j);
                        break;
                    default:
                        TablaFuncionario.setValueAt(func.getNumFuncionario(), i, j);
                        break;
                }
            }
        }
    }

    public void agregarFila() {
        //añade una fila a la tabla
        String fil[] = {"", "",""};
        modeloTabla.addRow(fil);
    }

    public void vaciar() {
        //vacia lo campos de texto
        NombreFuncionario.setText("");
        EdadFuncionario.setText("");
        NumeroFuncionario.setText("");
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
    private javax.swing.JButton AgregarFuncionario;
    private javax.swing.JTextField EdadFuncionario;
    private javax.swing.JTextField NombreFuncionario;
    private javax.swing.JTextField NumeroFuncionario;
    private javax.swing.JTable TablaFuncionario;
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
        agregarEnTablaFuncionario();
    }

}
