import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trigsquare {
    double x;
    double y;
    double z;
    Trigsquare(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    boolean isTriangle(){
        boolean b1=false;
        if(this.x>0&&this.y>0&&this.z>0){
            if ((this.x+this.y)>this.z&&(this.x+this.z)>this.y&&(this.y+this.z)>this.x)
                b1=true;
            else
                b1=false;

        }
        return b1;
    }
    double getArea(){
        double s=(this.x+this.y+this.z)/2.0;
        return (Math.sqrt(s*(s-this.x)*(s-this.y)*(s-this.z)));
    }
    public static void main(String args[]){
        double s[]=new double[3];
        try {
            InputStreamReader reader=new InputStreamReader(System.in);
            BufferedReader input =new BufferedReader(reader);
            System.out.print("请输入三个数字：");
            for (int i=0;i<3;i++){
                s[i]=Double.valueOf(input.readLine());
            }
        }catch (NumberFormatException fe){
            System.out.println("format....");
        }catch (IOException e){
            System.out.println("IO....");
        }
        Trigsquare ts=new Trigsquare(s[0],s[1],s[2]);
        if(ts.isTriangle()==true){
            System.out.println("三角形的面积是："+ts.getArea());
        }
        else {
            System.out.println("不是三角形");
        }
    }
}