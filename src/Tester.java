public class Tester {
    public Tester(){
    }

    public static void main(String[] args){

        int k1 = 0; //num1
        int k2 = k1 + 1; //num2
        int k3; //final num3

        for(int i = 0;i < 10; ++i){
            k3 = k1 + k2;

            System.out.print(k3 + " "); //print

            k1 = k2;   //increase numbers before loop restarts
            k2 = k3;
            
        }

    }

}
