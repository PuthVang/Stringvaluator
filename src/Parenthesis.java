/**
 * Utility class that gets the expression from parentheses, if there are any.
 *
 * @author Puth Vang
 * @since 17/10/2020 (dd/mm/yyyy)
 * @version 1.0
 */

public class Parenthesis {

    public String expression;

    private int leftParenthesis = -1;
    private int rightParenthesis = -1;

    public Parenthesis(String expression){
        this.expression = expression;
    }

    /**
     * This method will get the inner parenthesis expression from the first expression if there's more than one parenthesis.
     * <p>
     * For example, ( 20 / ( 25 * 25000 + ( 420 * 25 ) / 3.14157 ) - 25000 ) will return ( 420 * 25 ) because there's one expression
     * <p>
     * Whereas ( 10 / ( 25 + 50 ) * 500 ) + ( 10 / ( 10 - 25 ) + 500 ) will return ( 25 + 50 ) first because there's two expressions
     * <p>
     * @return The expression with the parenthesis
     */

    public String getInner(){

        for (int i = 0; i < expression.length(); i++){
            String s = String.valueOf(expression.charAt(i));
            if (s.equals("(")){
                leftParenthesis = i;
            }else if (s.equals(")")) {
                rightParenthesis = i;
            }else if (leftParenthesis > 1 && rightParenthesis > leftParenthesis){
                return expression.substring(leftParenthesis, rightParenthesis + 1);
            }
        }

        return expression;
    }

}
