

public class QuickFindUF {

	private int[] id;
	private int n;
	public QuickFindUF(int N){
		id = new int[N];
		n = N;
		for (int i=0; i<N; i++)
			id[i]=i;
	}

	public boolean connected (int p, int q)
	{return id[p] == id [q];}
	
	public void union (int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for (int i=0;i<id.length; i++)
			if (id[i]==pid) id[i]=qid;
	}
	
	public void show(){
		for(int i=0;i<n;i++){
			System.out.println(i);
			System.out.println(id[i]);
			System.out.println("/");
		}	}
	public static void main(String[] args)  {
//===========Lectures==========
	QuickFindUF qf = new QuickFindUF(10);
/*	qf.union(4, 3);
	qf.union(3, 8);
	qf.union(6, 5);
	qf.union(9, 4);
	qf.union(2, 1);
	boolean check1 = qf.connected(8, 9);
	System.out.println("Connected (8, 9)");
	System.out.println(check1);
	boolean check2 = qf.connected(5,0);
	System.out.println("Connected (5,0)");
	System.out.println(check2);
	qf.union(5,0);
	qf.union(7, 2);	
	qf.union(6,1);
	
	boolean check3 = qf.connected(0,7);
	System.out.println("Connected (0,7)");
	System.out.println(check3); */
//===========Exercises==========
//1-5 6-0 4-5 2-8 7-1 9-0 

	
//0 1 2 3 4 5 6 7 8 9
//0 5 8 3 5 5 0 5 8 0
	//		    5
	qf.union(1,5);
	qf.union(6,0);
	qf.union(4,5);
	qf.union(2,8);
	qf.union(7,1);
	qf.union(9,0);
	qf.show();
	
	}
	
	}



