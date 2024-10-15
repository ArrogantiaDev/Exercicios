package exerciciossaojudas;
import javax.swing.JOptionPane;


public class MetodoDeTesteA {
  public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual o nome?");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade?"));
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Qual o peso?")); 
        char sexo = JOptionPane.showInputDialog("Qual o sexo: M/F?").charAt(0);

        Jogador jogador = new Jogador(nome, idade, peso, sexo);

        String msg = "Nome: " + jogador.getNome() + "\nIdade: " + jogador.getIdade() + " anos" +
                     "\nPeso: " + jogador.getPeso() + " Kg" +
                     "\nSexo: " + jogador.getSexo();

        JOptionPane.showMessageDialog(null, msg);
    }
}
