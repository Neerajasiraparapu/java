import java.io.*;
class Sample
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, arr[],sum=0,count=0;
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        String input = br.readLine();
        String in[] = input.split(" ");
        for(int i=0 ; i<n ; i++){
            arr[i] = Integer.parseInt(in[i]);
        }
        for(int i=0 ; i<n ; i++){
            sum+=arr[i];
        }
        double avg=(double)sum/n;
        for(int i=0 ; i<n ;i++){
            if(arr[i]<=avg){
                count++;
            }
        }
        System.out.print(count);
    }
}
