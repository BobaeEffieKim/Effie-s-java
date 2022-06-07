package question1;

public class StandardWeightInfo extends Human{

	StandardWeightInfo(String name, double height, double weight) {
		super(name, height, weight);
	}


	
	public double getStandardWeight() {
		
		double standard = (super.getHeight() - 100) * 0.9;
		
		
		return standard;
		
	}
	
	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println(" 표준체중은 "+ getStandardWeight() +"입니다.");
	}

	
}
