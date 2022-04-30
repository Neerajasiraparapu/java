import java.io.*;
class Sample{
    public static int[]half(int arr[]){
        int res[],j=0;
        res=new int[arr.length];
        for(int i=arr.length-1;i>=arr.length/2;i--){
            res[j]=arr[i];
            j++;
        }
        for(int i=0;i<arr.length/2;i++){
            res[j]=arr[i];
            j++;
        }
        return res;
    }
    public static void main(String args[])throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int arr[],n,res[];
    n=Integer.parseInt(br.readLine());
    arr=new int[n];
    res=new int[n];
    String input;
    input=br.readLine();
    String in[]=input.split(" ");
    for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(in[i]);
    }
    res=half(arr);
    for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");
    }
}
}
