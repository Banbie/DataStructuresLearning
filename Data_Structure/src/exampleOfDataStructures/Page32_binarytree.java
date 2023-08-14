package exampleOfDataStructures;

public class Page32_binarytree {
	private Node start;
	public Page32_binarytree() {start=null;}	//생성자
	
	public class Node{	//노드(섬) 개별 생성
		private char name;
		private Node left, right;
		public Node(char newIsland, Node lt, Node rt) {name = newIsland; left = lt; right=rt;}
	}
	
	public Node map() {	//노드(섬)간 관계 설정
		Node n1 = new Node('H', null, null); Node n2 = new Node('F', null, null); 
		Node n3 = new Node('S', null, null); Node n4 = new Node('U', null, null); 
		Node n5= new Node('E', null, null); Node n6 = new Node('Z', null, null); 
		Node n7 = new Node('K', null, null); Node n8 = new Node('N', null, null); 
		Node n9 = new Node('A', null, null); Node n10 = new Node('Y', null, null); 
		Node n11 = new Node('T', null, null);
		
		n1.left = n2;	n1.right = n3;
		n2.left = n4;	n2.right = n5;
		n3.left = n6;	n3.right = n7;
		n4.left = n8;	n5.right = n9;
		n7.left = n10;	n9.right = n11;
		
		return n1;
	}
	
	//여기부터
	
	public void A_Course(Node n) {
		if(n!=null) {
			System.out.print(n.name+"-> ");
			A_Course(n.left);
			A_Course(n.right);
		}
	}
	
	public void B_Course(Node n) {
		if(n!=null) {
			B_Course(n.left);
			System.out.print(n.name+"-> ");
			B_Course(n.right);
		}
	}
	
	public void C_Course(Node n) {
		if(n!=null) {
			C_Course(n.left);
			C_Course(n.right);
			System.out.print(n.name+"-> ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Page32_binarytree travel = new Page32_binarytree();
		travel.start = travel.map();
		System.out.print("A-Course : ");	travel.A_Course(travel.start);
		System.out.print("\nB-Course : ");	travel.B_Course(travel.start);
		System.out.print("\nC-Course : ");	travel.C_Course(travel.start);

	}

}
