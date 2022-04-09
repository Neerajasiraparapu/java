import java.io.*;
class Sample{ 
    public static void main(String[] args)throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int N;
			N=Integer.parseInt(br.readLine());
			if(N>=0){
			    System.out.println("Positive Number");
			}
			else{
			    System.out.println("Negative Number");
			}
    
	}
}
