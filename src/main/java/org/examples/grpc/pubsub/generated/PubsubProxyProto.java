// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proxy.proto

package org.examples.grpc.pubsub.generated;

public final class PubsubProxyProto {
  private PubsubProxyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_examples_grpc_pubsub_generated_TokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_examples_grpc_pubsub_generated_TokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_examples_grpc_pubsub_generated_TokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_examples_grpc_pubsub_generated_TokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_examples_grpc_pubsub_generated_PublishRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_examples_grpc_pubsub_generated_PublishRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_examples_grpc_pubsub_generated_PubsubMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_examples_grpc_pubsub_generated_PubsubMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_examples_grpc_pubsub_generated_PublishResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_examples_grpc_pubsub_generated_PublishResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_examples_grpc_pubsub_generated_Void_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_examples_grpc_pubsub_generated_Void_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013proxy.proto\022\"org.examples.grpc.pubsub." +
      "generated\032\037google/protobuf/timestamp.pro" +
      "to\"\016\n\014TokenRequest\"\036\n\rTokenResponse\022\r\n\005t" +
      "oken\030\001 \001(\t\"c\n\016PublishRequest\022\r\n\005topic\030\001 " +
      "\001(\t\022B\n\007message\030\002 \001(\01321.org.examples.grpc" +
      ".pubsub.generated.PubsubMessage\"w\n\rPubsu" +
      "bMessage\022\014\n\004data\030\001 \001(\t\022\022\n\nattributes\030\002 \001" +
      "(\t\022\022\n\nmessage_id\030\003 \001(\t\0220\n\014publish_time\030\004" +
      " \001(\0132\032.google.protobuf.Timestamp\"%\n\017Publ" +
      "ishResponse\022\022\n\nmessage_id\030\001 \001(\t\"\006\n\004Void2",
      "\346\002\n\022PubsubProxyService\022a\n\tGetHealth\022(.or" +
      "g.examples.grpc.pubsub.generated.Void\032(." +
      "org.examples.grpc.pubsub.generated.Void\"" +
      "\000\022w\n\016GetAccessToken\0220.org.examples.grpc." +
      "pubsub.generated.TokenRequest\0321.org.exam" +
      "ples.grpc.pubsub.generated.TokenResponse" +
      "\"\000\022t\n\007Publish\0222.org.examples.grpc.pubsub" +
      ".generated.PublishRequest\0323.org.examples" +
      ".grpc.pubsub.generated.PublishResponse\"\000" +
      "B=\n\"org.examples.grpc.pubsub.generatedB\020",
      "PubsubProxyProtoP\001\242\002\002HWb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_org_examples_grpc_pubsub_generated_TokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_examples_grpc_pubsub_generated_TokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_examples_grpc_pubsub_generated_TokenRequest_descriptor,
        new java.lang.String[] { });
    internal_static_org_examples_grpc_pubsub_generated_TokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_examples_grpc_pubsub_generated_TokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_examples_grpc_pubsub_generated_TokenResponse_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_org_examples_grpc_pubsub_generated_PublishRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_examples_grpc_pubsub_generated_PublishRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_examples_grpc_pubsub_generated_PublishRequest_descriptor,
        new java.lang.String[] { "Topic", "Message", });
    internal_static_org_examples_grpc_pubsub_generated_PubsubMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_examples_grpc_pubsub_generated_PubsubMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_examples_grpc_pubsub_generated_PubsubMessage_descriptor,
        new java.lang.String[] { "Data", "Attributes", "MessageId", "PublishTime", });
    internal_static_org_examples_grpc_pubsub_generated_PublishResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_examples_grpc_pubsub_generated_PublishResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_examples_grpc_pubsub_generated_PublishResponse_descriptor,
        new java.lang.String[] { "MessageId", });
    internal_static_org_examples_grpc_pubsub_generated_Void_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_org_examples_grpc_pubsub_generated_Void_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_examples_grpc_pubsub_generated_Void_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
