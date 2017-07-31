package io.github.satr.idea.plugin.connector.la.ui;
// Copyright © 2017, github.com/satr, MIT License

import com.intellij.openapi.project.Project;
import io.github.satr.idea.plugin.connector.la.entities.FunctionEntry;

public interface ConnectorPresenter {
    void setView(ConnectorView view);
    void refreshFunctionList();
    void updateFunction(FunctionEntry functionEntry, Project project);
    void shutdown();
}