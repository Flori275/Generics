package GenericsDetyra;

public class ushtKufi {

    public <E extends Number> void gjejShume(E num1,E num2){
        double Shuma = 0;
        Shuma = num1.doubleValue() + num2.doubleValue();
        System.out.println("Shuma eshte" + Shuma);

    }


}
