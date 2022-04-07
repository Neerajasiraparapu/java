import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char N;
        N=(char)br.read();
        if(N=='A' || N=='I' || N=='O' || N=='U' || N=='E' || N=='a' || N=='u' || N=='o' || N=='i' || N=='e'){
        System.out.print("Vowel");
        }
        else{
            System.out.print("Consonant");
        }
        
    }
}
