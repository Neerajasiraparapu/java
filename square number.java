/*o/p:25
True*/


import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, count=0;
        n = Integer.parseInt(br.readLine());
        for(int i=1; i*i<=n ; i++){
            if(i*i==n){
                count=1;
            }
        }
        if(cnt==1){
            System.out.printf("True");
        }
        else{
            System.out.println("False");
        }
    }
}
