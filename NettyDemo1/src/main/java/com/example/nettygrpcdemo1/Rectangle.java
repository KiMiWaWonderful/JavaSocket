// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/route_guide.proto

package com.example.nettygrpcdemo1;

/**
 * Protobuf type {@code routeguide.Rectangle}
 */
public  final class Rectangle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:routeguide.Rectangle)
    RectangleOrBuilder {
  // Use Rectangle.newBuilder() to construct.
  private Rectangle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Rectangle() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Rectangle(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.example.nettygrpcdemo1.Point.Builder subBuilder = null;
            if (lo_ != null) {
              subBuilder = lo_.toBuilder();
            }
            lo_ = input.readMessage(com.example.nettygrpcdemo1.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lo_);
              lo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.example.nettygrpcdemo1.Point.Builder subBuilder = null;
            if (hi_ != null) {
              subBuilder = hi_.toBuilder();
            }
            hi_ = input.readMessage(com.example.nettygrpcdemo1.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hi_);
              hi_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.nettygrpcdemo1.RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.nettygrpcdemo1.RouteGuideProto.internal_static_routeguide_Rectangle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.nettygrpcdemo1.Rectangle.class, com.example.nettygrpcdemo1.Rectangle.Builder.class);
  }

  public static final int LO_FIELD_NUMBER = 1;
  private com.example.nettygrpcdemo1.Point lo_;
  /**
   * <code>.routeguide.Point lo = 1;</code>
   */
  public boolean hasLo() {
    return lo_ != null;
  }
  /**
   * <code>.routeguide.Point lo = 1;</code>
   */
  public com.example.nettygrpcdemo1.Point getLo() {
    return lo_ == null ? com.example.nettygrpcdemo1.Point.getDefaultInstance() : lo_;
  }
  /**
   * <code>.routeguide.Point lo = 1;</code>
   */
  public com.example.nettygrpcdemo1.PointOrBuilder getLoOrBuilder() {
    return getLo();
  }

  public static final int HI_FIELD_NUMBER = 2;
  private com.example.nettygrpcdemo1.Point hi_;
  /**
   * <code>.routeguide.Point hi = 2;</code>
   */
  public boolean hasHi() {
    return hi_ != null;
  }
  /**
   * <code>.routeguide.Point hi = 2;</code>
   */
  public com.example.nettygrpcdemo1.Point getHi() {
    return hi_ == null ? com.example.nettygrpcdemo1.Point.getDefaultInstance() : hi_;
  }
  /**
   * <code>.routeguide.Point hi = 2;</code>
   */
  public com.example.nettygrpcdemo1.PointOrBuilder getHiOrBuilder() {
    return getHi();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (lo_ != null) {
      output.writeMessage(1, getLo());
    }
    if (hi_ != null) {
      output.writeMessage(2, getHi());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLo());
    }
    if (hi_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHi());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.nettygrpcdemo1.Rectangle)) {
      return super.equals(obj);
    }
    com.example.nettygrpcdemo1.Rectangle other = (com.example.nettygrpcdemo1.Rectangle) obj;

    boolean result = true;
    result = result && (hasLo() == other.hasLo());
    if (hasLo()) {
      result = result && getLo()
          .equals(other.getLo());
    }
    result = result && (hasHi() == other.hasHi());
    if (hasHi()) {
      result = result && getHi()
          .equals(other.getHi());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLo()) {
      hash = (37 * hash) + LO_FIELD_NUMBER;
      hash = (53 * hash) + getLo().hashCode();
    }
    if (hasHi()) {
      hash = (37 * hash) + HI_FIELD_NUMBER;
      hash = (53 * hash) + getHi().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.nettygrpcdemo1.Rectangle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.nettygrpcdemo1.Rectangle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.nettygrpcdemo1.Rectangle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.nettygrpcdemo1.Rectangle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.nettygrpcdemo1.Rectangle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.nettygrpcdemo1.Rectangle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.nettygrpcdemo1.Rectangle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.nettygrpcdemo1.Rectangle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.nettygrpcdemo1.Rectangle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.nettygrpcdemo1.Rectangle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.nettygrpcdemo1.Rectangle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.nettygrpcdemo1.Rectangle parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.nettygrpcdemo1.Rectangle prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code routeguide.Rectangle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:routeguide.Rectangle)
      com.example.nettygrpcdemo1.RectangleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.nettygrpcdemo1.RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.nettygrpcdemo1.RouteGuideProto.internal_static_routeguide_Rectangle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.nettygrpcdemo1.Rectangle.class, com.example.nettygrpcdemo1.Rectangle.Builder.class);
    }

    // Construct using com.example.nettygrpcdemo1.Rectangle.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      if (loBuilder_ == null) {
        lo_ = null;
      } else {
        lo_ = null;
        loBuilder_ = null;
      }
      if (hiBuilder_ == null) {
        hi_ = null;
      } else {
        hi_ = null;
        hiBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.nettygrpcdemo1.RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
    }

    public com.example.nettygrpcdemo1.Rectangle getDefaultInstanceForType() {
      return com.example.nettygrpcdemo1.Rectangle.getDefaultInstance();
    }

    public com.example.nettygrpcdemo1.Rectangle build() {
      com.example.nettygrpcdemo1.Rectangle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.nettygrpcdemo1.Rectangle buildPartial() {
      com.example.nettygrpcdemo1.Rectangle result = new com.example.nettygrpcdemo1.Rectangle(this);
      if (loBuilder_ == null) {
        result.lo_ = lo_;
      } else {
        result.lo_ = loBuilder_.build();
      }
      if (hiBuilder_ == null) {
        result.hi_ = hi_;
      } else {
        result.hi_ = hiBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.nettygrpcdemo1.Rectangle) {
        return mergeFrom((com.example.nettygrpcdemo1.Rectangle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.nettygrpcdemo1.Rectangle other) {
      if (other == com.example.nettygrpcdemo1.Rectangle.getDefaultInstance()) return this;
      if (other.hasLo()) {
        mergeLo(other.getLo());
      }
      if (other.hasHi()) {
        mergeHi(other.getHi());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.nettygrpcdemo1.Rectangle parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.nettygrpcdemo1.Rectangle) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.example.nettygrpcdemo1.Point lo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.nettygrpcdemo1.Point, com.example.nettygrpcdemo1.Point.Builder, com.example.nettygrpcdemo1.PointOrBuilder> loBuilder_;
    /**
     * <code>.routeguide.Point lo = 1;</code>
     */
    public boolean hasLo() {
      return loBuilder_ != null || lo_ != null;
    }
    /**
     * <code>.routeguide.Point lo = 1;</code>
     */
    public com.example.nettygrpcdemo1.Point getLo() {
      if (loBuilder_ == null) {
        return lo_ == null ? com.example.nettygrpcdemo1.Point.getDefaultInstance() : lo_;
      } else {
        return loBuilder_.getMessage();
      }
    }
    /**
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder setLo(com.example.nettygrpcdemo1.Point value) {
      if (loBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lo_ = value;
        onChanged();
      } else {
        loBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder setLo(
        com.example.nettygrpcdemo1.Point.Builder builderForValue) {
      if (loBuilder_ == null) {
        lo_ = builderForValue.build();
        onChanged();
      } else {
        loBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder mergeLo(com.example.nettygrpcdemo1.Point value) {
      if (loBuilder_ == null) {
        if (lo_ != null) {
          lo_ =
            com.example.nettygrpcdemo1.Point.newBuilder(lo_).mergeFrom(value).buildPartial();
        } else {
          lo_ = value;
        }
        onChanged();
      } else {
        loBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder clearLo() {
      if (loBuilder_ == null) {
        lo_ = null;
        onChanged();
      } else {
        lo_ = null;
        loBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.routeguide.Point lo = 1;</code>
     */
    public com.example.nettygrpcdemo1.Point.Builder getLoBuilder() {
      
      onChanged();
      return getLoFieldBuilder().getBuilder();
    }
    /**
     * <code>.routeguide.Point lo = 1;</code>
     */
    public com.example.nettygrpcdemo1.PointOrBuilder getLoOrBuilder() {
      if (loBuilder_ != null) {
        return loBuilder_.getMessageOrBuilder();
      } else {
        return lo_ == null ?
            com.example.nettygrpcdemo1.Point.getDefaultInstance() : lo_;
      }
    }
    /**
     * <code>.routeguide.Point lo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.nettygrpcdemo1.Point, com.example.nettygrpcdemo1.Point.Builder, com.example.nettygrpcdemo1.PointOrBuilder> 
        getLoFieldBuilder() {
      if (loBuilder_ == null) {
        loBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.nettygrpcdemo1.Point, com.example.nettygrpcdemo1.Point.Builder, com.example.nettygrpcdemo1.PointOrBuilder>(
                getLo(),
                getParentForChildren(),
                isClean());
        lo_ = null;
      }
      return loBuilder_;
    }

    private com.example.nettygrpcdemo1.Point hi_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.nettygrpcdemo1.Point, com.example.nettygrpcdemo1.Point.Builder, com.example.nettygrpcdemo1.PointOrBuilder> hiBuilder_;
    /**
     * <code>.routeguide.Point hi = 2;</code>
     */
    public boolean hasHi() {
      return hiBuilder_ != null || hi_ != null;
    }
    /**
     * <code>.routeguide.Point hi = 2;</code>
     */
    public com.example.nettygrpcdemo1.Point getHi() {
      if (hiBuilder_ == null) {
        return hi_ == null ? com.example.nettygrpcdemo1.Point.getDefaultInstance() : hi_;
      } else {
        return hiBuilder_.getMessage();
      }
    }
    /**
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder setHi(com.example.nettygrpcdemo1.Point value) {
      if (hiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hi_ = value;
        onChanged();
      } else {
        hiBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder setHi(
        com.example.nettygrpcdemo1.Point.Builder builderForValue) {
      if (hiBuilder_ == null) {
        hi_ = builderForValue.build();
        onChanged();
      } else {
        hiBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder mergeHi(com.example.nettygrpcdemo1.Point value) {
      if (hiBuilder_ == null) {
        if (hi_ != null) {
          hi_ =
            com.example.nettygrpcdemo1.Point.newBuilder(hi_).mergeFrom(value).buildPartial();
        } else {
          hi_ = value;
        }
        onChanged();
      } else {
        hiBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder clearHi() {
      if (hiBuilder_ == null) {
        hi_ = null;
        onChanged();
      } else {
        hi_ = null;
        hiBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.routeguide.Point hi = 2;</code>
     */
    public com.example.nettygrpcdemo1.Point.Builder getHiBuilder() {
      
      onChanged();
      return getHiFieldBuilder().getBuilder();
    }
    /**
     * <code>.routeguide.Point hi = 2;</code>
     */
    public com.example.nettygrpcdemo1.PointOrBuilder getHiOrBuilder() {
      if (hiBuilder_ != null) {
        return hiBuilder_.getMessageOrBuilder();
      } else {
        return hi_ == null ?
            com.example.nettygrpcdemo1.Point.getDefaultInstance() : hi_;
      }
    }
    /**
     * <code>.routeguide.Point hi = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.nettygrpcdemo1.Point, com.example.nettygrpcdemo1.Point.Builder, com.example.nettygrpcdemo1.PointOrBuilder> 
        getHiFieldBuilder() {
      if (hiBuilder_ == null) {
        hiBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.nettygrpcdemo1.Point, com.example.nettygrpcdemo1.Point.Builder, com.example.nettygrpcdemo1.PointOrBuilder>(
                getHi(),
                getParentForChildren(),
                isClean());
        hi_ = null;
      }
      return hiBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:routeguide.Rectangle)
  }

  // @@protoc_insertion_point(class_scope:routeguide.Rectangle)
  private static final com.example.nettygrpcdemo1.Rectangle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.nettygrpcdemo1.Rectangle();
  }

  public static com.example.nettygrpcdemo1.Rectangle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Rectangle>
      PARSER = new com.google.protobuf.AbstractParser<Rectangle>() {
    public Rectangle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Rectangle(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Rectangle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Rectangle> getParserForType() {
    return PARSER;
  }

  public com.example.nettygrpcdemo1.Rectangle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
