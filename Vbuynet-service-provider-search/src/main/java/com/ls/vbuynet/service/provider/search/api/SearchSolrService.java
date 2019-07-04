package com.ls.vbuynet.service.provider.search.api;

import com.ls.vbuynet.commons.domain.Product;

import java.util.List;

public interface SearchSolrService {

    List<Product> search(String quyte, int page, int rows);
}
