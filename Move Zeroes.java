import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,arr[],count=0;
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        String input;
        input=br.readLine();
        String in[]=input.split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(in[i]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                System.out.print(arr[i]+" ");
            }
            else{
                count++;
            }
        }
        for(int i=0;i<count;i++){
        System.out.print(0+" ");
        }
    }
}
