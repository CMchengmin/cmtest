class sclass{
    String classid;
    int credit;
    sclass(String classid,int credit){
        this.classid=classid;
        this.credit=credit;
    }
}
class Student{
    String sid;
    String sname;
    char sex;
    float avgscore;
    float score[]=new float[3];
    Student(String id,String name,char sex,float s1,float s2,float s3){
        this.sid=id;
        this.sname=name;
        this.sex=sex;
        this.score[0]=s1;
        this.score[1]=s2;
        this.score[2]=s3;
    }
    Student(){};
    Student(String id,String name,char sex){
        this.sid=id;
        this.sname=name;
        this.sex=sex;
    }
    void print(){
        System.out.println("id:"+this.sid+"\t\t name:"+this.sname+"\t\t sex:"+this.sex);
        System.out.println("score1="+this.score[0]+"\t score2="+this.score[1]+"\t score3="+this.score[2]);
        System.out.println("avgscore="+this.avgscore);
        System.out.println("\n");
    }
    void print2(){
        System.out.println("student id:"+this.sid+"\t average score:"+this.avgscore);
    }
}
public class Stuscore {
    Student st[];
    sclass sc[]=new sclass[3];
    void initsc(){
        sc[0]=new sclass("C001",2);
        sc[1]=new sclass("C002",3);
        sc[2]=new sclass("C003",4);
    }
    void initst(){
        st=new Student[5];
        st[0]=new Student("S001","zs",'f',78,86,96);
        st[1]=new Student("S002","ls",'m',65,77,89);
        st[2]=new Student("S003","ww",'m',98,77,87);
        st[3]=new Student("S004","zl",'f',73,95,93);
        st[4]=new Student("S005","qd",'m',87,93,91);
    }
    void accuscore(){
        float as=0;
        int cs=0;
        for(int i=0;i<st.length;i++){
            for(int j=0;j<sc.length;j++){
                as+=sc[j].credit*st[i].score[j];
                cs+=sc[j].credit;
            }
            st[i].avgscore=(float)(as/cs);
        }
    }
    void sort(){
        Student tmp=new Student();
        for(int i=0;i<st.length;i++){
            for(int j=i+1;j<st.length;j++){
                if(st[i].avgscore<st[j].avgscore){
                    tmp=st[i];
                    st[i]=st[j];
                    st[j]=tmp;
                }
            }
        }
    }
    void print(){
        System.out.println("-----------------");
        System.out.println("学生信息如下：");
        System.out.println("-----------------");
        for(int i=0;i<st.length;i++){
            st[i].print();
        }
    }
    void print2(){
        System.out.println("------------------");
        System.out.println("学生平均分数排序如下：");
        System.out.println("------------------");
        for(int i=0;i<st.length;i++){
            st[i].print2();
        }
    }
    public static void main(String args[]){
        Stuscore stc=new Stuscore();
        stc.initsc();
        stc.initst();
        stc.accuscore();
        stc.print();
        stc.sort();
        stc.print2();
    }
}
