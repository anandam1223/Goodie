package com;
import java.util.Scanner;
public class Goodie{
	String goody;
	int cost;
	Goodie(String goody,int cost){
		this.goody=goody;
		this.cost=cost;
	}
public static void main(String[] args) {
	Goodie h1=new Goodie("Fitbit Plus",7980);
	Goodie h2=new Goodie("IPods",22349);
	Goodie h3=new Goodie("MI Band",999);
	Goodie h4=new Goodie("Cult Pass",2799);
	Goodie h5=new Goodie("Macbook Pro",229900);
	Goodie h6=new Goodie("Digital Camera",11101);
	Goodie h7=new Goodie("Alexa",9999);
	Goodie h8=new Goodie("SAndWich Toaster",2195);
	Goodie h9=new Goodie("Microwave Oven",9800);
	Goodie h10=new Goodie("Scale",4999);
		System.out.println("enter a number of employees :");
		Scanner s=new Scanner(System.in);
		int emp=s.nextInt();
		Goodie[] h= {h1,h2,h3,h4,h5,h6,h7,h8,h9,h10};
		int min=h[0].cost;
		int max=h[0].cost;
		for(int i=0;i<emp;i++) {
			if(min<h[i].cost) {
				min=h[i].cost;

			}
			if(max>h[i].cost) {
				max=h[i].cost;
			}
			System.out.println(h[i].goody+" :"+h[i].cost);

		}
		System.out.println("The difference between the chosen goodie with highest price and lowest price is: "+(min-max));

	}

}






