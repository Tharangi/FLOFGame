package FLOG_LOGIC;	

/**
 * @author DINUKA
 */
class FunctionElement extends FlogElement {
    private String functionName = "";
    
    FunctionElement(String functionName){
        this.functionName = functionName;
    }
    
    public void setFunctionName(String functionName){
         this.functionName = functionName;
    }
    
    public String getFunctionName(){
        return this.functionName;
    }
}