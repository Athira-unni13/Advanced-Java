package stringpack;

public class StringBufferBuilderCapacity {

	public static void main(String[] args) {
		
		StringBuffer buff = new StringBuffer("");
		StringBuffer buffer = new StringBuffer(6);
		
		System.out.println(buff.capacity());//initial capacity 16(default)
		System.out.println(buff.length());//0
		
		buff = new StringBuffer("Java");//4 length
		
		System.out.println(buff.capacity());//20
		System.out.println(buff.length());//4
		
		buff.append(" programming");//12
		System.out.println(buff.capacity());//20
		System.out.println(buff.length());//16
		System.out.println(buff);//Java programming
		
		buff.append(" Language");
		System.out.println(buff.capacity());//20 is not enough so the capacity become 20*2+2=42
		System.out.println(buff.length());//25
		
		buff.append(" Luminar Technolab");
		System.out.println(buff.capacity());//42 is not enough so 42*2+2 = 86
		System.out.println(buff.length());//43
		//<=============StringBuffer object buffer============>
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		
		
		//StringBuffer buffer = new StringBuffer(6); here 6 is the initial capacity
		buffer.append("Marit campus 1234");
		System.out.println("Length: "+buffer.length());
		System.out.println("Capacity: "+buffer.capacity());//6*2+2=14 but here the length of the string is
								//greater than the new capacity so its capacity become the length of string
								//this is only when we try to append on the initial capacity	
	}

}
