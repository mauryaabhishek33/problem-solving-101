class AClass{  
  int n;
static void m(){System.out.println("hello m");}  
static void n(){  
System.out.println("hello n");  
//m();//same as this.m()    
	
}
/**
 * @return the n
 */
public int getN() {
	return n;
}
/**
 * @param n the n to set
 */
public void setN(int n) {
	this.n = n;
}    
}  


///a non static method cannot be called from a static method 
// while a static method can be called from a non static method