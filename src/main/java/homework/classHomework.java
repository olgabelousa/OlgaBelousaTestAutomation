package homework;

public class classHomework {
    package homeWork.classHomeWork;
    public class trīsstūris {
        static int AB;
        static int BC;
        static int AC;
        static int triangle;
        static double Area;
        public static void  createtriangle() {

            //Definition of sides
            AB = 20;
            AC = 25;
            BC = 60;
            // creating triangle array
            int triangle[] = {AB, BC, AC};
            // printing triangle
            System.out.println("Mēs veidojām trīssttūri:");
            System.out.println("Side 1 = " + triangle[0] + "cm , Side 2 = " + triangle[1] + "cm , Side 3 = " +  triangle[2] + "cm");
        }

        public static void trianglearea(int side1, int side2, int side3)  {
            double p;
            double S;
            p = (side1 + side2 + side3)/2;
            S = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
            System.out.println("Ttrīsstūra platība ir: " + S + "cm2");
        }

        public static boolean equilateral(int side1, int side2, int side3) {
            return (side1==side2 && side2 == side3 && side1 == side3);
        }

        public static boolean isosceles(int side1, int side2, int side3) {
            return (side1==side2 || side2 == side3 || side1 == side3);
        }

        public static void main(String[] args) {
            createtriangle();
            trianglearea(AB, BC, AC);
            System.out.println("Trīsstūris ir vienādmalu :" + equilateral(AB, BC, AC));
            System.out.println("Trīsstūris ir vienādsānu :" + isosceles(AB, BC, AC));
        }

    }
}
