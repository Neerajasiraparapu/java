import java.io.*;
class Sample{ 
    public static void main(String[] args)throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    int N ,sum=0;
		    N=Integer.parseInt(br.readLine());
		    sum=N*(N+1)/2;
		    System.out.println(sum);
    }
}
