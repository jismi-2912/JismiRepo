package sample;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello world");
		System.out.println(sb);
		
		//append() -> add new string at the end
		sb.append("java");
		System.out.println(sb);
		
		//insert()
		sb.insert(5,"hi");
		System.out.println(sb);
		
		//replace()
		sb.replace(1, 3,"example");
		System.out.println(sb);
		
		//reverse()
		sb.reverse();
		System.out.println(sb);
		
		//delete()
		sb.delete(1, 3);
		System.out.println(sb);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
