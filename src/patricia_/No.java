package patricia_;

public class No
{
    boolean isfinal;
    StringBuilder[] vpalavra = new StringBuilder[26]; //stringbuilder pq é muito melhor pra manipular string
    No[] vlig = new No[26]; // não deixei como private pois estava dando problema na hora de usar o get com as posições.
    
    public No[] getVlig() {
        return vlig;
    }

    public void setVlig(No[] vlig) {
        this.vlig = vlig;
    }

    public StringBuilder[] getVpalavra() {
        return vpalavra;
    }

    public void setVpalavra(StringBuilder[] vpalavra) {
        this.vpalavra = vpalavra;
    }

    public boolean isIsfinal() {
        return isfinal;
    }

    public void setIsfinal(boolean isfinal) {
        this.isfinal = isfinal;
    }


    public No(boolean isfinal)
    {
        this.isfinal = isfinal;
    }
    
    
    

}
