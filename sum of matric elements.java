import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int m,n,x[][],y[][],z[][],sum=0;
    m=Integer.parseInt(br.readLine());
    n=Integer.parseInt(br.readLine());
    x=new int[m][n];
    for(int i=0;i<m;i++){
        String row=br.readLine();
        String in[]=row.split(" ");
        for(int j=0;j<in.length;j++){
            x[i][j]=Integer.parseInt(in[j]);
            sum+=x[i][j];
        }
    }
    System.out.println(sum);
    }
}
