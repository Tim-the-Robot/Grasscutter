// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FishEscapeNotify.proto

package emu.grasscutter.net.proto;

public final class FishEscapeNotifyOuterClass {
  private FishEscapeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FishEscapeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FishEscapeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector pos = 1;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 1;</code>
     * @return The pos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 1;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

    /**
     * <code>repeated uint32 fish_id_list = 15;</code>
     * @return A list containing the fishIdList.
     */
    java.util.List<java.lang.Integer> getFishIdListList();
    /**
     * <code>repeated uint32 fish_id_list = 15;</code>
     * @return The count of fishIdList.
     */
    int getFishIdListCount();
    /**
     * <code>repeated uint32 fish_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The fishIdList at the given index.
     */
    int getFishIdList(int index);

    /**
     * <code>uint32 uid = 5;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>.FishEscapeReason reason = 7;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.FishEscapeReason reason = 7;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.FishEscapeReasonOuterClass.FishEscapeReason getReason();
  }
  /**
   * <pre>
   * CmdId: 5807
   * Obf: CJAOKNLFKBE
   * </pre>
   *
   * Protobuf type {@code FishEscapeNotify}
   */
  public static final class FishEscapeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FishEscapeNotify)
      FishEscapeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FishEscapeNotify.newBuilder() to construct.
    private FishEscapeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FishEscapeNotify() {
      fishIdList_ = emptyIntList();
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FishEscapeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FishEscapeNotify(
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
            case 10: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (pos_ != null) {
                subBuilder = pos_.toBuilder();
              }
              pos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pos_);
                pos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 40: {

              uid_ = input.readUInt32();
              break;
            }
            case 56: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fishIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              fishIdList_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                fishIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                fishIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
          fishIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.internal_static_FishEscapeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.internal_static_FishEscapeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify.class, emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify.Builder.class);
    }

    public static final int POS_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 1;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 1;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
    }

    public static final int FISH_ID_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList fishIdList_;
    /**
     * <code>repeated uint32 fish_id_list = 15;</code>
     * @return A list containing the fishIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFishIdListList() {
      return fishIdList_;
    }
    /**
     * <code>repeated uint32 fish_id_list = 15;</code>
     * @return The count of fishIdList.
     */
    public int getFishIdListCount() {
      return fishIdList_.size();
    }
    /**
     * <code>repeated uint32 fish_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The fishIdList at the given index.
     */
    public int getFishIdList(int index) {
      return fishIdList_.getInt(index);
    }
    private int fishIdListMemoizedSerializedSize = -1;

    public static final int UID_FIELD_NUMBER = 5;
    private int uid_;
    /**
     * <code>uint32 uid = 5;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int REASON_FIELD_NUMBER = 7;
    private int reason_;
    /**
     * <code>.FishEscapeReason reason = 7;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.FishEscapeReason reason = 7;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.FishEscapeReasonOuterClass.FishEscapeReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.FishEscapeReasonOuterClass.FishEscapeReason result = emu.grasscutter.net.proto.FishEscapeReasonOuterClass.FishEscapeReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.FishEscapeReasonOuterClass.FishEscapeReason.UNRECOGNIZED : result;
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
      if (pos_ != null) {
        output.writeMessage(1, getPos());
      }
      if (uid_ != 0) {
        output.writeUInt32(5, uid_);
      }
      if (reason_ != emu.grasscutter.net.proto.FishEscapeReasonOuterClass.FishEscapeReason.FISN_ESCAPE_NONE.getNumber()) {
        output.writeEnum(7, reason_);
      }
      if (getFishIdListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(fishIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < fishIdList_.size(); i++) {
        output.writeUInt32NoTag(fishIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPos());
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, uid_);
      }
      if (reason_ != emu.grasscutter.net.proto.FishEscapeReasonOuterClass.FishEscapeReason.FISN_ESCAPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, reason_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fishIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fishIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFishIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fishIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify other = (emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify) obj;

      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (!getFishIdListList()
          .equals(other.getFishIdListList())) return false;
      if (getUid()
          != other.getUid()) return false;
      if (reason_ != other.reason_) return false;
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
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      if (getFishIdListCount() > 0) {
        hash = (37 * hash) + FISH_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFishIdListList().hashCode();
      }
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify prototype) {
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
     * CmdId: 5807
     * Obf: CJAOKNLFKBE
     * </pre>
     *
     * Protobuf type {@code FishEscapeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FishEscapeNotify)
        emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.internal_static_FishEscapeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.internal_static_FishEscapeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify.class, emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify.newBuilder()
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
        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        fishIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = 0;

        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.internal_static_FishEscapeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify build() {
        emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify buildPartial() {
        emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify result = new emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify(this);
        int from_bitField0_ = bitField0_;
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
        }
        if (((bitField0_ & 0x00000001) != 0)) {
          fishIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fishIdList_ = fishIdList_;
        result.uid_ = uid_;
        result.reason_ = reason_;
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
        if (other instanceof emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify other) {
        if (other == emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify.getDefaultInstance()) return this;
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (!other.fishIdList_.isEmpty()) {
          if (fishIdList_.isEmpty()) {
            fishIdList_ = other.fishIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFishIdListIsMutable();
            fishIdList_.addAll(other.fishIdList_);
          }
          onChanged();
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
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
        emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 1;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 1;</code>
       * @return The pos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      public Builder setPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
          onChanged();
        } else {
          posBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      public Builder setPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      public Builder mergePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
          } else {
            pos_ = value;
          }
          onChanged();
        } else {
          posBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      public Builder clearPos() {
        if (posBuilder_ == null) {
          pos_ = null;
          onChanged();
        } else {
          pos_ = null;
          posBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
      }

      private com.google.protobuf.Internal.IntList fishIdList_ = emptyIntList();
      private void ensureFishIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fishIdList_ = mutableCopy(fishIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 fish_id_list = 15;</code>
       * @return A list containing the fishIdList.
       */
      public java.util.List<java.lang.Integer>
          getFishIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fishIdList_) : fishIdList_;
      }
      /**
       * <code>repeated uint32 fish_id_list = 15;</code>
       * @return The count of fishIdList.
       */
      public int getFishIdListCount() {
        return fishIdList_.size();
      }
      /**
       * <code>repeated uint32 fish_id_list = 15;</code>
       * @param index The index of the element to return.
       * @return The fishIdList at the given index.
       */
      public int getFishIdList(int index) {
        return fishIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 fish_id_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The fishIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFishIdList(
          int index, int value) {
        ensureFishIdListIsMutable();
        fishIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fish_id_list = 15;</code>
       * @param value The fishIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFishIdList(int value) {
        ensureFishIdListIsMutable();
        fishIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fish_id_list = 15;</code>
       * @param values The fishIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFishIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFishIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fishIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fish_id_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFishIdList() {
        fishIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 5;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 5;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.FishEscapeReason reason = 7;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.FishEscapeReason reason = 7;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.FishEscapeReason reason = 7;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.FishEscapeReasonOuterClass.FishEscapeReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.FishEscapeReasonOuterClass.FishEscapeReason result = emu.grasscutter.net.proto.FishEscapeReasonOuterClass.FishEscapeReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.FishEscapeReasonOuterClass.FishEscapeReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.FishEscapeReason reason = 7;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.FishEscapeReasonOuterClass.FishEscapeReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.FishEscapeReason reason = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FishEscapeNotify)
    }

    // @@protoc_insertion_point(class_scope:FishEscapeNotify)
    private static final emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify();
    }

    public static emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FishEscapeNotify>
        PARSER = new com.google.protobuf.AbstractParser<FishEscapeNotify>() {
      @java.lang.Override
      public FishEscapeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FishEscapeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FishEscapeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FishEscapeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FishEscapeNotifyOuterClass.FishEscapeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FishEscapeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FishEscapeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FishEscapeNotify.proto\032\014Vector.proto\032\026" +
      "FishEscapeReason.proto\"n\n\020FishEscapeNoti" +
      "fy\022\024\n\003pos\030\001 \001(\0132\007.Vector\022\024\n\014fish_id_list" +
      "\030\017 \003(\r\022\013\n\003uid\030\005 \001(\r\022!\n\006reason\030\007 \001(\0162\021.Fi" +
      "shEscapeReasonB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.FishEscapeReasonOuterClass.getDescriptor(),
        });
    internal_static_FishEscapeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FishEscapeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FishEscapeNotify_descriptor,
        new java.lang.String[] { "Pos", "FishIdList", "Uid", "Reason", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
    emu.grasscutter.net.proto.FishEscapeReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
