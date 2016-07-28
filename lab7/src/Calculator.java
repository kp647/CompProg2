// an instance of this class represents a simple calculator.  The
// calculator keeps track of two operands (ints) and an operator (a
// char, one of '+', '*', '-', and '/'.)

public class Calculator
{
    /* add data fields (instance variables) here */
    int first=0;
    int second=0;
    char op=' ';
    StringBuilder numbers1 =new StringBuilder();
    StringBuilder numbers2 =new StringBuilder();
     
    /*
     * Method Clear
     * Clears out entire calculator
     */
    void Clear()
    {
	/* fill in this method */
    	numbers1.delete(0, numbers1.length());
    	first=Integer.parseInt(numbers1.append(0).toString());
    	numbers2.delete(0, numbers2.length());
    	second=Integer.parseInt(numbers2.append(0).toString());
    	//first=0;
    	//second=0;
    	//op=' ';
    	
    }    

    /*
     * Method EnterDigitOfFirstOperand
     * Takes a digit and appends it to the end of the first operand
     * e.g. if the operand is already 32 and the digit is 4, the operand
     * should become 324
     */
    void EnterDigitOfFirstOperand(int digit)
    {
	/* fill in this method */
    	numbers1.append(digit);
    }
    
    /*
     * Method GetFirstOperand
     * A "getter" method. Returns the first operand of the formula being entered
     */
    int GetFirstOperand()
    {
	/* remove the line below and fill in this method */
    	first=Integer.parseInt(numbers1.toString());
    //	numbers1.delete(0, numbers1.length());
    //	numbers1.append(0);
    	return first;
    }

    /*
     * Method EnterDigitOfSecondOperand
     * Takes a digit and appends it to the end of the second operand
     */
    void EnterDigitOfSecondOperand(int digit)
    {
	/* fill in this method */
    	numbers2.append(digit);
    }
    
    /*
     * Method GetSecondOperand
     * A "getter" method. Returns the second operand of the formula being entered
     */
    int GetSecondOperand()
    {
	/* remove the line below and fill in this method */
    	second=Integer.parseInt(numbers2.toString());
    	
    	//numbers2.delete(0, numbers2.length());
    	//numbers2.append(0);
    	return second;
    }

    /*
     * Method EnterOperator
     * Takes a mathematical operator and stores it
     */
    void EnterOperator(char op)
    {
	/* fill in this method */
    	this.op=op;
    }
    

    /*
     * Method ComputeAnswer
     * Evaluates the formula entered
     */
    int ComputeAnswer()
    {
	/* remove the line below and fill in this method */
    	if (op=='+')
    		return first+second;
    	else if(op=='-')
    		return first-second;
    	else if(op=='*')
    		return first*second;
    	else if(op=='/')
    		return first/second;
    	else return 0;
	
    }
    
}
