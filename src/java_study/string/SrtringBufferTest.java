package java_study.string;

public class SrtringBufferTest {
    public static void main(String[] args) {

        String s = "jeonghyungil";
        StringBuffer sb = new StringBuffer(s);

        System.out.println("처음 상태 : " + sb);
        System.out.println("문자열 string 변환 : " + sb.toString());
        System.out.println("문자열 추출 : " + sb.substring(2,4));
        System.out.println("문자열 추가 : " + sb.insert(2,"추가"));
        System.out.println("문자열 삭제 : " + sb.delete(2, 4));
        System.out.println("문자열 연결 : " + sb.append("aaaaaa"));
        System.out.println("문자열의 길이 : " + sb.length());
        System.out.println("용량의 크기 : " + sb.capacity());
        System.out.println("문자열 역순 변경 : " + sb.reverse());
        System.out.println("마지막 상태 : " + sb);
    }
}
