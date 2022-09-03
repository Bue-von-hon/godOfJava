package methodTemplatePattern;

public class Main {
    public static void main(String[] args) {
        KoreanTeacher kr = new KoreanTeacher();
        MathTeacher mt = new MathTeacher();
        EnglishTeacher en = new EnglishTeacher();

        kr.start_class();
        System.out.println("-----------------------");
        mt.start_class();
        System.out.println("-----------------------");
        en.start_class();
        System.out.println("-----------------------");
    }
}

/*
* 선생님들이 수업하시는 루틴은 비슷합니다. "강의실에 들어와서, 출석을 부르고
* 각 선생님이 맡고 계시는 수업을 하시고, 수업이 끝나면 강의실을 나가십니다."
* 이런 루틴에서 각 다른점을 하나 꼽으면 각자 맡은 과목이 다른 점 입니다.
* 선생님들 마다 공통적인 행동들(메소드)은 abstract 클래스에서 정의를 하고,
* 각자 다른 행동은 abstract 메소드로 만들어 놓고 각자 클래스에서 재정의 하도록 하는 것이
* 메소드 템플릿 패턴 입니다.
* */