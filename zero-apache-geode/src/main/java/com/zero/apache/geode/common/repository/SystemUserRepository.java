package com.zero.apache.geode.common.repository;

import com.zero.apache.geode.domain.entity.SystemUserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemUserRepository extends CrudRepository<SystemUserEntity, String> {}
