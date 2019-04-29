// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: artifact.proto

package org.tti.tokens.model.artifact;

public interface ArtifactOrBuilder extends
    // @@protoc_insertion_point(interface_extends:taxonomy.model.artifact.Artifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.taxonomy.model.artifact.ArtifactType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>.taxonomy.model.artifact.ArtifactType type = 1;</code>
   */
  org.tti.tokens.model.artifact.ArtifactType getType();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated string aliases = 3;</code>
   */
  java.util.List<java.lang.String>
      getAliasesList();
  /**
   * <code>repeated string aliases = 3;</code>
   */
  int getAliasesCount();
  /**
   * <code>repeated string aliases = 3;</code>
   */
  java.lang.String getAliases(int index);
  /**
   * <code>repeated string aliases = 3;</code>
   */
  com.google.protobuf.ByteString
      getAliasesBytes(int index);

  /**
   * <code>.taxonomy.model.artifact.ArtifactSymbol artifact_symbol = 4;</code>
   */
  boolean hasArtifactSymbol();
  /**
   * <code>.taxonomy.model.artifact.ArtifactSymbol artifact_symbol = 4;</code>
   */
  org.tti.tokens.model.artifact.ArtifactSymbol getArtifactSymbol();
  /**
   * <code>.taxonomy.model.artifact.ArtifactSymbol artifact_symbol = 4;</code>
   */
  org.tti.tokens.model.artifact.ArtifactSymbolOrBuilder getArtifactSymbolOrBuilder();

  /**
   * <code>string control_uri = 5;</code>
   */
  java.lang.String getControlUri();
  /**
   * <code>string control_uri = 5;</code>
   */
  com.google.protobuf.ByteString
      getControlUriBytes();

  /**
   * <pre>
   *Base, Behavior or Behavior group type indicated by ArtifactType
   * </pre>
   *
   * <code>.taxonomy.model.artifact.ArtifactDefinition definition = 6;</code>
   */
  boolean hasDefinition();
  /**
   * <pre>
   *Base, Behavior or Behavior group type indicated by ArtifactType
   * </pre>
   *
   * <code>.taxonomy.model.artifact.ArtifactDefinition definition = 6;</code>
   */
  org.tti.tokens.model.artifact.ArtifactDefinition getDefinition();
  /**
   * <pre>
   *Base, Behavior or Behavior group type indicated by ArtifactType
   * </pre>
   *
   * <code>.taxonomy.model.artifact.ArtifactDefinition definition = 6;</code>
   */
  org.tti.tokens.model.artifact.ArtifactDefinitionOrBuilder getDefinitionOrBuilder();

  /**
   * <pre>
   *for behaviors that have opposites, or if another behavior or property-set
   * </pre>
   *
   * <code>repeated .taxonomy.model.artifact.ArtifactSymbol incompatible_with_symbols = 7;</code>
   */
  java.util.List<org.tti.tokens.model.artifact.ArtifactSymbol> 
      getIncompatibleWithSymbolsList();
  /**
   * <pre>
   *for behaviors that have opposites, or if another behavior or property-set
   * </pre>
   *
   * <code>repeated .taxonomy.model.artifact.ArtifactSymbol incompatible_with_symbols = 7;</code>
   */
  org.tti.tokens.model.artifact.ArtifactSymbol getIncompatibleWithSymbols(int index);
  /**
   * <pre>
   *for behaviors that have opposites, or if another behavior or property-set
   * </pre>
   *
   * <code>repeated .taxonomy.model.artifact.ArtifactSymbol incompatible_with_symbols = 7;</code>
   */
  int getIncompatibleWithSymbolsCount();
  /**
   * <pre>
   *for behaviors that have opposites, or if another behavior or property-set
   * </pre>
   *
   * <code>repeated .taxonomy.model.artifact.ArtifactSymbol incompatible_with_symbols = 7;</code>
   */
  java.util.List<? extends org.tti.tokens.model.artifact.ArtifactSymbolOrBuilder> 
      getIncompatibleWithSymbolsOrBuilderList();
  /**
   * <pre>
   *for behaviors that have opposites, or if another behavior or property-set
   * </pre>
   *
   * <code>repeated .taxonomy.model.artifact.ArtifactSymbol incompatible_with_symbols = 7;</code>
   */
  org.tti.tokens.model.artifact.ArtifactSymbolOrBuilder getIncompatibleWithSymbolsOrBuilder(
      int index);

  /**
   * <pre>
   *loop through the files and read them in as bytes to produce a complete artifact object model instance.
   * </pre>
   *
   * <code>repeated .taxonomy.model.artifact.ArtifactFile artifact_files = 8;</code>
   */
  java.util.List<org.tti.tokens.model.artifact.ArtifactFile> 
      getArtifactFilesList();
  /**
   * <pre>
   *loop through the files and read them in as bytes to produce a complete artifact object model instance.
   * </pre>
   *
   * <code>repeated .taxonomy.model.artifact.ArtifactFile artifact_files = 8;</code>
   */
  org.tti.tokens.model.artifact.ArtifactFile getArtifactFiles(int index);
  /**
   * <pre>
   *loop through the files and read them in as bytes to produce a complete artifact object model instance.
   * </pre>
   *
   * <code>repeated .taxonomy.model.artifact.ArtifactFile artifact_files = 8;</code>
   */
  int getArtifactFilesCount();
  /**
   * <pre>
   *loop through the files and read them in as bytes to produce a complete artifact object model instance.
   * </pre>
   *
   * <code>repeated .taxonomy.model.artifact.ArtifactFile artifact_files = 8;</code>
   */
  java.util.List<? extends org.tti.tokens.model.artifact.ArtifactFileOrBuilder> 
      getArtifactFilesOrBuilderList();
  /**
   * <pre>
   *loop through the files and read them in as bytes to produce a complete artifact object model instance.
   * </pre>
   *
   * <code>repeated .taxonomy.model.artifact.ArtifactFile artifact_files = 8;</code>
   */
  org.tti.tokens.model.artifact.ArtifactFileOrBuilder getArtifactFilesOrBuilder(
      int index);

  /**
   * <code>.taxonomy.model.artifact.Maps maps = 9;</code>
   */
  boolean hasMaps();
  /**
   * <code>.taxonomy.model.artifact.Maps maps = 9;</code>
   */
  org.tti.tokens.model.artifact.Maps getMaps();
  /**
   * <code>.taxonomy.model.artifact.Maps maps = 9;</code>
   */
  org.tti.tokens.model.artifact.MapsOrBuilder getMapsOrBuilder();
}
