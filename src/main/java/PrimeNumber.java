import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
    private int pm;
    public void setPm(int pm) {
        this.pm = pm;
    }
    public boolean isPrime(){
        boolean b1=true;
        int i=2;
        for(i=2;i<=Math.sqrt(pm);){
            if(pm%i==0){
                b1=false;
                break;
            }else{
                i++;
            }
        }
        return b1;
    }
    public static void main(String args[]){
        PrimeNumber prim=new PrimeNumber();
        int testNum=0;
        try{
            InputStreamReader reader=new InputStreamReader(System.in);
            BufferedReader input=new BufferedReader(reader);
            System.out.println("请输入测试数字：");
            testNum=Integer.parseInt(input.readLine());
        }catch (IOException e){
            System.out.println("异常....");
        }
        prim.setPm(testNum);
        boolean b1=prim.isPrime();
        if(b1==true){
            System.out.print(testNum+"是素数");
        }else{
            System.out.print(testNum+"不是素数");
        }
    }
}
