import java.util.ArrayList;

public class SuperArrayList{

    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<String>();
        // ������� � ������ ��� ���������
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // ��������� ������� �� ������� 1

        System.out.println(people.get(1));// �������� 2-� ������
        people.set(1, "Robert"); // ��������� ������ �������� ��� 2-�� �������

        System.out.printf("ArrayList has %d elements \n", people.size());
        for(String person : people){

            System.out.println(person);
        }
        // ��������� ������� ��������
        if(people.contains("Tom")){

            System.out.println("ArrayList contains Tom");
        }

        // ������ ��������� ��������
        // �������� ����������� ��������
        people.remove("Robert");
        // �������� �� �������
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){

            System.out.println(person);
        }
    }
}