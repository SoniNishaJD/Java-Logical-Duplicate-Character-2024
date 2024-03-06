import java.util.*;

public class DupChar {
	  public static void findDuplicates(String str){    
	        int count;    
	            
	                //Converting given string into character array    
	            char strArray[] = str.toCharArray();    
	            
	                System.out.println(" Duplicate characters in a given string:  " );    
	                //Counting each character present in the string    
	                for(int i = 0; i <strArray.length; i++) {    
	                        count = 1;    
	                    for(int j = i+1; j <strArray.length; j++) {    
	                            if(strArray[i] == strArray[j] && strArray[i] != ' ') {    
	                                    count++;    
	                                    //Set strArray[j] to 0 to avoid printing visited character    
	                                    strArray[j] = '0';    
	                            }    
	                        }    
	                        //A character is considered as duplicate if count is greater than 1    
	                        if(count > 1 && strArray[i] != '0')    
	                            System.out.println(str+" contains "+strArray[i]+" "+ count + " times");    
	                }           
	    }     
	  
	    
	    public static void main(String[] args) {   
	      
	        //Getting string from the user  
	        Scanner sc = new Scanner(System.in);   
	        String str = sc.nextLine();  
	      
	        //Calling findDuplicates() method to find the duplicate characters in the string  
	        findDuplicates(str);  
	    }  

}
