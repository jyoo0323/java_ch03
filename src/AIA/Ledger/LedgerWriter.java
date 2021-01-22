package AIA.Ledger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/***
 * Records.txt파일에 덮어쓰는 기능을 담당하는 클래스.
 * 새로운 ArrayList(allRecords)에 record에 있던 모든 정보를 담은 후 allRecords에 있는걸 FileWriter를 사용해
 * 하나씩 Records.txt 파일에 쓰는 클래스
 * 
 * @author Jonghyun John Yoo PC
 *
 */
public class LedgerWriter {
    public void saveRecords(Record record) throws IOException {
    	ArrayList<ArrayList<String>> allRecords = record.getAllRecords();
    	
        FileWriter fileWriter = new FileWriter("./src/AIA/Ledger/Records.txt");

        try{
            for(int i = 0; i<allRecords.size();i++){
            	for(String str: allRecords.get(i)) {
            		fileWriter.write(str+";");
            	}
            	fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
