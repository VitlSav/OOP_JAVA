package ua.lpnuai.savchyn7;

import java.util.*;

public class Lab_8 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the text:");
		String text = scn.nextLine();
		int leng;
		do {
		    System.out.println("length of the word:");
		    leng = scn.nextInt();
		}
		while(leng <= 0 && leng > 500);
		
		System.out.print("Your text:  ");
		System.out.println (text);
		System.out.print ("Result:  ");
		
		char txt[] = text.toCharArray();
		int mas [] = new int [500];
		mas[0]=1;
		int k=1;
		
		for(int i=0, l=txt.length; i<l; i++) {
			if(txt[i]==' ') {
				mas[i]=1;
			}
			else
				mas[i]=0;	
		}
		int h=0;
		for(int i=0, l=txt.length; i<l; i++) {
			if(txt[i] != ' ')
				h++;
			else {
				mas [i-h]=h+2;
				h=0;
			}
		}
		
		for(int i=0, l=txt.length; i<l-1; i++) {
		    if (mas[i]==1 && (txt[i+1] == 'q' || txt[i+1] == 'w' || txt[i+1] == 'r' || txt[i+1] == 't' || txt[i+1] == 'p' || txt[i+1] == 's' || txt[i+1] == 'd' || txt[i+1] == 'f' || txt[i+1] == 'g' || txt[i+1] == 'h' || txt[i+1] == 'j' || txt[i+1] == 'k' || txt[i+1] == 'l' || txt[i+1] == 'z' || txt[i+1] == 'x' || txt[i+1] == 'c' || txt[i+1] == 'v' || txt[i+1] == 'b' || txt[i+1] == 'n' || txt[i+1] == 'm' ) && mas[i+1] == leng+2) {
		    	for (int j=i+1; j<100; j++) {
		    		if(mas[j] == 1)
		    			
		    			break;
		    		else {
		    			txt[j]='#';
		    		}
		    	}
		    }
		}
		if (txt[1]=='#')
			txt[0]='#';
		for (int i=0, l=txt.length; i<l; i++) {
			if(txt[i]!='#') {
				System.out.print(txt[i]);
			}
		}
	}

}
