package exerciciossaojudas;


public class ExercicioF4 {
    public class Partida {
    private int golsTimeA;
    private int golsTimeB;
    private int substituicaoTimeA;
    private int substituicaoTimeB;
    private float tempoDeJogo;
    private float acrescimo;
    
    public Partida (int gta, int gtb, int sta, int stb, float tdj, float acc){
        golsTimeA = gta;
        golsTimeB = gtb;
        substituicaoTimeA = sta;
        substituicaoTimeB = stb;
        tempoDeJogo = tdj;
        acrescimo = acc;
    }
            public int getGolsTimeA(){
                return golsTimeA;
            }
            
            public int getGolsTimeB(){
                return golsTimeB;
            }
            
            public int getSubstituicaoTimeA(){
                return substituicaoTimeA;
            }
            
            public int getSubstituicaoTimeB(){
                return substituicaoTimeB;
            }
            
            public float getTempoDeJogo(){
                return tempoDeJogo;
            }
            
            public float getAcrescimo(){
                return acrescimo;
            }
            
            public void setGolsTimeA (int golsTimeA){
                this.golsTimeA = golsTimeA;
            }
            
            public void setGolsTimeB (int golsTimeB){
                this.golsTimeB = golsTimeB;
            }
            
            public void setSubstituicaoTimeA (int substituicaoTimeA){
                this.substituicaoTimeA = substituicaoTimeA;
            }
            
            public void setSubstituicaoTimeB (int substituicaoTimeB){
                this.substituicaoTimeB = substituicaoTimeB;
            }
            
            public void setTempoDeJogo (float tempoDeJogo){
                this.tempoDeJogo = tempoDeJogo;
            }
            
            public void setAcrescimo (float acrescimo){
                this.acrescimo = acrescimo;
            }
    }
}

