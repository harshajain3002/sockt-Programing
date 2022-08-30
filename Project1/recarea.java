class rectArea {
  // fields to calculate area
  int length;
  int breadth;
  
  rectArea(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }
  // method to calculate area
  public void getArea() {
    int area = length * breadth;
    System.out.println("The area is:" + area);
  }
}

public class recarea {
	public static void main(String[] args) {
	    // create object of Area
	    // pass value of length and breadth
		 rectArea rectangle  = new rectArea(8, 9);
		    rectangle.getArea();
}
}