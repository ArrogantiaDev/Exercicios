// Este é o exercicio A da lista 4 //

package exerciciossaojudas;


public class Jogador {
    
    private String nome;
    private int idade;
    private float peso;
    private char sexo;

    public Jogador(String n, int i, float p, char s) {
        nome = n;
        idade = i;
        peso = p;
        sexo = s;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public char getSexo() {
        return sexo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
