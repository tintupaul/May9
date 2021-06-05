package Test;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int index = 5;
		
		
		//------------ While Loop ------------------
		
		/*while(index>0) {
			
			if(index!=3) {
				System.out.println(index);
			}
			
			index--;
			
		}
		
		int index1 = 5;
		
		while(index1>0) {
			
			System.out.println(index1);
			
			if(index1==3) {
				break;
				
			}
			
			index1--;
			
		} 
		
		
		//------------ Do While loop ---------------
		
		
		int index3 = 1;
		
		do {
			
			System.out.println(index3);
			index3++;
			
		}while(index3<11); */
		
		
		//------ For Loop ---------------------------
		
		
		for(int i=1;i<11;i++) {
			
			System.out.println(i);
		}
		
		
		int myarray [] = {2,3,45,6,7};
		
		for(int i=0;i<myarray.length;i++) {
			
			System.out.println(myarray[i]);
		}
		
		String array2 [] = {"abcd", "xyz", "pqr"};
		
		for(int i=0;i<array2.length;i++) {
			
			System.out.println(array2[i]);
		}
		
	}

}