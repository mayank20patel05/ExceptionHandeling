package generics;

import java.util.Arrays;

public class MayankArray <T> {

    private T [] ar;

    public MayankArray() {
        this.ar = (T[]) new Object[5];
    }

    public void add(T el){
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == null){
                ar[i] = el;
                break;
            }
        }
    }

    public boolean contains(T el){
        for (T t : ar) {
            if (t == el) {
                return true;
            }
        }
        return false;
    }

    public void remove(T el){
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == el){
                ar[i] = null;
            }
        }
    }

    public void print(){
        System.out.println(Arrays.toString(ar));
    }

}
