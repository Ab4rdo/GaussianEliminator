package project1;


public class Main {

	public static void main(String[] args) {
		
		
		double matrix[][] = { {1 , 2 , 3} 
							, {4 , 5 , 6} 
							, {7 , 8 , 9}};
		
		
		GEAlghoritm alg = new GEAlghoritm(matrix);
		
		
		for(double []i : matrix){
			for(double j : i){
				System.out.print(j + "\t ");
			}
			System.out.println();
		}
		System.out.println();
		
		alg.start();
		
		for(double []i : matrix){
			for(double j : i){
				System.out.print(j + "\t ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
