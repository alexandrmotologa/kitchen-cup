package kitchen;

public class Cup {

	private String liquidName;
	private short liquidVolume;
	
	Cup(){

    }
	
    public Cup( String liquidName, int liquidVolume ){
        setLiquidName(liquidName);
        setLiquidVolume( (short)liquidVolume );
        
    }
    
    //get method for liquidName
    public String getLiquidName() {
    	return liquidName;
    }
    
    //set method for liquidName
    public void setLiquidName(String liquidName) {
    	
    	if( liquidName.equals("Water") || liquidName.equals("Milk") || liquidName.equals("Tea") ) {
			this.liquidName = liquidName;
			
		} else {
			System.err.println( "Something Wrong! This Cup is intend for omly water, milk or tea." );
		}
    }
    
    //get method for liquidVolume
    public int getLiquidVolume() {
		return liquidVolume;
	}
    
    //set method for liquidVolume
    public void setLiquidVolume(int liquidVolume) {
    	
		if( liquidVolume >= 0 && liquidVolume <=600 ) {
			this.liquidVolume = (short)liquidVolume;
			
		} else if( liquidVolume < 0 ) {
			System.err.println( "Something Wrong! This cup cannot receive the negative liquid value, because - the laws of physics" );
			
		} else if( liquidVolume > 600 ){
			System.err.println( "Something Wrong! This cup cannot receive values greater than 600 mL" );
		}
	}
}
