class Area {
	private static final double PI = 3.14159;
	private double radius;

	public Area(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return PI * radius * radius;
	}

	public static void main(String[] args)
	{
		Area obj = new Area(5.0);
		System.out.println("Area of circle: " + obj.getArea());
	}
}