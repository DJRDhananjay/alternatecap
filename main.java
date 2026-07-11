import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int count=0;
		String name="dhananjay kumar ravi";
		for(int i=0;i<name.length();i++){
		    char ch=name.charAt(i);
		    if(ch==' '){
				System.out.print(" ");
		        count=0;
		    }else{
		        if(count%2==0){
		            if(ch>='a'&&ch<='z'){
		                ch=(char)(ch-32);
		            }
		        }
		        else{
		            if(ch>='A'&& ch<='Z'){
		                ch=(char)(ch+32);
		            }
		        }
		        System.out.print(ch);
		        count++;
		    }
		}
		
	    
	}
}
