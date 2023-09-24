package dev.naman.productservice.services;

import dev.naman.productservice.dtos.GenericProductDto;
import dev.naman.productservice.models.Product;
import dev.naman.productservice.repositories.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service("selfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    private FakeStoreProductService fakeStoreProductService;

    public SelfProductServiceImpl(ProductRepository productRepository, FakeStoreProductService fakeStoreProductService) {
        this.productRepository = productRepository;
        this.fakeStoreProductService = fakeStoreProductService;
    }

    @Override
    public GenericProductDto getProductById(Long id) {
        return null;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto product) {
        //productRepository.save(product);
        return fakeStoreProductService.createProduct(product);
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        return null;
    }

    @Override
    public GenericProductDto deleteProduct(Long id) {
        return null;
    }
}
