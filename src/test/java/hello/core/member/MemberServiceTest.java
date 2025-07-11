package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    void join(){
        // given
        Member member = new Member("memberA", 1L, Grade.VIP);
        // when
        memberService.join(member);
        Member findMember = memberService.findMember(member.getId());
        // then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
