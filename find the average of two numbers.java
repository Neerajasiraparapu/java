import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N,M;
        float avg;
        String input;
        input=br.readLine();
        String in[]=input.split(" ");
        N=Integer.parseInt(in[0]);
        M=Integer.parseInt(in[1]);
        avg=(float)(N+M)/2;
        System.out.format("%.4f",avg);

}
}
