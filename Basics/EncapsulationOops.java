package satyammahto;

public class EncapsulationOops {	
		private int age;
		private String name;
		
	public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	public static void main(String[] args) {
		
	EncapsulationOops p = new EncapsulationOops() ;
			p.setName("Satyam");
			p.setAge(18);
			System.out.println(p.getName());
			System.out.println(p.getAge());		
	}
}
