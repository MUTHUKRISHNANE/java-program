import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt(),rem=0,temp=num;
        String sum="";
        while(num>0){
        rem=num%10;
        sum=sum+String.valueOf(rem);
        num=num/10;}
        System.out.println(sum);
        if(temp==Integer.parseInt(sum)){
            System.out.println("It is a palindrome.");
        }
        else{
            System.out.println("It is not a palindrome.");
        }
    }
}
