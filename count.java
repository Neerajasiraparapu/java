import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,arr[],even=0,odd=0;
        n=Integer.parseInt(br.readLine());
        String input;
        input=br.readLine();
        String in[]=input.split(" ");
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(in[i]);
            if(arr[i]%2 ==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even+" "+odd);
    }
}
