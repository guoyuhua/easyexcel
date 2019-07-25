package com.alibaba.easyexcel.test.core.large;

import java.io.File;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.easyexcel.test.util.TestFileUtil;
import com.alibaba.excel.EasyExcelFactory;

/**
 * Large data test
 * 
 * @author zhuangjiaju
 */
public class LargeDataTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LargeDataTest.class);

    @Test
    public void read() {
        long start = System.currentTimeMillis();
        EasyExcelFactory.read(TestFileUtil.getPath() + "large" + File.separator + "large07.xlsx", LargeData.class,
            new LargeDataListener()).headRowNumber(2).sheet().doRead().finish();
        LOGGER.info("Large data total time spent:{}", System.currentTimeMillis() - start);
    }
}
