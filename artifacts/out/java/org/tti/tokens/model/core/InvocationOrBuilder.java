// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.tti.tokens.model.core;

public interface InvocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:taxonomy.model.core.Invocation)
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
   * <code>.taxonomy.model.core.InvocationRequest request = 3;</code>
   */
  boolean hasRequest();
  /**
   * <code>.taxonomy.model.core.InvocationRequest request = 3;</code>
   */
  org.tti.tokens.model.core.InvocationRequest getRequest();
  /**
   * <code>.taxonomy.model.core.InvocationRequest request = 3;</code>
   */
  org.tti.tokens.model.core.InvocationRequestOrBuilder getRequestOrBuilder();

  /**
   * <code>.taxonomy.model.core.InvocationResponse response = 4;</code>
   */
  boolean hasResponse();
  /**
   * <code>.taxonomy.model.core.InvocationResponse response = 4;</code>
   */
  org.tti.tokens.model.core.InvocationResponse getResponse();
  /**
   * <code>.taxonomy.model.core.InvocationResponse response = 4;</code>
   */
  org.tti.tokens.model.core.InvocationResponseOrBuilder getResponseOrBuilder();
}
