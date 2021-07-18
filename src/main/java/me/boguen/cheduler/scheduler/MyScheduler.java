package me.boguen.cheduler.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// 여러개를 등록해둬서 복잡하니, 메소드 하나씩 주석을 풀어서 확인해볼 것.

@Component // 빈으로 등록.
public class MyScheduler {

    // 고정된 주기(3000ms)마다 메소드가 실행됨
    @Scheduled(fixedDelay = 3000)
    public void test() {
        System.out.println("작업 시간 + 3초 지남!");
    }

    // 얘도 똑같지만 조금 다른게,
    // fixedDelay는 해당 작업이 끝나고 3초뒤에 다시 동작, (작업 시간 + 3초 뒤에 다시 동작)
    // fixedRate는 해당 작업의 시작과 동시에 3초를 세고 다시 동작. (작업 시간 무시하고 무조건 3초)
//    @Scheduled(fixedRate = 3000)
//    public void cronTest() {
//        System.out.println("순수 3초 지남!!");
//    }

    // initialDelay는 처음 3000ms만큼 쉬었다가 메소드가 실행됨.
    // 이 메소드는 서버 뜨고 3초는 가만히 있다가, .5초마다 푹푹 찍힘.
//    @Scheduled(initialDelay = 3000, fixedDelay = 500)
//    public void cronTest1() {
//        System.out.println("작업시간 + .5초 지남!");
//    }

    // cron 표현식으로 메소드가 실행될 일정을 정해줄 수 있음.
    // 초 분 시 일 월 요일 로 6자리가 있다.
    // 요일은 일~월 순으로 0~6, 7은 다시 일요일.
    // SUN~MON으로 표기할 수도 있다.
//    @Scheduled(cron = "* 1-3 * * * *") // 매 1, 2, 3분 마다 메소드 동작.
//    @Scheduled(cron = "* 0 2,15 * * *") // 매일 오전 2시 정각, 오후 3시 정각 마다 메소드 동작.
//    @Scheduled(cron = "* * * 3 * *") // 매월 3일 마다 메소드 동작.
//    @Scheduled(cron = "* * * * 4 *") // 매년 4월 마다 메소드 동작.
//    @Scheduled(cron = "0 0 0 * * 0-6") // 일요일 - 월요일 그러니까 매일 0시 0분 0초에 동작.
//    @Scheduled(cron = "0 0 0 * * SUN-MON") // 일요일 - 월요일 그러니까 매일 0시 0분 0초에 동작.
//    @Scheduled(cron = "0,5,10,15 * * * * 7") // 매 0, 5, 10, 15초 마다 메소드 동작.
//    public void cronTest2() {
//        System.out.println("시간 됐다!");
//    }

}
