/*
import java.io.*;
import java.util.Scanner;

public class Input {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The values:");
        int n=sc.nextInt();
        int sum=0;
        int digit;
    while(n!=0){
        digit=n%10;
    sum+=digit;
    n= n/10;
    }
    System.out.println(sum);
}}
*/
/* 
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The values:");
        int n = sc.nextInt();
        int sum = 0;
        int digit;
        for ( ;n != 0; n = n / 10) {
        digit = n % 10;
        sum += digit;
        }
        System.out.println(sum);
    }
}
    */
   /*
   import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value:");
        int n = sc.nextInt();
        int reverse = 0;
        int digit;
        for (; n != 0; n = n / 10) {
         digit = n % 10;
         reverse = reverse * 10 + digit;
        }
        System.out.println("Reversed value: " + reverse);
    }
}
*/

/*
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
    if (arr[i] > max) {
        max = arr[i];
        }
    if (arr[i] < min) {
        min = arr[i];
        }
        sum += arr[i];
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        System.out.println("Sum of elements: " + sum);
        sc.close();
    }
}

*/
/* 
public class Input {
    public static void main(String[] args) {
        int  digit;
        int rev = 0;
        while(num!=0){
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("Reversed value: " + rev);
    }

    public min_max_sum(int[] arr){

        int sum = 0;
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        System.out.println("Sum of elements: " + sum);
    }
/*
import java.util.*;
public class Input {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);
        System.out.println("Pop:"+s.peek());
        s.pop();
        System.out.println("After pop:" + s);
    }
}
*/
/* 
import java.util.*;
import java.util.Queue;

public class Input{
    public static void main(String[]  args){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(100000);
        queue.offer(200000);
        queue.offer(300000);
        System.out.println("Queue: " + queue);

        System.out.println("First Ele:"+ queue.peek());
        queue.poll();
        System.out.println("After poll: " + queue);
    
    }
}
*/

import java.util.PriorityQueue;

public class Input {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(40);
        System.out.println("Priority Queue: " + pq);
        System.out.println("Peek: " + pq.peek());
        System.out.println("Removing elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}