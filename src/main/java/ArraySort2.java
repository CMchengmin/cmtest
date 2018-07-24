//冒泡排序
public class ArraySort2 {
    public void sortArr2(int arr[],int len){
        int tmp=0;
        for(int i=0;i<len;i++){
            for(int j=len-1;j>=i+1;j--){
                if(arr[j]<arr[j-1]){
                    tmp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }
        }
    }
    public void print(int arr[],int len){
        for(int i=1;i<=len;i++){
            System.out.print(arr[i-1]+"\t");
        }
    }
    public static void main(String args[]){
        ArraySort2 as=new ArraySort2();
        int arr[]=new int[10];
        System.out.print("随机生成的整数数组的值如下：\n");
        for(int i=0;i<10;i++){
            arr[i]=(int)(100*Math.random());
            System.out.print(arr[i]+"\t");
        }
        as.sortArr2(arr,10);
        System.out.print("\n排序后的整数数组的值如下：\n");
        as.print(arr,10);
    }
}
