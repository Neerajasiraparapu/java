import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,arr[],sum=0;
        n=Integer.parseInt(br.readLine());
        String input;
        input=br.readLine();
        String in[]=input.split(" ");
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(in[i]);
        }
        int a=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]==a){break;
            }
        }
        System.out.println(sum);
    }
}
