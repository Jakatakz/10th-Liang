
public class C137 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C13_5_GeometricObject[] GeoObjArray1 = new C13_5_GeometricObject[5];
		//for each obj, display area, invoke howtoccolor method if its colorable
		
		GeoObjArray1[0] = new Circle(5);
		GeoObjArray1[1] = new C137_Square(10);
		GeoObjArray1[2] = new C137_Square(20);
		GeoObjArray1[3] = new C137_Square(30);
		GeoObjArray1[4] = new Circle(10);
		
		for (int i = 0; i < GeoObjArray1.length; i++)
		{
			if (GeoObjArray1[i] instanceof Colorable)
				System.out.println(GeoObjArray1[i].getArea() + " " + ((Colorable) GeoObjArray1[i]).howToColor());
		}
		
	}

}
