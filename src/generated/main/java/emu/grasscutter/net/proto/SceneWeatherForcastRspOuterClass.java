// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneWeatherForcastRsp.proto

package emu.grasscutter.net.proto;

public final class SceneWeatherForcastRspOuterClass {
  private SceneWeatherForcastRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneWeatherForcastRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneWeatherForcastRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 forcast_climate_list = 6;</code>
     * @return A list containing the forcastClimateList.
     */
    java.util.List<java.lang.Integer> getForcastClimateListList();
    /**
     * <code>repeated uint32 forcast_climate_list = 6;</code>
     * @return The count of forcastClimateList.
     */
    int getForcastClimateListCount();
    /**
     * <code>repeated uint32 forcast_climate_list = 6;</code>
     * @param index The index of the element to return.
     * @return The forcastClimateList at the given index.
     */
    int getForcastClimateList(int index);

    /**
     * <code>uint64 next_climate_time = 12;</code>
     * @return The nextClimateTime.
     */
    long getNextClimateTime();
  }
  /**
   * <pre>
   * CmdId: 3037
   * Obf: MGONCHGNCBI
   * </pre>
   *
   * Protobuf type {@code SceneWeatherForcastRsp}
   */
  public static final class SceneWeatherForcastRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneWeatherForcastRsp)
      SceneWeatherForcastRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneWeatherForcastRsp.newBuilder() to construct.
    private SceneWeatherForcastRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneWeatherForcastRsp() {
      forcastClimateList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneWeatherForcastRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneWeatherForcastRsp(
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
            case 48: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                forcastClimateList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              forcastClimateList_.addInt(input.readUInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                forcastClimateList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                forcastClimateList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 80: {

              retcode_ = input.readInt32();
              break;
            }
            case 96: {

              nextClimateTime_ = input.readUInt64();
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
          forcastClimateList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.internal_static_SceneWeatherForcastRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.internal_static_SceneWeatherForcastRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.class, emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.Builder.class);
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

    public static final int FORCAST_CLIMATE_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList forcastClimateList_;
    /**
     * <code>repeated uint32 forcast_climate_list = 6;</code>
     * @return A list containing the forcastClimateList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getForcastClimateListList() {
      return forcastClimateList_;
    }
    /**
     * <code>repeated uint32 forcast_climate_list = 6;</code>
     * @return The count of forcastClimateList.
     */
    public int getForcastClimateListCount() {
      return forcastClimateList_.size();
    }
    /**
     * <code>repeated uint32 forcast_climate_list = 6;</code>
     * @param index The index of the element to return.
     * @return The forcastClimateList at the given index.
     */
    public int getForcastClimateList(int index) {
      return forcastClimateList_.getInt(index);
    }
    private int forcastClimateListMemoizedSerializedSize = -1;

    public static final int NEXT_CLIMATE_TIME_FIELD_NUMBER = 12;
    private long nextClimateTime_;
    /**
     * <code>uint64 next_climate_time = 12;</code>
     * @return The nextClimateTime.
     */
    @java.lang.Override
    public long getNextClimateTime() {
      return nextClimateTime_;
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
      getSerializedSize();
      if (getForcastClimateListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(forcastClimateListMemoizedSerializedSize);
      }
      for (int i = 0; i < forcastClimateList_.size(); i++) {
        output.writeUInt32NoTag(forcastClimateList_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      if (nextClimateTime_ != 0L) {
        output.writeUInt64(12, nextClimateTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < forcastClimateList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(forcastClimateList_.getInt(i));
        }
        size += dataSize;
        if (!getForcastClimateListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        forcastClimateListMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
      }
      if (nextClimateTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, nextClimateTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp other = (emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getForcastClimateListList()
          .equals(other.getForcastClimateListList())) return false;
      if (getNextClimateTime()
          != other.getNextClimateTime()) return false;
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
      if (getForcastClimateListCount() > 0) {
        hash = (37 * hash) + FORCAST_CLIMATE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getForcastClimateListList().hashCode();
      }
      hash = (37 * hash) + NEXT_CLIMATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNextClimateTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp prototype) {
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
     * CmdId: 3037
     * Obf: MGONCHGNCBI
     * </pre>
     *
     * Protobuf type {@code SceneWeatherForcastRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneWeatherForcastRsp)
        emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.internal_static_SceneWeatherForcastRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.internal_static_SceneWeatherForcastRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.class, emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.newBuilder()
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

        forcastClimateList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        nextClimateTime_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.internal_static_SceneWeatherForcastRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp build() {
        emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp buildPartial() {
        emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp result = new emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          forcastClimateList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.forcastClimateList_ = forcastClimateList_;
        result.nextClimateTime_ = nextClimateTime_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp other) {
        if (other == emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.forcastClimateList_.isEmpty()) {
          if (forcastClimateList_.isEmpty()) {
            forcastClimateList_ = other.forcastClimateList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureForcastClimateListIsMutable();
            forcastClimateList_.addAll(other.forcastClimateList_);
          }
          onChanged();
        }
        if (other.getNextClimateTime() != 0L) {
          setNextClimateTime(other.getNextClimateTime());
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
        emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

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

      private com.google.protobuf.Internal.IntList forcastClimateList_ = emptyIntList();
      private void ensureForcastClimateListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          forcastClimateList_ = mutableCopy(forcastClimateList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 forcast_climate_list = 6;</code>
       * @return A list containing the forcastClimateList.
       */
      public java.util.List<java.lang.Integer>
          getForcastClimateListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(forcastClimateList_) : forcastClimateList_;
      }
      /**
       * <code>repeated uint32 forcast_climate_list = 6;</code>
       * @return The count of forcastClimateList.
       */
      public int getForcastClimateListCount() {
        return forcastClimateList_.size();
      }
      /**
       * <code>repeated uint32 forcast_climate_list = 6;</code>
       * @param index The index of the element to return.
       * @return The forcastClimateList at the given index.
       */
      public int getForcastClimateList(int index) {
        return forcastClimateList_.getInt(index);
      }
      /**
       * <code>repeated uint32 forcast_climate_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The forcastClimateList to set.
       * @return This builder for chaining.
       */
      public Builder setForcastClimateList(
          int index, int value) {
        ensureForcastClimateListIsMutable();
        forcastClimateList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 forcast_climate_list = 6;</code>
       * @param value The forcastClimateList to add.
       * @return This builder for chaining.
       */
      public Builder addForcastClimateList(int value) {
        ensureForcastClimateListIsMutable();
        forcastClimateList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 forcast_climate_list = 6;</code>
       * @param values The forcastClimateList to add.
       * @return This builder for chaining.
       */
      public Builder addAllForcastClimateList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureForcastClimateListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, forcastClimateList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 forcast_climate_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearForcastClimateList() {
        forcastClimateList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private long nextClimateTime_ ;
      /**
       * <code>uint64 next_climate_time = 12;</code>
       * @return The nextClimateTime.
       */
      @java.lang.Override
      public long getNextClimateTime() {
        return nextClimateTime_;
      }
      /**
       * <code>uint64 next_climate_time = 12;</code>
       * @param value The nextClimateTime to set.
       * @return This builder for chaining.
       */
      public Builder setNextClimateTime(long value) {
        
        nextClimateTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 next_climate_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearNextClimateTime() {
        
        nextClimateTime_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:SceneWeatherForcastRsp)
    }

    // @@protoc_insertion_point(class_scope:SceneWeatherForcastRsp)
    private static final emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp();
    }

    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneWeatherForcastRsp>
        PARSER = new com.google.protobuf.AbstractParser<SceneWeatherForcastRsp>() {
      @java.lang.Override
      public SceneWeatherForcastRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneWeatherForcastRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneWeatherForcastRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneWeatherForcastRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneWeatherForcastRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneWeatherForcastRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SceneWeatherForcastRsp.proto\"b\n\026SceneW" +
      "eatherForcastRsp\022\017\n\007retcode\030\n \001(\005\022\034\n\024for" +
      "cast_climate_list\030\006 \003(\r\022\031\n\021next_climate_" +
      "time\030\014 \001(\004B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneWeatherForcastRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneWeatherForcastRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneWeatherForcastRsp_descriptor,
        new java.lang.String[] { "Retcode", "ForcastClimateList", "NextClimateTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
