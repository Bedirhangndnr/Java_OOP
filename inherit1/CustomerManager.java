package inherit1;

public class CustomerManager {

	public void add(Logger logger) {
		//M��teri ekleme kodlar�s
		System.out.println("M��teri eklendi.");
		//Bir i� yapan s�n�f, ba�ka bir i� yapan s�n�f� kullanacaksa,
		//Asla ve asla somut s�n�ftan gidilmez.
		//Somut s�n�f, file, database vs. i� yapan s�n�flara somut s�n�f denir.
		//Ve bunlar� asla new'leyemeyiz.
		//E�er bir kodun i�erisinde ba�ka bir i� yapan s�n�f new'leniyorsa,
		//O koddan ileriye d�n�k hay�r gelmez, s�rd�rebilir de�il.
		
		//DatabaseLogger logger = new DatabaseLogger();
		
		logger.log();
	
	}

}
