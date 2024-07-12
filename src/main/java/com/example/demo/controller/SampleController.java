package com.example.demo.controller;


import com.example.demo.model.ApiResult;
import com.example.demo.model.DocQuery;
import com.example.demo.model.Document;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

/**
 * Restful demo api
 **/
@RestController
@RequestMapping("/sample")
public class SampleController {
    /**
     * List of documents
     *
     * @param docQuery List query parameters
     * @return document data list
     */
    @PostMapping("/list")
    public ApiResult<List<Document>> list(@RequestBody @Valid DocQuery docQuery) {
        // just mock, in practice, the implementation will be written in the service layer.
        Document document = new Document();
        document.setId(1L);
        document.setTitle("This is a demo title of doc-apis");
        document.setContent("This is a demo content of doc-apis");
        return ApiResult.success(Collections.singletonList(document));
    }

    /**
     * Get document details
     *
     * @param documentId document id
     * @return document details
     */
    @GetMapping("/getDocment")
    public ApiResult<Document> document(@RequestParam Long documentId) {
        // just mock, in practice, the implementation will be written in the service layer.
        Document document = new Document();
        document.setId(1L);
        document.setTitle("This is a demo title of doc-apis");
        document.setContent("This is a demo content of doc-apis");
        return ApiResult.success(document);
    }

    /**
     * Update document
     *
     * @param document document info
     * @return update result
     */
    @PutMapping("/updateDocument")
    public ApiResult<Boolean> updateDocument(@RequestBody Document document) {
        // just mock, in practice, the implementation will be written in the service layer.
        // TODO update document
        return ApiResult.success(Boolean.TRUE);
    }

    /**
     * Delete document
     *
     * @param documentId document id
     * @return delete result
     */
    @DeleteMapping("/delDocument")
    public ApiResult<Boolean> delDocument(@RequestParam Long documentId) {
        // just mock, in practice, the implementation will be written in the service layer.
        // TODO delete document
        return ApiResult.success(Boolean.TRUE);
    }


}
