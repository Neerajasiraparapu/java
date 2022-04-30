import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
        int n,k,arr[],count=0;
        String input1,input2;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        input1=br.readLine();
        String in[]=input1.split(" ");
        n=Integer.parseInt(in[0]);
        k=Integer.parseInt(in[1]);
        arr=new int[n];
        input2=br.readLine();
        String in1[]=input2.split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(in1[i]);
            if(arr[i]%k !=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
