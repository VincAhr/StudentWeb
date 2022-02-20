package de.neuefische.studentweb;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ShopServiceTest {


    @Test
    void addProductIsInProductRepo() {

        List<Product> products = List.of(new Product(), new Product());

        ProductRepo dbMock = mock(ProductRepo.class);
        when(dbMock.get("1"))
                .thenReturn(new Product("name", "1"));


        OrderRepo orderrepo = new OrderRepo();
        ShopService shopService = new ShopService(orderrepo, dbMock);
        Product actual = shopService.getProduct("1");
        assertEquals("name", actual.getName());

    }

//        @Test
//        void testGetProduct() {
//            List<Product> products = List.of(new Product(), new Product());
//
//            ProductRepo dbMock = mock(ProductRepo.class);
//            when(dbMock.getProducts()).thenReturn(products);
//
//            ProductService service = new ProductService(dbMock);
//            List<Product> result = service.getProducts();
//
//            assertEquals(products, result);
//        }

//        @Test
//        void testGetProduct() {
//            Product product = new Product();
//
//            ProductDatabase dbMock = mock(ProductDatabase.class);
//            when(dbMock.getProduct("4711")).thenReturn(Optional.of(product));
//
//            ProductService service = new ProductService(dbMock);
//            Product result = service.getProduct("4711");
//
//            assertEquals(product, result);
//        }
//
//        @Test
//        void testCreateProduct() {
//            Product product = new Product();
//
//            ProductDatabase dbMock = mock(ProductDatabase.class);
//
//            ProductService service = new ProductService(dbMock);
//            service.createProduct(product);
//
//            verify(dbMock).createProduct(product);
//        }
//
//        @Test
//        void testGetProductsByName() {
//            Product product1 = new Product();
//            product1.setName("IPhone");
//
//            Product product2 = new Product();
//            product2.setName("IPad");
//
//            Product product3 = new Product();
//            product3.setName("Macbook");
//
//            List<Product> allProducts = List.of(product1, product2, product3);
//            List<Product> expectedProducts = List.of(product1, product2);
//
//            ProductDatabase dbMock = mock(ProductDatabase.class);
//            when(dbMock.getProducts()).thenReturn(allProducts);
//
//            ProductService service = new ProductService(dbMock);
//            List<Product> result = service.getProductsByName("ip");
//
//            assertEquals(expectedProducts, result);
//        }
//
//    }

}