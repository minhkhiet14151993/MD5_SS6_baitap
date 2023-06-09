package ra.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.enttity.Blog;
import ra.model.repository.IBlogRepository;

import java.util.List;

@Service

public class BlogServiceIpm implements IBlogService {
    @Autowired
    private IBlogRepository repository;

    @Override
    public List<Blog> findAll() {
        return repository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void remove(Long id) {
        repository.remove(id);
    }
}