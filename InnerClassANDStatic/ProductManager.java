package InnerClassANDStatic;



public class ProductManager {
    public void Add(Product product){
        /* Asagideki kod,  static kullanılmadığı zaman yazılacka kod. ama biz bu tip utilif dediğimşz araçlarda her yerde newlemeden kullanmak daha mantıklıdır. 
        Bunun için ise onun operasyonunu(product'un isValid() operasyonu.)static yapmamız yeterlidir.*/
        System.out.println("******************");
        ProductValidator PV=new ProductValidator();
        System.out.println("******************");

        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi\n");
        }else{
            System.out.println("eklenemedi, bilgiler gecersiz.\n");
        }
        
        /**yanş şu şekilde.:  */
    }
    
}
