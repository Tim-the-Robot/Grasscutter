// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GOKFJAACELD.proto

package emu.grasscutter.net.proto;

public final class GOKFJAACELDOuterClass {
  private GOKFJAACELDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GOKFJAACELDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GOKFJAACELD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 12;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 max_score = 2;</code>
     * @return The maxScore.
     */
    int getMaxScore();

    /**
     * <code>bool is_open = 10;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 cost_time = 14;</code>
     * @return The costTime.
     */
    int getCostTime();
  }
  /**
   * Protobuf type {@code GOKFJAACELD}
   */
  public static final class GOKFJAACELD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GOKFJAACELD)
      GOKFJAACELDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GOKFJAACELD.newBuilder() to construct.
    private GOKFJAACELD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GOKFJAACELD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GOKFJAACELD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GOKFJAACELD(
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
            case 16: {

              maxScore_ = input.readUInt32();
              break;
            }
            case 80: {

              isOpen_ = input.readBool();
              break;
            }
            case 96: {

              levelId_ = input.readUInt32();
              break;
            }
            case 112: {

              costTime_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GOKFJAACELDOuterClass.internal_static_GOKFJAACELD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GOKFJAACELDOuterClass.internal_static_GOKFJAACELD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD.class, emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 12;
    private int levelId_;
    /**
     * <code>uint32 level_id = 12;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int MAX_SCORE_FIELD_NUMBER = 2;
    private int maxScore_;
    /**
     * <code>uint32 max_score = 2;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 10;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 10;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int COST_TIME_FIELD_NUMBER = 14;
    private int costTime_;
    /**
     * <code>uint32 cost_time = 14;</code>
     * @return The costTime.
     */
    @java.lang.Override
    public int getCostTime() {
      return costTime_;
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
      if (maxScore_ != 0) {
        output.writeUInt32(2, maxScore_);
      }
      if (isOpen_ != false) {
        output.writeBool(10, isOpen_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(12, levelId_);
      }
      if (costTime_ != 0) {
        output.writeUInt32(14, costTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, maxScore_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isOpen_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, levelId_);
      }
      if (costTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, costTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD other = (emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getMaxScore()
          != other.getMaxScore()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getCostTime()
          != other.getCostTime()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + COST_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCostTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD prototype) {
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
     * Protobuf type {@code GOKFJAACELD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GOKFJAACELD)
        emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GOKFJAACELDOuterClass.internal_static_GOKFJAACELD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GOKFJAACELDOuterClass.internal_static_GOKFJAACELD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD.class, emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD.newBuilder()
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
        levelId_ = 0;

        maxScore_ = 0;

        isOpen_ = false;

        costTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GOKFJAACELDOuterClass.internal_static_GOKFJAACELD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD build() {
        emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD buildPartial() {
        emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD result = new emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD(this);
        result.levelId_ = levelId_;
        result.maxScore_ = maxScore_;
        result.isOpen_ = isOpen_;
        result.costTime_ = costTime_;
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
        if (other instanceof emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD) {
          return mergeFrom((emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD other) {
        if (other == emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getCostTime() != 0) {
          setCostTime(other.getCostTime());
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
        emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 12;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 12;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 2;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 2;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {
        
        maxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        
        maxScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 10;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 10;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int costTime_ ;
      /**
       * <code>uint32 cost_time = 14;</code>
       * @return The costTime.
       */
      @java.lang.Override
      public int getCostTime() {
        return costTime_;
      }
      /**
       * <code>uint32 cost_time = 14;</code>
       * @param value The costTime to set.
       * @return This builder for chaining.
       */
      public Builder setCostTime(int value) {
        
        costTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cost_time = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostTime() {
        
        costTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GOKFJAACELD)
    }

    // @@protoc_insertion_point(class_scope:GOKFJAACELD)
    private static final emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD();
    }

    public static emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GOKFJAACELD>
        PARSER = new com.google.protobuf.AbstractParser<GOKFJAACELD>() {
      @java.lang.Override
      public GOKFJAACELD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GOKFJAACELD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GOKFJAACELD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GOKFJAACELD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GOKFJAACELDOuterClass.GOKFJAACELD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GOKFJAACELD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GOKFJAACELD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GOKFJAACELD.proto\"V\n\013GOKFJAACELD\022\020\n\010le" +
      "vel_id\030\014 \001(\r\022\021\n\tmax_score\030\002 \001(\r\022\017\n\007is_op" +
      "en\030\n \001(\010\022\021\n\tcost_time\030\016 \001(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GOKFJAACELD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GOKFJAACELD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GOKFJAACELD_descriptor,
        new java.lang.String[] { "LevelId", "MaxScore", "IsOpen", "CostTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
