public class Main{
    static void change(int A[],int index,int value){
        A[index] = value;
    }
    public static void main(String[] args) {
        int A[] = {2, 4, 6, 8, 10};
        change(A, 2, 29);
        for (int x : A) {
            System.out.println(x);
        }
    }
}