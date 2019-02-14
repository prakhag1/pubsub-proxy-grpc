// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy.proto

package org.examples.grpc.pubsub.generated;

public interface PubsubMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.examples.grpc.pubsub.generated.PubsubMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The message data field. If this field is empty, the message must contain
   * at least one attribute.
   * </pre>
   *
   * <code>string data = 1;</code>
   */
  java.lang.String getData();
  /**
   * <pre>
   * The message data field. If this field is empty, the message must contain
   * at least one attribute.
   * </pre>
   *
   * <code>string data = 1;</code>
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <pre>
   * Optional attributes for this message.
   * </pre>
   *
   * <code>string attributes = 2;</code>
   */
  java.lang.String getAttributes();
  /**
   * <pre>
   * Optional attributes for this message.
   * </pre>
   *
   * <code>string attributes = 2;</code>
   */
  com.google.protobuf.ByteString
      getAttributesBytes();

  /**
   * <pre>
   * ID of this message, assigned by the server when the message is published.
   * Guaranteed to be unique within the topic. This value may be read by a
   * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
   * delivery. It must not be populated by the publisher in a `Publish` call.
   * </pre>
   *
   * <code>string message_id = 3;</code>
   */
  java.lang.String getMessageId();
  /**
   * <pre>
   * ID of this message, assigned by the server when the message is published.
   * Guaranteed to be unique within the topic. This value may be read by a
   * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
   * delivery. It must not be populated by the publisher in a `Publish` call.
   * </pre>
   *
   * <code>string message_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();

  /**
   * <pre>
   * The time at which the message was published, populated by the server when
   * it receives the `Publish` call. It must not be populated by the
   * publisher in a `Publish` call.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 4;</code>
   */
  boolean hasPublishTime();
  /**
   * <pre>
   * The time at which the message was published, populated by the server when
   * it receives the `Publish` call. It must not be populated by the
   * publisher in a `Publish` call.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 4;</code>
   */
  com.google.protobuf.Timestamp getPublishTime();
  /**
   * <pre>
   * The time at which the message was published, populated by the server when
   * it receives the `Publish` call. It must not be populated by the
   * publisher in a `Publish` call.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getPublishTimeOrBuilder();
}
