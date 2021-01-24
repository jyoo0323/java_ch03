package AIA.Ledger;

/**
 * Ledger를 기동하는 드라이버 클래스. 친절한 인사말로 시작한다.
 * @author Jonghyun John Yoo PC
 *
 */
public class LedgerMain {

	public static void main(String[] args) throws Exception {
		System.out.println("JH가계부에 오신걸 환영합니다! \n");
		LedgerReader starter = new LedgerReader();
		Record records = new Record();
		
		starter.readRecords(records);
		
		LedgerDispConsole.work(records);
		System.out.println("이용해 주셔서 감사합니다. 좋은 하루 되세요!");
	}
}
