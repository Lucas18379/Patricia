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
public class NoF<T>
{
    private T item;
    private NoF prox;

    public NoF() {
    }
    public NoF(T item, NoF prox)
    {
        this.item=item;
        this.prox=prox;
    }

    public NoF(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public NoF getProx() {
        return prox;
    }

    public void setProx(NoF prox) {
        this.prox = prox;
    }
    
}
