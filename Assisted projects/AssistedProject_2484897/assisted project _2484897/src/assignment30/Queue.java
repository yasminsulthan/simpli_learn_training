package assignment30;



public class Queue {
	public static void main(String[] args) 
	{
		java.util.Queue<String> locationsQueue = new java.util.LinkedList<String>();
		locationsQueue.add("Kolkata");	
		        		locationsQueue.add("Patna");
		        		locationsQueue.add("Delhi");
		        		locationsQueue.add("Gurgaon");
		        		locationsQueue.add("Noida");
		                System.out.println("Queue is : " + locationsQueue);
		        		System.out.println("Head of Queue : " + locationsQueue.peek());
		        		locationsQueue.remove();
		        		System.out.println("After removing Head of Queue : " + locationsQueue);
		        		System.out.println("Size of Queue : " + locationsQueue.size());
		    	}
		}
		 
     		
