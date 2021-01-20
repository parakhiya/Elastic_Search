package com.furnico.search.elasticSearchFurnico;

import com.furnico.search.elasticSearchFurnico.entity.Product;
import com.furnico.search.elasticSearchFurnico.services.ElasticSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {


    @Autowired
    ElasticSearchService elasticSearchService;

    @CrossOrigin
    @GetMapping("/search/{text}")
    public List<Product> search(@PathVariable("text") String text){
        return elasticSearchService.getAll(text);
    }

    @CrossOrigin
    @GetMapping("/")
    public ArrayList<Product> findAll(){
        return elasticSearchService.findAll();
    }

    @CrossOrigin
    @PostMapping("/save")
    public String save(@RequestBody Product product){
        elasticSearchService.save(product);
        return "success";
    }

    @CrossOrigin
    @GetMapping()
    public String ret(){return "hello Wolrd";}

    @CrossOrigin
   @PostConstruct
    void populate(){
        System.out.println("Hello");
        elasticSearchService.save(new Product(1,"Fiona 2 Seater Wooden Sofa",1,"OliveGreen",50,3,"this is a sofa","chair",18500,"https://ii2.pepperfry.com/media/catalog/product/v/a/236x260/valery-1-seater-sofa-in-green-colour-with-brown-oak-finish-by-casacraft-valery-1-seater-sofa-in-gree-8ztdz2.jpg"));
        elasticSearchService.save(new Product(2,"Celene 2 Seater Wooden Sofa",1,"Camel",50,3,"this is a sofa","chair",18300,"https://ii3.pepperfry.com/media/catalog/product/v/a/236x260/valery-1-seater-sofa-in-safari-brown-colour-with-brown-oak-finish-by-casacraft-valery-1-seater-sofa--olb0my.jpg"));
        elasticSearchService.save(new Product(3,"Madison 2 Seater Sofa",1,"Grey",50,1,"this is a sofa","chair",13400,"https://ii1.pepperfry.com/media/catalog/product/j/a/236x260/jazmin-1-seater-sofa-in-dark-grey-colour-with-brown-oak-finish-by-casacraft-jazmin-1-seater-sofa-in--e1e1er.jpg"));
        elasticSearchService.save(new Product(4,"Bali 3 Seater Sofa",1,"Blue",50,1,"this is a sofa","chair",15000,"https://ii2.pepperfry.com/media/catalog/product/j/a/568x284/jazmin-2-seater-sofa-in-dark-grey-colour-with-brown-oak-finish-by-casacraft-jazmin-2-seater-sofa-in--0mnd40.jpg"));
        elasticSearchService.save(new Product(5,"Elegant 2 Seater Sofa",1,"Blue",50,1,"this is a sofa","chair",22000,"https://ii1.pepperfry.com/media/catalog/product/v/a/568x284/valery-2-seater-sofa-in-green-colour-with-brown-oak-finish-by-casacraft-valery-2-seater-sofa-in-gree-ovu32p.jpg"));
        elasticSearchService.save(new Product(6,"Kate 3 Seater Sofa",1,"Beige",50,1,"this is a sofa","chair",54000,"https://ii2.pepperfry.com/media/catalog/product/v/a/236x260/valery-1-seater-sofa-in-green-colour-with-brown-oak-finish-by-casacraft-valery-1-seater-sofa-in-gree-8ztdz2.jpg"));
        elasticSearchService.save(new Product(7,"Shahen Solid Wood 2 Seater Sofa",1,"Beige",50,1,"this is a sofa","chair",27000,"https://ii3.pepperfry.com/media/catalog/product/v/a/236x260/valery-1-seater-sofa-in-safari-brown-colour-with-brown-oak-finish-by-casacraft-valery-1-seater-sofa--olb0my.jpg"));
        elasticSearchService.save(new Product(8,"Margot Solid Wood 2 Seater Sofa",1,"Yellow",50,1,"this is a sofa","chair",22500,"https://ii2.pepperfry.com/media/catalog/product/v/a/236x260/valery-1-seater-sofa-in-green-colour-with-brown-oak-finish-by-casacraft-valery-1-seater-sofa-in-gree-8ztdz2.jpg"));
        elasticSearchService.save(new Product(9,"Arrow 2 Seater Sofa",1,"Black",50,1,"this is a sofa","chair",16090,"https://ii2.pepperfry.com/media/catalog/product/v/a/236x260/valery-1-seater-sofa-in-green-colour-with-brown-oak-finish-by-casacraft-valery-1-seater-sofa-in-gree-8ztdz2.jpg"));
        elasticSearchService.save(new Product(10,"Goa 3 Seater Sofa",1,"Brown",50,1,"this is a sofa","chair",11500,"https://ii1.pepperfry.com/media/catalog/product/v/a/568x284/valery-2-seater-sofa-in-green-colour-with-brown-oak-finish-by-casacraft-valery-2-seater-sofa-in-gree-ovu32p.jpg"));
    }

}
