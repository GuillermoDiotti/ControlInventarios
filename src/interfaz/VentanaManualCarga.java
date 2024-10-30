package interfaz;

import java.awt.*;
import dominio.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

public class VentanaManualCarga extends javax.swing.JFrame implements Observer {

    public VentanaManualCarga(Sistema unSistema) {
        modelo = unSistema;
        initComponents();
        agregarPanelEspacios();//agregar botones 12x10
        cargarFuncionarios();//agregar funcionarios a la lista
        cargarArticulos();//agregar articulos a la lista
        pintarBotones();//pintar botones
        PanelEgreso.setVisible(false);
        modelo.addObserver(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEspacios = new javax.swing.JPanel();
        PanelEgreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EgresarCarga = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EgresoCod = new javax.swing.JLabel();
        EgresoArt = new javax.swing.JLabel();
        EgresoCant = new javax.swing.JLabel();
        EgresoFunc = new javax.swing.JLabel();
        Decrementar = new javax.swing.JButton();
        Incrementar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Area = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PanelIngreso = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ArticulosCarga = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        FuncionariosCarga = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CantCarga = new javax.swing.JTextField();
        CodCarga = new javax.swing.JTextField();
        IngresarCarga = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso/Egreso de Carga");
        getContentPane().setLayout(null);

        panelEspacios.setBackground(new java.awt.Color(153, 255, 204));
        panelEspacios.setLayout(new java.awt.GridLayout(12, 10));
        getContentPane().add(panelEspacios);
        panelEspacios.setBounds(20, 90, 620, 430);

        PanelEgreso.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setText("Egreso");

        EgresarCarga.setText("Egresar");
        EgresarCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EgresarCargaActionPerformed(evt);
            }
        });

        jLabel2.setText("Código");

        jLabel3.setText("Artículo");

        jLabel4.setText("Cantidad");

        jLabel5.setText("Funcionario");

        EgresoCod.setText(" ");

        EgresoArt.setText(" ");

        EgresoCant.setText(" ");

        EgresoFunc.setText(" ");

        javax.swing.GroupLayout PanelEgresoLayout = new javax.swing.GroupLayout(PanelEgreso);
        PanelEgreso.setLayout(PanelEgresoLayout);
        PanelEgresoLayout.setHorizontalGroup(
            PanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEgresoLayout.createSequentialGroup()
                .addGroup(PanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEgresoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(PanelEgresoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(PanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5))
                        .addGroup(PanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEgresoLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(PanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EgresoArt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EgresoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEgresoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EgresoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EgresoCant, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEgresoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EgresarCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        PanelEgresoLayout.setVerticalGroup(
            PanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEgresoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EgresoCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EgresoArt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EgresoCant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EgresoFunc)
                    .addComponent(jLabel5))
                .addGap(51, 51, 51)
                .addComponent(EgresarCarga)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getContentPane().add(PanelEgreso);
        PanelEgreso.setBounds(650, 450, 520, 300);

        Decrementar.setText("<<");
        Decrementar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecrementarActionPerformed(evt);
            }
        });
        getContentPane().add(Decrementar);
        Decrementar.setBounds(30, 560, 100, 23);

        Incrementar.setText(">>");
        Incrementar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncrementarActionPerformed(evt);
            }
        });
        getContentPane().add(Incrementar);
        Incrementar.setBounds(520, 560, 100, 23);

        jLabel6.setText("Area: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 30, 40, 16);

        Area.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Area.setText("A");
        getContentPane().add(Area);
        Area.setBounds(60, 30, 30, 16);

        jLabel8.setText("1            2              3              4               5              6              7               8              9            10");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 70, 490, 16);

        PanelIngreso.setBackground(new java.awt.Color(0, 255, 102));

        jLabel7.setText("Ingreso");

        jLabel10.setText("Funcionarios");

        jLabel11.setText("Articulos");

        ArticulosCarga.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ArticulosCarga);

        FuncionariosCarga.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(FuncionariosCarga);

        jLabel12.setText("Cantidad");

        jLabel13.setText("Codigo");

        IngresarCarga.setText("Ingresar");
        IngresarCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarCargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelIngresoLayout = new javax.swing.GroupLayout(PanelIngreso);
        PanelIngreso.setLayout(PanelIngresoLayout);
        PanelIngresoLayout.setHorizontalGroup(
            PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIngresoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelIngresoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelIngresoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(CantCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CodCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 24, Short.MAX_VALUE))
                            .addGroup(PanelIngresoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(IngresarCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel7))
                .addContainerGap())
        );
        PanelIngresoLayout.setVerticalGroup(
            PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIngresoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10))
                .addGroup(PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelIngresoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelIngresoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CantCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CodCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IngresarCarga)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        getContentPane().add(PanelIngreso);
        PanelIngreso.setBounds(650, 130, 520, 300);

        jLabel14.setText("12");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 430, 20, 16);

        jLabel16.setText("2");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 130, 10, 16);

        jLabel15.setText("1");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 100, 10, 16);

        jLabel17.setText("3");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 160, 10, 16);

        jLabel18.setText("4");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 190, 10, 16);

        jLabel19.setText("5");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(0, 220, 10, 16);

        jLabel20.setText("6");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(0, 250, 10, 16);

        jLabel21.setText("7");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(0, 280, 10, 16);

        jLabel22.setText("8");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(0, 310, 10, 16);

        jLabel23.setText("9");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(0, 340, 10, 16);

        jLabel24.setText("10");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(0, 370, 20, 16);

        jLabel25.setText("11");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(0, 400, 20, 16);

        setBounds(0, 0, 1194, 766);
    }// </editor-fold>//GEN-END:initComponents

    private void DecrementarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecrementarActionPerformed
        //cambiar el area
        String areas[] = {"A", "B", "C", "D", "E"};
        if (posArea() != 0) {
            Area.setText(areas[posArea() - 1]);
        }
        pintarBotones();
    }//GEN-LAST:event_DecrementarActionPerformed

    private void IncrementarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncrementarActionPerformed
        //cammbiar el area
        String areas[] = {"A", "B", "C", "D", "E"};
        if (posArea() != areas.length - 1) {
            Area.setText(areas[posArea() + 1]);
        }
        pintarBotones();
    }//GEN-LAST:event_IncrementarActionPerformed

    private void EgresarCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EgresarCargaActionPerformed
        //eliminar carga de una posicion
        modelo.getListaCargas().get(posArea())[getFila(presionado)][getColumna(presionado)] = null;
        egresoNotVisible();
        pintarBotones();
    }//GEN-LAST:event_EgresarCargaActionPerformed

    private void IngresarCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarCargaActionPerformed
        //Ingresar carga nueva
        if (presionado != null) {
            int fila = getFila(presionado);
            int columna = getColumna(presionado);
            int area = posArea();
            String cant = CantCarga.getText();
            if (modelo.esEntero(cant, "Cantidad de carga")) {
                String codigo = CodCarga.getText();
                if (modelo.esEntero(codigo, "Codigo")) {
                    if (modelo.codCargaRepetido(area, Integer.parseInt(codigo))) {
                        JOptionPane.showMessageDialog(null, "Error: codigo de carga repetido",
                                "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                    } else {
                        int posFunc = FuncionariosCarga.getSelectedIndex();
                        int posArt = ArticulosCarga.getSelectedIndex();
                        Funcionario func = modelo.getListaFuncionarios().get(posFunc);
                        Articulo art = modelo.getListaArticulos().get(posArt);

                        modelo.getListaCargas().get(posArea())[fila][columna] = new Carga(Integer.parseInt(codigo), art, Integer.parseInt(cant), func);
                        pintarBotones();
                        actualizar();
                    }

                }
            }
            if (modelo.getListaCargas().get(posArea())[getFila(presionado)][getColumna(presionado)] != null) {
                egresoVisible(presionado);
            } else {
                egresoNotVisible();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No has seleccionado nada aun",
                    "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_IngresarCargaActionPerformed

    public int posArea() {
        //calcular posicion del area dentro de un array
        String areas[] = {"A", "B", "C", "D", "E"};
        String letra = Area.getText();
        int pos = 0;
        for (int i = 0; i < areas.length; i++) {
            if (areas[i].equals(letra)) {
                pos = i;
            }
        }
        return pos;
    }

    public void agregarPanelEspacios() {
        int cont = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                
                JButton nuevo = new JButton(" ");
                nuevo.setBorder(new BotonRedondo(17));
                nuevo.setMargin(new Insets(-5, -5, -5, -5));
                nuevo.setBackground(Color.lightGray);
                nuevo.setForeground(Color.WHITE);
                nuevo.setText((i + 1) + ": " + (j + 1));
                nuevo.setFont(new Font("Arial", Font.BOLD, 9));
                nuevo.addActionListener(new EspacioListener());
                panelEspacios.add(nuevo);
                matrizBotones[i][j] = nuevo;

            }
        }
    }

    private class EspacioListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //accion del boton al presionarlo
            pintarBotones();
            JButton cual = ((JButton) e.getSource());
            presionado = cual;
            cual.setBackground(Color.RED);
            if (modelo.getListaCargas().get(posArea())[getFila(cual)][getColumna(cual)] != null) {
                egresoVisible(cual);
            } else {
                egresoNotVisible();
            }
        }
    }

    public void egresoNotVisible() {
        //no hay carga en esa posicion
        PanelEgreso.setVisible(false);
        PanelIngreso.setVisible(true);
        PanelIngreso.setBounds(650, 130, 520, 300);
        PanelEgreso.setBounds(650, 450, 520, 300);
    }

    public void egresoVisible(JButton cual) {
        //hay carga en esa posicion, se muestra
        PanelEgreso.setVisible(true);
        PanelIngreso.setVisible(false);
        PanelEgreso.setBounds(650, 130, 520, 300);
        PanelIngreso.setBounds(650, 450, 520, 300);
        EgresoCod.setText(modelo.getListaCargas().get(posArea())[getFila(cual)][getColumna(cual)].getCodigo() + "");
        EgresoArt.setText(modelo.getListaCargas().get(posArea())[getFila(cual)][getColumna(cual)].getArticulo() + "");
        EgresoCant.setText(modelo.getListaCargas().get(posArea())[getFila(cual)][getColumna(cual)].getCantidad() + "");
        EgresoFunc.setText(modelo.getListaCargas().get(posArea())[getFila(cual)][getColumna(cual)].getFuncionario() + "");
    }

    public void actualizar() {
        //resetear campos de texto
        CodCarga.setText("");
        CantCarga.setText("");
    }

    public int getFila(JButton cual) {
        //identificar fila del boton

        String var = cual.getText();
        int cota = var.indexOf(":");
        String fila = var.substring(0, cota);
        return Integer.parseInt(fila) - 1;

    }

    public int getColumna(JButton cual) {
        //identificar columna del boton
        String var = cual.getText();
        int cota = var.indexOf(":");
        String col = var.substring(cota + 2, var.length());
        return Integer.parseInt(col) - 1;
    }

    public void cargarFuncionarios() {
        //ingresar funcionarios en la lista
        String[] str = new String[modelo.getListaFuncionarios().size()];
        for (int i = 0; i < modelo.getListaFuncionarios().size(); i++) {
            Funcionario func = modelo.getListaFuncionarios().get(i);
            str[i] = func.getNombreFuncionario();
        }
        FuncionariosCarga.setListData(str);
    }

    public void cargarArticulos() {
        //ingresar articulos en la lista
        String[] str = new String[modelo.getListaArticulos().size()];
        for (int i = 0; i < modelo.getListaArticulos().size(); i++) {
            Articulo art = modelo.getListaArticulos().get(i);
            str[i] = art.getNombreArticulo();
        }
        ArticulosCarga.setListData(str);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Area;
    private javax.swing.JList<String> ArticulosCarga;
    private javax.swing.JTextField CantCarga;
    private javax.swing.JTextField CodCarga;
    private javax.swing.JButton Decrementar;
    private javax.swing.JButton EgresarCarga;
    private javax.swing.JLabel EgresoArt;
    private javax.swing.JLabel EgresoCant;
    private javax.swing.JLabel EgresoCod;
    private javax.swing.JLabel EgresoFunc;
    private javax.swing.JList<String> FuncionariosCarga;
    private javax.swing.JButton Incrementar;
    private javax.swing.JButton IngresarCarga;
    private javax.swing.JPanel PanelEgreso;
    private javax.swing.JPanel PanelIngreso;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panelEspacios;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;//variable sistema para poder usarla en cualquier funcion
    private JButton presionado; //variable del boton presionado para poder usarlo en cualquier funcion
    private JButton[][] matrizBotones = new JButton[12][10];//matriz de botones, indica si un casillero está vacío o no

    public void pintarBotones() {

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                matrizBotones[i][j].setBackground(Color.lightGray);
            }
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                if (modelo.getListaCargas().get(posArea())[i][j] != null) {
                    matrizBotones[i][j].setBackground(Color.BLUE);
                }
            }
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        cargarFuncionarios();
        cargarArticulos();
        pintarBotones();
    }
}
