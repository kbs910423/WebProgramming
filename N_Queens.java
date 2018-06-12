package BackTracking;

public class N_Queens {
	private int n;
	private int cols[];
	
	public N_Queens(int N){
		this.n=N;
		cols = new int[n];
	}
	
	public void back_tracking(int level){
		if(level == n){
			for(int i=0; i<n; i++){
				System.out.print(cols[i]);
			}
			System.out.println("");
		}
		else{
			for(int i=0; i<n; i++){
				cols[level]=i;
				if(isPossible(level)){
					back_tracking(level+1);
				}
			}
		}
	}
	public boolean isPossible(int level){
		for(int i=0; i<level; i++){
			if(cols[i]==cols[level] || Math.abs(level-i)==Math.abs(cols[level]-cols[i])){
				return false;
			}
		}
		return true;
	}
	
}


