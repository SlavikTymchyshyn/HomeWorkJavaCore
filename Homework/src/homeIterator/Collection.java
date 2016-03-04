package homeIterator;

public class Collection {

	private static final int size = 40;
	private Object[] object;
	
	public Collection() {
		this.object = new Object[size];
		for (int i = 0; i < object.length; i++) {
			object[i] = i;
			System.out.print(object[i] + " ");
		}
	}
	
	
	
		
		
	

//1 inner class
	public class Collclass1 implements Iterator {

		@Override
		public boolean hasNext() {
			int i = 0;
			while (i++ < object.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object[] next() {
			for (int i = 0; i < object.length; i++) {
				object[i] = i;
				if ((Integer)(object[i])%2 != 0) {
					object[i] = 0;
				}
				System.out.print(object[i] + " ");
			}
			System.out.print("--inner cLass1");
			return object;
		}
	}
//2 inner class
	public class Collclass2 implements Iterator {

		@Override
		public boolean hasNext() {
			int i = object.length-1;
			while (i-- > 0) {
				return true;
			}
			return false;
		}

		@Override
		public Object[] next() {
			int i = object.length;

			while (i-- > 0) {
				if ((i+1) % 2 == 0) {
					object[i] = i;
					System.out.print(object[i] + " ");
				}
			}
			System.out.print("--inner cLass2(�� ������������ ������� ����� 1 �����)");
			return object;
		}
	}
//	��������� �� ��� ��  ����� �������� ���������(new NameInterface(){� ������ ���� ��������� ����������� ������ ���})
	//��������� �� ��� �� � ����� �����������
	public static class Collclass3{					// ����� c���� ���� ���� ������

		public boolean hasNext(Object[] object) {
			int i=0;
			return (i++<object.length);
		}
	
		public Object[] next(Object[] object) {
		
			int i=0;
			while (i++ < object.length-1) {
				object[i]=i;
				if((i+1)%2==0){
					if((Integer)(object[i])%2==0)
					object[i]=i+1;
				System.out.print(object[i] + " ");}
			}
			System.out.print("--nested Static cLass3 \n��������� ����� ������ ������� �����y �� �������, ���� �� ������, ��� ������� � ����� ��������");
			return object;
		}
	}
		
//��� ���� ������ � ��������� �� Object 
//		Object[]ob=new Object[10];
//		ob[0]=1;
//		System.out.println((Integer)ob[0]-100);
	
	public void localClass(){
		class LocalClass{
			int i = 0;
			
			public boolean hasNextLocal() {
			
			return (i++<object.length-1);
				}
										/////// ������� �� ������ ����� �����
//			public boolean hasNextLocal() {
//				while (i++ < object.length-1) {
//					object[i]=i;
//					if((i+1)%5==0){
//						if((Integer)(object[i])%2==0)
//						return true;
//					}
//				}
//				return false;
//			}
			
						
//			public Object[] nextLocal() {
//				System.out.println();
//				while (i++ < object.length-1) {
//					if((Integer)(object[i])%2==0)
//						{object[i]=i-100;
//						System.out.print(object[i] + " ");
//						}
//					}
//					System.out.print("--Local CLASS(����� ����� ������� ������, ���� �� ������ �� ������ �� ����� ����� 100)");
//				return object;
//			}
			
			public Object[] nextLocal() {
					
				while (i++ < object.length-1) {
					object[i]=i;
					if((i+1)%5==0){
						if((Integer)(object[i])%2==0)
						{object[i]=(Integer)(object[i])-100;
						System.out.print(object[i] + " ");
						}
					}
				}
				System.out.print("--Local CLASS(����� ����� ������� ������, ���� �� ������ �� ������ �� ����� ����� 100)");
				return object;
			}
		};
		LocalClass loc3=new LocalClass();

		if(loc3.hasNextLocal())
			loc3.nextLocal();
	}
	
	//��������� ����� ����� ������� ������, ���� �� ������ �� ������ �� ����� ����� 100, � ������� �� �������
	
	public Object createCollection() {
		return (new Object());
	}
	
	public Object[] getObject() {
		return object;
	}
	
	public void setObject(Object[] object) {
		this.object = object;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}