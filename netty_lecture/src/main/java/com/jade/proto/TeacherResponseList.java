// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Teacher.proto

package com.jade.proto;

/**
 * Protobuf type {@code com.jade.proto.TeacherResponseList}
 */
public  final class TeacherResponseList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.jade.proto.TeacherResponseList)
    TeacherResponseListOrBuilder {
  // Use TeacherResponseList.newBuilder() to construct.
  private TeacherResponseList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TeacherResponseList() {
    teacherResponse_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TeacherResponseList(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              teacherResponse_ = new java.util.ArrayList<com.jade.proto.TeacherResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            teacherResponse_.add(
                input.readMessage(com.jade.proto.TeacherResponse.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        teacherResponse_ = java.util.Collections.unmodifiableList(teacherResponse_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.jade.proto.TeacherProto.internal_static_com_jade_proto_TeacherResponseList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jade.proto.TeacherProto.internal_static_com_jade_proto_TeacherResponseList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jade.proto.TeacherResponseList.class, com.jade.proto.TeacherResponseList.Builder.class);
  }

  public static final int TEACHERRESPONSE_FIELD_NUMBER = 1;
  private java.util.List<com.jade.proto.TeacherResponse> teacherResponse_;
  /**
   * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
   */
  public java.util.List<com.jade.proto.TeacherResponse> getTeacherResponseList() {
    return teacherResponse_;
  }
  /**
   * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
   */
  public java.util.List<? extends com.jade.proto.TeacherResponseOrBuilder> 
      getTeacherResponseOrBuilderList() {
    return teacherResponse_;
  }
  /**
   * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
   */
  public int getTeacherResponseCount() {
    return teacherResponse_.size();
  }
  /**
   * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
   */
  public com.jade.proto.TeacherResponse getTeacherResponse(int index) {
    return teacherResponse_.get(index);
  }
  /**
   * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
   */
  public com.jade.proto.TeacherResponseOrBuilder getTeacherResponseOrBuilder(
      int index) {
    return teacherResponse_.get(index);
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
    for (int i = 0; i < teacherResponse_.size(); i++) {
      output.writeMessage(1, teacherResponse_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < teacherResponse_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, teacherResponse_.get(i));
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
    if (!(obj instanceof com.jade.proto.TeacherResponseList)) {
      return super.equals(obj);
    }
    com.jade.proto.TeacherResponseList other = (com.jade.proto.TeacherResponseList) obj;

    boolean result = true;
    result = result && getTeacherResponseList()
        .equals(other.getTeacherResponseList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTeacherResponseCount() > 0) {
      hash = (37 * hash) + TEACHERRESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getTeacherResponseList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.jade.proto.TeacherResponseList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jade.proto.TeacherResponseList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jade.proto.TeacherResponseList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jade.proto.TeacherResponseList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jade.proto.TeacherResponseList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jade.proto.TeacherResponseList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jade.proto.TeacherResponseList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.jade.proto.TeacherResponseList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jade.proto.TeacherResponseList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jade.proto.TeacherResponseList parseFrom(
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
  public static Builder newBuilder(com.jade.proto.TeacherResponseList prototype) {
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
   * Protobuf type {@code com.jade.proto.TeacherResponseList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.jade.proto.TeacherResponseList)
      com.jade.proto.TeacherResponseListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jade.proto.TeacherProto.internal_static_com_jade_proto_TeacherResponseList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jade.proto.TeacherProto.internal_static_com_jade_proto_TeacherResponseList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jade.proto.TeacherResponseList.class, com.jade.proto.TeacherResponseList.Builder.class);
    }

    // Construct using com.jade.proto.TeacherResponseList.newBuilder()
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
        getTeacherResponseFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (teacherResponseBuilder_ == null) {
        teacherResponse_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        teacherResponseBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jade.proto.TeacherProto.internal_static_com_jade_proto_TeacherResponseList_descriptor;
    }

    public com.jade.proto.TeacherResponseList getDefaultInstanceForType() {
      return com.jade.proto.TeacherResponseList.getDefaultInstance();
    }

    public com.jade.proto.TeacherResponseList build() {
      com.jade.proto.TeacherResponseList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.jade.proto.TeacherResponseList buildPartial() {
      com.jade.proto.TeacherResponseList result = new com.jade.proto.TeacherResponseList(this);
      int from_bitField0_ = bitField0_;
      if (teacherResponseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          teacherResponse_ = java.util.Collections.unmodifiableList(teacherResponse_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.teacherResponse_ = teacherResponse_;
      } else {
        result.teacherResponse_ = teacherResponseBuilder_.build();
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
      if (other instanceof com.jade.proto.TeacherResponseList) {
        return mergeFrom((com.jade.proto.TeacherResponseList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jade.proto.TeacherResponseList other) {
      if (other == com.jade.proto.TeacherResponseList.getDefaultInstance()) return this;
      if (teacherResponseBuilder_ == null) {
        if (!other.teacherResponse_.isEmpty()) {
          if (teacherResponse_.isEmpty()) {
            teacherResponse_ = other.teacherResponse_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTeacherResponseIsMutable();
            teacherResponse_.addAll(other.teacherResponse_);
          }
          onChanged();
        }
      } else {
        if (!other.teacherResponse_.isEmpty()) {
          if (teacherResponseBuilder_.isEmpty()) {
            teacherResponseBuilder_.dispose();
            teacherResponseBuilder_ = null;
            teacherResponse_ = other.teacherResponse_;
            bitField0_ = (bitField0_ & ~0x00000001);
            teacherResponseBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTeacherResponseFieldBuilder() : null;
          } else {
            teacherResponseBuilder_.addAllMessages(other.teacherResponse_);
          }
        }
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
      com.jade.proto.TeacherResponseList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.jade.proto.TeacherResponseList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.jade.proto.TeacherResponse> teacherResponse_ =
      java.util.Collections.emptyList();
    private void ensureTeacherResponseIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        teacherResponse_ = new java.util.ArrayList<com.jade.proto.TeacherResponse>(teacherResponse_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.jade.proto.TeacherResponse, com.jade.proto.TeacherResponse.Builder, com.jade.proto.TeacherResponseOrBuilder> teacherResponseBuilder_;

    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public java.util.List<com.jade.proto.TeacherResponse> getTeacherResponseList() {
      if (teacherResponseBuilder_ == null) {
        return java.util.Collections.unmodifiableList(teacherResponse_);
      } else {
        return teacherResponseBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public int getTeacherResponseCount() {
      if (teacherResponseBuilder_ == null) {
        return teacherResponse_.size();
      } else {
        return teacherResponseBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public com.jade.proto.TeacherResponse getTeacherResponse(int index) {
      if (teacherResponseBuilder_ == null) {
        return teacherResponse_.get(index);
      } else {
        return teacherResponseBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public Builder setTeacherResponse(
        int index, com.jade.proto.TeacherResponse value) {
      if (teacherResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTeacherResponseIsMutable();
        teacherResponse_.set(index, value);
        onChanged();
      } else {
        teacherResponseBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public Builder setTeacherResponse(
        int index, com.jade.proto.TeacherResponse.Builder builderForValue) {
      if (teacherResponseBuilder_ == null) {
        ensureTeacherResponseIsMutable();
        teacherResponse_.set(index, builderForValue.build());
        onChanged();
      } else {
        teacherResponseBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public Builder addTeacherResponse(com.jade.proto.TeacherResponse value) {
      if (teacherResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTeacherResponseIsMutable();
        teacherResponse_.add(value);
        onChanged();
      } else {
        teacherResponseBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public Builder addTeacherResponse(
        int index, com.jade.proto.TeacherResponse value) {
      if (teacherResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTeacherResponseIsMutable();
        teacherResponse_.add(index, value);
        onChanged();
      } else {
        teacherResponseBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public Builder addTeacherResponse(
        com.jade.proto.TeacherResponse.Builder builderForValue) {
      if (teacherResponseBuilder_ == null) {
        ensureTeacherResponseIsMutable();
        teacherResponse_.add(builderForValue.build());
        onChanged();
      } else {
        teacherResponseBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public Builder addTeacherResponse(
        int index, com.jade.proto.TeacherResponse.Builder builderForValue) {
      if (teacherResponseBuilder_ == null) {
        ensureTeacherResponseIsMutable();
        teacherResponse_.add(index, builderForValue.build());
        onChanged();
      } else {
        teacherResponseBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public Builder addAllTeacherResponse(
        java.lang.Iterable<? extends com.jade.proto.TeacherResponse> values) {
      if (teacherResponseBuilder_ == null) {
        ensureTeacherResponseIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, teacherResponse_);
        onChanged();
      } else {
        teacherResponseBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public Builder clearTeacherResponse() {
      if (teacherResponseBuilder_ == null) {
        teacherResponse_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        teacherResponseBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public Builder removeTeacherResponse(int index) {
      if (teacherResponseBuilder_ == null) {
        ensureTeacherResponseIsMutable();
        teacherResponse_.remove(index);
        onChanged();
      } else {
        teacherResponseBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public com.jade.proto.TeacherResponse.Builder getTeacherResponseBuilder(
        int index) {
      return getTeacherResponseFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public com.jade.proto.TeacherResponseOrBuilder getTeacherResponseOrBuilder(
        int index) {
      if (teacherResponseBuilder_ == null) {
        return teacherResponse_.get(index);  } else {
        return teacherResponseBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public java.util.List<? extends com.jade.proto.TeacherResponseOrBuilder> 
         getTeacherResponseOrBuilderList() {
      if (teacherResponseBuilder_ != null) {
        return teacherResponseBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(teacherResponse_);
      }
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public com.jade.proto.TeacherResponse.Builder addTeacherResponseBuilder() {
      return getTeacherResponseFieldBuilder().addBuilder(
          com.jade.proto.TeacherResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public com.jade.proto.TeacherResponse.Builder addTeacherResponseBuilder(
        int index) {
      return getTeacherResponseFieldBuilder().addBuilder(
          index, com.jade.proto.TeacherResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .com.jade.proto.TeacherResponse teacherResponse = 1;</code>
     */
    public java.util.List<com.jade.proto.TeacherResponse.Builder> 
         getTeacherResponseBuilderList() {
      return getTeacherResponseFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.jade.proto.TeacherResponse, com.jade.proto.TeacherResponse.Builder, com.jade.proto.TeacherResponseOrBuilder> 
        getTeacherResponseFieldBuilder() {
      if (teacherResponseBuilder_ == null) {
        teacherResponseBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.jade.proto.TeacherResponse, com.jade.proto.TeacherResponse.Builder, com.jade.proto.TeacherResponseOrBuilder>(
                teacherResponse_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        teacherResponse_ = null;
      }
      return teacherResponseBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.jade.proto.TeacherResponseList)
  }

  // @@protoc_insertion_point(class_scope:com.jade.proto.TeacherResponseList)
  private static final com.jade.proto.TeacherResponseList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.jade.proto.TeacherResponseList();
  }

  public static com.jade.proto.TeacherResponseList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TeacherResponseList>
      PARSER = new com.google.protobuf.AbstractParser<TeacherResponseList>() {
    public TeacherResponseList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TeacherResponseList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TeacherResponseList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TeacherResponseList> getParserForType() {
    return PARSER;
  }

  public com.jade.proto.TeacherResponseList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

