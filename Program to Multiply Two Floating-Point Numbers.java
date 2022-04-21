import java.util.Scanner;
class Sample{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        float a,b,c;
        a=s.nextFloat();
        b=s.nextFloat();
        c=a*b;
        System.out.format("%.2f",c);
    }
}
