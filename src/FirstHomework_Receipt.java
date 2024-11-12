import java.util.Scanner;

public class FirstHomework_Receipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] recipe = new String[10];

        System.out.print("요리 제목을 입력해주세요 : ");
        String name = scanner.nextLine();

        System.out.print("별점을 입력해주세요 : ");
        int point = scanner.nextInt();
        scanner.nextLine();
        double percent = ((double) point/5) * 100;

        System.out.println("레시피를 입력해주세요(총 10줄)");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ": ");
            recipe[i] = scanner.nextLine();
        }

        System.out.println("[" + name + "]");
        System.out.println("별점 : " + point + "(" + percent + "%)");

        int i = 0;
        for (String s : recipe) {
            System.out.println((i+1) + ". " + s);
            i++;
        }
    }
}
