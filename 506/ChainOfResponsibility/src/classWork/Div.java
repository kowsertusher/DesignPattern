package classWork;

public class Div extends COR{

	@Override
	public int calculate(int a, int b, int op) {
		if(op == 4) {
			if(b != 0) return a / b;
			else return -0;
		}
		if(nextCor != null) return nextCor.calculate(a, b, op);
		
		
		return -0;
	}

	

}
