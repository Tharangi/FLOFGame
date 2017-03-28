package FLOG_LOGIC;

/**
 * @author DINUKA
 * Contains constant elements.
 */
class ConstantElement extends FlogElement {
    
    /** Set the constant value. */
    ConstantElement(double value){
        super.value = value;
    }

    public double getValue(){
	return this.value;
    }
    
}