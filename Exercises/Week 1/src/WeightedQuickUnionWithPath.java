
public class WeightedQuickUnionWithPath {

	private int[] id;
	private int[] sz;
	private int n;
	public WeightedQuickUnionWithPath(int N){
		id = new int[N];
		sz = new int[N];
		n = N;
		for (int i=0; i<N; i++)
			{id[i]=i;
			sz[i]=1;}
	}
	
	private int root(int i)
	{
		while (i != id[i]) 
		{
			id[i]=id[id[i]];
			i=id[i];
		}
		return i;
	}

	public boolean connected (int p, int q)
	{return root(p)==root(q);}
	
	public void union (int p, int q) {
		int i = root (p);
		int j = root (q);
		if(sz[i]<sz[j]) {id[i] = j; sz[j] += sz[i];}
		else			{id[j] = i; sz[i] += sz[j];}
		
		}
	
	public void show(){
		for(int i=0;i<n;i++){
			System.out.println(i);
			System.out.println(id[i]);
			System.out.println("/");
		}	}
	public static void main(String[] args)  {
//===========Lectures========== 
		
		WeightedQuickUnionWithPath wqup = new WeightedQuickUnionWithPath(10);
	
	/*
	wqup.union(4, 3);
	wqup.union(3, 8);
	wqup.union(6, 5);
	wqup.union(9, 4);
	wqup.union(2, 1);
	boolean check1 = wqup.connected(8, 9);
	System.out.println("Connected (8, 9)");
	System.out.println(check1);
	boolean check2 = wqup.connected(5,0);
	System.out.println("Connected (5,0)");
	System.out.println(check2);
	wqup.union(5,0);
	wqup.union(7, 2);	
	wqup.union(6,1);
	wqup.union(7, 3);
	
	boolean check3 = wqup.connected(0,7);
	System.out.println("Connected (0,7)");
	System.out.println(check3); 
	wqup.show();
	/*/
//===========Exercises==========
//  7-8 1-9 9-4 4-6 5-2 5-8 3-9 2-3 3-0
	
//0 1 2 3 4 5 6 7 8 9
//1 1 5 1 1 1 1 5 7 1
		
	wqup.union(7,8);
	wqup.union(1,9);
	wqup.union(9,4);
	wqup.union(4,6);
	wqup.union(5,2);
	wqup.union(5,8);
	wqup.union(3,9);
	wqup.union(2,3);
	wqup.union(3,0);
	
	wqup.show();
	
	/*/
	
		
		// 4-6 6-0 1-3 2-5 2-3 8-4 8-1 9-6 8-7 
	
		//0 1 2 3 4 5 6 7 8 9
		//4 2 4 1 4 2 4 4 4 4
	
		wqu.union(4,6);
		wqu.union(6,0);
		wqu.union(1,3);
		wqu.union(2,5);
		wqu.union(2,3);
		wqu.union(8,4);
		wqu.union(8,1);
		wqu.union(9,6);
		wqu.union(8,7);
		
		wqu.show();
		*/
	}
	
	}


