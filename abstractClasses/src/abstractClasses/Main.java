package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator woman =new WomanGameCalculator();
		woman.gameOver();
		
		KidsGameCalculator kids=new KidsGameCalculator();
		kids.gameOver();
		
		/*GameCalculator game=new GameCalculator() {
			
			@Override
			public void hesapla() {
				// TODO Auto-generated method stub
				
			}
		};
		
		ABSTRACT CLASSLARI NEWLEYEMEZS�N NEWLERSEN B�YLE HER SEFER�NDE ���N� DOLDURMAN GEREK
		bu classlar genelde base class� saklamak/gizlemek i�in kullan�l�r bir de zorunlu i�ini doldurma zorunlulu�u sa�layabiliyoruz
		*/
	}

}
