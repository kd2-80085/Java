import java.util.Objects;

public class CustomString {
	    private String value;

	    public CustomString(String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }


	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        CustomString other = (CustomString) obj;
	        return Objects.equals(this.value, other.value);
	    }
	    
	    @Override
	    public int hashCode() {
	        return value.hashCode();
	    }
	}

//@Override
//public boolean equals(Object obj) {
//    if (this == obj)
//        return true;
//    if (obj == null || getClass() != obj.getClass())
//        return false;
//    CustomString other = (CustomString) obj;
//    String thisValue = this.value;
//    String otherValue = other.value;
//
//    if (thisValue == null && otherValue == null) {
//        return true; // Both values are null
//    } else if (thisValue == null || otherValue == null) {
//        return false; // One value is null, the other is not
//    } else if (thisValue.length() != otherValue.length()) {
//        return false; // Different lengths
//    } else {
//        // Compare character by character
//        for (int i = 0; i < thisValue.length(); i++) {
//            if (thisValue.charAt(i) != otherValue.charAt(i)) {
//                return false; // Characters do not match
//            }
//        }
//        return true; // All characters match
//    }
//}
