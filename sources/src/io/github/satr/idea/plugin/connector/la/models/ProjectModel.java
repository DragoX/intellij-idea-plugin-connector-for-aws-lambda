package io.github.satr.idea.plugin.connector.la.models;
// Copyright © 2018, github.com/satr, MIT License

import io.github.satr.idea.plugin.connector.la.entities.ArtifactEntity;

import java.util.Collection;

public interface ProjectModel {
    Collection<? extends ArtifactEntity> getJarArtifacts();
}
