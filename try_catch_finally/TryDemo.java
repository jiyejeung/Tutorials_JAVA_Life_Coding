package life_coding.try_catch_finally;

class Calculator{
	
    int left, right;
    
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left / this.right);
            System.out.print(" 입니다.");
        } catch(ArithmeticException e) {
        	// 0을 나누었을 때 
        	System.out.println("0을 나누었음");
        } catch(ArrayIndexOutOfBoundsException e) {
        	// 배열에 대한 오류가 있을 때 
        	System.out.println("배열에 대한 오류가 있음");
        } catch(Exception e) {
            System.out.println("\n\ne.getMessage()\n" + e.getMessage());
            System.out.println("\n\ne.toString()\n" + e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        } finally {
        	System.out.println("divde end");
        }
    }
    
} 

public class TryDemo {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.setOprands(10, 1);
		calc.divide();
	}
}
