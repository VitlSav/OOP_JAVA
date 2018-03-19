public class sqare {

    public static void main(String[] args) {
    	int k=1;
    	for (int i=0; i<5; i++) {
    		for (int j=0; j<5; j++) {
    			if (i==j || j==4-i)
    				System.out.print(" * ");
    			else
    				System.out.print(k+" ");
    			k++;
    		}
    		System.out.println();
    	}
    }
}