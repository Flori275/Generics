package GenericsDetyra;

import java.util.ArrayList;
import java.util.List;

public class Dell <E> {

    private E Procesori;
    private E OS;

    public Dell(E Procesor, E OperatingSystem) {

        this.Procesori = Procesor;
        this.OS = OperatingSystem;
    }


    public void ktheList(List<E> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public E getProcesori() {
        return Procesori;
    }

    public void setProcesori(E procesori) {
        Procesori = procesori;
    }

    public E getOS() {
        return this.OS;
    }

    public void setOS(E OS) {
        this.OS = OS;
    }
}