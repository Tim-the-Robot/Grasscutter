// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AsterLargeInfoNotify.proto

package emu.grasscutter.net.proto;

public final class AsterLargeInfoNotifyOuterClass {
  private AsterLargeInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AsterLargeInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AsterLargeInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AsterLargeDetailInfo info = 10;</code>
     * @return Whether the info field is set.
     */
    boolean hasInfo();
    /**
     * <code>.AsterLargeDetailInfo info = 10;</code>
     * @return The info.
     */
    emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo getInfo();
    /**
     * <code>.AsterLargeDetailInfo info = 10;</code>
     */
    emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfoOrBuilder getInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 2011
   * Obf: IJINGOEHBHI
   * </pre>
   *
   * Protobuf type {@code AsterLargeInfoNotify}
   */
  public static final class AsterLargeInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AsterLargeInfoNotify)
      AsterLargeInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AsterLargeInfoNotify.newBuilder() to construct.
    private AsterLargeInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AsterLargeInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AsterLargeInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AsterLargeInfoNotify(
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
            case 82: {
              emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo.Builder subBuilder = null;
              if (info_ != null) {
                subBuilder = info_.toBuilder();
              }
              info_ = input.readMessage(emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(info_);
                info_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.internal_static_AsterLargeInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.internal_static_AsterLargeInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify.class, emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify.Builder.class);
    }

    public static final int INFO_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo info_;
    /**
     * <code>.AsterLargeDetailInfo info = 10;</code>
     * @return Whether the info field is set.
     */
    @java.lang.Override
    public boolean hasInfo() {
      return info_ != null;
    }
    /**
     * <code>.AsterLargeDetailInfo info = 10;</code>
     * @return The info.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo getInfo() {
      return info_ == null ? emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo.getDefaultInstance() : info_;
    }
    /**
     * <code>.AsterLargeDetailInfo info = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfoOrBuilder getInfoOrBuilder() {
      return getInfo();
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
      if (info_ != null) {
        output.writeMessage(10, getInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (info_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify other = (emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify) obj;

      if (hasInfo() != other.hasInfo()) return false;
      if (hasInfo()) {
        if (!getInfo()
            .equals(other.getInfo())) return false;
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
      if (hasInfo()) {
        hash = (37 * hash) + INFO_FIELD_NUMBER;
        hash = (53 * hash) + getInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify prototype) {
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
     * CmdId: 2011
     * Obf: IJINGOEHBHI
     * </pre>
     *
     * Protobuf type {@code AsterLargeInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AsterLargeInfoNotify)
        emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.internal_static_AsterLargeInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.internal_static_AsterLargeInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify.class, emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify.newBuilder()
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
        if (infoBuilder_ == null) {
          info_ = null;
        } else {
          info_ = null;
          infoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.internal_static_AsterLargeInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify build() {
        emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify buildPartial() {
        emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify result = new emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify(this);
        if (infoBuilder_ == null) {
          result.info_ = info_;
        } else {
          result.info_ = infoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify other) {
        if (other == emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify.getDefaultInstance()) return this;
        if (other.hasInfo()) {
          mergeInfo(other.getInfo());
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
        emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo info_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo, emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo.Builder, emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfoOrBuilder> infoBuilder_;
      /**
       * <code>.AsterLargeDetailInfo info = 10;</code>
       * @return Whether the info field is set.
       */
      public boolean hasInfo() {
        return infoBuilder_ != null || info_ != null;
      }
      /**
       * <code>.AsterLargeDetailInfo info = 10;</code>
       * @return The info.
       */
      public emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo getInfo() {
        if (infoBuilder_ == null) {
          return info_ == null ? emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo.getDefaultInstance() : info_;
        } else {
          return infoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AsterLargeDetailInfo info = 10;</code>
       */
      public Builder setInfo(emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo value) {
        if (infoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          info_ = value;
          onChanged();
        } else {
          infoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AsterLargeDetailInfo info = 10;</code>
       */
      public Builder setInfo(
          emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo.Builder builderForValue) {
        if (infoBuilder_ == null) {
          info_ = builderForValue.build();
          onChanged();
        } else {
          infoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AsterLargeDetailInfo info = 10;</code>
       */
      public Builder mergeInfo(emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo value) {
        if (infoBuilder_ == null) {
          if (info_ != null) {
            info_ =
              emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo.newBuilder(info_).mergeFrom(value).buildPartial();
          } else {
            info_ = value;
          }
          onChanged();
        } else {
          infoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AsterLargeDetailInfo info = 10;</code>
       */
      public Builder clearInfo() {
        if (infoBuilder_ == null) {
          info_ = null;
          onChanged();
        } else {
          info_ = null;
          infoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AsterLargeDetailInfo info = 10;</code>
       */
      public emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo.Builder getInfoBuilder() {
        
        onChanged();
        return getInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AsterLargeDetailInfo info = 10;</code>
       */
      public emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfoOrBuilder getInfoOrBuilder() {
        if (infoBuilder_ != null) {
          return infoBuilder_.getMessageOrBuilder();
        } else {
          return info_ == null ?
              emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo.getDefaultInstance() : info_;
        }
      }
      /**
       * <code>.AsterLargeDetailInfo info = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo, emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo.Builder, emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfoOrBuilder> 
          getInfoFieldBuilder() {
        if (infoBuilder_ == null) {
          infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo, emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfo.Builder, emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.AsterLargeDetailInfoOrBuilder>(
                  getInfo(),
                  getParentForChildren(),
                  isClean());
          info_ = null;
        }
        return infoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AsterLargeInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:AsterLargeInfoNotify)
    private static final emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify();
    }

    public static emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AsterLargeInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<AsterLargeInfoNotify>() {
      @java.lang.Override
      public AsterLargeInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AsterLargeInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AsterLargeInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AsterLargeInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AsterLargeInfoNotifyOuterClass.AsterLargeInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AsterLargeInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AsterLargeInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032AsterLargeInfoNotify.proto\032\032AsterLarge" +
      "DetailInfo.proto\";\n\024AsterLargeInfoNotify" +
      "\022#\n\004info\030\n \001(\0132\025.AsterLargeDetailInfoB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.getDescriptor(),
        });
    internal_static_AsterLargeInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AsterLargeInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AsterLargeInfoNotify_descriptor,
        new java.lang.String[] { "Info", });
    emu.grasscutter.net.proto.AsterLargeDetailInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
