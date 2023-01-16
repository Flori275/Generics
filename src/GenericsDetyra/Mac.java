package GenericsDetyra;

import java.util.List;

public class Mac <E>{



    private E proc;
    private E OS;

    public Mac (E proc, E os){
        this.proc = proc;
        this.OS = os;
    }

    public void ktheList(List<E> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public E getProc() {
        return proc;
    }

    public void setProc(E proc) {
        this.proc = proc;
    }

    public E getOS() {
        return OS;
    }

    public void setOS(E OS) {
        this.OS = OS;
    }
}



