package com.evergent.corejava.kulsum.applicationCasestudy;

public class AdultUser implements LibraryAccount{
	 private int age;
	    private String bookType;
	    public void registerAccount(int age) 
	    {
	        this.age=age;
	        try 
	        {
	            if(age<0)
	            {
	                throw new IllegalArgumentException("Age cannot be negative.");
	            }
	            if(age>12)
	            {
	                System.out.println("You have successfully registered under an Adult Account.");
	            } 
	            else
	            {
	                System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
	            }
	        } 
	        catch(IllegalArgumentException e) 
	        {
	            System.out.println(e.getMessage());
	        }
	    }
	    public void requestBook(String btype)
	    {
	        this.bookType = btype;
	        try
	        {
	            if(bookType==null || bookType.isEmpty())
	            {
	                throw new IllegalArgumentException("Book type cannot be null or empty.");
	            }
	            if("Fiction".equalsIgnoreCase(bookType))
	            {
	                System.out.println("Book Issued successfully, please return the book within 7 days.");
	            } 
	            else
	            {
	                System.out.println("Oops, you are allowed to take only adult Fiction books.");
	            }
	        } 
	        catch(IllegalArgumentException e) 
	        {
	            System.out.println(e.getMessage());
	        }
	    }
		@Override
		public void registerage(int age) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void registerbook(String book) {
			// TODO Auto-generated method stub
			
		}
		


}
