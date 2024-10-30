package interfaz;

import dominio.*;
import javax.swing.*;
import javax.swing.table.*;

public class VentanaRegistrarVuelos extends javax.swing.JFrame {

    public VentanaRegistrarVuelos(Sistema unSistema) {
        traducir();
        initComponents();
        modelo = unSistema;
        PanelTabla.setVisible(false);
        alinear.setHorizontalAlignment(SwingConstants.CENTER);//centra los datos de la tabla
        definirTabla();//defina la tabla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FileChooser = new javax.swing.JFileChooser();
        PanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVuelos = new javax.swing.JTable();
        LabelCoincidencias = new javax.swing.JLabel();
        LabelDiferencias = new javax.swing.JLabel();
        LabelFila = new javax.swing.JLabel();
        LabelArea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Vuelo");
        getContentPane().setLayout(null);

        FileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserActionPerformed(evt);
            }
        });

        TablaVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "De", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaVuelos.setShowGrid(true);
        jScrollPane1.setViewportView(TablaVuelos);

        LabelCoincidencias.setText("Total coincidencias:");

        LabelDiferencias.setText("Total diferencias:");

        LabelFila.setText("Fila:");

        LabelArea.setText("Area: ");

        javax.swing.GroupLayout PanelTablaLayout = new javax.swing.GroupLayout(PanelTabla);
        PanelTabla.setLayout(PanelTablaLayout);
        PanelTablaLayout.setHorizontalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDiferencias)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelTablaLayout.createSequentialGroup()
                        .addComponent(LabelArea)
                        .addGap(42, 42, 42)
                        .addComponent(LabelFila))
                    .addComponent(LabelCoincidencias))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        PanelTablaLayout.setVerticalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTablaLayout.createSequentialGroup()
                .addGroup(PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelArea)
                    .addComponent(LabelFila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelCoincidencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelDiferencias)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1120, 500);

        setBounds(0, 0, 1137, 507);
    }// </editor-fold>//GEN-END:initComponents

    public void traducir(){
        //traduccion de elementos a español
        UIManager.put("FileChooser.lookInLabelText", "Mirar En:");
        UIManager.put("FileChooser.fileNameLabelText", "Archivo");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Tipo");
        UIManager.put("FileChooser.openButtonText", "Abrir");
        UIManager.put("FileChooser.openButtonToolTipText", "Abrir");
        UIManager.put("FileChooser.cancelButtonText", "Cancelar");
        UIManager.put("FileChooser.cancelButtonToolTipText", "Cancelar");
        UIManager.put("FileChooser.newFolderToolTipText", "Crear carpeta");
        UIManager.put("FileChooser.newFolderButtonText", "Crear carpeta");
        UIManager.put("FileChooser.renameFileButtonText", "Renombrar archivo");
        UIManager.put("FileChooser.deleteFileButtonText", "Eliminar archivo");
        UIManager.put("FileChooser.detailsViewButtonToolTipText", "Detalles");
        UIManager.put("FileChooser.homeFolderToolTipText", "Escritorio");
        UIManager.put("FileChooser.listViewButtonToolTipText", "Lista");
    }
    
    public void definirTabla() {
        modeloTabla = new DefaultTableModel();
        TablaVuelos.setModel(modeloTabla);
        modeloTabla.addColumn("De");
        for (int i = 1; i <= 10; i++) {
            modeloTabla.addColumn(1 + "");
        }
        String[] str1 = {"", "", "", "", "", "", "", "", "", "", ""};
        String[] str2 = {"", "", "", "", "", "", "", "", "", "", ""};
        modeloTabla.addRow(str1);
        modeloTabla.addRow(str2);

    }

    public int posArea(String letra) {
        //calcular posicion del area dentro de un array
        int pos = -1;
        String areas[] = {"A", "B", "C", "D", "E"};
        for (int i = 0; i < areas.length; i++) {
            if (areas[i].equals(letra)) {
                pos = i;
            }
        }
        return pos;
    }


    private void FileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserActionPerformed
        //agregar un vuelo de un archivo
        try {
            String direccion = FileChooser.getSelectedFile().getPath();
            System.out.println(direccion);   
            if (direccion != null) {
                ArchivoLectura lectura = new ArchivoLectura(direccion);

                lectura.hayMasLineas();
                String id = lectura.linea();

                if (identificarDron(id) == null) {
                    JOptionPane.showMessageDialog(null, "El Dron ingresado en el archivo no existe",
                            "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                } else {
                    Dron dron = identificarDron(id);
                    String nombreArchivo = nombreArchivo(direccion);

                    lectura.hayMasLineas();
                    String[] partes = lectura.linea().split("#");
                    String area = partes[0];
                    int posArea = posArea(area);
                    int fila = (Integer.parseInt(partes[1]) - 1);

                    int[] manual = new int[10];
                    for (int i = 0; i < 10; i++) {
                        Carga carga = modelo.getListaCargas().get(posArea)[fila][i];
                        if (carga != null) {
                            manual[i] = carga.getCodigo();
                        }
                    }
                    int archivo[] = new int[10];
                    int veces = 0;
                    boolean vuelos[] = new boolean[10];
                    while (lectura.hayMasLineas()) {
                        int codigo = Integer.parseInt(lectura.linea());
                        archivo[veces] = codigo;
                        vuelos[veces] = true;
                        veces++;
                    }
                    if (veces == 10) {
                        if (esExitoso(vuelos)) {
                            PanelTabla.setVisible(true);
                            Coincidencias(archivo, manual);
                            LabelArea.setText("Area: " + area);
                            LabelFila.setText("Fila: " + fila);
                            filaManual(manual);
                            filaArchivo(archivo);
                            alinearTabla();
                            pintarTabla();
                            LabelCoincidencias.setText("Total Coincidencias: " + Coincidencias(archivo, manual));
                            LabelDiferencias.setText("Total Diferencias: " + (10 - Coincidencias(archivo, manual)));

                            if (noEsta(id)) {
                                modelo.agregarDronConVuelos(identificarDron(id));
                                modelo.agregarVueloNuevo(new Vuelos(dron, (nombreArchivo + " - Area: " + area + ", Fila: " + fila + " , " + LabelCoincidencias.getText() + " , " + LabelDiferencias.getText())));
                            } else {
                                modelo.agregarVueloExistente(new Vuelos(dron, (nombreArchivo + " - Area: " + area + ", Fila: " + fila + " , " + LabelCoincidencias.getText() + " , " + LabelDiferencias.getText())));
                            }

                        } else {
                            PanelTabla.setVisible(false);
                            JOptionPane.showMessageDialog(null, "Vuelo no exitoso",
                                    "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);

                            if (noEsta(id)) {
                                modelo.agregarDronConVuelos(identificarDron(id));
                                modelo.agregarVueloNuevo(new Vuelos(dron, (nombreArchivo + " - Area: " + area + ", Fila: " + fila + ", Lineas de Carga: " + veces)));
                            } else {
                                modelo.agregarVueloExistente(new Vuelos(dron, (nombreArchivo + " - Area: " + area + ", Fila: " + fila + ", Lineas de Carga: " + veces)));
                            }
                        }
                    } else {
                        PanelTabla.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Vuelo no exitoso",
                                "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                        JOptionPane.showMessageDialog(null, "El archivo tiene " + veces + " lineas de carga",
                                "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);

                        if (noEsta(id)) {
                            modelo.agregarDronConVuelos(identificarDron(id));
                            modelo.agregarVueloNuevo(new Vuelos(dron, (nombreArchivo + " - Area: " + area + ", Fila: " + fila + ", Lineas de Carga: " + veces)));
                        } else {
                            modelo.agregarVueloExistente(new Vuelos(dron, (nombreArchivo + " - Area: " + area + ", Fila: " + fila + ", Lineas de Carga: " + veces)));
                        }
                    }

                    lectura.cerrar();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo",
                    "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            dispose();
        }
    }//GEN-LAST:event_FileChooserActionPerformed

    public String nombreArchivo(String direccion) {
        //ver el nombre del archivo en base a su ubicacion
        String nombre = "";
        String aux = "a\\a";
        boolean bool = true;
        for (int i = direccion.length() - 1; i >= 0 && bool; i--) {
            if ((direccion.charAt(i) + "").equals(aux.charAt(1) + "")) {
                nombre = direccion.substring(i + 1, direccion.length()).toUpperCase();
                bool = false;
            }
        }
        return nombre;
    }

    public void pintarTabla() {
        //pintar tabla en rojo o verde
        ColorCeldaRojo TableCellRenderer1 = new ColorCeldaRojo();
        ColorCeldaVerde TableCellRenderer2 = new ColorCeldaVerde();
        for (int i = 1; i <= 10; i++) {
            int cel1 = Integer.parseInt(modeloTabla.getValueAt(0, i) + "");
            int cel2 = Integer.parseInt(modeloTabla.getValueAt(1, i) + "");
            if (cel1 != cel2) {
                TableColumn columna = TablaVuelos.getColumnModel().getColumn(i);
                TableCellRenderer1.setColumns(1);
                TableCellRenderer1.setRow(0);
                columna.setCellRenderer(TableCellRenderer1);
            } else {
                TableColumn columna = TablaVuelos.getColumnModel().getColumn(i);
                TableCellRenderer2.setColumns(1);
                TableCellRenderer2.setRow(0);
                columna.setCellRenderer(TableCellRenderer2);
            }
        }
    }

    public boolean noEsta(String id) {
        //ver si es dron ya se encuentra en la lista
        boolean NoEsta = true;
        for (int i = 0; i < modelo.getListaDronesConVuelos().size() && NoEsta; i++) {
            if (modelo.getListaDronesConVuelos().get(i).getIdentificacionDron().equals(id)) {
                NoEsta = false;
            }
        }
        return NoEsta;
    }

    public Dron identificarDron(String id) {
        //identificar el dron en base a su id
        Dron unDron = null;
        for (int i = 0; i < modelo.getListaDrones().size(); i++) {
            if (modelo.getListaDrones().get(i).getIdentificacionDron().equals(id)) {
                unDron = modelo.getListaDrones().get(i);
            }
        }
        return unDron;
    }

    public boolean esExitoso(boolean vuelos[]) {
        //verificar si el dron recorre todos los espacios de una fila
        boolean ok = true;
        for (int i = 0; i < 10 && ok; i++) {
            if (vuelos[i] == false) {
                ok = false;
            }
        }
        return ok;
    }

    public int Coincidencias(int archivo[], int manual[]) {
        //ver cuantas coincidencias y diferencias hay
        int coincidencias = 0;
        for (int i = 0; i < 10; i++) {
            if (archivo[i] == manual[i]) {
                coincidencias++;
            }
        }
        return coincidencias;
    }

    public void filaManual(int[] manual) {
        //añadir la fila a la tabla
        TablaVuelos.setValueAt("MANUAL", 0, 0);
        for (int i = 1; i <= 10; i++) {
            TablaVuelos.setValueAt(manual[i - 1], 0, i);
        }
    }

    public void filaArchivo(int[] archivo) {
        //añadir la fila a la tabla
        TablaVuelos.setValueAt("ARCHIVO", 1, 0);
        for (int i = 1; i <= 10; i++) {
            TablaVuelos.setValueAt(archivo[i - 1], 1, i);
        }
    }

    public void alinearTabla() {
        //centrar tabla
        for (int i = 0; i < 11; i++) {
            TablaVuelos.getColumnModel().getColumn(i).setCellRenderer(alinear);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JLabel LabelArea;
    private javax.swing.JLabel LabelCoincidencias;
    private javax.swing.JLabel LabelDiferencias;
    private javax.swing.JLabel LabelFila;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JTable TablaVuelos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
    private DefaultTableModel modeloTabla;
}
