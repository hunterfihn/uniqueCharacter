package linearSearch;

public class Driver {

	public static void main(String[] args) 
	{
		String sentence = "hi world";
		
		//System.out.println(BinarySearch(array, 19));
		//System.out.println(BinarySearchChar(sentence, 'a'));
		
		System.out.println(uniqueChar(sentence));
		

	}
	
	
	public static boolean uniqueChar(String str)
	{
		for(int i = 0; i < str.length() - 1; i++)
		{
			for(int j = i + 1; j < str.length() - 1; j++)
			{
				
				if(str.charAt(i) == str.charAt(j))
				{
					return false;
				}
			}
				
		}
		return true;
	}
	
	/* public static int BinarySearch(int[] array, int key)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == key)
			{
				return i;
			}
		}
		return -1;
	} 
	
	public static int BinarySearchChar(String str, char key)
	{
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == key)
			{
				return i;
			}
		}
		return -1;
	} */

}
