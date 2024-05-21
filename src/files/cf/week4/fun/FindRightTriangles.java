package files.cf.week4.fun;



public class FindRightTriangles {

    public static void main(String[] args) {
        int hypotenuseSquared = 0;
        int squaredSideA = 0;
        int squaredSideB = 0;

        int hypotenuse = 1;
        int sideA = 1;
        int sideB = 1;
        int counter1 = 1;
        int counter2 = 1;
        int counter3 = 1;

        for (int i = 1; i <= 25; i++) {
            hypotenuseSquared = i * i;
            for (int j = 1; j <= 25; j++) {
                squaredSideA = j * j;
                for (int z = 1; z <= 25; z++) {
                    squaredSideB = z * z;
                    if (hypotenuseSquared == squaredSideA + squaredSideB) {
                        System.out.printf("Bingo! %d %d %d%n", hypotenuseSquared, squaredSideA, squaredSideB);
                        hypotenuse = (int) (Math.sqrt(hypotenuseSquared));
                        sideA = (int) (Math.sqrt(squaredSideA));
                        sideB = (int) (Math.sqrt(squaredSideB));

//                        while (counter1 * counter1 <= hypotenuseSquared) {
//                            counter1++;
//                        }
//                        while (counter2 * counter2 <= squaredSideA) {
//                            counter2++;
//                        }
//                        while (counter3 * counter3 <= squaredSideB) {
//                            counter3++;

//                        }
//                        while (hypotenuse < hypotenuseSquared) {
//                            hypotenuse = counter1 * counter1;
//                            counter1++;
//                        }
//                        while (sideA < squaredSideA) {
//                            sideA = counter2 * counter2;
//                            counter2++;
//                        }
//                        while (sideB < squaredSideB) {
//                            sideB = counter3 * counter3;
//                            counter3++;
//                        }
                        System.out.println(hypotenuse + " " + sideA + " " + sideB);
//                        System.out.println("Squared triangle found!");
//                        System.out.printf("Hypotenuse = %d Side a = %d Side b = %d%n", counter1, counter2, counter3);
                    }
                }
            }
        }
    }
}
