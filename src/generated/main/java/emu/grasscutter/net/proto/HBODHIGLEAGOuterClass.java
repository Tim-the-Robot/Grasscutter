// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HBODHIGLEAG.proto

package emu.grasscutter.net.proto;

public final class HBODHIGLEAGOuterClass {
  private HBODHIGLEAGOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HBODHIGLEAGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HBODHIGLEAG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool IBKDAKCIGBJ = 6;</code>
     * @return The iBKDAKCIGBJ.
     */
    boolean getIBKDAKCIGBJ();

    /**
     * <code>repeated uint32 card_list = 13;</code>
     * @return A list containing the cardList.
     */
    java.util.List<java.lang.Integer> getCardListList();
    /**
     * <code>repeated uint32 card_list = 13;</code>
     * @return The count of cardList.
     */
    int getCardListCount();
    /**
     * <code>repeated uint32 card_list = 13;</code>
     * @param index The index of the element to return.
     * @return The cardList at the given index.
     */
    int getCardList(int index);

    /**
     * <code>repeated uint32 LAMMFAEALFK = 4;</code>
     * @return A list containing the lAMMFAEALFK.
     */
    java.util.List<java.lang.Integer> getLAMMFAEALFKList();
    /**
     * <code>repeated uint32 LAMMFAEALFK = 4;</code>
     * @return The count of lAMMFAEALFK.
     */
    int getLAMMFAEALFKCount();
    /**
     * <code>repeated uint32 LAMMFAEALFK = 4;</code>
     * @param index The index of the element to return.
     * @return The lAMMFAEALFK at the given index.
     */
    int getLAMMFAEALFK(int index);

