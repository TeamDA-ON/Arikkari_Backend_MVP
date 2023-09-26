package com.daon.mvp.domain.multiplechoicequestion.presentation;

import com.daon.mvp.domain.multiplechoicequestion.presentation.dto.response.MCQResponse;
import com.daon.mvp.domain.multiplechoicequestion.service.MCQService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/mcq")
@CrossOrigin("https://port-0-arikkari-backend-mvp-2rrqq2blmy418s6.sel5.cloudtype.app/")
public class MCQController {

    private final MCQService service;

    @GetMapping("/get")
    public ResponseEntity<List<MCQResponse>> getQuestion() {
        return ResponseEntity.ok(service.execute());
    }

}
