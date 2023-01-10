class fa{
	static void array(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
				int rem=arr[i]%10;
				sum=sum+rem;
				arr[i]=arr[i]/10;
				
			}
			System.out.println(sum);
		}
			
	
	public static void main(String[] args){
		int[] arr={17686,287736,3243677,42639,38735};
		array(arr);
}
	
}
