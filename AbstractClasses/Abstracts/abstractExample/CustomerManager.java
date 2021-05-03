package AbstractClasses.Abstracts.abstractExample;

public class CustomerManager {
        /*
        public void getCustomer(){
        hatalı yaklaşım:
        OracleDataBaseManager odm=new OracleDataBaseManager();
        odm.getData();
        çünkü birsürü spesifik databse imiz olabili, daha dinamik ve sürdürülebilir bir çözüm gerekir
        }
        */
        /**olması gereken: */
        BaseDataBaseManager dataBaseManager;
        public void getCustomers(){
            dataBaseManager.getData();
            

    }
    
}
