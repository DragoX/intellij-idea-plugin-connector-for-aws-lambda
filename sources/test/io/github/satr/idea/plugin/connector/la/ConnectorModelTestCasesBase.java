package io.github.satr.idea.plugin.connector.la;
// Copyright © 2017, github.com/satr, MIT License

import com.amazonaws.regions.Regions;
import io.github.satr.idea.plugin.connector.la.models.ConnectorModel;
import org.junit.After;
import org.junit.Before;

import java.io.File;

public class ConnectorModelTestCasesBase {
    protected ConnectorModel connectorModel;

    @Before
    public void setUp() throws Exception {
        connectorModel = new ConnectorModel(Regions.US_EAST_1);
    }

    @After
    public void tearDown() throws Exception {
        connectorModel.shutdown();
    }

    protected File getResourceFile(String fileRelativePath) {
        ClassLoader classLoader = ConnectorModelTestCasesBase.class.getClassLoader();
        return new File(classLoader.getResource(fileRelativePath).getFile());
    }
}
