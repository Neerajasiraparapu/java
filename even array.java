import java.io.*;
class Sample
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, arr[];
        Boolean status=true;
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        String input = br.readLine();
        String in[] = input.split(" ");
        for(int i=0 ; i<n ; i++){
            arr[i] = Integer.parseInt(in[i]);
            if(arr[i]%2!=0){
                status=false;
            }
        }
        if(status){
            System.out.println("True");
        }
        else{
        System.out.print("False");}
    }
}
