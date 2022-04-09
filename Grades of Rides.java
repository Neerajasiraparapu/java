import java.io.*;
class Sample{ 
    public static void main(String[] args)throws Exception{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
		    int HF,SF,SpF;
		    String input;
            input=br.readLine();
            String in[]=input.split(" ");
            HF=Integer.parseInt(in[0]);
		    SF=Integer.parseInt(in[1]);
		    SpF=Integer.parseInt(in[2]);
		    if(HF>50&&SF>60&&SpF>100)
		    {
		        System.out.println("10");
		    }
		    else if(HF>50&&SF>60&&SpF<100)
		    {
		        System.out.println("9");
		    }
		    else if(HF<50&&SF>60&&SpF>100)
		    {
		        System.out.println("8");
		    }
		    else if(HF>50&&SF<60&&SpF>100)
		    {
		        System.out.println("7");
		    }
		    else if(HF>50&&SF<60&&SpF<100)
		    {
		        System.out.println("6");
		    }
		    else
		    {
		        System.out.println("5");
		    }
	}
}
