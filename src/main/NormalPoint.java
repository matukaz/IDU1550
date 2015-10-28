package main;

import java.util.Map;

public class NormalPoint {

	double x;
	double y;

	public NormalPoint() {
		this.x = 0;
		this.y = 0;
	}

	public NormalPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double rho() {
		return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
	}

	public double tehta() {
		return Math.atan2(getY(), getX());
	}

	public double distance(NormalPoint other) {
		return this.vectorTo(other).rho();
	}

	public NormalPoint vectorTo(NormalPoint other) {
		return new NormalPoint(other.getX() - this.getX(), other.getY() - this.getY());
	}

	public void translate(double dx, double dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}

	public void scale(double factor) {

		this.x *= factor;
		this.y *= factor;
	}

	// rotate point around center point. This class takes inside a radians not
	// degrees!
	public void centre_rotate(double angle) {
		double temp_x = this.rho() * Math.cos(this.tehta() + angle);
		double temp_y = this.rho() * Math.sin(this.tehta() + angle);

		this.x = temp_x;
		this.y = temp_y;
	}

	public void rotate(NormalPoint other, Double angle) {
		this.translate(-other.getX(), -other.getY());
		this.centre_rotate(angle);
		this.translate(other.getX(), other.getY());
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
		NormalPoint other = (NormalPoint) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

}
