// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGOperationReboot.proto

package emu.grasscutter.net.proto;

public final class GCGOperationRebootOuterClass {
  private GCGOperationRebootOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGOperationRebootOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGOperationReboot)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 cost_card_guid_list = 4;</code>
     * @return A list containing the costCardGuidList.
     */
    java.util.List<java.lang.Integer> getCostCardGuidListList();
    /**
     * <code>repeated uint32 cost_card_guid_list = 4;</code>
     * @return The count of costCardGuidList.
     */
    int getCostCardGuidListCount();
    /**
     * <code>repeated uint32 cost_card_guid_list = 4;</code>
     * @param index The index of the element to return.
     * @return The costCardGuidList at the given index.
     */
    int getCostCardGuidList(int index);

    /**
     * <code>repeated uint32 dice_index_list = 8;</code>
     * @return A list containing the diceIndexList.
     */
    java.util.List<java.lang.Integer> getDiceIndexListList();
    /**
     * <code>repeated uint32 dice_index_list = 8;</code>
     * @return The count of diceIndexList.
     */
    int getDiceIndexListCount();
    /**
     * <code>repeated uint32 dice_index_list = 8;</code>
     * @param index The index of the element to return.
     * @return The diceIndexList at the given index.
     */
    int getDiceIndexList(int index);
  }
  /**
   * <pre>
   * Obf: HLLFOJAOECP
   * </pre>
   *
   * Protobuf type {@code GCGOperationReboot}
   */
  public static final class GCGOperationReboot extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGOperationReboot)
      GCGOperationRebootOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGOperationReboot.newBuilder() to construct.
    private GCGOperationReboot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGOperationReboot() {
      costCardGuidList_ = emptyIntList();
      diceIndexList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGOperationReboot();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGOperationReboot(
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
            case 32: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                costCardGuidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              costCardGuidList_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                costCardGuidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                costCardGuidList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 64: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                diceIndexList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              diceIndexList_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                diceIndexList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                diceIndexList_.addInt(input.readUInt32());
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
          costCardGuidList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          diceIndexList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGOperationRebootOuterClass.internal_static_GCGOperationReboot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGOperationRebootOuterClass.internal_static_GCGOperationReboot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot.class, emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot.Builder.class);
    }

    public static final int COST_CARD_GUID_LIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList costCardGuidList_;
    /**
     * <code>repeated uint32 cost_card_guid_list = 4;</code>
     * @return A list containing the costCardGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCostCardGuidListList() {
      return costCardGuidList_;
    }
    /**
     * <code>repeated uint32 cost_card_guid_list = 4;</code>
     * @return The count of costCardGuidList.
     */
    public int getCostCardGuidListCount() {
      return costCardGuidList_.size();
    }
    /**
     * <code>repeated uint32 cost_card_guid_list = 4;</code>
     * @param index The index of the element to return.
     * @return The costCardGuidList at the given index.
     */
    public int getCostCardGuidList(int index) {
      return costCardGuidList_.getInt(index);
    }
    private int costCardGuidListMemoizedSerializedSize = -1;

    public static final int DICE_INDEX_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList diceIndexList_;
    /**
     * <code>repeated uint32 dice_index_list = 8;</code>
     * @return A list containing the diceIndexList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDiceIndexListList() {
      return diceIndexList_;
    }
    /**
     * <code>repeated uint32 dice_index_list = 8;</code>
     * @return The count of diceIndexList.
     */
    public int getDiceIndexListCount() {
      return diceIndexList_.size();
    }
    /**
     * <code>repeated uint32 dice_index_list = 8;</code>
     * @param index The index of the element to return.
     * @return The diceIndexList at the given index.
     */
    public int getDiceIndexList(int index) {
      return diceIndexList_.getInt(index);
    }
    private int diceIndexListMemoizedSerializedSize = -1;

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
      if (getCostCardGuidListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(costCardGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < costCardGuidList_.size(); i++) {
        output.writeUInt32NoTag(costCardGuidList_.getInt(i));
      }
      if (getDiceIndexListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(diceIndexListMemoizedSerializedSize);
      }
      for (int i = 0; i < diceIndexList_.size(); i++) {
        output.writeUInt32NoTag(diceIndexList_.getInt(i));
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
        for (int i = 0; i < costCardGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(costCardGuidList_.getInt(i));
        }
        size += dataSize;
        if (!getCostCardGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        costCardGuidListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < diceIndexList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(diceIndexList_.getInt(i));
        }
        size += dataSize;
        if (!getDiceIndexListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        diceIndexListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot other = (emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot) obj;

      if (!getCostCardGuidListList()
          .equals(other.getCostCardGuidListList())) return false;
      if (!getDiceIndexListList()
          .equals(other.getDiceIndexListList())) return false;
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
      if (getCostCardGuidListCount() > 0) {
        hash = (37 * hash) + COST_CARD_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCostCardGuidListList().hashCode();
      }
      if (getDiceIndexListCount() > 0) {
        hash = (37 * hash) + DICE_INDEX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDiceIndexListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot prototype) {
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
     * Obf: HLLFOJAOECP
     * </pre>
     *
     * Protobuf type {@code GCGOperationReboot}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGOperationReboot)
        emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationRebootOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGOperationRebootOuterClass.internal_static_GCGOperationReboot_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGOperationRebootOuterClass.internal_static_GCGOperationReboot_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot.class, emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot.newBuilder()
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
        costCardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        diceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGOperationRebootOuterClass.internal_static_GCGOperationReboot_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot build() {
        emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot buildPartial() {
        emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot result = new emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          costCardGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.costCardGuidList_ = costCardGuidList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          diceIndexList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.diceIndexList_ = diceIndexList_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot) {
          return mergeFrom((emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot other) {
        if (other == emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot.getDefaultInstance()) return this;
        if (!other.costCardGuidList_.isEmpty()) {
          if (costCardGuidList_.isEmpty()) {
            costCardGuidList_ = other.costCardGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCostCardGuidListIsMutable();
            costCardGuidList_.addAll(other.costCardGuidList_);
          }
          onChanged();
        }
        if (!other.diceIndexList_.isEmpty()) {
          if (diceIndexList_.isEmpty()) {
            diceIndexList_ = other.diceIndexList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDiceIndexListIsMutable();
            diceIndexList_.addAll(other.diceIndexList_);
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
        emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList costCardGuidList_ = emptyIntList();
      private void ensureCostCardGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          costCardGuidList_ = mutableCopy(costCardGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 4;</code>
       * @return A list containing the costCardGuidList.
       */
      public java.util.List<java.lang.Integer>
          getCostCardGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(costCardGuidList_) : costCardGuidList_;
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 4;</code>
       * @return The count of costCardGuidList.
       */
      public int getCostCardGuidListCount() {
        return costCardGuidList_.size();
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 4;</code>
       * @param index The index of the element to return.
       * @return The costCardGuidList at the given index.
       */
      public int getCostCardGuidList(int index) {
        return costCardGuidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 4;</code>
       * @param index The index to set the value at.
       * @param value The costCardGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setCostCardGuidList(
          int index, int value) {
        ensureCostCardGuidListIsMutable();
        costCardGuidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 4;</code>
       * @param value The costCardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addCostCardGuidList(int value) {
        ensureCostCardGuidListIsMutable();
        costCardGuidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 4;</code>
       * @param values The costCardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCostCardGuidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCostCardGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, costCardGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostCardGuidList() {
        costCardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList diceIndexList_ = emptyIntList();
      private void ensureDiceIndexListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          diceIndexList_ = mutableCopy(diceIndexList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 dice_index_list = 8;</code>
       * @return A list containing the diceIndexList.
       */
      public java.util.List<java.lang.Integer>
          getDiceIndexListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(diceIndexList_) : diceIndexList_;
      }
      /**
       * <code>repeated uint32 dice_index_list = 8;</code>
       * @return The count of diceIndexList.
       */
      public int getDiceIndexListCount() {
        return diceIndexList_.size();
      }
      /**
       * <code>repeated uint32 dice_index_list = 8;</code>
       * @param index The index of the element to return.
       * @return The diceIndexList at the given index.
       */
      public int getDiceIndexList(int index) {
        return diceIndexList_.getInt(index);
      }
      /**
       * <code>repeated uint32 dice_index_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The diceIndexList to set.
       * @return This builder for chaining.
       */
      public Builder setDiceIndexList(
          int index, int value) {
        ensureDiceIndexListIsMutable();
        diceIndexList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 dice_index_list = 8;</code>
       * @param value The diceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addDiceIndexList(int value) {
        ensureDiceIndexListIsMutable();
        diceIndexList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 dice_index_list = 8;</code>
       * @param values The diceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addAllDiceIndexList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDiceIndexListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, diceIndexList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 dice_index_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearDiceIndexList() {
        diceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:GCGOperationReboot)
    }

    // @@protoc_insertion_point(class_scope:GCGOperationReboot)
    private static final emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot();
    }

    public static emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGOperationReboot>
        PARSER = new com.google.protobuf.AbstractParser<GCGOperationReboot>() {
      @java.lang.Override
      public GCGOperationReboot parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGOperationReboot(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGOperationReboot> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGOperationReboot> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGOperationRebootOuterClass.GCGOperationReboot getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGOperationReboot_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGOperationReboot_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGOperationReboot.proto\"J\n\022GCGOperati" +
      "onReboot\022\033\n\023cost_card_guid_list\030\004 \003(\r\022\027\n" +
      "\017dice_index_list\030\010 \003(\rB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGOperationReboot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGOperationReboot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGOperationReboot_descriptor,
        new java.lang.String[] { "CostCardGuidList", "DiceIndexList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
