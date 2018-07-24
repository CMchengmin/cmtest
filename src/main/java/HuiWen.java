import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HuiWen {
    boolean isHuiWen(char s[],int n){
        int net=0;
        int i,j;
        for(i=0,j=n-1;i<n/2;i++,j--){
            if(s[i]==s[j]) net++;
        }
        if(net==(int)(n/2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        HuiWen hw1=new HuiWen();
        String pm="";
        try {
            InputStreamReader reader=new InputStreamReader(System.in);
            BufferedReader input=new BufferedReader(reader);
            pm=input.readLine();
            System.out.println(pm);
        }catch (IOException e){
            System.out.println("exception occur...");
        }
        boolean bw= hw1.isHuiWen(pm.toCharArray(),pm.length());
        if(bw==true){System.out.println("It is HuiWen!");
        }
        else {
            System.out.println("It is not HuiWen!");
        }
   }
}
