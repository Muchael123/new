public class Main {
    public static void  bubbleSort(int [] a){
        int i = a.length -1;
        for (;i>0; i--){
            for (int j = 0; j<i; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] a;
        a = new int[]{23,45,12,21,56,34,67,87,43,54,1001,14,45,23,43,21,34,75,201,23,21};
        bubbleSort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ,");
        }
    }
}
