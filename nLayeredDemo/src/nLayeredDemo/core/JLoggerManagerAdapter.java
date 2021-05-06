package nLayeredDemo.core;

import nLayeredDemo.jLogger.jLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logRoSystem(String massage) {
		jLoggerManager manager=new jLoggerManager();
		manager.log(massage); 
		
	}

}
