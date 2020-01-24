package dataStructure;

/*자료구조 연결리스트를 구현*/
public class LinkedList {
	Node head;
	Node tail;
	int size = 0;
	
	private class Node {
		Node next;
		Object data;
		
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void addElement(Object data) {
		Node node = new Node(data);
		if(head == null) {
			addFirst(data);
		} else {
			//마지막 node에 추가
			Node temp = new Node(data);
			
			Node temp2 = head.next;
			Node index = head;
			while(temp2 != null) {
				//반복문을 돌리면서 next를 하나씩 꺼내며 최종 끝에 위치해있는 node의 위치 찾기
				index = temp2;
				temp2 = temp2.next;
			}
			
			index.next = temp;
			index.next.next = null;
			//tail 노드가 마지막으로 추가된 node를 바라볼 수 있도록 
			tail = temp;
		} 
	}
	
	public void addFirst(Object data) {
		if(head == null) {
			Node temp = new Node(data);
			head = temp;
			head.next = null;
			tail = temp;
			//linkedList의 사이즈를 증가시킨다.
			size++;
		} else {
			return;
		}
	}
	
	public int size() {
		return size;
	}
	
	Node node(int index) {
		Node temp = head;
		for(int i = 0; i < index; i++)
			temp = head.next;
		return temp;
	}
	
	public Node remove(int index) {
		Node deletedNode = null;
		if(index == 0) {
			removeFirst();
		} else {
			Node temp = node(index);
			Node temp2 = node(index-1);
			
			//이전 node와 이후 node의 next노드를 연결해준다.
			temp2.next = temp.next;
			
			deletedNode = temp;
			temp = null;
			
			size--;
		}
		return deletedNode;
	}
	
	public Node removeFirst() {
		Node temp = head;
		head = temp.next;
		
		Node deletedNode = temp;
		temp = null;
		size--;
		return deletedNode;
	}
	
	public boolean contains(Object object) {
		Node temp = head;
		Node temp2 = tail;
		if(temp.data.equals(object)) {
			return true;
		} else if(temp2.data.equals(object)) {
			return true;
		} else {
			while(temp.next != null) {
				Node nextTemp = temp.next;
				if(nextTemp.data.equals(object)) {
					return true;
				}
				temp = temp.next;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addElement("우왕");
		linkedList.addElement("꼬왕");
		linkedList.addElement("helloWorld");
		System.out.println(linkedList.contains("우왕"));
		System.out.println(linkedList.contains("오우노우"));
		System.out.println(linkedList.contains("helloWorld"));
		linkedList.remove(1);
		System.out.println(linkedList.contains("우왕"));
		
	}
	
	/*static Node[] linkedNode;
	
	public void removeElement(int index) {
		int pointer = linkedNode[index].getPointer();
		linkedNode[index-1].setPointer(pointer);
		linkedNode[index] = null;
		//gc 시 제거대상이 되는 가?
	}
	
	public boolean add(int index, Object object) {
		//해당 위치에 이미 객체가 존재
		if(linkedNode[index] != null) {
			return false;
		} else {
			linkedNode[index] = new Node(index, object);
			Node.lastPointer = index;
			return true;
		}
	}
	
	public boolean contains(Object object) {
		if(search(object,0) != null) {
			return false;
		}
		return true;
		
	}
	
	private Object search(Object object, int index) {
		Object returnObject = null;
		if(index == linkedNode.length -1) {
			if(!linkedNode[index].getObject().equals(object)) {
				return null;
			}
		} 
		if(index == Node.lastPointer-1) {
			if(!linkedNode[index].getObject().equals(object)) {
				return null;
			}
		} else {
			int pointer = linkedNode[index].getPointer();
			returnObject = linkedNode[index].getObject();
			if(returnObject.equals(object)) {
				return returnObject;
			} else {
				//그 다음 위치에 해당하는 object를 반환하도록 
				search(object, pointer);
			}
		}
		return returnObject;
	}

	public Object get(int index) {
		return linkedNode[index].getObject();
	}*/
}