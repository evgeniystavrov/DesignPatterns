package ru.evgs.basepatterns.creational.builder;

public class EnterpriceWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        website.setName("Sberbank inner website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.DRUPAL);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
