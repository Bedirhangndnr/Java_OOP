package inherit1;

public class main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		Logger[] loggers=new Logger[]{new FileLogger(), new EmailLogger()};
		for (Logger logger : loggers) {
			logger.log();
			customerManager.add(logger);

		}
		System.out.println("\n\n");
		EmailLogger log_dene=new EmailLogger();
		log_dene.log();
	
	}	

}
