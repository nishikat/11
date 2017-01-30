class concatenate{
static int[] concatenate(int[] a, int[] b)

	{
		int[] newArr = new int[a.length + b.length];
		int i = 0;

		for (int elem : a)
		{	newArr[i] = elem; i++;	}
		for (int elem : b)
		{	newArr[i] = elem; i++;	}
	
		return newArr;
	}
}
