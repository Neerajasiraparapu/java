import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int N;
    N=Integer.parseInt(br.readLine());
    if(N>=4&&N<=6){
        System.out.println("Summer");
    }
    else if(N==7||N==10||N==8||N==9||N==11){
        System.out.println("Rainy");
    }
    else if(N==11||N==12||N==1){
        System.out.println("Winter");
    }
    else if(N==2||N==3){
        System.out.println("Spring");
    }
    else{
      System.out.println("-1");
    }
    }
}
