package AIA.Ledger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/***
 * Records.txt파일을 읽어오는 기능을 하는 클래스.
 * File로 동일 package 위치에 있는 Records.txt 파일의 위치를 잡아주고 FileReader를 사용해 텍스트 파일을 읽은 후
 * BufferReader로 버퍼로 읽어서 그 읽은 값을 record 객체에 넣어준다.
 * 
 * @author Jonghyun John Yoo PC
 *
 */
public class LedgerReader {
	public LinkedList<String> allRecords = new LinkedList<String>();
    
    public void readRecords(Record record){
        try{
            FileReader fileReader = new FileReader(new File("./src/AIA/Ledger/Records.txt"));
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            
            while((line = br.readLine()) != null){
            	ArrayList<String> lineArr = new ArrayList<String>(Arrays.asList(line.split(";")));
                record.addRecord(lineArr);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }	 
}
