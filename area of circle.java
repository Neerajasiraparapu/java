import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int r;
        float area;
        String input;
        input=br.readLine();
        String in[]=input.split(" ");
        r=Integer.parseInt(in[0]);
        area=(float)(3.14*r*r);
       System.out.format("%.2f",area);
}
}
