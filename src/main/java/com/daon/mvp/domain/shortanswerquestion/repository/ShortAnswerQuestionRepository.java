package com.daon.mvp.domain.shortanswerquestion.repository;

import com.daon.mvp.domain.shortanswerquestion.domain.ShortAnswerQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortAnswerQuestionRepository extends JpaRepository<ShortAnswerQuestion, Long> {
    @Query("SELECT MAX(id) FROM ShortAnswerQuestion")
    Long findMaxId();
}
