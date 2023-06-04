// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientCollectorDataNotify.proto

package emu.grasscutter.net.proto;

public final class ClientCollectorDataNotifyOuterClass {
  private ClientCollectorDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientCollectorDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientCollectorDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData> 
        getClientCollectorDataListList();
    /**
     * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
     */
    emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData getClientCollectorDataList(int index);
    /**
     * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
     */
    int getClientCollectorDataListCount();
    /**
     * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> 
        getClientCollectorDataListOrBuilderList();
    /**
     * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
     */
    emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder getClientCollectorDataListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 4285
   * Obf: DPLPEHGIGIF
   * </pre>
   *
   * Protobuf type {@code ClientCollectorDataNotify}
   */
  public static final class ClientCollectorDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientCollectorDataNotify)
      ClientCollectorDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientCollectorDataNotify.newBuilder() to construct.
    private ClientCollectorDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientCollectorDataNotify() {
      clientCollectorDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientCollectorDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientCollectorDataNotify(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                clientCollectorDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData>();
                mutable_bitField0_ |= 0x00000001;
              }
              clientCollectorDataList_.add(
                  input.readMessage(emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          clientCollectorDataList_ = java.util.Collections.unmodifiableList(clientCollectorDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.internal_static_ClientCollectorDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.internal_static_ClientCollectorDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify.class, emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify.Builder.class);
    }

    public static final int CLIENT_COLLECTOR_DATA_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData> clientCollectorDataList_;
    /**
     * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData> getClientCollectorDataListList() {
      return clientCollectorDataList_;
    }
    /**
     * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> 
        getClientCollectorDataListOrBuilderList() {
      return clientCollectorDataList_;
    }
    /**
     * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
     */
    @java.lang.Override
    public int getClientCollectorDataListCount() {
      return clientCollectorDataList_.size();
    }
    /**
     * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData getClientCollectorDataList(int index) {
      return clientCollectorDataList_.get(index);
    }
    /**
     * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder getClientCollectorDataListOrBuilder(
        int index) {
      return clientCollectorDataList_.get(index);
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
      for (int i = 0; i < clientCollectorDataList_.size(); i++) {
        output.writeMessage(4, clientCollectorDataList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < clientCollectorDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, clientCollectorDataList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify other = (emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify) obj;

      if (!getClientCollectorDataListList()
          .equals(other.getClientCollectorDataListList())) return false;
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
      if (getClientCollectorDataListCount() > 0) {
        hash = (37 * hash) + CLIENT_COLLECTOR_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getClientCollectorDataListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify prototype) {
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
     * CmdId: 4285
     * Obf: DPLPEHGIGIF
     * </pre>
     *
     * Protobuf type {@code ClientCollectorDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientCollectorDataNotify)
        emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.internal_static_ClientCollectorDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.internal_static_ClientCollectorDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify.class, emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify.newBuilder()
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
          getClientCollectorDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (clientCollectorDataListBuilder_ == null) {
          clientCollectorDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          clientCollectorDataListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.internal_static_ClientCollectorDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify build() {
        emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify buildPartial() {
        emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify result = new emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (clientCollectorDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            clientCollectorDataList_ = java.util.Collections.unmodifiableList(clientCollectorDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.clientCollectorDataList_ = clientCollectorDataList_;
        } else {
          result.clientCollectorDataList_ = clientCollectorDataListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify other) {
        if (other == emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify.getDefaultInstance()) return this;
        if (clientCollectorDataListBuilder_ == null) {
          if (!other.clientCollectorDataList_.isEmpty()) {
            if (clientCollectorDataList_.isEmpty()) {
              clientCollectorDataList_ = other.clientCollectorDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureClientCollectorDataListIsMutable();
              clientCollectorDataList_.addAll(other.clientCollectorDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.clientCollectorDataList_.isEmpty()) {
            if (clientCollectorDataListBuilder_.isEmpty()) {
              clientCollectorDataListBuilder_.dispose();
              clientCollectorDataListBuilder_ = null;
              clientCollectorDataList_ = other.clientCollectorDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              clientCollectorDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getClientCollectorDataListFieldBuilder() : null;
            } else {
              clientCollectorDataListBuilder_.addAllMessages(other.clientCollectorDataList_);
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
        emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData> clientCollectorDataList_ =
        java.util.Collections.emptyList();
      private void ensureClientCollectorDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          clientCollectorDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData>(clientCollectorDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.Builder, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> clientCollectorDataListBuilder_;

      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData> getClientCollectorDataListList() {
        if (clientCollectorDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(clientCollectorDataList_);
        } else {
          return clientCollectorDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public int getClientCollectorDataListCount() {
        if (clientCollectorDataListBuilder_ == null) {
          return clientCollectorDataList_.size();
        } else {
          return clientCollectorDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData getClientCollectorDataList(int index) {
        if (clientCollectorDataListBuilder_ == null) {
          return clientCollectorDataList_.get(index);
        } else {
          return clientCollectorDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public Builder setClientCollectorDataList(
          int index, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData value) {
        if (clientCollectorDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClientCollectorDataListIsMutable();
          clientCollectorDataList_.set(index, value);
          onChanged();
        } else {
          clientCollectorDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public Builder setClientCollectorDataList(
          int index, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.Builder builderForValue) {
        if (clientCollectorDataListBuilder_ == null) {
          ensureClientCollectorDataListIsMutable();
          clientCollectorDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          clientCollectorDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public Builder addClientCollectorDataList(emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData value) {
        if (clientCollectorDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClientCollectorDataListIsMutable();
          clientCollectorDataList_.add(value);
          onChanged();
        } else {
          clientCollectorDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public Builder addClientCollectorDataList(
          int index, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData value) {
        if (clientCollectorDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClientCollectorDataListIsMutable();
          clientCollectorDataList_.add(index, value);
          onChanged();
        } else {
          clientCollectorDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public Builder addClientCollectorDataList(
          emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.Builder builderForValue) {
        if (clientCollectorDataListBuilder_ == null) {
          ensureClientCollectorDataListIsMutable();
          clientCollectorDataList_.add(builderForValue.build());
          onChanged();
        } else {
          clientCollectorDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public Builder addClientCollectorDataList(
          int index, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.Builder builderForValue) {
        if (clientCollectorDataListBuilder_ == null) {
          ensureClientCollectorDataListIsMutable();
          clientCollectorDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          clientCollectorDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public Builder addAllClientCollectorDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData> values) {
        if (clientCollectorDataListBuilder_ == null) {
          ensureClientCollectorDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, clientCollectorDataList_);
          onChanged();
        } else {
          clientCollectorDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public Builder clearClientCollectorDataList() {
        if (clientCollectorDataListBuilder_ == null) {
          clientCollectorDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          clientCollectorDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public Builder removeClientCollectorDataList(int index) {
        if (clientCollectorDataListBuilder_ == null) {
          ensureClientCollectorDataListIsMutable();
          clientCollectorDataList_.remove(index);
          onChanged();
        } else {
          clientCollectorDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.Builder getClientCollectorDataListBuilder(
          int index) {
        return getClientCollectorDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder getClientCollectorDataListOrBuilder(
          int index) {
        if (clientCollectorDataListBuilder_ == null) {
          return clientCollectorDataList_.get(index);  } else {
          return clientCollectorDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> 
           getClientCollectorDataListOrBuilderList() {
        if (clientCollectorDataListBuilder_ != null) {
          return clientCollectorDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(clientCollectorDataList_);
        }
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.Builder addClientCollectorDataListBuilder() {
        return getClientCollectorDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance());
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.Builder addClientCollectorDataListBuilder(
          int index) {
        return getClientCollectorDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.getDefaultInstance());
      }
      /**
       * <code>repeated .ClientCollectorData client_collector_data_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.Builder> 
           getClientCollectorDataListBuilderList() {
        return getClientCollectorDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.Builder, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder> 
          getClientCollectorDataListFieldBuilder() {
        if (clientCollectorDataListBuilder_ == null) {
          clientCollectorDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorData.Builder, emu.grasscutter.net.proto.ClientCollectorDataOuterClass.ClientCollectorDataOrBuilder>(
                  clientCollectorDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          clientCollectorDataList_ = null;
        }
        return clientCollectorDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ClientCollectorDataNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientCollectorDataNotify)
    private static final emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify();
    }

    public static emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientCollectorDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientCollectorDataNotify>() {
      @java.lang.Override
      public ClientCollectorDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientCollectorDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientCollectorDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientCollectorDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ClientCollectorDataNotifyOuterClass.ClientCollectorDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientCollectorDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientCollectorDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ClientCollectorDataNotify.proto\032\031Clien" +
      "tCollectorData.proto\"U\n\031ClientCollectorD" +
      "ataNotify\0228\n\032client_collector_data_list\030" +
      "\004 \003(\0132\024.ClientCollectorDataB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ClientCollectorDataOuterClass.getDescriptor(),
        });
    internal_static_ClientCollectorDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientCollectorDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientCollectorDataNotify_descriptor,
        new java.lang.String[] { "ClientCollectorDataList", });
    emu.grasscutter.net.proto.ClientCollectorDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
