import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            arr[i]= sc.nextInt();
        }
        int max = Math.max(arr[0], arr[1]);
        max = Math.max(max, arr[2]);
        System.out.println(max);
    }
}