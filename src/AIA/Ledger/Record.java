package AIA.Ledger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/***
 * 유저의 수입/지출 내역을 추가하고 지우고 하는 모든 업무를 가지고 있는 클래스. 
 * 
 * @author Jonghyun John Yoo PC
 *
 */
public class Record {
	Scanner sc = new Scanner(System.in);
	private ArrayList<ArrayList<String>> allRecords = new ArrayList<ArrayList<String>>();

    public ArrayList<ArrayList<String>> getAllRecords(){
        return allRecords;
    }

    public void addRecord(ArrayList<String> invoice) {
        allRecords.add(invoice);
    }

    public void editRecord(int num){
        System.out.println("Which information do you want to change?\n1. date 2. amount 3. description 4. type(Cost/Revenue)");
        String choice = sc.nextLine();
        switch(choice){
            case "4":
                System.out.println("Was it falsely reported to be revenue/cost?");
                String ntype = sc.nextLine();
                allRecords.get(num-1).set(0,ntype);
                break;
            case "1":
                System.out.println("Enter the new date: ");
                String ndate = sc.nextLine();
                allRecords.get(num-1).set(1, ndate);
                break;
            case "2":
                System.out.println("Enter the new amount: ");
                String amount = sc.nextLine();
                allRecords.get(num-1).set(2, amount);
                break;
            case "3":
                System.out.println("Enter the new description: ");
                String ndesc = sc.nextLine();
                allRecords.get(num-1).set(3, ndesc);
                break;
            default:
                System.out.println("\nPlease put valid NUMBER\n");
                editRecord(num);
        }
        System.out.println("\nYour request has been succesfully resolved");
        return;//재귀로인한 위의 문장 반복 출력방지
    }

    public void printAllRecords() {
        int total = 0;
        System.out.println("\n/////////////////////////////////////////////////////////////\n");
        System.out.printf("\t\t\tYour Invoices:\n");
        for(int i = 0; i<allRecords.size();i++){
            System.out.println("\nInvoice "+ (i+1)+" "+ allRecords.get(i));
            if(allRecords.get(i).get(0).equals("R")){
                total += Integer.parseInt(allRecords.get(i).get(2));
            }
            else{
                total -= Integer.parseInt(allRecords.get(i).get(2));
            }
        }
        System.out.println("\n      Total balance: "+total);
        System.out.println("\n/////////////////////////////////////////////////////////////\n");
    }

    public void deleteRecord(int num) {
        allRecords.remove(num-1);
        System.out.println("Invoice "+num+" is deleted");
    }

    public void search(String clue){
	    for(int i = 0; i<allRecords.size();i++){
	        List<String> ithVals = allRecords.get(i);
	        if(ithVals.contains(clue)){
	            System.out.println("\nInvoice number: "+ (i+1)+" contains: "+clue+" \n"+ allRecords.get(i));
	        }
	    }
    }
}
