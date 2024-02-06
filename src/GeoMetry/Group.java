package GeoMetry;

import java.util.ArrayList;

public class Group {
	
	private String name;
	private ArrayList<Shape> shape;
	
	
	public Group(String name, ArrayList<Shape> shape) {
		super();
		this.name = name;
		this.shape = shape;
	}


	public String getName() {
		return name;
	}


	public ArrayList<Shape> getShape() {
		return shape;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setShape(ArrayList<Shape> shape) {
		this.shape = shape;
	}


	@Override
	public String toString() {
		return "Group: Name=" + name + ", Form=" + shape;
	}

	/**
	 * Method add shape from ArrayList 
	 * @param shape
	 */
	public void addShape(Shape shape) {
		if(!this.shape.contains(shape)) {
			this.shape.add(shape);
		}
	}
	
	/**
	 * Method remove shape from ArrayList 
	 * @param shape
	 */
	public void removeShape(Shape shape) {
		this.removeShape(shape);
	}
	
	/**
	 * Method print all shapes 
	 */
	public void printAllShapes() {
		int tmp = 0;
		for(Shape s : this.shape) {
			tmp++;
			System.out.println(s);
		}
		System.out.println("Anzahl an Formen: " + tmp);
	}
	
	/**
	 * Method calculate all areas 
	 * @return
	 */
	public double calculateAllAreas() {
		double sum = 0;
		for(Shape s : this.shape) {
			sum += s.calculateArea();
		}
		return sum;
	}
	
	/**
	 * Method calculate all circumferences 
	 * @return
	 */
	public double calculateAllCirumference() {
		double sum = 0;
		for(Shape s : this.shape) {
			sum += s.calculateCircumference();
		}
		return sum;
	}
	
	/**
	 * Method calculate biggest area 
	 * @return
	 */
	public double calculateBiggestArea() {
		double temp = 0;
		for(Shape s : this.shape) {
			if(temp < s.calculateArea()) {
				temp = s.calculateArea();
			}
		}
		return temp;
	}
	/**
	 * Method calculate biggest circumference 
	 * @return
	 */
	public double calculateBiggestCirumference() {
		double temp = 0;
		for(Shape s : this.shape) {
			if(temp < s.calculateCircumference()) {
				temp = s.calculateCircumference();
			}
		}
		return temp;
	}
	
	
}


