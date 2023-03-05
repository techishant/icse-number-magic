package harshad_niven;

public class Main {
    public static void main(String[] args){
        System.out.println("Entered");
        int[] k = harshad.list(100);
        System.out.println(k);
        for(int i = 0; i<k.length; i++){
            System.out.println(Integer.toBinaryString(k[i]));
        }
    }
}
