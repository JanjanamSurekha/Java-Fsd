package program.Assisted.Practice;

public class ProgBubbleSort36 {

		    public static void main(String[] args){

		     int[] arr= {25,20,15,5,10};
		     ProgBubbleSort36(arr);
		     for(int i=0;i<arr.length;i++){

		        System.out.println(arr[i]);
		        }
		    }

		    public static void ProgBubbleSort36(int[] arr){
		        int len = arr.length;
		        int temp = 0;
		        for(int i=0;i<len;i++){
		            for (int j=1;j<(len);j++){
		                if(arr[j-1]>arr[j]){
		                temp = arr[j-1];
		                arr[j-1]= arr[j];
		                arr[j]= temp;

		                }


		            }

		        }

	}

}
