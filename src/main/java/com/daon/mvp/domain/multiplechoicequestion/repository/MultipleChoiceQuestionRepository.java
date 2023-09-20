package com.daon.mvp.domain.multiplechoicequestion.repository;

import com.daon.mvp.domain.multiplechoicequestion.domain.MultipleChoiceQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MultipleChoiceQuestionRepository extends JpaRepository<MultipleChoiceQuestion, Long> {
    @Query("SELECT MAX(id) FROM MultipleChoiceQuestion ")
    Long findMaxId();

}
