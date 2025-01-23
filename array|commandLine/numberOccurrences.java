import java.util.*;
public class NumberOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int[] visited = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            visited[i] = 0; 
        }
        System.out.println("Occurrences of each number:");
        for (int i = 0; i < size; i++) {
            if (visited[i] == 1) {
                continue; 
            }
            int count = 1; 
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    visited[j] = 1; 
                }
            }
            System.out.println("Occurrence of " + numbers[i] + " = " + count);
        }
      
    }
}


