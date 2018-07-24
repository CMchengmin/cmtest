public class ArrayCount {
    public static void main(String args[]){
        int arr[]=new int[1000];
        for(int i=0;i<1000;i++){
            arr[i]=(int)(100*Math.random()+1);
        }
        int arrCount[]=new int[100];
        for(int i=0;i<100;i++){
            arrCount[i]=0;
        }
        for(int i=0;i<1000;i++){
            arrCount[arr[i]-1]++;
        }
        System.out.print("整数数组的各值的个数如下：\n");
        for(int i=0;i<arrCount.length;i++){
            if(arrCount[i]!=0)
                System.out.print((i)+"的个数为："+arrCount[i]+"\t");
        }
        System.out.print("\n");
    }
}
