class ParentClass{
    private int value;
    public ParentClass(){
        value=0;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int y){
        value=y;
    }
}
class SubClass1 extends ParentClass{
    private int value;
    private int classvalue1=11;
    public SubClass1(){
        value=1;
    }
    public int getValue(){
        return value;
    }
    public int getClassvalue1(){
        return classvalue1;
    }
}
class SubClass2 extends ParentClass{
    private int value;
    private int classvalue2=22;
    public SubClass2(){
        value=2;
    }
    public int getValue(){
        return value;
    }
    public int getClassvalue2(){
        return classvalue2;
    }
}
public class Test2 {
    public static void main(String args[]){
        ParentClass a=new ParentClass();
        SubClass1 b=new SubClass1();
        SubClass2 c=new SubClass2();
        a=c;
        System.out.println("a="+a.getValue());
    }
}
