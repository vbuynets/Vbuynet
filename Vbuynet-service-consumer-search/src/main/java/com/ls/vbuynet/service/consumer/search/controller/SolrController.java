package com.ls.vbuynet.service.consumer.search.controller;


import com.ls.vbuynet.commons.domain.Product;
import com.ls.vbuynet.service.provider.search.api.SearchSolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SolrController {

    @Resource
    private SearchSolrService searchService;

    @RequestMapping(value = "search/{query}/{page}/{rows}", method = RequestMethod.GET)
    public List<Product> search(
            @PathVariable(required = true) String query,
            @PathVariable(required = true) int page,
            @PathVariable(required = true) int rows
    ) {
        return searchService.search(query, page, rows);
    }
}
