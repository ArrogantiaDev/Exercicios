package exerciciossaojudas;


public class ExercicioE4 {
    public class Jogador {
    private String jogador;
    private String time;
    private int cartaoAmarelo;
    private int cartaoVermelho;
    
    public Jogador (String j, String t, int cA, int cV){
        jogador = j;
        time = t;
        cartaoAmarelo = cA;
        cartaoVermelho = cV;
    }
    
    public String getJogador (){
        return jogador;
    }
    
    public String getTime (){
        return time;
    }
    
    public int getCartaoAmarelo (){
        return cartaoAmarelo;
    }
    
    public int getCartaoVermelho (){
        return cartaoVermelho;
    }
    
    public void setNome(String jogador) {
        this.jogador = jogador;
    }
    
    public void setTime (String time){
        this.time = time;
    }
    
    public void setCartaoAmarelo (int cartaoAmarelo){
        this.cartaoAmarelo = cartaoAmarelo;
    }
    
    public void setCartaoVermelho (int cartaoVermelho){
        this.cartaoVermelho = cartaoVermelho;
    }
  }
}
