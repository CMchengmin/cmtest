class Count{
    int seri;
    static int counter=0;
    public Count(){
        counter++;
        seri=counter;
    }
        }
public class UseStatic {
    public static void main(String args[]){
        System.out.println("------"+Count.counter);
        Count tom=new Count();
        Count john=new Count();
        System.out.println("tom----:"+tom.seri);
        System.out.println("tom----:"+john.seri);
        System.out.println("now----:"+Count.counter);
    }
}
