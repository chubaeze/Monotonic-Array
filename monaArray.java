package monArray;

public class monaArray {
//array = [-1, -5, -10, -1100, -1100, -1101, -1102, -9001]
	//true 
	
	public static boolean Mono(int[] array) {
		
		boolean isMono = false;
		int i = 0;
		
		if (array.length <= 2){
			return isMono = true;
		}
		
			while(array[i] < array[i + 1]) {
				i++;
				isMono = true;
				if (array[i] > array[i + 1]) {
					return isMono = false;
				}
			}
			while(array[i] > array[i + 1]){
				i++;
				isMono = true;
				if (array[i] < array[i + 1]) {
					return isMono = false;
			}
		}
		return isMono;
	
}
}
