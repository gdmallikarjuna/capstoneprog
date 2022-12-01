package com.snipe.learning.corejava;

class Color {
	String colour;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Color(String colour) {
		super();
		this.colour = colour;
	}
	
	
	public static void swap(Color cola,Color colb) {
		Color temp = cola;
		cola = colb;
		colb= temp;
		System.out.println("inside method");
		System.out.println("red_color:"+cola.getColour());
		System.out.println("blue_color:"+colb.getColour());
	}

}

public class PassByValueandReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Color red_color = new Color("Red");
		Color blue_color = new Color("Blue");
		Color.swap(red_color,blue_color);
		System.out.println("original objects");
		System.out.println("red_color:"+red_color.getColour());
		System.out.println("blue_color:"+blue_color.getColour());
			
	}

}
