// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: artifact.proto

package org.tokentaxonomyinitiative.tokens.model.artifact;

/**
 * Protobuf enum {@code taxonomy.model.artifact.MappingType}
 */
public enum MappingType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SOURCE_CODE = 0;</code>
   */
  SOURCE_CODE(0),
  /**
   * <code>IMPLEMENTATION = 1;</code>
   */
  IMPLEMENTATION(1),
  /**
   * <pre>
   *to an external informational source like a regulatory framework or related issue
   * </pre>
   *
   * <code>RESOURCE = 2;</code>
   */
  RESOURCE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SOURCE_CODE = 0;</code>
   */
  public static final int SOURCE_CODE_VALUE = 0;
  /**
   * <code>IMPLEMENTATION = 1;</code>
   */
  public static final int IMPLEMENTATION_VALUE = 1;
  /**
   * <pre>
   *to an external informational source like a regulatory framework or related issue
   * </pre>
   *
   * <code>RESOURCE = 2;</code>
   */
  public static final int RESOURCE_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MappingType valueOf(int value) {
    return forNumber(value);
  }

  public static MappingType forNumber(int value) {
    switch (value) {
      case 0: return SOURCE_CODE;
      case 1: return IMPLEMENTATION;
      case 2: return RESOURCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MappingType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MappingType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MappingType>() {
          public MappingType findValueByNumber(int number) {
            return MappingType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.tokentaxonomyinitiative.tokens.model.artifact.ArtifactOuterClass.getDescriptor().getEnumTypes().get(2);
  }

  private static final MappingType[] VALUES = values();

  public static MappingType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MappingType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:taxonomy.model.artifact.MappingType)
}

