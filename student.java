class Student {

int rollNo;
String name;
String branch;
int marks;

void getData(int rn,String na,String bn,int mr) {

this.rollNo = rn;
this.name = na;
this.branch = bn;
this.marks = mr;
}

void display() {
System.out.println("Roll Number " + rollNo);
System.out.println("Name " + name);
System.out.println("Branch " + branch);
System.out.println("Marks " + marks);
}

public static void main(String[] args) {

Student s1 = new Student();
Student s2 = new Student();

s1.getData(1,"Nandini","CSE",100);
s2.getData(2,"Navya","Inter",99);

s1.display();
s2.display();
}
}