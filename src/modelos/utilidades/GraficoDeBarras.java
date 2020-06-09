package modelos.utilidades;

import javax.swing.JFrame;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficoDeBarras extends JFrame {

    public GraficoDeBarras() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Estatistica de Emprestimos");
        setSize(950, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void estruturarGrafico() {
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
    }
}
