package interfaz;

import dominio.*;
import java.util.*;

public class VentanaEstadisticas extends javax.swing.JFrame implements Observer {

    public VentanaEstadisticas(Sistema unSistema) {
        modelo = unSistema;
        initComponents();
        cargarSinVuelos();//ingresar drones sin vuelos a la lista
        cargarConVuelos();//ingresar drones con vuelos a la lista

        modelo.addObserver(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListInformacion = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        JListSinVuelos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JListConVuelos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VentEstadisticas");
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(JListInformacion);

        JListSinVuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListSinVuelosMouseClicked(evt);
            }
        });
        JListSinVuelos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JListSinVuelosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(JListSinVuelos);

        jLabel1.setText("Drones con Vuelos");

        jLabel2.setText("Drones sin Vuelos");

        jLabel3.setText("Información de Vuelos");

        JListConVuelos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "it" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JListConVuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListConVuelosMouseClicked(evt);
            }
        });
        JListConVuelos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JListConVuelosValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(JListConVuelos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(186, 186, 186))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel3)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 455);

        setBounds(0, 0, 775, 485);
    }// </editor-fold>//GEN-END:initComponents

    private void JListSinVuelosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JListSinVuelosValueChanged

    }//GEN-LAST:event_JListSinVuelosValueChanged

    private void JListConVuelosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JListConVuelosValueChanged

    }//GEN-LAST:event_JListConVuelosValueChanged

    private void JListConVuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListConVuelosMouseClicked
        cargarDetallesConVuelos();        
    }//GEN-LAST:event_JListConVuelosMouseClicked

    private void JListSinVuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListSinVuelosMouseClicked

    }//GEN-LAST:event_JListSinVuelosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JListConVuelos;
    private javax.swing.JList<String> JListInformacion;
    private javax.swing.JList<String> JListSinVuelos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;

    public void cargarSinVuelos() {
        //añadir drones sin vuelos a la lista
        String[] str = new String[modelo.getListaDronesSinVuelos().size()];
        for (int i = 0; i < modelo.getListaDronesSinVuelos().size(); i++) {
            Dron unDron = modelo.getListaDronesSinVuelos().get(i);
            str[i] = unDron.toString();
        }
        JListSinVuelos.setListData(str);

    }

    public void cargarConVuelos() {
        //añadir drones con vuelos a la lista
        String[] str = new String[modelo.getListaDronesConVuelos().size()];
        for (int i = 0; i < modelo.getListaDronesConVuelos().size(); i++) {
            Dron unDron = modelo.getListaDronesConVuelos().get(i);
            str[i] = unDron.toString();
        }
        JListConVuelos.setListData(str);
    }

    public void cargarDetallesConVuelos() {
        //ingresar detalles de vuelos de un respectivo dron al presionarlo

        int posicion = JListConVuelos.getSelectedIndex();
        System.out.println("pos "+posicion);
        if (posicion >= 0) {
            Dron unDron = modelo.getListaDronesConVuelos().get(posicion);
            ArrayList<String> aux = new ArrayList<>();
            for (int i = 0; i < modelo.getListaVueloDron().size(); i++) {
                System.out.println("i "+i);
                System.out.println("condicion "+ modelo.getListaVueloDron().get(i).getDron().equals(unDron));
                if (modelo.getListaVueloDron().get(i).getDron().equals(unDron)) {
                    
                    for (int j = 0; j < modelo.getListaVueloDron().get(i).getListaDetalles().size(); j++) {
                        System.out.println("j "+j);
                        String det = modelo.getListaVueloDron().get(i).getListaDetalles().get(j);
                        System.out.println("det "+det);
                        System.out.println("condicion2 "+ !aux.contains(det));
                        if (!aux.contains(det)) {
                            aux.add(det);
                        }
                    }
                }
            }

            String[] str = new String[aux.size()];
            System.out.println("largo "+str.length);
            for (int i = 0; i < str.length; i++) {
                System.out.println("i "+i);
                System.out.println("det "+ aux.get(i));
                str[i] = aux.get(i);

            }

            JListInformacion.setListData(str);
        }

    }

    @Override
    public void update(Observable o, Object arg) {
        cargarConVuelos();
        cargarSinVuelos();
        cargarDetallesConVuelos();
    }
}
