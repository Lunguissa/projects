package mz.co.lunguissa.Testes;

import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Properties;

import org.apache.log4j.Logger;

import mz.co.lunguissa.Interfaces.Janela_1;
import mz.co.lunguissa.Interfaces.Janela_2;
import mz.co.lunguissa.Interfaces.Janela_3;
import mz.co.lunguissa.dao.SenhaDao;
import mz.co.lunguissa.entity.Senha;

public class Teste {

	private static Logger log = Logger.getLogger(Teste.class);

	public static void main(String[] args) throws HeadlessException, ParseException {
		log.info("Starting app");
		
		log.info("Loading properties");
		Properties prop = loadProperties();
		
		log.info("Creating DAO");
		SenhaDao senhaDao = new SenhaDao(prop);
		Senha ent, sai;
		Janela_1 r = new Janela_1();
		r.setVisible(true);
		Janela_2 rd = null;
		Janela_3 rm = null;

		while (true) {
			
			ent = senhaDao.readEntSenha();
			if (ent != null) {
				log.info("Found new senha");
				rd = new Janela_2();
				rd.setVisible(true);
				senhaDao.updateEntSenha();
			}

			sai = senhaDao.readSaiSenha();
			if (sai != null) {
				log.info("Removing old senha");
				rm = new Janela_3();
				rm.setVisible(true);
				senhaDao.updateSaiSenha();
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				log.info(e);
			}
		}
	}

	private static Properties loadProperties() {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("C://HCM-LUNGUISSA/config.properties");

			// load a properties file
			prop.load(input);
			return prop;
		} catch (IOException ex) {
			log.info(ex);
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					log.info(e);
				}
			}
		}
		return prop;
	}
}
