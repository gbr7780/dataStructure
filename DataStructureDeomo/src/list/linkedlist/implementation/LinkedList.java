package list.linkedlist.implementation;

public class LinkedList {
	// head -> 누가 첫번째 노드인지
	private Node head;
	
	// tail -> 누가 제일 끝에 있는 노드인지
	private Node tail;
	
	// 리스트 사이즈 개수 
	private int size = 0;
	
	// Node -> 하나의 객체고 이너 클래스로 사용
	// Node의 필요한 것 1.데이터 2. 다음 노드
	private class Node {
		private Object data;
		private Node next;
		
		// 생성자
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		// 테스트용 -> 데이터 값을 출력하기 위해서!
		public String toString() {
			return String.valueOf(this.data);
		}
		
	}
}
