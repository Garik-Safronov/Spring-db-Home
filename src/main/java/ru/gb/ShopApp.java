package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gb.config.HibernateConfig;
import ru.gb.dao.ManufacturerDao;
import ru.gb.dao.OldJdbcManufacturerDao;
import ru.gb.dao.ProductDao;
import ru.gb.entity.Manufacturer;

public class ShopApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

        ProductDao productDao = context.getBean(ProductDao.class);
//        for (Product product : productDao.findAll()) {
//            System.out.println(product);
//        }
        System.out.println(productDao.findTitleById(5L));
    }
}
