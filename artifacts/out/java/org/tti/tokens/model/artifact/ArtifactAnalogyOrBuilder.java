// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: artifact.proto

package org.tti.tokens.model.artifact;

public interface ArtifactAnalogyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:taxonomy.model.artifact.ArtifactAnalogy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   *navigation to parent
   * </pre>
   *
   * <code>.taxonomy.model.artifact.ArtifactDefinition artifact_definition = 3;</code>
   */
  boolean hasArtifactDefinition();
  /**
   * <pre>
   *navigation to parent
   * </pre>
   *
   * <code>.taxonomy.model.artifact.ArtifactDefinition artifact_definition = 3;</code>
   */
  org.tti.tokens.model.artifact.ArtifactDefinition getArtifactDefinition();
  /**
   * <pre>
   *navigation to parent
   * </pre>
   *
   * <code>.taxonomy.model.artifact.ArtifactDefinition artifact_definition = 3;</code>
   */
  org.tti.tokens.model.artifact.ArtifactDefinitionOrBuilder getArtifactDefinitionOrBuilder();
}
