package foreignExchange;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriteClass {
	private FileWriter fw;
	private boolean isFileExist;
	ExchangeType exType;
	
	public FileWriteClass() {
		try {
			File file = new File("C:\\Users\\�̵���\\Desktop\\exchange.csv");
			if(file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			fw = new FileWriter("C:\\Users\\�̵���\\Desktop\\exchange.csv", true);					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void headerWrite() throws IOException {
		if(isFileExist == false) {
			String head = "��¥," + "ȯ�����," + "�ݾ�," + "ȯ�����," + "�Ž�����" + "\n";
			fw.write(head);
		}		
	}

	public void dataWrite(String exchangetype, double w, int cvtd, int returnwon) throws IOException {
		headerWrite();		
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		String result = sdf.format(c.getTime()) + "," + exchangetype  + "," + w + "," + cvtd + "," + returnwon + "\n";
		fw.write(result);
		fw.close();	
	}
}

