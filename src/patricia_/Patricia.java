/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patricia_;

/**
 *
 * @author Lucas
 */
public class Patricia
{
    private final No raiz = new No(false);
    private char charinicio='a';
 
    public Patricia()
    {}
 
    private StringBuilder copiarpalavra(CharSequence str, int pos)
    {
        StringBuilder resultado = new StringBuilder(100);       
        while (pos != str.length()) {
            resultado.append(str.charAt(pos++));
        }
         
        return resultado;
    }
 
    public void inserir(String palavra) {
        No aux = raiz;
        int i = 0;
 
        while (i < palavra.length() && aux.getVpalavra()[palavra.charAt(i) - charinicio] != null)
        {
            int pos = palavra.charAt(i) - charinicio, j = 0;
            StringBuilder tag = aux.getVpalavra()[pos];
 
            while (j < tag.length() && i < palavra.length() && tag.charAt(j) == palavra.charAt(i))
            {
                ++i;
                ++j;
            }
 
            if (j == tag.length())
            {
                aux = aux.vlig[pos];
            } 
            else
            {
                if (i == palavra.length())
                {   
                    No ligexistente = aux.vlig[pos];
                    No novalig = new No(true);
                    StringBuilder pRestante = copiarpalavra(tag, j);                    
                    tag.setLength(j);
                    aux.vlig[pos] = novalig;
                    novalig.vlig[pRestante.charAt(0) - charinicio] = ligexistente;
                    novalig.vpalavra[pRestante.charAt(0) - charinicio] = pRestante;
                } 
                else
                {   
                    StringBuilder resto = copiarpalavra(tag, j);
                    No novalig = new No(false);
                    StringBuilder restopalavra = copiarpalavra(palavra, i);
                    No temp = aux.vlig[pos];
                     
                    tag.setLength(j);
                    aux.vlig[pos] = novalig;
                    novalig.vpalavra[resto.charAt(0) - charinicio] = resto;
                    novalig.vlig[resto.charAt(0) - charinicio] = temp;
                    novalig.vpalavra[restopalavra.charAt(0) - charinicio] = restopalavra;
                    novalig.vlig[restopalavra.charAt(0) - charinicio] = new No(true);
                }
 
                return; //desculpa chico
            }
        }
 
        if (i < palavra.length())
        {   
            aux.vpalavra[palavra.charAt(i) - charinicio] = copiarpalavra(palavra, i);
            aux.vlig[palavra.charAt(i) - charinicio] = new No(true);
        } 
        else
        {
            aux.isfinal = true;
        }
    }
     
    
    public void niveis()
    {
        Fila<No> f = new Fila();
        f.Enqueue(raiz);
        No aux =null;
        while(!f.isEmpty())
        {
            aux=f.Dequeue();
            for (int i = 0; i < aux.vpalavra.length; ++i)
            if (aux.vpalavra[i] != null)
            {
                System.out.print(aux.vpalavra[i]+" ");
            }
            System.out.println();
             for (int i = 0; i < aux.vlig.length; ++i)
            {
                if(aux.vlig[i]!=null)
                {
                    f.Enqueue(aux.vlig[i]);
                }
            }
        }               
    }
   
    public void exibir()
    {
        exibirno(raiz, new StringBuilder());
    }
 
    private void exibirno(No no, StringBuilder str)
    {
        if (no.isfinal)
        {
            System.out.println(str);
        }
 
        for (int i = 0; i < no.vpalavra.length; ++i)
        {
            if (no.vpalavra[i] != null)
            {
                int length = str.length();
 
                str = str.append(no.vpalavra[i]);
                exibirno(no.vlig[i], str);
                str = str.delete(length, str.length());
            }
        }
    }   
    

}
