 class HelloWorld {
	  enum HelloWordSize { SMALL, MEDIUM , LARGE }
	  HelloWorld size;
	  
}
 
 public class HelloWorldTest {
	 
	
	public static void main(String args []) {
	  HelloWorld world = new HelloWorld();
	  world.size = HelloWorld.HelloWorldSize.MEDIUM ;
	  System.out.println("Size: " + world.size );
		 
	 }
	 
	 

}
