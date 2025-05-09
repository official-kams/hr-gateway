package kams.co.kr.hr.repository.auth;

import org.springframework.stereotype.Repository;
import kams.co.kr.hr.entity.user.UserDetail;
import kams.co.kr.hr.repository.GatewayReactiveCrudRepository;
import reactor.core.publisher.Mono;

@Repository
public interface AuthRepository extends GatewayReactiveCrudRepository<UserDetail, Long> {

    Mono<UserDetail> findByUserEmail(String userEmail);

    Mono<UserDetail> findByUserCode(String userCode);

    Mono<Boolean> existsByUserEmail(String userEmail);
}
