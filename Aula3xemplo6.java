package aula3exemplo6;
import javax.swing.JOptionPane;
/**
 *
 * @author DarthRen
 */
public class Aula3xemplo6 {

    public static void main(String args[]) {
        String modelo;
        int quilometragem;
        float valor;
        modelo = JOptionPane.showInputDialog(null, "Digite o modelo do ve�culo: ");
        quilometragem = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quilometragem do ve�culo: "));
        valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do ve�culo em R$: "));
        JOptionPane.showMessageDialog(null, "Dados do ve�culo: \n Modelo: " + modelo + "\n Quilometragem: "
        + quilometragem + "km \n Valor em R$: " + valor);
    }
}
