package study.lei;

public class NestedClass {
	private int a = 0;

	class Y {
		private int a = 5;
		public void test() {
			System.out.println(this.a);
			System.out.println(NestedClass.this.a);
		}
	}
}
