import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,arr[],count=0,max=0;
        n=Integer.parseInt(br.readLine());
        String input;
        input=br.readLine();
        String in[]=input.split(" ");
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(in[i]);
        }
        String input1=br.readLine();
        String in1[]=input1.split(" ");
        int a=Integer.parseInt(in1[0]);
        int b=Integer.parseInt(in1[1]);
        for(int i=0;i<n;i++){
            if(arr[i]>=a&&arr[i]<=b){
                max=max>arr[i]?max:arr[i];
                count++;
            }
        }if(count == 0)
        System.out.println(-1);
        else
        System.out.println(max);
    }
}
