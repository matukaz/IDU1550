package main;


// This class is equal to NormalPoint.class but has some differences.
public class RhoTehtaPoint {
/**
	double rho;
	double tehta;
	
	public Point2(){
		this.rho = 0;
		this.tehta = 0;
	}
	
	 public Point2(double x, double y){
		 this.x = x;
		 this.y = y;
	 }
	 
		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}
		
		public double rho(){
			return Math.sqrt(Math.pow(getX(),2)+Math.pow(getY(),2));
		}
		
		public double tehta(){
			return Math.atan2(getY(), getX());
		}
		
		public double distance(Point other){
			return this.vectorTo(other).rho();
		}
		public Point vectorTo(Point other){
			return new Point(other.getX() - this.getX(), other.getY()-this.getY());
		}
		
		// Commands
		
		public void translate(double dx, double dy){
			this.x = this.x + dx;
			this.y = this.y + dy;
		}
		
		public void scale(double factor){
			
			this.x *= factor;
			this.y *= factor;
		}
		
		public void centre_rotate(double angle){
			double temp_x = this.rho()*Math.cos(this.tehta()+angle);
			double temp_y = this.rho()*Math.sin(this.tehta()+angle);
		
			this.x = temp_x;
			this.y = temp_y;
		}
		
		public void rotate(Point p, Double angle){
			this.translate(-p.getX(), -p.getY());
			this.centre_rotate(angle);
			this.translate(p.getX(), p.getY());
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(x);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(y);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
				return false;
			if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
				return false;
			return true;
		} **/


}
