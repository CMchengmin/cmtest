import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

class CD{
    String cdid;
    String cdname;
    float price;
    String press;
    CD(String cdid,String cdname,float price,String press){
        this.cdid=cdid;
        this.cdname=cdname;
        this.price=price;
        this.press=press;
    }
    CD(){}

    public void setID(String cdid) {
        this.cdid = cdid;
    }

    public void setName(String cdname) {
        this.cdname = cdname;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPress(String press) {
        this.press = press;
    }
    void print(){
        System.out.print("ID:"+this.cdid+"\t"+"Name:"+this.cdname+"\t"+"Price:"+this.price+"\t"+"Press:"+this.press+"\n");
    }
}
public class CDManager extends Vector {
    Vector cds;
    CDManager(){
        cds=new Vector(50,1);
    }
    int addcd(CD tmpcd){
        cds.addElement(tmpcd);
        return 1;
    }
    int deletecd(){
        if(cds.isEmpty()==false){
            int i=cds.size();
            cds.removeElementAt(i-1);
            return 1;
        }
        else{
            return 0;
        }
    }
    CD findcd(String cid){
        CD tmpcd=new CD();
        int i=0;
        for(i=0;i<cds.size();i++){
            CD getcd=(CD)cds.elementAt(i);
            if(((getcd.cdid).trim()).compareTo(cid.trim())==0){
                tmpcd=(CD)cds.elementAt(i);
            }
        }
        return tmpcd;
    }
    public void printcd(){
        CD tmpcd;
        int length=cds.size();
        if (length>0){
            System.out.println("vector的数值元素是："+length+"and 它们分别是：");
            for(int i=0;i<length;i++){
                tmpcd=(CD)cds.elementAt(i);
                System.out.println("ID:"+tmpcd.cdid+"\t"+"Name:"+tmpcd.cdname+"\t"+"Price:"+tmpcd.price+"\t"+"Press:"+tmpcd.press+"\n");
            }
        }
        else{
            System.out.println("没有cd，请添加");
        }
    }
    String inputstr(){
        String pm="";
        try{
            InputStreamReader reader=new InputStreamReader(System.in);
            BufferedReader input=new BufferedReader(reader);
            pm=input.readLine();
        }catch (IOException e){
            System.out.println("IO异常");
        }
        return pm;
    }
    public static void main(String args[]){
        CDManager cm=new CDManager();
        int count=1;
        while (count!=0){
            System.out.print("你想选择哪个选项：（1，2，3，4，0）\n");
            System.out.print("1.add cd.\n");
            System.out.print("2.find cd.\n");
            System.out.print("3.delete cd.\n");
            System.out.print("4.print all cd.\n");
            System.out.print("0.exit.\n");
            try{
                count = Integer.parseInt(cm.inputstr());
            }catch (NumberFormatException ne){
                System.out.println("无效的数据");
            }
            switch (count){
                case 1:
                    CD cd1=new CD();
                    System.out.print("请输入cd ID：");
                    cd1.setID(cm.inputstr());
                    System.out.print("请输入cd 名：");
                    cd1.setName(cm.inputstr());
                    System.out.print("请输入cd 价格：");
                    try {
                        float pc=Float.parseFloat(cm.inputstr());
                        cd1.setPrice(pc);
                    }catch (NumberFormatException ne){
                        System.out.println("请输入正确的数字");
                    }
                    System.out.print("请输入cd 发行商：");
                    cd1.setPress(cm.inputstr());
                    int i=cm.addcd(cd1);
                    if(i>0){
                        System.out.print("添加成功\n");
                    }
                    else{
                        System.out.print("添加失败\n");
                    }
                    break;
                case 2:
                    System.out.println("请输入你要查找的CD：");
                    String id=cm.inputstr();
                    CD fcd=cm.findcd(id);
                    if(fcd.cdid==null){
                        System.out.println("没有你要找的CD");
                    }
                    else{
                        System.out.println("你要查找的CD信息是：");
                        fcd.print();
                    }
                    break;
                case 3:
                    if(cm.deletecd()>0){
                        System.out.print("删除成功\n");
                    }
                    else{
                        System.out.print("删除失败\n");
                    }
                    break;
                case 4:
                    cm.printcd();
                    break;
                case 0:
                    System.exit(0);
                    default:
                        break;
            }
        }
    }
}
