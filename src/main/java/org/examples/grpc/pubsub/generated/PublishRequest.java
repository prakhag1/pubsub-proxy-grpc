// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy.proto

package org.examples.grpc.pubsub.generated;

/**
 * <pre>
 * Request for the Publish method.
 * </pre>
 *
 * Protobuf type {@code org.examples.grpc.pubsub.generated.PublishRequest}
 */
public  final class PublishRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.examples.grpc.pubsub.generated.PublishRequest)
    PublishRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublishRequest.newBuilder() to construct.
  private PublishRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublishRequest() {
    topic_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PublishRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            topic_ = s;
            break;
          }
          case 18: {
            org.examples.grpc.pubsub.generated.PubsubMessage.Builder subBuilder = null;
            if (message_ != null) {
              subBuilder = message_.toBuilder();
            }
            message_ = input.readMessage(org.examples.grpc.pubsub.generated.PubsubMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(message_);
              message_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.examples.grpc.pubsub.generated.PubsubProxyProto.internal_static_org_examples_grpc_pubsub_generated_PublishRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.examples.grpc.pubsub.generated.PubsubProxyProto.internal_static_org_examples_grpc_pubsub_generated_PublishRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.examples.grpc.pubsub.generated.PublishRequest.class, org.examples.grpc.pubsub.generated.PublishRequest.Builder.class);
  }

  public static final int TOPIC_FIELD_NUMBER = 1;
  private volatile java.lang.Object topic_;
  /**
   * <pre>
   * The message in the request will be published on this topic.
   * </pre>
   *
   * <code>string topic = 1;</code>
   */
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The message in the request will be published on this topic.
   * </pre>
   *
   * <code>string topic = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private org.examples.grpc.pubsub.generated.PubsubMessage message_;
  /**
   * <pre>
   * Message to publish.
   * </pre>
   *
   * <code>.org.examples.grpc.pubsub.generated.PubsubMessage message = 2;</code>
   */
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <pre>
   * Message to publish.
   * </pre>
   *
   * <code>.org.examples.grpc.pubsub.generated.PubsubMessage message = 2;</code>
   */
  public org.examples.grpc.pubsub.generated.PubsubMessage getMessage() {
    return message_ == null ? org.examples.grpc.pubsub.generated.PubsubMessage.getDefaultInstance() : message_;
  }
  /**
   * <pre>
   * Message to publish.
   * </pre>
   *
   * <code>.org.examples.grpc.pubsub.generated.PubsubMessage message = 2;</code>
   */
  public org.examples.grpc.pubsub.generated.PubsubMessageOrBuilder getMessageOrBuilder() {
    return getMessage();
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
    if (!getTopicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topic_);
    }
    if (message_ != null) {
      output.writeMessage(2, getMessage());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTopicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topic_);
    }
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMessage());
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
    if (!(obj instanceof org.examples.grpc.pubsub.generated.PublishRequest)) {
      return super.equals(obj);
    }
    org.examples.grpc.pubsub.generated.PublishRequest other = (org.examples.grpc.pubsub.generated.PublishRequest) obj;

    boolean result = true;
    result = result && getTopic()
        .equals(other.getTopic());
    result = result && (hasMessage() == other.hasMessage());
    if (hasMessage()) {
      result = result && getMessage()
          .equals(other.getMessage());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.examples.grpc.pubsub.generated.PublishRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.examples.grpc.pubsub.generated.PublishRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.examples.grpc.pubsub.generated.PublishRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.examples.grpc.pubsub.generated.PublishRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.examples.grpc.pubsub.generated.PublishRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.examples.grpc.pubsub.generated.PublishRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.examples.grpc.pubsub.generated.PublishRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.examples.grpc.pubsub.generated.PublishRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.examples.grpc.pubsub.generated.PublishRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.examples.grpc.pubsub.generated.PublishRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.examples.grpc.pubsub.generated.PublishRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.examples.grpc.pubsub.generated.PublishRequest parseFrom(
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
  public static Builder newBuilder(org.examples.grpc.pubsub.generated.PublishRequest prototype) {
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
   * <pre>
   * Request for the Publish method.
   * </pre>
   *
   * Protobuf type {@code org.examples.grpc.pubsub.generated.PublishRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.examples.grpc.pubsub.generated.PublishRequest)
      org.examples.grpc.pubsub.generated.PublishRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.examples.grpc.pubsub.generated.PubsubProxyProto.internal_static_org_examples_grpc_pubsub_generated_PublishRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.examples.grpc.pubsub.generated.PubsubProxyProto.internal_static_org_examples_grpc_pubsub_generated_PublishRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.examples.grpc.pubsub.generated.PublishRequest.class, org.examples.grpc.pubsub.generated.PublishRequest.Builder.class);
    }

    // Construct using org.examples.grpc.pubsub.generated.PublishRequest.newBuilder()
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
      topic_ = "";

      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        message_ = null;
        messageBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.examples.grpc.pubsub.generated.PubsubProxyProto.internal_static_org_examples_grpc_pubsub_generated_PublishRequest_descriptor;
    }

    public org.examples.grpc.pubsub.generated.PublishRequest getDefaultInstanceForType() {
      return org.examples.grpc.pubsub.generated.PublishRequest.getDefaultInstance();
    }

    public org.examples.grpc.pubsub.generated.PublishRequest build() {
      org.examples.grpc.pubsub.generated.PublishRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.examples.grpc.pubsub.generated.PublishRequest buildPartial() {
      org.examples.grpc.pubsub.generated.PublishRequest result = new org.examples.grpc.pubsub.generated.PublishRequest(this);
      result.topic_ = topic_;
      if (messageBuilder_ == null) {
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.examples.grpc.pubsub.generated.PublishRequest) {
        return mergeFrom((org.examples.grpc.pubsub.generated.PublishRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.examples.grpc.pubsub.generated.PublishRequest other) {
      if (other == org.examples.grpc.pubsub.generated.PublishRequest.getDefaultInstance()) return this;
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
      }
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      org.examples.grpc.pubsub.generated.PublishRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.examples.grpc.pubsub.generated.PublishRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object topic_ = "";
    /**
     * <pre>
     * The message in the request will be published on this topic.
     * </pre>
     *
     * <code>string topic = 1;</code>
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The message in the request will be published on this topic.
     * </pre>
     *
     * <code>string topic = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The message in the request will be published on this topic.
     * </pre>
     *
     * <code>string topic = 1;</code>
     */
    public Builder setTopic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topic_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message in the request will be published on this topic.
     * </pre>
     *
     * <code>string topic = 1;</code>
     */
    public Builder clearTopic() {
      
      topic_ = getDefaultInstance().getTopic();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message in the request will be published on this topic.
     * </pre>
     *
     * <code>string topic = 1;</code>
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topic_ = value;
      onChanged();
      return this;
    }

    private org.examples.grpc.pubsub.generated.PubsubMessage message_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.examples.grpc.pubsub.generated.PubsubMessage, org.examples.grpc.pubsub.generated.PubsubMessage.Builder, org.examples.grpc.pubsub.generated.PubsubMessageOrBuilder> messageBuilder_;
    /**
     * <pre>
     * Message to publish.
     * </pre>
     *
     * <code>.org.examples.grpc.pubsub.generated.PubsubMessage message = 2;</code>
     */
    public boolean hasMessage() {
      return messageBuilder_ != null || message_ != null;
    }
    /**
     * <pre>
     * Message to publish.
     * </pre>
     *
     * <code>.org.examples.grpc.pubsub.generated.PubsubMessage message = 2;</code>
     */
    public org.examples.grpc.pubsub.generated.PubsubMessage getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? org.examples.grpc.pubsub.generated.PubsubMessage.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Message to publish.
     * </pre>
     *
     * <code>.org.examples.grpc.pubsub.generated.PubsubMessage message = 2;</code>
     */
    public Builder setMessage(org.examples.grpc.pubsub.generated.PubsubMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Message to publish.
     * </pre>
     *
     * <code>.org.examples.grpc.pubsub.generated.PubsubMessage message = 2;</code>
     */
    public Builder setMessage(
        org.examples.grpc.pubsub.generated.PubsubMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Message to publish.
     * </pre>
     *
     * <code>.org.examples.grpc.pubsub.generated.PubsubMessage message = 2;</code>
     */
    public Builder mergeMessage(org.examples.grpc.pubsub.generated.PubsubMessage value) {
      if (messageBuilder_ == null) {
        if (message_ != null) {
          message_ =
            org.examples.grpc.pubsub.generated.PubsubMessage.newBuilder(message_).mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Message to publish.
     * </pre>
     *
     * <code>.org.examples.grpc.pubsub.generated.PubsubMessage message = 2;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        message_ = null;
        messageBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Message to publish.
     * </pre>
     *
     * <code>.org.examples.grpc.pubsub.generated.PubsubMessage message = 2;</code>
     */
    public org.examples.grpc.pubsub.generated.PubsubMessage.Builder getMessageBuilder() {
      
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Message to publish.
     * </pre>
     *
     * <code>.org.examples.grpc.pubsub.generated.PubsubMessage message = 2;</code>
     */
    public org.examples.grpc.pubsub.generated.PubsubMessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            org.examples.grpc.pubsub.generated.PubsubMessage.getDefaultInstance() : message_;
      }
    }
    /**
     * <pre>
     * Message to publish.
     * </pre>
     *
     * <code>.org.examples.grpc.pubsub.generated.PubsubMessage message = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.examples.grpc.pubsub.generated.PubsubMessage, org.examples.grpc.pubsub.generated.PubsubMessage.Builder, org.examples.grpc.pubsub.generated.PubsubMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.examples.grpc.pubsub.generated.PubsubMessage, org.examples.grpc.pubsub.generated.PubsubMessage.Builder, org.examples.grpc.pubsub.generated.PubsubMessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.examples.grpc.pubsub.generated.PublishRequest)
  }

  // @@protoc_insertion_point(class_scope:org.examples.grpc.pubsub.generated.PublishRequest)
  private static final org.examples.grpc.pubsub.generated.PublishRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.examples.grpc.pubsub.generated.PublishRequest();
  }

  public static org.examples.grpc.pubsub.generated.PublishRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishRequest>
      PARSER = new com.google.protobuf.AbstractParser<PublishRequest>() {
    public PublishRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PublishRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PublishRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublishRequest> getParserForType() {
    return PARSER;
  }

  public org.examples.grpc.pubsub.generated.PublishRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

