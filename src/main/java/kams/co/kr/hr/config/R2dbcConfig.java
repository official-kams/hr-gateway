package kams.co.kr.hr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import kams.co.kr.hr.repository.GatewayReactiveCrudRepositoryImpl;

@Configuration
@EnableR2dbcAuditing
@EnableR2dbcRepositories(basePackages = "kams.co.kr.hr.repository", repositoryBaseClass = GatewayReactiveCrudRepositoryImpl.class)
public class R2dbcConfig {
}