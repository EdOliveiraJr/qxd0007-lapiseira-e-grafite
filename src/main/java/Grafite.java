public class Grafite {
    private int tamanho;
    private Grafite.Dureza dureza;
    private float calibre;

    public enum Dureza {
        G_HB(1),
        G_2B(2),
        G_4B(4),
        G_6B(6);

        int desgastePorFolha;
        Dureza(int desgastePorFolha){
            this.desgastePorFolha = desgastePorFolha;
        }
        
        public int getDesgastePorFolha(){
            return desgastePorFolha;
        }
    
    }

    public Grafite(float calibre, Dureza dureza, int tamanho) {
        this.calibre = calibre;
        this.dureza = dureza;
        this.tamanho = tamanho;
    }

    public int desgastePorFolha() {
        return dureza.getDesgastePorFolha();
    }

    public Dureza getDureza() {
        return dureza;
    }

    public float getCalibre() {
        return calibre;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}

