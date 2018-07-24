import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Moneycount {
    public static void main(String args[]){
        int val[]={100,50,20,10,5,2,1};
        int count;
        int num[]=new int[7];
        int asval=0;
        System.out.println("请输入人民币币值（以分计）：");
        try {
            InputStreamReader reader=new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(reader);
            asval=Integer.parseInt(input.readLine());
        }catch (NumberFormatException ne){
            System.out.println("输入的不是数值");
        }catch (IOException e){
            e.printStackTrace();
        }
        if (asval!=0){
            int reval=asval;
            for (int i=0;i<7;i++){
                num[i]=asval/val[i];
                asval=asval%val[i];
            }
            System.out.println("输入的人民币币值为"+reval);
            for (int i=0;i<7;i++){
                if (num[i]!=0) {
                    System.out.println(val[i] + "分的个数：" + num[i]);
                }else{
                    System.out.println("eeeee");
                }
            }
        }else{
            System.out.println("errrrr");
        }
    }
}
