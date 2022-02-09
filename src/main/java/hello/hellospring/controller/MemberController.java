package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    /*
    // setter 주입 방법 -> set 메소드를 public으로 노출, 아무 개발자나 호출이 가능
    private MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }*/

    /*
    // 필드 주입 -> 별로 안좋음
    @Autowired private MemberService memberService;
    */

    //생성자 주입
    private final MemberService memberService;

    //생성하는 시점에 연결하고 이후 추가수정 불가능
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 실무에서는 정형화된 컨트롤러, 서비스, 리포지토리 같은 코드는 컴포넌트 스캔을 사용
    // 그리고 정형화 되지 않거나, 상황에 따라 구현 클래스를 변경해야 하면 설정을 통해 스프링 빈으로 등록한다.
}
