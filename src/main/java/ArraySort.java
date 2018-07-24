//普通排序
public class ArraySort {
    public void sortArr(int arr[],int len) {
        int k = 0, tmp = 0;
        for (int i = 0; i < len - 1; i++) {
            k=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[k]){
                    k=j;
                }
            }
            tmp=arr[i];
            arr[i]=arr[k];
            arr[k]=tmp;
        }
    }
    public void print(int arr[],int len){
        for(int i=1;i<=len;i++){
            System.out.print(arr[i-1]+"\t");
        }
    }
    public static void main(String args[]){
        ArraySort as=new ArraySort();
        int arr[]=new int[10];
        System.out.print("随机生成的整数数组的值如下：\n");
        for(int i=0;i<10;i++){
            arr[i]=(int)(100*Math.random());
            System.out.print(arr[i]+"\t");
        }
        as.sortArr(arr,10);
        System.out.print("\n排序后的整数数组的值如下：\n");
        as.print(arr,10);
    }
}
