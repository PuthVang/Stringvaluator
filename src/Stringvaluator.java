public class Stringvaluator {

    public static void main(String[] args){

        String expression = " ( 10 / 10 ) + ( 10 * ( 25000 + ( 10 / 25 * ( 10 + 25 * 30 ) * 35 ) + 582395 ) ) + 295 ";

        Parenthesis parenthesis = new Parenthesis(expression);

        String innerExpression = parenthesis.getInner();

        System.out.println(innerExpression); // Will show "( 10 + 25 * 30 )" without the quotations.

    }

}
