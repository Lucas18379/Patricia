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

public class Fila<T> {
    
    private NoF inicio;
    
    public Fila(){
        inicio=null;
    }
 
    public void Enqueue(No info)
    {
        NoF novo = new NoF<>(info);
        if (isEmpty())
            inicio = novo;
        else {
            NoF aux = inicio;
            while (aux.getProx() != null)
                aux = aux.getProx();
            aux.setProx(novo);
        }
    }
    public T Dequeue()
    {
        if (isEmpty())
            return null;
        NoF aux = inicio;
        inicio = inicio.getProx();
        return (T)aux.getItem();
    }
    public boolean isEmpty()
    {
        return inicio == null;
    }
    
    public void exibe()
    {
       /* NoF aux = inicio;
       
        while(aux != null)
        {
            System.out.println("++"+aux.getItem().getInfo());
            aux = aux.getProx();
        }*/
    }
    
    
}


