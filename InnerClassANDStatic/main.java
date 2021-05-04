package InnerClassANDStatic;

public class main {
     public static void main(String[] args){
         ProductManager PM= new ProductManager();
         Product product=new Product();
         product.price=-10;
         product.name="mouse";

         PM.Add(product);

         ProductValidator pc=new ProductValidator();
         ProductValidator.mainde_denemek_icin();

     }
} 
