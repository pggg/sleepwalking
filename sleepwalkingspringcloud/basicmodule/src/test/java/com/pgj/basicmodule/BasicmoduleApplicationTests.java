package com.pgj.basicmodule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicmoduleApplicationTests {

    @Test
    public void contextLoads() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List warnings = new ArrayList();
        // 根据配置文件生成相应的实体类、mapper文件
        Configuration config = new ConfigurationParser(warnings).parseConfiguration(new File(BasicmoduleApplicationTests.class.getResource("/mybatis-generator.xml").getPath()));
        new MyBatisGenerator(config, new DefaultShellCallback(true), warnings).generate(null);
    }


}
