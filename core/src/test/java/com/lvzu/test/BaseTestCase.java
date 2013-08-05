package com.lvzu.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:applicationContext-core.xml"})
public abstract class BaseTestCase extends AbstractTransactionalJUnit4SpringContextTests {

}
