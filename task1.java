import java.lang.*;
import java.util.*;

class task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("enter marks for student " + i + ": ");
            marks[i] = sc.nextInt();
        }

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        int max = marks[0];
        int min = marks[0];
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max)
                max = marks[i];

            if (marks[i] < min)
                min = marks[i];

            sum += marks[i];
        }

        double avg = (double) sum / marks.length;

        System.out.println("Highest mark: " + max);
        System.out.println("Lowest mark: " + min);
        System.out.println("Average mark: " + avg);

        Arrays.sort(marks);
        System.out.println("sorted marks: " + Arrays.toString(marks));

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<marks.length;i++){
            list.add(marks[i]);
        }

        System.out.println("\nArraylist: " + list);




    }
}

