// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGSkillPreviewReactionInfo.proto

package emu.grasscutter.net.proto;

public final class GCGSkillPreviewReactionInfoOuterClass {
  private GCGSkillPreviewReactionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGSkillPreviewReactionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGSkillPreviewReactionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 IKBOBKNGGIH = 14;</code>
     * @return The iKBOBKNGGIH.
     */
    int getIKBOBKNGGIH();

    /**
     * <code>uint32 AGNBFAGMNIO = 4;</code>
     * @return The aGNBFAGMNIO.
     */
    int getAGNBFAGMNIO();
  }
  /**
   * <pre>
   * Obf: JNKPNKFNAFB
   * </pre>
   *
   * Protobuf type {@code GCGSkillPreviewReactionInfo}
   */
  public static final class GCGSkillPreviewReactionInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGSkillPreviewReactionInfo)
      GCGSkillPreviewReactionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGSkillPreviewReactionInfo.newBuilder() to construct.
    private GCGSkillPreviewReactionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGSkillPreviewReactionInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGSkillPreviewReactionInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGSkillPreviewReactionInfo(
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
            case 32: {

              aGNBFAGMNIO_ = input.readUInt32();
              break;
            }
            case 112: {

              iKBOBKNGGIH_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.internal_static_GCGSkillPreviewReactionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.internal_static_GCGSkillPreviewReactionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo.class, emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo.Builder.class);
    }

    public static final int IKBOBKNGGIH_FIELD_NUMBER = 14;
    private int iKBOBKNGGIH_;
    /**
     * <code>uint32 IKBOBKNGGIH = 14;</code>
     * @return The iKBOBKNGGIH.
     */
    @java.lang.Override
    public int getIKBOBKNGGIH() {
      return iKBOBKNGGIH_;
    }

    public static final int AGNBFAGMNIO_FIELD_NUMBER = 4;
    private int aGNBFAGMNIO_;
    /**
     * <code>uint32 AGNBFAGMNIO = 4;</code>
     * @return The aGNBFAGMNIO.
     */
    @java.lang.Override
    public int getAGNBFAGMNIO() {
      return aGNBFAGMNIO_;
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
      if (aGNBFAGMNIO_ != 0) {
        output.writeUInt32(4, aGNBFAGMNIO_);
      }
      if (iKBOBKNGGIH_ != 0) {
        output.writeUInt32(14, iKBOBKNGGIH_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (aGNBFAGMNIO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, aGNBFAGMNIO_);
      }
      if (iKBOBKNGGIH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, iKBOBKNGGIH_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo other = (emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo) obj;

      if (getIKBOBKNGGIH()
          != other.getIKBOBKNGGIH()) return false;
      if (getAGNBFAGMNIO()
          != other.getAGNBFAGMNIO()) return false;
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
      hash = (37 * hash) + IKBOBKNGGIH_FIELD_NUMBER;
      hash = (53 * hash) + getIKBOBKNGGIH();
      hash = (37 * hash) + AGNBFAGMNIO_FIELD_NUMBER;
      hash = (53 * hash) + getAGNBFAGMNIO();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo prototype) {
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
     * Obf: JNKPNKFNAFB
     * </pre>
     *
     * Protobuf type {@code GCGSkillPreviewReactionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGSkillPreviewReactionInfo)
        emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.internal_static_GCGSkillPreviewReactionInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.internal_static_GCGSkillPreviewReactionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo.class, emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo.newBuilder()
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
        iKBOBKNGGIH_ = 0;

        aGNBFAGMNIO_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.internal_static_GCGSkillPreviewReactionInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo build() {
        emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo buildPartial() {
        emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo result = new emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo(this);
        result.iKBOBKNGGIH_ = iKBOBKNGGIH_;
        result.aGNBFAGMNIO_ = aGNBFAGMNIO_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo) {
          return mergeFrom((emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo other) {
        if (other == emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo.getDefaultInstance()) return this;
        if (other.getIKBOBKNGGIH() != 0) {
          setIKBOBKNGGIH(other.getIKBOBKNGGIH());
        }
        if (other.getAGNBFAGMNIO() != 0) {
          setAGNBFAGMNIO(other.getAGNBFAGMNIO());
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
        emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int iKBOBKNGGIH_ ;
      /**
       * <code>uint32 IKBOBKNGGIH = 14;</code>
       * @return The iKBOBKNGGIH.
       */
      @java.lang.Override
      public int getIKBOBKNGGIH() {
        return iKBOBKNGGIH_;
      }
      /**
       * <code>uint32 IKBOBKNGGIH = 14;</code>
       * @param value The iKBOBKNGGIH to set.
       * @return This builder for chaining.
       */
      public Builder setIKBOBKNGGIH(int value) {
        
        iKBOBKNGGIH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IKBOBKNGGIH = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIKBOBKNGGIH() {
        
        iKBOBKNGGIH_ = 0;
        onChanged();
        return this;
      }

      private int aGNBFAGMNIO_ ;
      /**
       * <code>uint32 AGNBFAGMNIO = 4;</code>
       * @return The aGNBFAGMNIO.
       */
      @java.lang.Override
      public int getAGNBFAGMNIO() {
        return aGNBFAGMNIO_;
      }
      /**
       * <code>uint32 AGNBFAGMNIO = 4;</code>
       * @param value The aGNBFAGMNIO to set.
       * @return This builder for chaining.
       */
      public Builder setAGNBFAGMNIO(int value) {
        
        aGNBFAGMNIO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 AGNBFAGMNIO = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAGNBFAGMNIO() {
        
        aGNBFAGMNIO_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGSkillPreviewReactionInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGSkillPreviewReactionInfo)
    private static final emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo();
    }

    public static emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGSkillPreviewReactionInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGSkillPreviewReactionInfo>() {
      @java.lang.Override
      public GCGSkillPreviewReactionInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGSkillPreviewReactionInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGSkillPreviewReactionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGSkillPreviewReactionInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGSkillPreviewReactionInfoOuterClass.GCGSkillPreviewReactionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGSkillPreviewReactionInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGSkillPreviewReactionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!GCGSkillPreviewReactionInfo.proto\"G\n\033G" +
      "CGSkillPreviewReactionInfo\022\023\n\013IKBOBKNGGI" +
      "H\030\016 \001(\r\022\023\n\013AGNBFAGMNIO\030\004 \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGSkillPreviewReactionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGSkillPreviewReactionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGSkillPreviewReactionInfo_descriptor,
        new java.lang.String[] { "IKBOBKNGGIH", "AGNBFAGMNIO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
