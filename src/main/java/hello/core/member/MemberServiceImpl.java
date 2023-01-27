package hello.core.member;

public class MemberServiceImpl implements MemberService{
    //MemberRepository의 인터페이스도 의존하고 구현체인 MemoryMemberRepository도 의존하고있어서 2개를 의존해서 안좋은 코드다.
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
