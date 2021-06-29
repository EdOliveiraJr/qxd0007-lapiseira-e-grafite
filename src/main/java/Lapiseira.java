public class Lapiseira {
    private float calibre;
    private Grafite grafite;
    private int folhasEscritas;
    private int podeSerEscritas;

    public Lapiseira(float calibre) {
        this.calibre = calibre;
    }

    public boolean inserir(Grafite grafite) {
        if(getGrafite() != null){
            return false;    
        }else{
            if(grafite.getCalibre() == this.calibre){
                this.grafite = grafite;
                folhasEscritas = 0;
                setPodeSerEscritas();
                return true;
            }else{
                return false;
            }
        }
    }

    public boolean remover() {
        if(getGrafite() == null){
            return false;
        }else{
            this.grafite = null;
            return true;
        }        
    }

    public boolean escrever(int folhas) {
        if(getGrafite() == null){
            return false;
        }else{
            if(podeSerEscritas > folhas){
                folhasEscritas += folhas;
                podeSerEscritas -= folhas;
                return true;
            }else if(podeSerEscritas < folhas){
                folhasEscritas += podeSerEscritas;
                remover();
                return false;
            }else{
                folhasEscritas += podeSerEscritas;
                remover();
                return true;
            }
        }
    }

    public Grafite getGrafite() {
        return grafite;
    }

    public float getCalibre() {
        return calibre;
    }

    public int getFolhasEscritas() {
        return folhasEscritas;
    }

    public void setPodeSerEscritas() {
        podeSerEscritas = grafite.getTamanho() / grafite.getDureza().getDesgastePorFolha();
    }

    public int getPodeSerEscritas() {
        return podeSerEscritas;    
    }
}
