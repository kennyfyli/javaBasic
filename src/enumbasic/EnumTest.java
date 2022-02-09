package enumbasic;

public class EnumTest {

	public void judge(SeasonEnum s) {
		switch (s) {
			case SPRING:
				System.out.println("ENUM spring");
				break;
			case SUMMER:
				System.out.println("ENUM summer");
				break;
			case FALL:
				System.out.println("ENUM fall");
				break;
			case WINTER:
				System.out.println("ENUM winter");
				break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("judge test ++++++++++");
		new EnumTest().judge(SeasonEnum.SUMMER);
		
		System.out.println("enum value test ++++++++++");
		// .values() return list [] of all values of enum
		SeasonEnum[] enumList = SeasonEnum.values();
		
		System.out.println(enumList[0]);
		System.out.println(SeasonEnum.WINTER);
		System.out.println(SeasonEnum.WINTER.toString());
		
		System.out.println("value of test ++++++++++");
		SeasonEnum s = Enum.valueOf(SeasonEnum.class, "SUMMER");
		System.out.println(s);
		// Enum.valueOf(SeasonEnum.class, "SUMMER"); will cause "No enum constant" error
		// same as class
		s.name = "testname";
		System.out.println("SUMMER field name test:" + s.name);
		
		SeasonEnum w = Enum.valueOf(SeasonEnum.class, "WINTER");
		System.out.println("WINTER not set:" + w.name);
		
		// but ENUM normally is unchangeable 'class'
		// use private and final keywords with constructor to set the field
		
	}

}
