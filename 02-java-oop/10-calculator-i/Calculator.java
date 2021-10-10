public class Calculator implements java.io.Serializable 
{
    private double OperandOne;
    private String Operation;
    private double OperandTwo;
    
    public Calculator()
    {

    }
    public Calculator(double OperandOne, String Operation, double OperandTwo)
    {
        this.OperandOne=OperandOne;
        this.Operation=Operation;
        this.OperandTwo=OperandTwo;
    }
    public void setOperandOne(double operandOne) {
        OperandOne = operandOne;
    }
    public void setOperation(String operation) {
        Operation = operation;
    }
    public void setOperandTwo(double operandTwo) {
        OperandTwo = operandTwo;
    }
    public double getOperandOne() {
        return OperandOne;
    }
    public String getOperation() {
        return Operation;
    }
    public double getOperandTwo() {
        return OperandTwo;
    }
    public double performOperation()
    {
        double result;
        if (getOperation().equals("+"))
        {
            result=getOperandOne()+getOperandTwo();
            return result;
        }
        else if(getOperation().equals("-"))
        {   
            result=getOperandOne()-getOperandTwo();
            return result;
        }
        return 1;
    }
    public void getResults()
    {
        System.out.println("Result is: "+performOperation());
    }


} 