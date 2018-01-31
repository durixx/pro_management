package sk.durco.promanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sk.durco.promanagement.mapper.TestMapper;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    @Transactional
    public void insert() {
        testMapper.insert();
    }
}
