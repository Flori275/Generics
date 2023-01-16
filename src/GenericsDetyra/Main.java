package GenericsDetyra;
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){

        Dell pc1 = new Dell(2,"Flori");
        Dell pc2 = new Dell (3,"Flori2");

        List<Dell> kompjuteraDell = new ArrayList<>();
        kompjuteraDell.add(pc1);
        kompjuteraDell.add(pc2);
        for(Dell list1 : kompjuteraDell){
            System.out.println(list1.getProcesori());
        }

        Mac pc3 = new Mac (6,"Mac1");
        Mac pc4 = new Mac (8,"Mac2");

        List<Mac> kompjuteraMac = new ArrayList<>();
        kompjuteraMac.add(pc3);
        kompjuteraMac.add(pc4);
        for(Mac list2 : kompjuteraMac){
            System.out.println(list2.getOS());
        }
        klaseGen usht2 = new klaseGen();
        usht2.printMSG("Flori");
        usht2.printMSG(3);

        ushtKufi objekt1 = new ushtKufi();
        objekt1.gjejShume(15,22);


    }
}
