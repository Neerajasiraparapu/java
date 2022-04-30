
import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,arr[];
        n=Integer.parseInt(br.readLine());
        String input;
        input=br.readLine();
        String in[]=input.split(" ");
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(in[i]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
            System.out.print(arr[i]+" ");
        }
        }
    }
}
