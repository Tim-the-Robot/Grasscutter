// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LJKDBILCDCB.proto

package emu.grasscutter.net.proto;

public final class LJKDBILCDCBOuterClass {
  private LJKDBILCDCBOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LJKDBILCDCBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LJKDBILCDCB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool FNPMBGBICIP = 11;</code>
     * @return The fNPMBGBICIP.
     */
    boolean getFNPMBGBICIP();

    /**
     * <code>uint32 template_id = 9;</code>
     * @return The templateId.
     */
    int getTemplateId();

    /**
     * <code>uint32 OHADDJPJJHL = 4;</code>
     * @return The oHADDJPJJHL.
     */
    int getOHADDJPJJHL();
  }
  /**
   * Protobuf type {@code LJKDBILCDCB}
   */
  public static final class LJKDBILCDCB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LJKDBILCDCB)
      LJKDBILCDCBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LJKDBILCDCB.newBuilder() to construct.
    private LJKDBILCDCB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LJKDBILCDCB() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LJKDBILCDCB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LJKDBILCDCB(
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

              oHADDJPJJHL_ = input.readUInt32();
              break;
            }
            case 72: {

              templateId_ = input.readUInt32();
              break;
            }
            case 88: {

              fNPMBGBICIP_ = input.readBool();
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
      return emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.internal_static_LJKDBILCDCB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.internal_static_LJKDBILCDCB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB.class, emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB.Builder.class);
    }

    public static final int FNPMBGBICIP_FIELD_NUMBER = 11;
    private boolean fNPMBGBICIP_;
    /**
     * <code>bool FNPMBGBICIP = 11;</code>
     * @return The fNPMBGBICIP.
     */
    @java.lang.Override
    public boolean getFNPMBGBICIP() {
      return fNPMBGBICIP_;
    }

    public static final int TEMPLATE_ID_FIELD_NUMBER = 9;
    private int templateId_;
    /**
     * <code>uint32 template_id = 9;</code>
     * @return The templateId.
     */
    @java.lang.Override
    public int getTemplateId() {
      return templateId_;
    }

    public static final int OHADDJPJJHL_FIELD_NUMBER = 4;
    private int oHADDJPJJHL_;
    /**
     * <code>uint32 OHADDJPJJHL = 4;</code>
     * @return The oHADDJPJJHL.
     */
    @java.lang.Override
    public int getOHADDJPJJHL() {
      return oHADDJPJJHL_;
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
      if (oHADDJPJJHL_ != 0) {
        output.writeUInt32(4, oHADDJPJJHL_);
      }
      if (templateId_ != 0) {
        output.writeUInt32(9, templateId_);
      }
      if (fNPMBGBICIP_ != false) {
        output.writeBool(11, fNPMBGBICIP_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oHADDJPJJHL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, oHADDJPJJHL_);
      }
      if (templateId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, templateId_);
      }
      if (fNPMBGBICIP_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, fNPMBGBICIP_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB other = (emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB) obj;

      if (getFNPMBGBICIP()
          != other.getFNPMBGBICIP()) return false;
      if (getTemplateId()
          != other.getTemplateId()) return false;
      if (getOHADDJPJJHL()
          != other.getOHADDJPJJHL()) return false;
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
      hash = (37 * hash) + FNPMBGBICIP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFNPMBGBICIP());
      hash = (37 * hash) + TEMPLATE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTemplateId();
      hash = (37 * hash) + OHADDJPJJHL_FIELD_NUMBER;
      hash = (53 * hash) + getOHADDJPJJHL();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB prototype) {
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
     * Protobuf type {@code LJKDBILCDCB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LJKDBILCDCB)
        emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.internal_static_LJKDBILCDCB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.internal_static_LJKDBILCDCB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB.class, emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB.newBuilder()
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
        fNPMBGBICIP_ = false;

        templateId_ = 0;

        oHADDJPJJHL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.internal_static_LJKDBILCDCB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB build() {
        emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB buildPartial() {
        emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB result = new emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB(this);
        result.fNPMBGBICIP_ = fNPMBGBICIP_;
        result.templateId_ = templateId_;
        result.oHADDJPJJHL_ = oHADDJPJJHL_;
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
        if (other instanceof emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB) {
          return mergeFrom((emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB other) {
        if (other == emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB.getDefaultInstance()) return this;
        if (other.getFNPMBGBICIP() != false) {
          setFNPMBGBICIP(other.getFNPMBGBICIP());
        }
        if (other.getTemplateId() != 0) {
          setTemplateId(other.getTemplateId());
        }
        if (other.getOHADDJPJJHL() != 0) {
          setOHADDJPJJHL(other.getOHADDJPJJHL());
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
        emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean fNPMBGBICIP_ ;
      /**
       * <code>bool FNPMBGBICIP = 11;</code>
       * @return The fNPMBGBICIP.
       */
      @java.lang.Override
      public boolean getFNPMBGBICIP() {
        return fNPMBGBICIP_;
      }
      /**
       * <code>bool FNPMBGBICIP = 11;</code>
       * @param value The fNPMBGBICIP to set.
       * @return This builder for chaining.
       */
      public Builder setFNPMBGBICIP(boolean value) {
        
        fNPMBGBICIP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool FNPMBGBICIP = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFNPMBGBICIP() {
        
        fNPMBGBICIP_ = false;
        onChanged();
        return this;
      }

      private int templateId_ ;
      /**
       * <code>uint32 template_id = 9;</code>
       * @return The templateId.
       */
      @java.lang.Override
      public int getTemplateId() {
        return templateId_;
      }
      /**
       * <code>uint32 template_id = 9;</code>
       * @param value The templateId to set.
       * @return This builder for chaining.
       */
      public Builder setTemplateId(int value) {
        
        templateId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 template_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTemplateId() {
        
        templateId_ = 0;
        onChanged();
        return this;
      }

      private int oHADDJPJJHL_ ;
      /**
       * <code>uint32 OHADDJPJJHL = 4;</code>
       * @return The oHADDJPJJHL.
       */
      @java.lang.Override
      public int getOHADDJPJJHL() {
        return oHADDJPJJHL_;
      }
      /**
       * <code>uint32 OHADDJPJJHL = 4;</code>
       * @param value The oHADDJPJJHL to set.
       * @return This builder for chaining.
       */
      public Builder setOHADDJPJJHL(int value) {
        
        oHADDJPJJHL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OHADDJPJJHL = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearOHADDJPJJHL() {
        
        oHADDJPJJHL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LJKDBILCDCB)
    }

    // @@protoc_insertion_point(class_scope:LJKDBILCDCB)
    private static final emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB();
    }

    public static emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LJKDBILCDCB>
        PARSER = new com.google.protobuf.AbstractParser<LJKDBILCDCB>() {
      @java.lang.Override
      public LJKDBILCDCB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LJKDBILCDCB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LJKDBILCDCB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LJKDBILCDCB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LJKDBILCDCBOuterClass.LJKDBILCDCB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LJKDBILCDCB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LJKDBILCDCB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LJKDBILCDCB.proto\"L\n\013LJKDBILCDCB\022\023\n\013FN" +
      "PMBGBICIP\030\013 \001(\010\022\023\n\013template_id\030\t \001(\r\022\023\n\013" +
      "OHADDJPJJHL\030\004 \001(\rB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LJKDBILCDCB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LJKDBILCDCB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LJKDBILCDCB_descriptor,
        new java.lang.String[] { "FNPMBGBICIP", "TemplateId", "OHADDJPJJHL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
