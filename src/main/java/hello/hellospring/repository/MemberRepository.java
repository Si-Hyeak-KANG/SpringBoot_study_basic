package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

// 기계적, 동작에 의존한 용어를 메소드로 선정
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    // Optional은 null 값 처리 , java8 기능

    List<Member> findAll();
}
