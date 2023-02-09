package 스트림예제6번;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
// 스트림 최종 연산 : 중개 연산을 통해 변환된 스트림은 마지막으로 최종 연산을 통해 요소를 소모해 결과를 출력
public class StreamEx6 {
    public static void main(String[] args) {
        // 요소의 출력
        Stream<String> stream = Stream.of("하나","둘","셋","넷");
        //stream.forEach(System.out::println); // == forEach(e-> System.out.print(e + " "));
        // 요소의 소모 : 스트림의 요소를 소모하여 연산을 수행
        // reduce() : 첫번째 요소와 두번째 요소를 가지고 연산을 수행 후, 그 결과를 세번째 요소를 가지고 다시 연산
        Stream<String> stream1 = Stream.of("하나","둘","셋","넷");
        IntStream stream2 = IntStream.of(7,5,5,2,1,3,5,4,6);
        OptionalInt reduce = stream2.reduce((s1, s2) -> s1 * s2); // Optional : 랩퍼클래스로 NPE 를 예방해줌
       // System.out.println(reduce.getAsInt());
        Optional<String> rst1 = stream1.reduce((s1,s2) -> s1 + "+" + s2);
       // rst1.ifPresent(System.out::println); // ifPresent() : 만약 값이 존재하면 ()를 수행하라는 코드

        // 요소 검색 : findFirst(), findAny() : 해당 스트림에서 첫번째 요소를 반환
        IntStream stream3 = IntStream.of(4,2,7,3,5,1,6);
        IntStream stream4 = IntStream.of(4,2,7,3,5,1,6);
        OptionalInt rst2 = stream3.sorted().findFirst();
        System.out.println(rst2.getAsInt());
        OptionalInt rst3 = stream4.sorted().findAny(); // 병렬처리 관련 내용이 포함되어 있어서 요소의 첫번째 값이 아닌 경우가 있음
        System.out.println(rst3.getAsInt());

        // 요소 검사 :
        // anyMatch() : 해당 스트림의 일부 요소가 조건에 만족하면 true
        // allMatch() : 해당 스트림의 모든 요소가 조건에 만족하면 true
        // noneMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족하지 않을 경우 true
        IntStream stream5 = IntStream.of(30,90,70,10);
        IntStream stream6 = IntStream.of(30,90,70,10);
        IntStream stream7 = IntStream.of(30,90,70,10);
        System.out.println(stream5.anyMatch(n -> n > 80));
        System.out.println(stream6.allMatch(n -> n > 80));
        System.out.println(stream7.noneMatch(n -> n > 90));

        // 요소의 통계 : count(), max(),min()
        IntStream stream8 = IntStream.of(30,90,70,10);
        IntStream stream9 = IntStream.of(30,90,70,10);
        System.out.println(stream8.count());
        System.out.println(stream9.max().getAsInt());

        // 요소의 연산 : sum(), average()
        IntStream stream10 = IntStream.of(30,90,70,10);
        DoubleStream stream11 = DoubleStream.of(30.3,90.9,70.11,10.12);
        System.out.println(stream10.sum());
        System.out.println(stream11.average().getAsDouble());
    }
}



