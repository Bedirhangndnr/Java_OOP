package InnerClassANDStatic;
/**Urunu gundellerken falan, utunun kurallara uygun olup olmadıgını kontrol eder. */

public class ProductValidator {
/**Urunu gundellerken falan, utunun kurallara uygun olup olmadıgını kontrol eder. */
    static {
        System.out.println("Static Yapıcı Blok Çalıştı\n");
    }
    public ProductValidator(){
        System.out.println("Yapıcı Blok Çalıştı\n");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void mainde_denemek_icin(){
        System.out.println("mainde denemek icin static method");
    }
    
}
