import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Good Number");
        }
        else if(num%3==0){
            System.out.println("Bad Number");            
        }
        else if(num%5==0){
            System.out.println("Poor Number"); 
        }
        else{
            System.out.println(-1);
        }
    }
}
