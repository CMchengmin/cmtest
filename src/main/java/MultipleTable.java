public class MultipleTable {
    public static void main(String args[]){
        int initNum=9;
        int sum=0;
        for(int i=1;i<=initNum;i++){
            for(int j=1;j<=i;j++){
                sum=i*j;
                System.out.print(i+"*"+j+"="+sum+"   ");
            }
            System.out.print("\n");
        }
    }
}