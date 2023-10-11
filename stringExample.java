package stirngexample;

public class stringExample{
	
	    public static void main(String[] args) {
	       
	        StringBuffer stringBuffer = new StringBuffer("johnny's");
	        stringBuffer.append(" world!");
	        System.out.println("Appended: " + stringBuffer);
	        stringBuffer.insert(8, " Java ");
	        System.out.println("Inserted: " + stringBuffer);
	        int length = stringBuffer.length();
	        System.out.println("Length: " + length);
	    }
	}


