package com.tasks3.fibonacci;

public class Fibonacci
{
	public long getNumber(int position){
		if(position%1 != 0 || position<1) {
			return -1l;
		}
		else if(position <3){
			return 1l;
		}
		else{
			return (long)(getNumber(position - 1)+getNumber(position - 2));

		}
	}
}
