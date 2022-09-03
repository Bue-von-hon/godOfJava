package methodTemplatePattern;

abstract class Teacher {
    public void start_class() {
        inside();
        attendance();
        teach();
        outside();
    }

    // 공통 메서드
    public void inside() {
        System.out.println("선생님이 강의실로 들어오십니다.");
    }

    public void attendance() {
        System.out.println("선생님이 출석을 부르십니다.");
    }

    public void outside() {
        System.out.println("선생님이 강의실을 나가십니다.");
    }

    abstract void teach();
}
