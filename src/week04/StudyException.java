package week04;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        // try ~ catch ~ finally
        // try : 시도하다
        // catch : 잡다
        // final : 마침내

        try {
            // 일단 실행!!
            ourClass.thisMethodIsDangerous();

        } catch (OurBadException e) {
            System.out.println(e.getMessage());
        } finally {
            //무조건 여기는 거친다!
            System.out.println("우리는 방금 예외를 핸들링했습니다. 정상처리되든, 예외사항이 발생하든 여기를 거쳐요!");
        }
    }
}
