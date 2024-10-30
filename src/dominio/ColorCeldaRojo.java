package dominio;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;

public class ColorCeldaRojo extends JLabel implements TableCellRenderer {
    int Row;
    int Columns;

    public void setRow(int Row) {
        this.Row = Row;
    }

    public void setColumns(int Columns) {
        this.Columns = Columns;
    }

    public ColorCeldaRojo() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setBackground(Color.red);
        setForeground(Color.BLACK);
        return this;
    }
}