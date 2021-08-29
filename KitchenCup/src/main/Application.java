package main;
import kitchen.Cup;

public class Application {

	public static void main(String[] args) {
		
		Cup cupA = new Cup( "Milk", 300 );
		Cup cupB = new Cup( "Water", 500 );

		cupA.setLiquidVolume( cupA.getLiquidVolume()-50 );
		cupB.setLiquidVolume( cupA.getLiquidVolume()+50 );

		System.out.printf( "Cup A contains %dMl of %s\n", cupA.getLiquidVolume(), cupA.getLiquidName() );
		System.out.printf( "Cup B contains %dMl of %s\n", cupB.getLiquidVolume(), cupB.getLiquidName() );

	}

}
