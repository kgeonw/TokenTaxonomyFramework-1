// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.tti.tokens.model.core;

/**
 * Protobuf type {@code taxonomy.model.core.PropertySet}
 */
public  final class PropertySet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:taxonomy.model.core.PropertySet)
    PropertySetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PropertySet.newBuilder() to construct.
  private PropertySet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PropertySet() {
    properties_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PropertySet(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.tti.tokens.model.artifact.Artifact.Builder subBuilder = null;
            if (artifact_ != null) {
              subBuilder = artifact_.toBuilder();
            }
            artifact_ = input.readMessage(org.tti.tokens.model.artifact.Artifact.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(artifact_);
              artifact_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              properties_ = new java.util.ArrayList<org.tti.tokens.model.core.Property>();
              mutable_bitField0_ |= 0x00000002;
            }
            properties_.add(
                input.readMessage(org.tti.tokens.model.core.Property.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        properties_ = java.util.Collections.unmodifiableList(properties_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tti.tokens.model.core.Core.internal_static_taxonomy_model_core_PropertySet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tti.tokens.model.core.Core.internal_static_taxonomy_model_core_PropertySet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tti.tokens.model.core.PropertySet.class, org.tti.tokens.model.core.PropertySet.Builder.class);
  }

  private int bitField0_;
  public static final int ARTIFACT_FIELD_NUMBER = 1;
  private org.tti.tokens.model.artifact.Artifact artifact_;
  /**
   * <code>.taxonomy.model.artifact.Artifact artifact = 1;</code>
   */
  public boolean hasArtifact() {
    return artifact_ != null;
  }
  /**
   * <code>.taxonomy.model.artifact.Artifact artifact = 1;</code>
   */
  public org.tti.tokens.model.artifact.Artifact getArtifact() {
    return artifact_ == null ? org.tti.tokens.model.artifact.Artifact.getDefaultInstance() : artifact_;
  }
  /**
   * <code>.taxonomy.model.artifact.Artifact artifact = 1;</code>
   */
  public org.tti.tokens.model.artifact.ArtifactOrBuilder getArtifactOrBuilder() {
    return getArtifact();
  }

  public static final int PROPERTIES_FIELD_NUMBER = 2;
  private java.util.List<org.tti.tokens.model.core.Property> properties_;
  /**
   * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
   */
  public java.util.List<org.tti.tokens.model.core.Property> getPropertiesList() {
    return properties_;
  }
  /**
   * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
   */
  public java.util.List<? extends org.tti.tokens.model.core.PropertyOrBuilder> 
      getPropertiesOrBuilderList() {
    return properties_;
  }
  /**
   * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
   */
  public int getPropertiesCount() {
    return properties_.size();
  }
  /**
   * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
   */
  public org.tti.tokens.model.core.Property getProperties(int index) {
    return properties_.get(index);
  }
  /**
   * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
   */
  public org.tti.tokens.model.core.PropertyOrBuilder getPropertiesOrBuilder(
      int index) {
    return properties_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (artifact_ != null) {
      output.writeMessage(1, getArtifact());
    }
    for (int i = 0; i < properties_.size(); i++) {
      output.writeMessage(2, properties_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (artifact_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getArtifact());
    }
    for (int i = 0; i < properties_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, properties_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tti.tokens.model.core.PropertySet)) {
      return super.equals(obj);
    }
    org.tti.tokens.model.core.PropertySet other = (org.tti.tokens.model.core.PropertySet) obj;

    if (hasArtifact() != other.hasArtifact()) return false;
    if (hasArtifact()) {
      if (!getArtifact()
          .equals(other.getArtifact())) return false;
    }
    if (!getPropertiesList()
        .equals(other.getPropertiesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasArtifact()) {
      hash = (37 * hash) + ARTIFACT_FIELD_NUMBER;
      hash = (53 * hash) + getArtifact().hashCode();
    }
    if (getPropertiesCount() > 0) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + getPropertiesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tti.tokens.model.core.PropertySet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tti.tokens.model.core.PropertySet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tti.tokens.model.core.PropertySet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tti.tokens.model.core.PropertySet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tti.tokens.model.core.PropertySet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tti.tokens.model.core.PropertySet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tti.tokens.model.core.PropertySet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tti.tokens.model.core.PropertySet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tti.tokens.model.core.PropertySet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tti.tokens.model.core.PropertySet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tti.tokens.model.core.PropertySet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tti.tokens.model.core.PropertySet parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tti.tokens.model.core.PropertySet prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code taxonomy.model.core.PropertySet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:taxonomy.model.core.PropertySet)
      org.tti.tokens.model.core.PropertySetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tti.tokens.model.core.Core.internal_static_taxonomy_model_core_PropertySet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tti.tokens.model.core.Core.internal_static_taxonomy_model_core_PropertySet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tti.tokens.model.core.PropertySet.class, org.tti.tokens.model.core.PropertySet.Builder.class);
    }

    // Construct using org.tti.tokens.model.core.PropertySet.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPropertiesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (artifactBuilder_ == null) {
        artifact_ = null;
      } else {
        artifact_ = null;
        artifactBuilder_ = null;
      }
      if (propertiesBuilder_ == null) {
        properties_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        propertiesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tti.tokens.model.core.Core.internal_static_taxonomy_model_core_PropertySet_descriptor;
    }

    @java.lang.Override
    public org.tti.tokens.model.core.PropertySet getDefaultInstanceForType() {
      return org.tti.tokens.model.core.PropertySet.getDefaultInstance();
    }

    @java.lang.Override
    public org.tti.tokens.model.core.PropertySet build() {
      org.tti.tokens.model.core.PropertySet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tti.tokens.model.core.PropertySet buildPartial() {
      org.tti.tokens.model.core.PropertySet result = new org.tti.tokens.model.core.PropertySet(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (artifactBuilder_ == null) {
        result.artifact_ = artifact_;
      } else {
        result.artifact_ = artifactBuilder_.build();
      }
      if (propertiesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          properties_ = java.util.Collections.unmodifiableList(properties_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.properties_ = properties_;
      } else {
        result.properties_ = propertiesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tti.tokens.model.core.PropertySet) {
        return mergeFrom((org.tti.tokens.model.core.PropertySet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tti.tokens.model.core.PropertySet other) {
      if (other == org.tti.tokens.model.core.PropertySet.getDefaultInstance()) return this;
      if (other.hasArtifact()) {
        mergeArtifact(other.getArtifact());
      }
      if (propertiesBuilder_ == null) {
        if (!other.properties_.isEmpty()) {
          if (properties_.isEmpty()) {
            properties_ = other.properties_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePropertiesIsMutable();
            properties_.addAll(other.properties_);
          }
          onChanged();
        }
      } else {
        if (!other.properties_.isEmpty()) {
          if (propertiesBuilder_.isEmpty()) {
            propertiesBuilder_.dispose();
            propertiesBuilder_ = null;
            properties_ = other.properties_;
            bitField0_ = (bitField0_ & ~0x00000002);
            propertiesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPropertiesFieldBuilder() : null;
          } else {
            propertiesBuilder_.addAllMessages(other.properties_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tti.tokens.model.core.PropertySet parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tti.tokens.model.core.PropertySet) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.tti.tokens.model.artifact.Artifact artifact_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tti.tokens.model.artifact.Artifact, org.tti.tokens.model.artifact.Artifact.Builder, org.tti.tokens.model.artifact.ArtifactOrBuilder> artifactBuilder_;
    /**
     * <code>.taxonomy.model.artifact.Artifact artifact = 1;</code>
     */
    public boolean hasArtifact() {
      return artifactBuilder_ != null || artifact_ != null;
    }
    /**
     * <code>.taxonomy.model.artifact.Artifact artifact = 1;</code>
     */
    public org.tti.tokens.model.artifact.Artifact getArtifact() {
      if (artifactBuilder_ == null) {
        return artifact_ == null ? org.tti.tokens.model.artifact.Artifact.getDefaultInstance() : artifact_;
      } else {
        return artifactBuilder_.getMessage();
      }
    }
    /**
     * <code>.taxonomy.model.artifact.Artifact artifact = 1;</code>
     */
    public Builder setArtifact(org.tti.tokens.model.artifact.Artifact value) {
      if (artifactBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        artifact_ = value;
        onChanged();
      } else {
        artifactBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.taxonomy.model.artifact.Artifact artifact = 1;</code>
     */
    public Builder setArtifact(
        org.tti.tokens.model.artifact.Artifact.Builder builderForValue) {
      if (artifactBuilder_ == null) {
        artifact_ = builderForValue.build();
        onChanged();
      } else {
        artifactBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.taxonomy.model.artifact.Artifact artifact = 1;</code>
     */
    public Builder mergeArtifact(org.tti.tokens.model.artifact.Artifact value) {
      if (artifactBuilder_ == null) {
        if (artifact_ != null) {
          artifact_ =
            org.tti.tokens.model.artifact.Artifact.newBuilder(artifact_).mergeFrom(value).buildPartial();
        } else {
          artifact_ = value;
        }
        onChanged();
      } else {
        artifactBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.taxonomy.model.artifact.Artifact artifact = 1;</code>
     */
    public Builder clearArtifact() {
      if (artifactBuilder_ == null) {
        artifact_ = null;
        onChanged();
      } else {
        artifact_ = null;
        artifactBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.taxonomy.model.artifact.Artifact artifact = 1;</code>
     */
    public org.tti.tokens.model.artifact.Artifact.Builder getArtifactBuilder() {
      
      onChanged();
      return getArtifactFieldBuilder().getBuilder();
    }
    /**
     * <code>.taxonomy.model.artifact.Artifact artifact = 1;</code>
     */
    public org.tti.tokens.model.artifact.ArtifactOrBuilder getArtifactOrBuilder() {
      if (artifactBuilder_ != null) {
        return artifactBuilder_.getMessageOrBuilder();
      } else {
        return artifact_ == null ?
            org.tti.tokens.model.artifact.Artifact.getDefaultInstance() : artifact_;
      }
    }
    /**
     * <code>.taxonomy.model.artifact.Artifact artifact = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tti.tokens.model.artifact.Artifact, org.tti.tokens.model.artifact.Artifact.Builder, org.tti.tokens.model.artifact.ArtifactOrBuilder> 
        getArtifactFieldBuilder() {
      if (artifactBuilder_ == null) {
        artifactBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tti.tokens.model.artifact.Artifact, org.tti.tokens.model.artifact.Artifact.Builder, org.tti.tokens.model.artifact.ArtifactOrBuilder>(
                getArtifact(),
                getParentForChildren(),
                isClean());
        artifact_ = null;
      }
      return artifactBuilder_;
    }

    private java.util.List<org.tti.tokens.model.core.Property> properties_ =
      java.util.Collections.emptyList();
    private void ensurePropertiesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        properties_ = new java.util.ArrayList<org.tti.tokens.model.core.Property>(properties_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tti.tokens.model.core.Property, org.tti.tokens.model.core.Property.Builder, org.tti.tokens.model.core.PropertyOrBuilder> propertiesBuilder_;

    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public java.util.List<org.tti.tokens.model.core.Property> getPropertiesList() {
      if (propertiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(properties_);
      } else {
        return propertiesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public int getPropertiesCount() {
      if (propertiesBuilder_ == null) {
        return properties_.size();
      } else {
        return propertiesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public org.tti.tokens.model.core.Property getProperties(int index) {
      if (propertiesBuilder_ == null) {
        return properties_.get(index);
      } else {
        return propertiesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public Builder setProperties(
        int index, org.tti.tokens.model.core.Property value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertiesIsMutable();
        properties_.set(index, value);
        onChanged();
      } else {
        propertiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public Builder setProperties(
        int index, org.tti.tokens.model.core.Property.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.set(index, builderForValue.build());
        onChanged();
      } else {
        propertiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public Builder addProperties(org.tti.tokens.model.core.Property value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertiesIsMutable();
        properties_.add(value);
        onChanged();
      } else {
        propertiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public Builder addProperties(
        int index, org.tti.tokens.model.core.Property value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertiesIsMutable();
        properties_.add(index, value);
        onChanged();
      } else {
        propertiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public Builder addProperties(
        org.tti.tokens.model.core.Property.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.add(builderForValue.build());
        onChanged();
      } else {
        propertiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public Builder addProperties(
        int index, org.tti.tokens.model.core.Property.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.add(index, builderForValue.build());
        onChanged();
      } else {
        propertiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public Builder addAllProperties(
        java.lang.Iterable<? extends org.tti.tokens.model.core.Property> values) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, properties_);
        onChanged();
      } else {
        propertiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public Builder clearProperties() {
      if (propertiesBuilder_ == null) {
        properties_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        propertiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public Builder removeProperties(int index) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.remove(index);
        onChanged();
      } else {
        propertiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public org.tti.tokens.model.core.Property.Builder getPropertiesBuilder(
        int index) {
      return getPropertiesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public org.tti.tokens.model.core.PropertyOrBuilder getPropertiesOrBuilder(
        int index) {
      if (propertiesBuilder_ == null) {
        return properties_.get(index);  } else {
        return propertiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public java.util.List<? extends org.tti.tokens.model.core.PropertyOrBuilder> 
         getPropertiesOrBuilderList() {
      if (propertiesBuilder_ != null) {
        return propertiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(properties_);
      }
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public org.tti.tokens.model.core.Property.Builder addPropertiesBuilder() {
      return getPropertiesFieldBuilder().addBuilder(
          org.tti.tokens.model.core.Property.getDefaultInstance());
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public org.tti.tokens.model.core.Property.Builder addPropertiesBuilder(
        int index) {
      return getPropertiesFieldBuilder().addBuilder(
          index, org.tti.tokens.model.core.Property.getDefaultInstance());
    }
    /**
     * <code>repeated .taxonomy.model.core.Property properties = 2;</code>
     */
    public java.util.List<org.tti.tokens.model.core.Property.Builder> 
         getPropertiesBuilderList() {
      return getPropertiesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tti.tokens.model.core.Property, org.tti.tokens.model.core.Property.Builder, org.tti.tokens.model.core.PropertyOrBuilder> 
        getPropertiesFieldBuilder() {
      if (propertiesBuilder_ == null) {
        propertiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tti.tokens.model.core.Property, org.tti.tokens.model.core.Property.Builder, org.tti.tokens.model.core.PropertyOrBuilder>(
                properties_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        properties_ = null;
      }
      return propertiesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:taxonomy.model.core.PropertySet)
  }

  // @@protoc_insertion_point(class_scope:taxonomy.model.core.PropertySet)
  private static final org.tti.tokens.model.core.PropertySet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tti.tokens.model.core.PropertySet();
  }

  public static org.tti.tokens.model.core.PropertySet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PropertySet>
      PARSER = new com.google.protobuf.AbstractParser<PropertySet>() {
    @java.lang.Override
    public PropertySet parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PropertySet(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PropertySet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PropertySet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tti.tokens.model.core.PropertySet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