    /**
     * <code>string name = 15;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 15;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code HBODHIGLEAG}
   */
  public static final class HBODHIGLEAG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HBODHIGLEAG)
      HBODHIGLEAGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HBODHIGLEAG.newBuilder() to construct.
    private HBODHIGLEAG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HBODHIGLEAG() {
      cardList_ = emptyIntList();
      lAMMFAEALFK_ = emptyIntList();
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HBODHIGLEAG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HBODHIGLEAG(
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
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                lAMMFAEALFK_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              lAMMFAEALFK_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                lAMMFAEALFK_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                lAMMFAEALFK_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {

              iBKDAKCIGBJ_ = input.readBool();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                cardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              cardList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                cardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                cardList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 122: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          lAMMFAEALFK_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          cardList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.internal_static_HBODHIGLEAG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.internal_static_HBODHIGLEAG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG.class, emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG.Builder.class);
    }

    public static final int IBKDAKCIGBJ_FIELD_NUMBER = 6;
    private boolean iBKDAKCIGBJ_;
    /**
     * <code>bool IBKDAKCIGBJ = 6;</code>
     * @return The iBKDAKCIGBJ.
     */
    @java.lang.Override
    public boolean getIBKDAKCIGBJ() {
      return iBKDAKCIGBJ_;
    }

    public static final int CARD_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList cardList_;
    /**
     * <code>repeated uint32 card_list = 13;</code>
     * @return A list containing the cardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCardListList() {
      return cardList_;
    }
    /**
     * <code>repeated uint32 card_list = 13;</code>
     * @return The count of cardList.
     */
    public int getCardListCount() {
      return cardList_.size();
    }
    /**
     * <code>repeated uint32 card_list = 13;</code>
     * @param index The index of the element to return.
     * @return The cardList at the given index.
     */
    public int getCardList(int index) {
      return cardList_.getInt(index);
    }
    private int cardListMemoizedSerializedSize = -1;

    public static final int LAMMFAEALFK_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList lAMMFAEALFK_;
    /**
     * <code>repeated uint32 LAMMFAEALFK = 4;</code>
     * @return A list containing the lAMMFAEALFK.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getLAMMFAEALFKList() {
      return lAMMFAEALFK_;
    }
    /**
     * <code>repeated uint32 LAMMFAEALFK = 4;</code>
     * @return The count of lAMMFAEALFK.
     */
    public int getLAMMFAEALFKCount() {
      return lAMMFAEALFK_.size();
    }
    /**
     * <code>repeated uint32 LAMMFAEALFK = 4;</code>
     * @param index The index of the element to return.
     * @return The lAMMFAEALFK at the given index.
     */
    public int getLAMMFAEALFK(int index) {
      return lAMMFAEALFK_.getInt(index);
    }
    private int lAMMFAEALFKMemoizedSerializedSize = -1;

    public static final int NAME_FIELD_NUMBER = 15;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 15;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 15;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (getLAMMFAEALFKList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(lAMMFAEALFKMemoizedSerializedSize);
      }
      for (int i = 0; i < lAMMFAEALFK_.size(); i++) {
        output.writeUInt32NoTag(lAMMFAEALFK_.getInt(i));
      }
      if (iBKDAKCIGBJ_ != false) {
        output.writeBool(6, iBKDAKCIGBJ_);
      }
      if (getCardListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(cardListMemoizedSerializedSize);
      }
      for (int i = 0; i < cardList_.size(); i++) {
        output.writeUInt32NoTag(cardList_.getInt(i));
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, name_);
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
        for (int i = 0; i < lAMMFAEALFK_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(lAMMFAEALFK_.getInt(i));
        }
        size += dataSize;
        if (!getLAMMFAEALFKList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        lAMMFAEALFKMemoizedSerializedSize = dataSize;
      }
      if (iBKDAKCIGBJ_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, iBKDAKCIGBJ_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < cardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cardList_.getInt(i));
        }
        size += dataSize;
        if (!getCardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cardListMemoizedSerializedSize = dataSize;
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, name_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG other = (emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG) obj;

      if (getIBKDAKCIGBJ()
          != other.getIBKDAKCIGBJ()) return false;
      if (!getCardListList()
          .equals(other.getCardListList())) return false;
      if (!getLAMMFAEALFKList()
          .equals(other.getLAMMFAEALFKList())) return false;
      if (!getName()
          .equals(other.getName())) return false;
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
      hash = (37 * hash) + IBKDAKCIGBJ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIBKDAKCIGBJ());
      if (getCardListCount() > 0) {
        hash = (37 * hash) + CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCardListList().hashCode();
      }
      if (getLAMMFAEALFKCount() > 0) {
        hash = (37 * hash) + LAMMFAEALFK_FIELD_NUMBER;
        hash = (53 * hash) + getLAMMFAEALFKList().hashCode();
      }
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG prototype) {
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
     * Protobuf type {@code HBODHIGLEAG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HBODHIGLEAG)
        emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.internal_static_HBODHIGLEAG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.internal_static_HBODHIGLEAG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG.class, emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG.newBuilder()
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
        iBKDAKCIGBJ_ = false;

        cardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        lAMMFAEALFK_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.internal_static_HBODHIGLEAG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG build() {
        emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG buildPartial() {
        emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG result = new emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG(this);
        int from_bitField0_ = bitField0_;
        result.iBKDAKCIGBJ_ = iBKDAKCIGBJ_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cardList_ = cardList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          lAMMFAEALFK_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.lAMMFAEALFK_ = lAMMFAEALFK_;
        result.name_ = name_;
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
        if (other instanceof emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG) {
          return mergeFrom((emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG other) {
        if (other == emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG.getDefaultInstance()) return this;
        if (other.getIBKDAKCIGBJ() != false) {
          setIBKDAKCIGBJ(other.getIBKDAKCIGBJ());
        }
        if (!other.cardList_.isEmpty()) {
          if (cardList_.isEmpty()) {
            cardList_ = other.cardList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCardListIsMutable();
            cardList_.addAll(other.cardList_);
          }
          onChanged();
        }
        if (!other.lAMMFAEALFK_.isEmpty()) {
          if (lAMMFAEALFK_.isEmpty()) {
            lAMMFAEALFK_ = other.lAMMFAEALFK_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLAMMFAEALFKIsMutable();
            lAMMFAEALFK_.addAll(other.lAMMFAEALFK_);
          }
          onChanged();
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
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
        emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean iBKDAKCIGBJ_ ;
      /**
       * <code>bool IBKDAKCIGBJ = 6;</code>
       * @return The iBKDAKCIGBJ.
       */
      @java.lang.Override
      public boolean getIBKDAKCIGBJ() {
        return iBKDAKCIGBJ_;
      }
      /**
       * <code>bool IBKDAKCIGBJ = 6;</code>
       * @param value The iBKDAKCIGBJ to set.
       * @return This builder for chaining.
       */
      public Builder setIBKDAKCIGBJ(boolean value) {
        
        iBKDAKCIGBJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool IBKDAKCIGBJ = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIBKDAKCIGBJ() {
        
        iBKDAKCIGBJ_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList cardList_ = emptyIntList();
      private void ensureCardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cardList_ = mutableCopy(cardList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 card_list = 13;</code>
       * @return A list containing the cardList.
       */
      public java.util.List<java.lang.Integer>
          getCardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cardList_) : cardList_;
      }
      /**
       * <code>repeated uint32 card_list = 13;</code>
       * @return The count of cardList.
       */
      public int getCardListCount() {
        return cardList_.size();
      }
      /**
       * <code>repeated uint32 card_list = 13;</code>
       * @param index The index of the element to return.
       * @return The cardList at the given index.
       */
      public int getCardList(int index) {
        return cardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 card_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The cardList to set.
       * @return This builder for chaining.
       */
      public Builder setCardList(
          int index, int value) {
        ensureCardListIsMutable();
        cardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_list = 13;</code>
       * @param value The cardList to add.
       * @return This builder for chaining.
       */
      public Builder addCardList(int value) {
        ensureCardListIsMutable();
        cardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_list = 13;</code>
       * @param values The cardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardList() {
        cardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList lAMMFAEALFK_ = emptyIntList();
      private void ensureLAMMFAEALFKIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          lAMMFAEALFK_ = mutableCopy(lAMMFAEALFK_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 LAMMFAEALFK = 4;</code>
       * @return A list containing the lAMMFAEALFK.
       */
      public java.util.List<java.lang.Integer>
          getLAMMFAEALFKList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(lAMMFAEALFK_) : lAMMFAEALFK_;
      }
      /**
       * <code>repeated uint32 LAMMFAEALFK = 4;</code>
       * @return The count of lAMMFAEALFK.
       */
      public int getLAMMFAEALFKCount() {
        return lAMMFAEALFK_.size();
      }
      /**
       * <code>repeated uint32 LAMMFAEALFK = 4;</code>
       * @param index The index of the element to return.
       * @return The lAMMFAEALFK at the given index.
       */
      public int getLAMMFAEALFK(int index) {
        return lAMMFAEALFK_.getInt(index);
      }
      /**
       * <code>repeated uint32 LAMMFAEALFK = 4;</code>
       * @param index The index to set the value at.
       * @param value The lAMMFAEALFK to set.
       * @return This builder for chaining.
       */
      public Builder setLAMMFAEALFK(
          int index, int value) {
        ensureLAMMFAEALFKIsMutable();
        lAMMFAEALFK_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LAMMFAEALFK = 4;</code>
       * @param value The lAMMFAEALFK to add.
       * @return This builder for chaining.
       */
      public Builder addLAMMFAEALFK(int value) {
        ensureLAMMFAEALFKIsMutable();
        lAMMFAEALFK_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LAMMFAEALFK = 4;</code>
       * @param values The lAMMFAEALFK to add.
       * @return This builder for chaining.
       */
      public Builder addAllLAMMFAEALFK(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLAMMFAEALFKIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lAMMFAEALFK_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 LAMMFAEALFK = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLAMMFAEALFK() {
        lAMMFAEALFK_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 15;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 15;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 15;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 15;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
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


      // @@protoc_insertion_point(builder_scope:HBODHIGLEAG)
    }

    // @@protoc_insertion_point(class_scope:HBODHIGLEAG)
    private static final emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG();
    }

    public static emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HBODHIGLEAG>
        PARSER = new com.google.protobuf.AbstractParser<HBODHIGLEAG>() {
      @java.lang.Override
      public HBODHIGLEAG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HBODHIGLEAG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HBODHIGLEAG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HBODHIGLEAG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HBODHIGLEAGOuterClass.HBODHIGLEAG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HBODHIGLEAG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HBODHIGLEAG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HBODHIGLEAG.proto\"X\n\013HBODHIGLEAG\022\023\n\013IB" +
      "KDAKCIGBJ\030\006 \001(\010\022\021\n\tcard_list\030\r \003(\r\022\023\n\013LA" +
      "MMFAEALFK\030\004 \003(\r\022\014\n\004name\030\017 \001(\tB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HBODHIGLEAG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HBODHIGLEAG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HBODHIGLEAG_descriptor,
        new java.lang.String[] { "IBKDAKCIGBJ", "CardList", "LAMMFAEALFK", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
