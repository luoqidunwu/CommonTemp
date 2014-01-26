package net.com.common;

public class Test02 {

	/*private Class entityClass;
	public BaseDao(){
		Type genType = getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
		entityClass = (Class)params[0];
	}*/
	
	public void print(){
		 int len = 4; // 菱形边长
	        for (int row = -len; row <= len; row++) {
	            for (int col = -len; col <= len; col++) {
	                int tmp = len - Math.abs(row);
	                
	                if (col >= -tmp && col <= tmp) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	
	
	   public static void main(String[] args) {
		   short s1=1;
		   s1 += 1;
	   }
	       
	
}
