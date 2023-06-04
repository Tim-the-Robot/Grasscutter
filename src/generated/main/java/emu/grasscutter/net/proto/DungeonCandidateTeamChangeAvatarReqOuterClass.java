// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamChangeAvatarReq.proto

package emu.grasscutter.net.proto;

public final class DungeonCandidateTeamChangeAvatarReqOuterClass {
  private DungeonCandidateTeamChangeAvatarReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonCandidateTeamChangeAvatarReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonCandidateTeamChangeAvatarReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint64 avatar_guid_list = 9;</code>
     * @return A list containing the avatarGuidList.
     */
    java.util.List<java.lang.Long> getAvatarGuidListList();
    /**
     * <code>repeated uint64 avatar_guid_list = 9;</code>
     * @return The count of avatarGuidList.
     */
    int getAvatarGuidListCount();
    /**
     * <code>repeated uint64 avatar_guid_list = 9;</code>
     * @param index The index of the element to return.
     * @return The avatarGuidList at the given index.
     */
    long getAvatarGuidList(int index);
  }
  /**
   * <pre>
   * CmdId: 949
   * Obf: HPEDCFMBMIO
   * </pre>
   *
   * Protobuf type {@code DungeonCandidateTeamChangeAvatarReq}
   */
  public static final class DungeonCandidateTeamChangeAvatarReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonCandidateTeamChangeAvatarReq)
      DungeonCandidateTeamChangeAvatarReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonCandidateTeamChangeAvatarReq.newBuilder() to construct.
    private DungeonCandidateTeamChangeAvatarReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonCandidateTeamChangeAvatarReq() {
      avatarGuidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonCandidateTeamChangeAvatarReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonCandidateTeamChangeAvatarReq(
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
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                avatarGuidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              avatarGuidList_.addLong(input.readUInt64());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                avatarGuidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                avatarGuidList_.addLong(input.readUInt64());
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
          avatarGuidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.internal_static_DungeonCandidateTeamChangeAvatarReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.internal_static_DungeonCandidateTeamChangeAvatarReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq.class, emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq.Builder.class);
    }

    public static final int AVATAR_GUID_LIST_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.LongList avatarGuidList_;
    /**
     * <code>repeated uint64 avatar_guid_list = 9;</code>
     * @return A list containing the avatarGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getAvatarGuidListList() {
      return avatarGuidList_;
    }
    /**
     * <code>repeated uint64 avatar_guid_list = 9;</code>
     * @return The count of avatarGuidList.
     */
    public int getAvatarGuidListCount() {
      return avatarGuidList_.size();
    }
    /**
     * <code>repeated uint64 avatar_guid_list = 9;</code>
     * @param index The index of the element to return.
     * @return The avatarGuidList at the given index.
     */
    public long getAvatarGuidList(int index) {
      return avatarGuidList_.getLong(index);
    }
    private int avatarGuidListMemoizedSerializedSize = -1;

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
      if (getAvatarGuidListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(avatarGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < avatarGuidList_.size(); i++) {
        output.writeUInt64NoTag(avatarGuidList_.getLong(i));
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
        for (int i = 0; i < avatarGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(avatarGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getAvatarGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        avatarGuidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq other = (emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq) obj;

      if (!getAvatarGuidListList()
          .equals(other.getAvatarGuidListList())) return false;
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
      if (getAvatarGuidListCount() > 0) {
        hash = (37 * hash) + AVATAR_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarGuidListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq prototype) {
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
     * CmdId: 949
     * Obf: HPEDCFMBMIO
     * </pre>
     *
     * Protobuf type {@code DungeonCandidateTeamChangeAvatarReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonCandidateTeamChangeAvatarReq)
        emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.internal_static_DungeonCandidateTeamChangeAvatarReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.internal_static_DungeonCandidateTeamChangeAvatarReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq.class, emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq.newBuilder()
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
        avatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.internal_static_DungeonCandidateTeamChangeAvatarReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq build() {
        emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq buildPartial() {
        emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq result = new emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          avatarGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.avatarGuidList_ = avatarGuidList_;
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
        if (other instanceof emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq other) {
        if (other == emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq.getDefaultInstance()) return this;
        if (!other.avatarGuidList_.isEmpty()) {
          if (avatarGuidList_.isEmpty()) {
            avatarGuidList_ = other.avatarGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAvatarGuidListIsMutable();
            avatarGuidList_.addAll(other.avatarGuidList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.LongList avatarGuidList_ = emptyLongList();
      private void ensureAvatarGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarGuidList_ = mutableCopy(avatarGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 9;</code>
       * @return A list containing the avatarGuidList.
       */
      public java.util.List<java.lang.Long>
          getAvatarGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(avatarGuidList_) : avatarGuidList_;
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 9;</code>
       * @return The count of avatarGuidList.
       */
      public int getAvatarGuidListCount() {
        return avatarGuidList_.size();
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 9;</code>
       * @param index The index of the element to return.
       * @return The avatarGuidList at the given index.
       */
      public long getAvatarGuidList(int index) {
        return avatarGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The avatarGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuidList(
          int index, long value) {
        ensureAvatarGuidListIsMutable();
        avatarGuidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 9;</code>
       * @param value The avatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAvatarGuidList(long value) {
        ensureAvatarGuidListIsMutable();
        avatarGuidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 9;</code>
       * @param values The avatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAvatarGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureAvatarGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuidList() {
        avatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:DungeonCandidateTeamChangeAvatarReq)
    }

    // @@protoc_insertion_point(class_scope:DungeonCandidateTeamChangeAvatarReq)
    private static final emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq();
    }

    public static emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonCandidateTeamChangeAvatarReq>
        PARSER = new com.google.protobuf.AbstractParser<DungeonCandidateTeamChangeAvatarReq>() {
      @java.lang.Override
      public DungeonCandidateTeamChangeAvatarReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonCandidateTeamChangeAvatarReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonCandidateTeamChangeAvatarReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonCandidateTeamChangeAvatarReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonCandidateTeamChangeAvatarReqOuterClass.DungeonCandidateTeamChangeAvatarReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonCandidateTeamChangeAvatarReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonCandidateTeamChangeAvatarReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)DungeonCandidateTeamChangeAvatarReq.pr" +
      "oto\"?\n#DungeonCandidateTeamChangeAvatarR" +
      "eq\022\030\n\020avatar_guid_list\030\t \003(\004B\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonCandidateTeamChangeAvatarReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonCandidateTeamChangeAvatarReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonCandidateTeamChangeAvatarReq_descriptor,
        new java.lang.String[] { "AvatarGuidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
