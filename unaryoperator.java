public class unaryoperator{

  public static void main(String[]args){

    //Unary is a quality that is applied, to which a mathematical/logical operation is performed 
    
    //Unary minus 
    int n1 = 40;
    System.out.println(n1);
    n1 = -n1;
    System.out.println("This is the unary " + n1);

    //Not operator 
    boolean cond = !true;
    System.out.println("not operator: " + cond);

    //post-increment operator
    int num = 12;
    num++;
    System.out.println("Post-increment operator " + num);
    ++num;
    System.out.println("Pre-increment operator " + num);
    //Same for decrements 
    //BitWise complement (every 0s in a bit is 1 and other way for 1s)
    int n2 = 6, n3 = -2;
    System.out.println("First numbers 1: " + n2);
    System.out.println("First numbers 2: " + n3);
    
    System.out.println("BitWise Complemented number 1 " + ~n2);
    System.out.println("BitWise Complemented number 2 " + ~n3);
  
  }
}
