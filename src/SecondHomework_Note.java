import java.util.*;

public class SecondHomework_Note {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("저장할 타입을 입력해주세요(List, Set, Map) : ");
        String type = scanner.nextLine();

        System.out.print("레시피 제목을 적어주세요 : ");
        String menu = scanner.nextLine();

        System.out.println("조리 과정을 적어주세요(다 입력하시고 '끝'이라고 적어주세요).");


        if (type.equalsIgnoreCase("List")){
            ArrayList<String> strList = new ArrayList<String>();

            while (true) {
                String receipt = scanner.nextLine();
                if (receipt.trim().equals("끝")){
                    break;
                }
                strList.add(receipt);
            }

            System.out.println("[List로 저장된 " + menu + "]");
            for (int i = 0; i < strList.size(); i++){
                System.out.println((i+1) + ". " + strList.get(i));
            }

        } else if (type.equalsIgnoreCase("Set")) {
            Set<String> strSet = new LinkedHashSet<>();

            while (true) {
                String receipt = scanner.nextLine();
                if (receipt.trim().equals("끝")){
                    break;
                }
                strSet.add(receipt);
            }

            System.out.println("[Set 으로 저장된 " + menu + "]");
            int i = 0;
            for (String s : strSet) {
                System.out.println((i+1) + ". " + s);
                i++;
            }

        } else if (type.equalsIgnoreCase("Map")) {
            Map<Integer, String> strMap = new LinkedHashMap<>();

            for (int i = 0; ; i++) {
                String receipt = scanner.nextLine();
                if (receipt.trim().equals("끝")){
                    break;
                }
                strMap.put((i+1), receipt);
            }

            System.out.println("[Map 으로 저장된 " + menu + "]");
            for (Integer key : strMap.keySet()) {
                System.out.println(key + ". " + strMap.get(key));
            }
        } else {
            System.out.println("잘못된 타입을 입력하셨습니다.");
        }

        scanner.close();

    }
}
