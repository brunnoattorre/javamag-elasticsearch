package elastic;

import org.apache.log4j.Logger;

public class ExampleLog {

	static Logger log = Logger.getLogger(ExampleLog.class);

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			log.info("Esse é um log de Debug!");
			log.warn("Esse é um log de Warning!");
			log.error("Esse é um log de Erro!");
			Thread.sleep(100000);
		}
	}
}
