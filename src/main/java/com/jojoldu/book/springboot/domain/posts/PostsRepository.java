package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/*단순히 테이블 설계만으로는 존재할 수 없음 아래와 같이 설정을 해줘야 가능*/
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
