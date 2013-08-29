

public class QuickUnion {

	private int[] id;
	private int n;
	public QuickUnion(int N){
		id = new int[N];
		n = N;
		for (int i=0; i<N; i++)
			id[i]=i;
	}
	
	private int root(int i)
	{
		while (i != id[i]) 
			i=id[i];
			
		return i;
	}

	public boolean connected (int p, int q)
	{return root(p)==root(q);}
	
	public void union (int p, int q) {
		int i = root (p);
		int j = root (q);
		id[i] = j;}
	
	public void show(){
		for(int i=0;i<n;i++){
			System.out.println(i);
			System.out.println(id[i]);
			System.out.println("/");
		}	}
	public static void main(String[] args)  {
//===========Lectures========== 
		
	QuickUnion qu = new QuickUnion(10);
	
	/*
	qu.union(4, 3);
	qu.union(3, 8);
	qu.union(6, 5);
	qu.union(9, 4);
	qu.union(2, 1);
	boolean check1 = qu.connected(8, 9);
	System.out.println("Connected (8, 9)");
	System.out.println(check1);
	boolean check2 = qu.connected(5,0);
	System.out.println("Connected (5,0)");
	System.out.println(check2);
	qu.union(5,0);
	qu.union(7, 2);	
	qu.union(6,1);
	qu.union(7, 3);
	
	boolean check3 = qu.connected(0,7);
	System.out.println("Connected (0,7)");
	System.out.println(check3); 
	qu.show();
	/*/
//===========Exercises==========
// 4-6 6-0 1-3 2-5 2-3 8-4 8-1 9-6 8-7 

	
//0 1 2 3 4 5 6 7 8 9
//3 3 5 7 6 3 0 7 0 3


//0 1 2 3 4 5 6 7 8 9
//9 3 0 3 3 9 0 0 0 3
	qu.union(4,6);
	qu.union(6,0);
	qu.union(1,3);
	qu.union(2,5);
	qu.union(2,3);
	qu.union(8,4);
	qu.union(8,1);
	qu.union(9,6);
	qu.union(8,7);
	
	qu.show();
	
	}
	
	}



