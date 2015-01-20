package elastic;

import org.apache.log4j.Logger;

public class ExampleLog {

	static Logger log = Logger.getLogger(ExampleLog.class);

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			log.info("Esse � um log de Debug!");
			log.warn("Esse � um log de Warning!");
			log.error("Esse � um log de Erro!");
			Thread.sleep(100000);
		}
	}
}
