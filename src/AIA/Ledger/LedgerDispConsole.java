package AIA.Ledger;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


/**
 * 프로그램이 실행되는 동안 콘솔에 선택지를 출력해주고 유저의 선택을 입력받고 그 선택지의 기능을 실현시켜주는 클래스. 
 * @author Jonghyun John Yoo PC
 *
 */
public class LedgerDispConsole {
	public static Scanner sc = new Scanner(System.in);
	public static LedgerWriter saver = new LedgerWriter();
	
	public static void work(Record record) throws Exception {
		HashMap<String, Method> order = new HashMap<String, Method>();
		order.put("1", LedgerDispConsole.class.getMethod("add", Record.class));
		order.put("2", LedgerDispConsole.class.getMethod("delete", Record.class));
		order.put("3", LedgerDispConsole.class.getMethod("edit", Record.class));
		order.put("4", LedgerDispConsole.class.getMethod("search", Record.class));
		order.put("5", LedgerDispConsole.class.getMethod("print", Record.class));
		Set<String> keys = order.keySet();
		String todo = "";
        while(!todo.equals("6")){
            System.out.println("=============Select One===============");
            System.out.println("1. Add an invoice \n2. Delete an invoice \n3. Edit an invoice \n"
            		+ "4. Search for an invoice \n5: Print all records "+
            		"\n6: Exit");
            System.out.println("======================================");
            
            todo = sc.nextLine();
            if(keys.contains(todo)) {
            	
            	order.get(todo).invoke(null, record);
            
            }else if(!todo.equals("6")) {
            	System.out.println("\nAN ERROR MESSAGE: Please enter runnable commands\n");
            }    
        }
        saver.saveRecords(record);
        System.out.println("All changes saved");
        sc.close();
    }

	public static void print(Record record) {
		record.printAllRecords();
		
	}

	public static void search(Record record) {
		System.out.println("Enter what you know about it");
        String clue = sc.nextLine();
        record.search(clue);
	}

	public static void edit(Record record) {
		System.out.println("Enter the number of invoice you want to edit");
        String numtoedit = sc.nextLine();
        int nume = Integer.parseInt(numtoedit);
        record.editRecord(nume);
	}

	public static void delete(Record record) {
		System.out.println("Enter the number of invoice you want to delete");
        String numtodel = sc.nextLine();
        int dnum = Integer.parseInt(numtodel);
        record.deleteRecord(dnum);
	}

	public static void add(Record record) {
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
            
            System.out.println("Did you get receipt 1.Yes or 2.No?");
            String receipt = sc.nextLine();
            if (receipt.equals("1")){
                invoice.add("Have");
            }
            if(receipt.equals("2")){
                invoice.add("Do not Have");
            }
        }
        record.addRecord(invoice);
	}
}
