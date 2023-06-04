// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeResourceBonusPropUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class RoguelikeResourceBonusPropUpdateNotifyOuterClass {
  private RoguelikeResourceBonusPropUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeResourceBonusPropUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeResourceBonusPropUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float bonus_resource_prop = 2;</code>
     * @return The bonusResourceProp.
     */
    float getBonusResourceProp();
  }
  /**
   * <pre>
   * CmdId: 8700
   * Obf: FPDJKFMIFHI
   * </pre>
   *
   * Protobuf type {@code RoguelikeResourceBonusPropUpdateNotify}
   */
  public static final class RoguelikeResourceBonusPropUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeResourceBonusPropUpdateNotify)
      RoguelikeResourceBonusPropUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeResourceBonusPropUpdateNotify.newBuilder() to construct.
    private RoguelikeResourceBonusPropUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeResourceBonusPropUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeResourceBonusPropUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoguelikeResourceBonusPropUpdateNotify(
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
            case 21: {

              bonusResourceProp_ = input.readFloat();
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
      return emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.internal_static_RoguelikeResourceBonusPropUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.internal_static_RoguelikeResourceBonusPropUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.class, emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.Builder.class);
    }

    public static final int BONUS_RESOURCE_PROP_FIELD_NUMBER = 2;
    private float bonusResourceProp_;
    /**
     * <code>float bonus_resource_prop = 2;</code>
     * @return The bonusResourceProp.
     */
    @java.lang.Override
    public float getBonusResourceProp() {
      return bonusResourceProp_;
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
      if (bonusResourceProp_ != 0F) {
        output.writeFloat(2, bonusResourceProp_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bonusResourceProp_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, bonusResourceProp_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify other = (emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify) obj;

      if (java.lang.Float.floatToIntBits(getBonusResourceProp())
          != java.lang.Float.floatToIntBits(
              other.getBonusResourceProp())) return false;
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
      hash = (37 * hash) + BONUS_RESOURCE_PROP_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getBonusResourceProp());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify prototype) {
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
     * CmdId: 8700
     * Obf: FPDJKFMIFHI
     * </pre>
     *
     * Protobuf type {@code RoguelikeResourceBonusPropUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeResourceBonusPropUpdateNotify)
        emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.internal_static_RoguelikeResourceBonusPropUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.internal_static_RoguelikeResourceBonusPropUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.class, emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.newBuilder()
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
        bonusResourceProp_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.internal_static_RoguelikeResourceBonusPropUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify build() {
        emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify result = new emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify(this);
        result.bonusResourceProp_ = bonusResourceProp_;
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
        if (other instanceof emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify.getDefaultInstance()) return this;
        if (other.getBonusResourceProp() != 0F) {
          setBonusResourceProp(other.getBonusResourceProp());
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
        emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float bonusResourceProp_ ;
      /**
       * <code>float bonus_resource_prop = 2;</code>
       * @return The bonusResourceProp.
       */
      @java.lang.Override
      public float getBonusResourceProp() {
        return bonusResourceProp_;
      }
      /**
       * <code>float bonus_resource_prop = 2;</code>
       * @param value The bonusResourceProp to set.
       * @return This builder for chaining.
       */
      public Builder setBonusResourceProp(float value) {
        
        bonusResourceProp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float bonus_resource_prop = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBonusResourceProp() {
        
        bonusResourceProp_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeResourceBonusPropUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeResourceBonusPropUpdateNotify)
    private static final emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify();
    }

    public static emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeResourceBonusPropUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeResourceBonusPropUpdateNotify>() {
      @java.lang.Override
      public RoguelikeResourceBonusPropUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoguelikeResourceBonusPropUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoguelikeResourceBonusPropUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeResourceBonusPropUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RoguelikeResourceBonusPropUpdateNotifyOuterClass.RoguelikeResourceBonusPropUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeResourceBonusPropUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeResourceBonusPropUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,RoguelikeResourceBonusPropUpdateNotify" +
      ".proto\"E\n&RoguelikeResourceBonusPropUpda" +
      "teNotify\022\033\n\023bonus_resource_prop\030\002 \001(\002B\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeResourceBonusPropUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeResourceBonusPropUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeResourceBonusPropUpdateNotify_descriptor,
        new java.lang.String[] { "BonusResourceProp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
