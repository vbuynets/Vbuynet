package com.ls.test;

import com.ls.vbuynet.service.provider.search.SearchApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SearchApplication.class)
public class TestSeach {

//    @Autowired
////    private SolrClient solrClient;
////
////    @Autowired
////    private TbItemResultMapper tbItemResultMapper;
////
////    @Test
////    public void testAddDocument() {
////        SolrInputDocument document = new SolrInputDocument();
////        document.addField("id", 562379);
////        document.addField("tb_item_title", "new8- 三星 W999 黑色 电信3G手机 双卡双待双通");
////
////        try {
////            solrClient.add(document);
////            solrClient.commit();
////        } catch (SolrServerException e) {
////            e.printStackTrace();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
////
////    @Test
////    public void testDeleteDocument() {
////        try {
////            solrClient.deleteByQuery("*:*");
////            solrClient.commit();
////        } catch (SolrServerException e) {
////            e.printStackTrace();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
////
////    @Test
////    public void initSolr() {
////        List<Product> productList = tbItemResultMapper.selectAll();
////
////        try {
////            SolrInputDocument document = null;
////            for (Product product : productList) {
////                document = new SolrInputDocument();
////                document.addField("id", product.getId());
////                document.addField("tb_item_cid", product.getTbItemCid());
////                document.addField("tb_item_cname", product.getTbItemCname());
////                document.addField("tb_item_title", product.getTbItemTitle());
////                document.addField("tb_item_sell_point", product.getTbItemSellPoint());
////                document.addField("tb_item_desc", product.getTbItemDesc());
////
////                solrClient.add(document);
////                solrClient.commit();
////            }
////        } catch (SolrServerException e) {
////            e.printStackTrace();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
////
////    @Test
////    public void testSearch() {
////        SolrQuery query = new SolrQuery();
////
////        // 查询条件
////        query.setQuery("手机");
////
////        // 分页
////        query.setStart(0);
////        query.setRows(10);
////
////        // 设置默认域
////        query.set("df", "tb_item_keywords");
////
////        // 设置高亮
////        query.setHighlight(true);
////        query.addHighlightField("tb_item_title");
////        query.setHighlightSimplePre("<span style='color:red;'>");
////        query.setHighlightSimplePost("</span>");
////
////        // 开始查询
////        try {
////            QueryResponse queryResponse = solrClient.query(query);
////            // 获取高亮
////            Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
////            SolrDocumentList results = queryResponse.getResults();
////            for (SolrDocument result : results) {
////                List<String> strings = highlighting.get(result.get("id")).get("tb_item_title");
////                if (strings != null && strings.size() > 0) {
////                    String title = strings.get(0);
////                    System.out.println(title);
////                }
////            }
////        } catch (SolrServerException e) {
////            e.printStackTrace();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
}
