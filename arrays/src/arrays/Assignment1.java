package arrays;

public class Assignment1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 15;
        int d = 30;

        
        int greatest = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d)) :
                       ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));

        System.out.println("The four numbers are: " + a + ", " + b + ", " + c + ", " + d);
        System.out.println("The greatest number is: " + greatest);

       
    }
}