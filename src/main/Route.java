package main;

import java.util.ArrayList;
import java.util.List;

public class Route {

	List<NormalPoint> list = null;

	public List<NormalPoint> getList() {
		return list;
	}

	public void create_route() {

		list = new ArrayList<NormalPoint>();

	}

	public void add_point(double x, double y, int index) {

		list.add(index, new NormalPoint(x, y));

	}

	public void remove_point(int index) {

		list.remove(index);

	}

	public double get_length() {

		double distance = 0;
		int arraySizeTwo = 2;

		// if route does not have more than 2 points it will return zero else it
		// will calculate distance between points.
		if (list.size() >= arraySizeTwo) {
			for (int i = 1; i < list.size(); i++) {

				NormalPoint firstPoint = list.get(i - 1);
				NormalPoint secondPoint = list.get(i);
				distance += firstPoint.distance(secondPoint);

			}
			return distance;
		} else {
			return distance;
		}

	}

}
