package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public void gameOver() {
		System.out.println("Oyun bitti");
	}

	/*
	 * 	public final void gameOver() {
		System.out.println("Oyun bitti");
		
		ABSTRACT CLASSLAR ASLA NEWLENEMEZ;
		final anahtar s�zc��� olursa override edemezsin bu method �al���cak
		abstract kullanmak i�in abstract class olmak zorunda,final i�in zorunlu de�il
		abstract anahtar s�zc��� olursa override etmek zorundas�n hepsinin i�ini gidip extends classlarda doldurmal�s�n
	}
	 * */
}
