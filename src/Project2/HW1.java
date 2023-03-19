package Project2;

public class HW1 {
    public static void main(String[] args) {
/**: Write a program to print out the sum of the digits of a given number.
 Ex : int num = 123
 Output = 6*/
int num = 123;
int sum = 0;
        System.out.println(num);
sum+= num%10;
num= num/10;
sum+=num%10;
num = num/10;
sum+= num%10;
        System.out.println(sum);
    }
}
