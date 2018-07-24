import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tempconverter {
    double celsius(double y){
        return ((y-32)/9*5);
    }
    public static void main(String args[]){
        Tempconverter tc=new Tempconverter();
        double tmp=0;
        try{
            InputStreamReader reader=new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(reader);
            System.out.print("请输入华氏温度：");
            tmp=Double.valueOf(input.readLine());
        }
        catch (NumberFormatException fe){
            System.out.println("format异常....");
        }
        catch (IOException e){
            System.out.println("IO异常....");
        }
        System.out.println("转化后的摄氏温度是："+tc.celsius(tmp));
    }
}
