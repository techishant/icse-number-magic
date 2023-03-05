package harshad_niven;
public class harshad{
    public static boolean checkHarshad(int n){
        int s = 0; int p = 1; int d;
        while(n>0){
            d = n%10;
            s+=d;
            p*=d;
            n = n/10;
        }
        if(s==p){
            return true;
        }else{
            return false;
        }
    }

    public static int[] list(int n){
        int out[] = new int[n];
        int k = 0;
        for(int i = 1; k<n; i++){
            if(checkHarshad(i)){
                out[k] = i;
                k++;
            }
        }
        return out;
    }
}