package homeIterator;

import homeIterator.Collection.Collclass3;

public class CollIterMain {
	

	public static void main(String[] args) {
		Collection col=new Collection();
		col.getObject();
		
		Collection.Collclass1 class1=col.new Collclass1();	//inner classes ������� ����� 1 � 2� �����
		Collection.Collclass2 class2=col.new Collclass2();	//������� ���������� �������� ���� �����
		Collection.Collclass3 class3=new Collclass3();		 // StaticNestedClass(��������) �� ������� �������� ��������� ����� new ��� ���������
		System.out.println();
		class1.next();
		System.out.println();
		class2.next();
		System.out.println();
		
		Object[] object=new Object[40];	//for StaticNestedClass ����� ��� ������������ ����� �� �� �� ������ ���� ����� � ����
		class3.next(object);
		System.out.println();
		col.localClass();			//local class ������������� ������ �� ���� �� � �������� ���� ������ ������ ���� �������
		
		Iterator it=new Iterator(){				//anonymous class -��� ������ ����� ������ ��������� ��� ������ ���� ���� �� �� ���� � 1�� �������
			int i=object.length-1;
			@Override
			public boolean hasNext() {
				while(i-->0){
					return true;}
				return false;
			}

			@Override
			public Object[] next() {
				System.out.println();
				while(i-->0){
					object[i]=i;
					if((i-1)%3==0){
						if((Integer)(object[i])%2!=0)
						System.out.print(object[i]+" ");
					}
				}
				System.out.println("--Anonymous Class(��������� ����� ����� ������� ������ �� ���������� �� �� ��������,\n ���� ��� �� ������� ��� �������� �� �������)");
				return object;
			}
		};
		
		if(it.hasNext())it.next();	//--- ������ ���Ͳ����� �����
		
//		�������� �� ���������� �� �������
//		�������� ������. ��������� ����� ����� ������� ������ �� ���������� �� �� ��������, ���� ��� �� ������� ��� �������� �� �������.
		
		
		
		
		
		
		
		
		
	}

}
