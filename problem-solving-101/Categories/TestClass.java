/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {

    public static String camelToSnake(String str){
        String result ="";
        char c = str.charAt(0);
        result +=Character.toLowerCase(c);
        for(int i = 1 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                result+='_';
                result+=Character.toLowerCase(ch);
            }
            else{
                result+=ch;
            }
            
        }
    return result;
    }
    public static void main(String args[] ) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	for(int j = 0;j<T;j++) {
    	String st = sc.nextLine();

    	Stack<Character>s=new Stack<>();

    	s.push(st.charAt(0));

    	for(int i=1;i<st.length();i++){

    	if(!s.empty() && s.peek()==st.charAt(i)){

    	s.pop();

    	}

    	else{

    	s.push(st.charAt(i));

    	}

    	}

    	Stack<Character>b=new Stack<>();

    	String n="";

    	while(!s.empty()){

    	b.push(s.pop());

    	 

    	}

    	while(!b.empty()){

    	n+=b.pop();

    	}

    	System.out.println(n);

    	}
    }
}
