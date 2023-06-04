// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderDisplayNotify.proto

package emu.grasscutter.net.proto;

public final class OrderDisplayNotifyOuterClass {
  private OrderDisplayNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OrderDisplayNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OrderDisplayNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 order_id = 5;</code>
     * @return The orderId.
     */
    int getOrderId();
  }
  /**
   * <pre>
   * CmdId: 4139
   * Obf: BCMJAOPNAGF
   * </pre>
   *
   * Protobuf type {@code OrderDisplayNotify}
   */
  public static final class OrderDisplayNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OrderDisplayNotify)
      OrderDisplayNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OrderDisplayNotify.newBuilder() to construct.
    private OrderDisplayNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OrderDisplayNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OrderDisplayNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OrderDisplayNotify(
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
            case 40: {

              orderId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.internal_static_OrderDisplayNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.internal_static_OrderDisplayNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify.class, emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify.Builder.class);
    }

    public static final int ORDER_ID_FIELD_NUMBER = 5;
    private int orderId_;
    /**
     * <code>uint32 order_id = 5;</code>
     * @return The orderId.
     */
    @java.lang.Override
    public int getOrderId() {
      return orderId_;
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
      if (orderId_ != 0) {
        output.writeUInt32(5, orderId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (orderId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, orderId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify other = (emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify) obj;

      if (getOrderId()
          != other.getOrderId()) return false;
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
      hash = (37 * hash) + ORDER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOrderId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify prototype) {
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
     * CmdId: 4139
     * Obf: BCMJAOPNAGF
     * </pre>
     *
     * Protobuf type {@code OrderDisplayNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OrderDisplayNotify)
        emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.internal_static_OrderDisplayNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.internal_static_OrderDisplayNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify.class, emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify.newBuilder()
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
        orderId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.internal_static_OrderDisplayNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify build() {
        emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify buildPartial() {
        emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify result = new emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify(this);
        result.orderId_ = orderId_;
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
        if (other instanceof emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify) {
          return mergeFrom((emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify other) {
        if (other == emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify.getDefaultInstance()) return this;
        if (other.getOrderId() != 0) {
          setOrderId(other.getOrderId());
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
        emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int orderId_ ;
      /**
       * <code>uint32 order_id = 5;</code>
       * @return The orderId.
       */
      @java.lang.Override
      public int getOrderId() {
        return orderId_;
      }
      /**
       * <code>uint32 order_id = 5;</code>
       * @param value The orderId to set.
       * @return This builder for chaining.
       */
      public Builder setOrderId(int value) {
        
        orderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 order_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearOrderId() {
        
        orderId_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:OrderDisplayNotify)
    }

    // @@protoc_insertion_point(class_scope:OrderDisplayNotify)
    private static final emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify();
    }

    public static emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OrderDisplayNotify>
        PARSER = new com.google.protobuf.AbstractParser<OrderDisplayNotify>() {
      @java.lang.Override
      public OrderDisplayNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OrderDisplayNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OrderDisplayNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OrderDisplayNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OrderDisplayNotifyOuterClass.OrderDisplayNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OrderDisplayNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OrderDisplayNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030OrderDisplayNotify.proto\"&\n\022OrderDispl" +
      "ayNotify\022\020\n\010order_id\030\005 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OrderDisplayNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OrderDisplayNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OrderDisplayNotify_descriptor,
        new java.lang.String[] { "OrderId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
