package AIA.Ledger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * 프로그램이 실행되는 동안 콘솔에 선택지를 출력해주고 유저의 선택을 입력받고 그 선택지의 기능을 실현시켜주는 클래스. 
 * @author Jonghyun John Yoo PC
 *
 */
public class LedgerDispConsole {
	public Scanner sc = new Scanner(System.in);
	public LedgerWriter saver = new LedgerWriter();
	
	public void work(Record record) throws IOException {
		 String todo = "";
        while(!todo.equals("6")){
            System.out.println("=============Select One===============");
            System.out.println("1. Add an invoice \n2. Delete an invoice \n3. Edit an invoice \n"
            		+ "4. Search for an invoice \n5: Print all records "+
            		"\n6: Exit");
            System.out.println("======================================");
            todo = sc.nextLine();
            switch (todo){
                case "1":
                	add(record);
                    break;
                case "2":
                    System.out.println("Enter the number of invoice you want to delete");
                    String numtodel = sc.nextLine();
                    int dnum = Integer.parseInt(numtodel);
                    record.deleteRecord(dnum);
                    break;
                case "3":
                    System.out.println("Enter the number of invoice you want to edit");
                    String numtoedit = sc.nextLine();
                    int nume = Integer.parseInt(numtoedit);
                    record.editRecord(nume);
                    break;
                case "4":
                    System.out.println("Enter what you know about it");
                    String clue = sc.nextLine();
                    record.search(clue);
                    break;
                case "5":
                    record.printAllRecords();
                    break;
                case "6":
                	break;
                default:
                    System.out.println("\nAN ERROR MESSAGE: Please enter runnable commands\n");
            }
        }
        saver.saveRecords(record);
        System.out.println("All changes saved");
		
        sc.close();
    }

	private void add(Record record) {
		ArrayList<String> invoice = new ArrayList<String>();
		System.out.println("earn(R)? or pay(C)?");
        invoice.add(sc.nextLine());
        System.out.println("Enter the date");
        invoice.add(sc.nextLine());
        System.out.println("Enter the amount");
        invoice.add(sc.nextLine());
        System.out.println("Enter the description");
        invoice.add(sc.nextLine());
        if(invoice.get(0).equals("C")){
            System.out.println("Was it 1.Cash or 2.Credit?");
            String input = sc.nextLine();
            if (input.equals("1")){
                invoice.add("Cash");
            }
            if(input.equals("2")){
                invoice.add("Credit");
            }
        }
        record.addRecord(invoice);
	}
}
