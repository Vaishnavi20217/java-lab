class Student {
    int rollNumber;

    void getNumber(int n) {
        rollNumber = n;
    }

    void printNumber() {
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Test extends Student {
    float part1, part2;

    void getMarks(float a, float b) {
        part1 = a;
        part2 = b;
    }

    void putMarks() {
        System.out.println("Marks in part1: " + part1);
        System.out.println("Marks in part2: " + part2);
    }
}

interface Sports {
    float sportwt = 6.0F;  
    void putwt();
}

class Result extends Test implements Sports {
    float total;

    public void putwt() {
        System.out.println("Sports weight: " + sportwt);
    }

    void display() {
        total = part1 + part2 + sportwt;
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Score: " + total);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Result a = new Result();
        a.getNumber(101);
        a.printNumber();
        a.getMarks(75.5F, 82.0F);
        a.putMarks();
        a.putwt();
        a.display();
    }
}