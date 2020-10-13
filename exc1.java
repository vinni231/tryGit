 class Area {
	 double len, width;
	    double side;
	    double rad;
	    Area(double l,double w) {
	        len=l;
	        width=w;
	    }
	    Area(double s){
	    	side=s;
	    }
	    Area(){
	    	rad=5;
	    }
	    
	    double areaRec() {
	    	return len*width;
	    }
	    
	    double areaSq() {
	    	return side*side;
	    }
	    
	    double areaCircle() {
	    	return 3.14*rad*rad;
	    }
	    
	    public static class exc1 {
	        public static void main(String args[]) {
	            Area rectangle = new Area(10,11);
	            Area square = new Area(100);
	            Area circle = new Area();
	            System.out.println("Area of Rectangle = " + rectangle.areaRec() + " sq. units");
	            System.out.println("Area of Square = " + square.areaSq() + " sq. units");
	            System.out.println("Area of Circle = " + circle.areaCircle() + " sq. units");
			System.out.println("trying git");
System.out.println("trying git and branch");
	        }
	    }
	    
}
	
