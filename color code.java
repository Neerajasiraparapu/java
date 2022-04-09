import java.io.*;
class Sample{ 
    public static void main(String[] args)throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			char ch;
			ch=(char)br.read();
			if(ch=='Y'||ch=='y'){
				System.out.println("Yellow");
		    }
		    else if(ch=='R'||ch=='r'){
				System.out.println("Red");
		    }
		    else if(ch=='I'||ch=='i'){
				System.out.println("Indigo");
		    }
			else if(ch=='O'||ch=='o'){
				System.out.println("Orange");
		    }
			else if(ch=='G'||ch=='g'){
				System.out.println("Green");
			}
			else if(ch=='B'||ch=='b'){
				System.out.println("Blue");
		    }
		    else if(ch=='V'||ch=='v'){
				System.out.println("Violet");
		    }
		    else{
			    System.out.println("-1");
			
			}
	}
}
