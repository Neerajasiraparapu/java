import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a;
    double sum=0;
    a=Integer.parseInt(br.readLine());
    for(int i=1;i<=a;i++){
        sum+=(double)1/i;
    }
    System.out.printf("%.2f",sum);
    }
}
