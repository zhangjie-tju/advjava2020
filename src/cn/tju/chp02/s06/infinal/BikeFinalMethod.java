package cn.tju.chp02.s06.infinal;

class BikeBase{
	final void run(){
		System.out.println("running");
	}
}

public class BikeFinalMethod extends BikeBase{
//	@Override
//	void run(){
//		System.out.println("running override");
//	}

	public static void main(String[] args) {
		new BikeFinalMethod().run();

	}

}
