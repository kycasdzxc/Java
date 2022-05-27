package a220209;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<Addr> addrs = new HashSet<Addr>();
		
		String str = new String("고길동");
		Addr addr = new Addr(1, "고길동");
		Addr addr2 = new Addr(1, "고길동");
		Addr addr3 = new Addr(11, "고길동");
		Addr addr4 = new Addr(1, "1고길동");
		
		System.out.println(addr3.hashCode());
		System.out.println(addr4.hashCode());
		System.out.println("11고길동".hashCode());
		
//		System.out.println(addr.hashCode());
//		System.out.println(addr2.hashCode());
//		System.out.println("고길동".hashCode());
//		System.out.println(new Integer(1).hashCode());
//		System.out.println(new Integer(2).hashCode());
//
//		System.out.println(str.hashCode());
//		System.out.println(addr.hashCode());
//		
//		System.out.println(addr.equals(addr2));
		
		addrs.add(addr);
		addrs.add(addr2);
		addrs.add(new Addr(2, "김길동"));
		
		addrs.forEach(System.out::println);
	}
}
class Addr {
	int no;
	String name;
	public Addr(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return
//				obj != null &&
				Objects.isNull(obj) &&
				obj instanceof Addr &&
				no == ((Addr)obj).no &&
				name.equals(((Addr)obj).name);
	}
	
	@Override
	public int hashCode() {
//		return (no + name).hashCode();
		return Objects.hash(no, name);
	}

	@Override
	public String toString() {
		return String.format("Addr [no=%s, name=%s]", no, name);
	}
}