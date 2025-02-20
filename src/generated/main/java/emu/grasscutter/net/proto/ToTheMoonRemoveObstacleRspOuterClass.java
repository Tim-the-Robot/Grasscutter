// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ToTheMoonRemoveObstacleRsp.proto

package emu.grasscutter.net.proto;

public final class ToTheMoonRemoveObstacleRspOuterClass {
  private ToTheMoonRemoveObstacleRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ToTheMoonRemoveObstacleRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ToTheMoonRemoveObstacleRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>int32 query_id = 3;</code>
     * @return The queryId.
     */
    int getQueryId();

    /**
     * <code>.DynamicNodes dynamic_nodes = 7;</code>
     * @return Whether the dynamicNodes field is set.
     */
    boolean hasDynamicNodes();
    /**
     * <code>.DynamicNodes dynamic_nodes = 7;</code>
     * @return The dynamicNodes.
     */
    emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes getDynamicNodes();
    /**
     * <code>.DynamicNodes dynamic_nodes = 7;</code>
     */
    emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder getDynamicNodesOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 6187
   * Obf: BNCPFLGDEGF
   * </pre>
   *
   * Protobuf type {@code ToTheMoonRemoveObstacleRsp}
   */
  public static final class ToTheMoonRemoveObstacleRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ToTheMoonRemoveObstacleRsp)
      ToTheMoonRemoveObstacleRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ToTheMoonRemoveObstacleRsp.newBuilder() to construct.
    private ToTheMoonRemoveObstacleRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ToTheMoonRemoveObstacleRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ToTheMoonRemoveObstacleRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ToTheMoonRemoveObstacleRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 24: {

              queryId_ = input.readInt32();
              break;
            }
            case 58: {
              emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder subBuilder = null;
              if (dynamicNodes_ != null) {
                subBuilder = dynamicNodes_.toBuilder();
              }
              dynamicNodes_ = input.readMessage(emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(dynamicNodes_);
                dynamicNodes_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {

              retcode_ = input.readInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.internal_static_ToTheMoonRemoveObstacleRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.internal_static_ToTheMoonRemoveObstacleRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp.class, emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int QUERY_ID_FIELD_NUMBER = 3;
    private int queryId_;
    /**
     * <code>int32 query_id = 3;</code>
     * @return The queryId.
     */
    @java.lang.Override
    public int getQueryId() {
      return queryId_;
    }

    public static final int DYNAMIC_NODES_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes dynamicNodes_;
    /**
     * <code>.DynamicNodes dynamic_nodes = 7;</code>
     * @return Whether the dynamicNodes field is set.
     */
    @java.lang.Override
    public boolean hasDynamicNodes() {
      return dynamicNodes_ != null;
    }
    /**
     * <code>.DynamicNodes dynamic_nodes = 7;</code>
     * @return The dynamicNodes.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes getDynamicNodes() {
      return dynamicNodes_ == null ? emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.getDefaultInstance() : dynamicNodes_;
    }
    /**
     * <code>.DynamicNodes dynamic_nodes = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder getDynamicNodesOrBuilder() {
      return getDynamicNodes();
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
      if (queryId_ != 0) {
        output.writeInt32(3, queryId_);
      }
      if (dynamicNodes_ != null) {
        output.writeMessage(7, getDynamicNodes());
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (queryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, queryId_);
      }
      if (dynamicNodes_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getDynamicNodes());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp other = (emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getQueryId()
          != other.getQueryId()) return false;
      if (hasDynamicNodes() != other.hasDynamicNodes()) return false;
      if (hasDynamicNodes()) {
        if (!getDynamicNodes()
            .equals(other.getDynamicNodes())) return false;
      }
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + QUERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQueryId();
      if (hasDynamicNodes()) {
        hash = (37 * hash) + DYNAMIC_NODES_FIELD_NUMBER;
        hash = (53 * hash) + getDynamicNodes().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp prototype) {
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
     * <pre>
     * CmdId: 6187
     * Obf: BNCPFLGDEGF
     * </pre>
     *
     * Protobuf type {@code ToTheMoonRemoveObstacleRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ToTheMoonRemoveObstacleRsp)
        emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.internal_static_ToTheMoonRemoveObstacleRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.internal_static_ToTheMoonRemoveObstacleRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp.class, emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        queryId_ = 0;

        if (dynamicNodesBuilder_ == null) {
          dynamicNodes_ = null;
        } else {
          dynamicNodes_ = null;
          dynamicNodesBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.internal_static_ToTheMoonRemoveObstacleRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp build() {
        emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp buildPartial() {
        emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp result = new emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp(this);
        result.retcode_ = retcode_;
        result.queryId_ = queryId_;
        if (dynamicNodesBuilder_ == null) {
          result.dynamicNodes_ = dynamicNodes_;
        } else {
          result.dynamicNodes_ = dynamicNodesBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp other) {
        if (other == emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getQueryId() != 0) {
          setQueryId(other.getQueryId());
        }
        if (other.hasDynamicNodes()) {
          mergeDynamicNodes(other.getDynamicNodes());
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
        emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int queryId_ ;
      /**
       * <code>int32 query_id = 3;</code>
       * @return The queryId.
       */
      @java.lang.Override
      public int getQueryId() {
        return queryId_;
      }
      /**
       * <code>int32 query_id = 3;</code>
       * @param value The queryId to set.
       * @return This builder for chaining.
       */
      public Builder setQueryId(int value) {
        
        queryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 query_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueryId() {
        
        queryId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes dynamicNodes_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder> dynamicNodesBuilder_;
      /**
       * <code>.DynamicNodes dynamic_nodes = 7;</code>
       * @return Whether the dynamicNodes field is set.
       */
      public boolean hasDynamicNodes() {
        return dynamicNodesBuilder_ != null || dynamicNodes_ != null;
      }
      /**
       * <code>.DynamicNodes dynamic_nodes = 7;</code>
       * @return The dynamicNodes.
       */
      public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes getDynamicNodes() {
        if (dynamicNodesBuilder_ == null) {
          return dynamicNodes_ == null ? emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.getDefaultInstance() : dynamicNodes_;
        } else {
          return dynamicNodesBuilder_.getMessage();
        }
      }
      /**
       * <code>.DynamicNodes dynamic_nodes = 7;</code>
       */
      public Builder setDynamicNodes(emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes value) {
        if (dynamicNodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dynamicNodes_ = value;
          onChanged();
        } else {
          dynamicNodesBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.DynamicNodes dynamic_nodes = 7;</code>
       */
      public Builder setDynamicNodes(
          emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder builderForValue) {
        if (dynamicNodesBuilder_ == null) {
          dynamicNodes_ = builderForValue.build();
          onChanged();
        } else {
          dynamicNodesBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.DynamicNodes dynamic_nodes = 7;</code>
       */
      public Builder mergeDynamicNodes(emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes value) {
        if (dynamicNodesBuilder_ == null) {
          if (dynamicNodes_ != null) {
            dynamicNodes_ =
              emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.newBuilder(dynamicNodes_).mergeFrom(value).buildPartial();
          } else {
            dynamicNodes_ = value;
          }
          onChanged();
        } else {
          dynamicNodesBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.DynamicNodes dynamic_nodes = 7;</code>
       */
      public Builder clearDynamicNodes() {
        if (dynamicNodesBuilder_ == null) {
          dynamicNodes_ = null;
          onChanged();
        } else {
          dynamicNodes_ = null;
          dynamicNodesBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.DynamicNodes dynamic_nodes = 7;</code>
       */
      public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder getDynamicNodesBuilder() {
        
        onChanged();
        return getDynamicNodesFieldBuilder().getBuilder();
      }
      /**
       * <code>.DynamicNodes dynamic_nodes = 7;</code>
       */
      public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder getDynamicNodesOrBuilder() {
        if (dynamicNodesBuilder_ != null) {
          return dynamicNodesBuilder_.getMessageOrBuilder();
        } else {
          return dynamicNodes_ == null ?
              emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.getDefaultInstance() : dynamicNodes_;
        }
      }
      /**
       * <code>.DynamicNodes dynamic_nodes = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder> 
          getDynamicNodesFieldBuilder() {
        if (dynamicNodesBuilder_ == null) {
          dynamicNodesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder>(
                  getDynamicNodes(),
                  getParentForChildren(),
                  isClean());
          dynamicNodes_ = null;
        }
        return dynamicNodesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ToTheMoonRemoveObstacleRsp)
    }

    // @@protoc_insertion_point(class_scope:ToTheMoonRemoveObstacleRsp)
    private static final emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp();
    }

    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ToTheMoonRemoveObstacleRsp>
        PARSER = new com.google.protobuf.AbstractParser<ToTheMoonRemoveObstacleRsp>() {
      @java.lang.Override
      public ToTheMoonRemoveObstacleRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ToTheMoonRemoveObstacleRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ToTheMoonRemoveObstacleRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ToTheMoonRemoveObstacleRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ToTheMoonRemoveObstacleRspOuterClass.ToTheMoonRemoveObstacleRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ToTheMoonRemoveObstacleRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ToTheMoonRemoveObstacleRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ToTheMoonRemoveObstacleRsp.proto\032\022Dyna" +
      "micNodes.proto\"e\n\032ToTheMoonRemoveObstacl" +
      "eRsp\022\017\n\007retcode\030\n \001(\005\022\020\n\010query_id\030\003 \001(\005\022" +
      "$\n\rdynamic_nodes\030\007 \001(\0132\r.DynamicNodesB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.DynamicNodesOuterClass.getDescriptor(),
        });
    internal_static_ToTheMoonRemoveObstacleRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ToTheMoonRemoveObstacleRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ToTheMoonRemoveObstacleRsp_descriptor,
        new java.lang.String[] { "Retcode", "QueryId", "DynamicNodes", });
    emu.grasscutter.net.proto.DynamicNodesOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
