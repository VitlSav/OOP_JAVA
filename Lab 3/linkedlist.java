package com.tasks3.linkedlist;

    public class LinkedList {
    	int size;
    	Node head;
    	Node tail;
    	Node current;
    	public LinkedList() {
    		 size = 0;
    		 head=null;
    		 tail=null;
    		
    	}

    	public void add(Integer data) {
    		Node new_Node=new Node();
    		new_Node.setData(data);
    		if(tail==null) {
    			head=new_Node;
    			tail=new_Node;
    		}else {
    	        tail.setNext(new_Node);
    	        tail=new_Node;
    		}
    		size++;
                    
    	}

    	public Integer get(int index) {
                    //PUT YOUR CODE HERE
    		current=head;
    		if(index>size) {
    			return null;
    		}
    		else if(index==0){
    			{
    				return head.getData();
    			}
    		}
    			else {	while(index>0) {
    				if(current==null) {
    					return null;
    				}else {
    					current=current.getNext();
    					index--;    					
    				}
    			}
    			return current.getData();   			
    		}
    		    		
                    //PUT YOUR CODE HERE
    	}

    	public boolean delete(int index) {
                    //PUT YOUR CODE HERE
    		if (size() == 0 || index > size()-1) {
    	        return false;
    	    }
    		if(index<0) {
            size--;
    			return false;
    		}
    		if(index==0) {
    			head=head.getNext();
    			size--;
    			return true;
    		}
    	 else if ((index == 0) && (head == tail)) {
    	        head = head.getNext();
    	        if (head == null) {
    	            tail = null;
    	        }
    	        size--;
    	        return true;
    		}
    		else { 
    		 
    		  Node previous=head;
    		  Node current=head.getNext();
    		  
    		   for (int i=0; i<size; i++) {
    			   if(i+1 == index) {
    				   previous.setNext(null);
    				   previous.setNext(current.getNext());
    				   current=null;
    				   i=size;
    			   }else {
    				   previous=current;
    				   current=current.getNext();
    			   }
    			   
    		}
    		
    		
    		size--;
    		return true;
    		}
                    //PUT YOUR CODE HERE
    	}

    	public int size() {
                    //PUT YOUR CODE HERE
    		return size;
                    //PUT YOUR CODE HERE
    	}
    	
    	
    	class Node{
        	private Integer data;
        	private Node next;
        	
        	
        	public Node() {
        	}

        	public Node getNext() {
        		return next;
        	}
        	public void setNext(Node next) {
        		this.next = next;
        	}
        	public Integer getData() {
        		return data;
        	}
        	public void setData(Integer data) {
        		this.data = data;
        	}
        }
}