// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MailItem.proto

package emu.grasscutter.net.proto;

public final class MailItemOuterClass {
  private MailItemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MailItemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MailItem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.EquipParam equip_param = 1;</code>
     * @return Whether the equipParam field is set.
     */
    boolean hasEquipParam();
    /**
     * <code>.EquipParam equip_param = 1;</code>
     * @return The equipParam.
     */
    emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam getEquipParam();
    /**
     * <code>.EquipParam equip_param = 1;</code>
     */
    emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder getEquipParamOrBuilder();

    /**
     * <code>.MaterialDeleteInfo delete_info = 2;</code>
     * @return Whether the deleteInfo field is set.
     */
    boolean hasDeleteInfo();
    /**
     * <code>.MaterialDeleteInfo delete_info = 2;</code>
     * @return The deleteInfo.
     */
    emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo getDeleteInfo();
    /**
     * <code>.MaterialDeleteInfo delete_info = 2;</code>
     */
    emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder getDeleteInfoOrBuilder();
  }
  /**
   * <pre>
   * Obf: MBAJGGFCGGC
   * </pre>
   *
   * Protobuf type {@code MailItem}
   */
  public static final class MailItem extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MailItem)
      MailItemOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MailItem.newBuilder() to construct.
    private MailItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MailItem() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MailItem();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MailItem(
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
            case 10: {
              emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder subBuilder = null;
              if (equipParam_ != null) {
                subBuilder = equipParam_.toBuilder();
              }
              equipParam_ = input.readMessage(emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(equipParam_);
                equipParam_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder subBuilder = null;
              if (deleteInfo_ != null) {
                subBuilder = deleteInfo_.toBuilder();
              }
              deleteInfo_ = input.readMessage(emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(deleteInfo_);
                deleteInfo_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.MailItemOuterClass.internal_static_MailItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MailItemOuterClass.internal_static_MailItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MailItemOuterClass.MailItem.class, emu.grasscutter.net.proto.MailItemOuterClass.MailItem.Builder.class);
    }

    public static final int EQUIP_PARAM_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam equipParam_;
    /**
     * <code>.EquipParam equip_param = 1;</code>
     * @return Whether the equipParam field is set.
     */
    @java.lang.Override
    public boolean hasEquipParam() {
      return equipParam_ != null;
    }
    /**
     * <code>.EquipParam equip_param = 1;</code>
     * @return The equipParam.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam getEquipParam() {
      return equipParam_ == null ? emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.getDefaultInstance() : equipParam_;
    }
    /**
     * <code>.EquipParam equip_param = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder getEquipParamOrBuilder() {
      return getEquipParam();
    }

    public static final int DELETE_INFO_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo deleteInfo_;
    /**
     * <code>.MaterialDeleteInfo delete_info = 2;</code>
     * @return Whether the deleteInfo field is set.
     */
    @java.lang.Override
    public boolean hasDeleteInfo() {
      return deleteInfo_ != null;
    }
    /**
     * <code>.MaterialDeleteInfo delete_info = 2;</code>
     * @return The deleteInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo getDeleteInfo() {
      return deleteInfo_ == null ? emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.getDefaultInstance() : deleteInfo_;
    }
    /**
     * <code>.MaterialDeleteInfo delete_info = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder getDeleteInfoOrBuilder() {
      return getDeleteInfo();
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
      if (equipParam_ != null) {
        output.writeMessage(1, getEquipParam());
      }
      if (deleteInfo_ != null) {
        output.writeMessage(2, getDeleteInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (equipParam_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getEquipParam());
      }
      if (deleteInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getDeleteInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.MailItemOuterClass.MailItem)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MailItemOuterClass.MailItem other = (emu.grasscutter.net.proto.MailItemOuterClass.MailItem) obj;

      if (hasEquipParam() != other.hasEquipParam()) return false;
      if (hasEquipParam()) {
        if (!getEquipParam()
            .equals(other.getEquipParam())) return false;
      }
      if (hasDeleteInfo() != other.hasDeleteInfo()) return false;
      if (hasDeleteInfo()) {
        if (!getDeleteInfo()
            .equals(other.getDeleteInfo())) return false;
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
      if (hasEquipParam()) {
        hash = (37 * hash) + EQUIP_PARAM_FIELD_NUMBER;
        hash = (53 * hash) + getEquipParam().hashCode();
      }
      if (hasDeleteInfo()) {
        hash = (37 * hash) + DELETE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getDeleteInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MailItemOuterClass.MailItem prototype) {
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
     * Obf: MBAJGGFCGGC
     * </pre>
     *
     * Protobuf type {@code MailItem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MailItem)
        emu.grasscutter.net.proto.MailItemOuterClass.MailItemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MailItemOuterClass.internal_static_MailItem_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MailItemOuterClass.internal_static_MailItem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MailItemOuterClass.MailItem.class, emu.grasscutter.net.proto.MailItemOuterClass.MailItem.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MailItemOuterClass.MailItem.newBuilder()
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
        if (equipParamBuilder_ == null) {
          equipParam_ = null;
        } else {
          equipParam_ = null;
          equipParamBuilder_ = null;
        }
        if (deleteInfoBuilder_ == null) {
          deleteInfo_ = null;
        } else {
          deleteInfo_ = null;
          deleteInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MailItemOuterClass.internal_static_MailItem_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MailItemOuterClass.MailItem getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MailItemOuterClass.MailItem.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MailItemOuterClass.MailItem build() {
        emu.grasscutter.net.proto.MailItemOuterClass.MailItem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MailItemOuterClass.MailItem buildPartial() {
        emu.grasscutter.net.proto.MailItemOuterClass.MailItem result = new emu.grasscutter.net.proto.MailItemOuterClass.MailItem(this);
        if (equipParamBuilder_ == null) {
          result.equipParam_ = equipParam_;
        } else {
          result.equipParam_ = equipParamBuilder_.build();
        }
        if (deleteInfoBuilder_ == null) {
          result.deleteInfo_ = deleteInfo_;
        } else {
          result.deleteInfo_ = deleteInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.MailItemOuterClass.MailItem) {
          return mergeFrom((emu.grasscutter.net.proto.MailItemOuterClass.MailItem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MailItemOuterClass.MailItem other) {
        if (other == emu.grasscutter.net.proto.MailItemOuterClass.MailItem.getDefaultInstance()) return this;
        if (other.hasEquipParam()) {
          mergeEquipParam(other.getEquipParam());
        }
        if (other.hasDeleteInfo()) {
          mergeDeleteInfo(other.getDeleteInfo());
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
        emu.grasscutter.net.proto.MailItemOuterClass.MailItem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MailItemOuterClass.MailItem) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam equipParam_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder> equipParamBuilder_;
      /**
       * <code>.EquipParam equip_param = 1;</code>
       * @return Whether the equipParam field is set.
       */
      public boolean hasEquipParam() {
        return equipParamBuilder_ != null || equipParam_ != null;
      }
      /**
       * <code>.EquipParam equip_param = 1;</code>
       * @return The equipParam.
       */
      public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam getEquipParam() {
        if (equipParamBuilder_ == null) {
          return equipParam_ == null ? emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.getDefaultInstance() : equipParam_;
        } else {
          return equipParamBuilder_.getMessage();
        }
      }
      /**
       * <code>.EquipParam equip_param = 1;</code>
       */
      public Builder setEquipParam(emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam value) {
        if (equipParamBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          equipParam_ = value;
          onChanged();
        } else {
          equipParamBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EquipParam equip_param = 1;</code>
       */
      public Builder setEquipParam(
          emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder builderForValue) {
        if (equipParamBuilder_ == null) {
          equipParam_ = builderForValue.build();
          onChanged();
        } else {
          equipParamBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EquipParam equip_param = 1;</code>
       */
      public Builder mergeEquipParam(emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam value) {
        if (equipParamBuilder_ == null) {
          if (equipParam_ != null) {
            equipParam_ =
              emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.newBuilder(equipParam_).mergeFrom(value).buildPartial();
          } else {
            equipParam_ = value;
          }
          onChanged();
        } else {
          equipParamBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EquipParam equip_param = 1;</code>
       */
      public Builder clearEquipParam() {
        if (equipParamBuilder_ == null) {
          equipParam_ = null;
          onChanged();
        } else {
          equipParam_ = null;
          equipParamBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EquipParam equip_param = 1;</code>
       */
      public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder getEquipParamBuilder() {
        
        onChanged();
        return getEquipParamFieldBuilder().getBuilder();
      }
      /**
       * <code>.EquipParam equip_param = 1;</code>
       */
      public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder getEquipParamOrBuilder() {
        if (equipParamBuilder_ != null) {
          return equipParamBuilder_.getMessageOrBuilder();
        } else {
          return equipParam_ == null ?
              emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.getDefaultInstance() : equipParam_;
        }
      }
      /**
       * <code>.EquipParam equip_param = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder> 
          getEquipParamFieldBuilder() {
        if (equipParamBuilder_ == null) {
          equipParamBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder>(
                  getEquipParam(),
                  getParentForChildren(),
                  isClean());
          equipParam_ = null;
        }
        return equipParamBuilder_;
      }

      private emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo deleteInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo, emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder, emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder> deleteInfoBuilder_;
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       * @return Whether the deleteInfo field is set.
       */
      public boolean hasDeleteInfo() {
        return deleteInfoBuilder_ != null || deleteInfo_ != null;
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       * @return The deleteInfo.
       */
      public emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo getDeleteInfo() {
        if (deleteInfoBuilder_ == null) {
          return deleteInfo_ == null ? emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.getDefaultInstance() : deleteInfo_;
        } else {
          return deleteInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      public Builder setDeleteInfo(emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo value) {
        if (deleteInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          deleteInfo_ = value;
          onChanged();
        } else {
          deleteInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      public Builder setDeleteInfo(
          emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder builderForValue) {
        if (deleteInfoBuilder_ == null) {
          deleteInfo_ = builderForValue.build();
          onChanged();
        } else {
          deleteInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      public Builder mergeDeleteInfo(emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo value) {
        if (deleteInfoBuilder_ == null) {
          if (deleteInfo_ != null) {
            deleteInfo_ =
              emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.newBuilder(deleteInfo_).mergeFrom(value).buildPartial();
          } else {
            deleteInfo_ = value;
          }
          onChanged();
        } else {
          deleteInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      public Builder clearDeleteInfo() {
        if (deleteInfoBuilder_ == null) {
          deleteInfo_ = null;
          onChanged();
        } else {
          deleteInfo_ = null;
          deleteInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      public emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder getDeleteInfoBuilder() {
        
        onChanged();
        return getDeleteInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      public emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder getDeleteInfoOrBuilder() {
        if (deleteInfoBuilder_ != null) {
          return deleteInfoBuilder_.getMessageOrBuilder();
        } else {
          return deleteInfo_ == null ?
              emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.getDefaultInstance() : deleteInfo_;
        }
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo, emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder, emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder> 
          getDeleteInfoFieldBuilder() {
        if (deleteInfoBuilder_ == null) {
          deleteInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo, emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder, emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder>(
                  getDeleteInfo(),
                  getParentForChildren(),
                  isClean());
          deleteInfo_ = null;
        }
        return deleteInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MailItem)
    }

    // @@protoc_insertion_point(class_scope:MailItem)
    private static final emu.grasscutter.net.proto.MailItemOuterClass.MailItem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MailItemOuterClass.MailItem();
    }

    public static emu.grasscutter.net.proto.MailItemOuterClass.MailItem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MailItem>
        PARSER = new com.google.protobuf.AbstractParser<MailItem>() {
      @java.lang.Override
      public MailItem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MailItem(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MailItem> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MailItem> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MailItemOuterClass.MailItem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MailItem_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MailItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016MailItem.proto\032\020EquipParam.proto\032\030Mate" +
      "rialDeleteInfo.proto\"V\n\010MailItem\022 \n\013equi" +
      "p_param\030\001 \001(\0132\013.EquipParam\022(\n\013delete_inf" +
      "o\030\002 \001(\0132\023.MaterialDeleteInfoB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EquipParamOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.getDescriptor(),
        });
    internal_static_MailItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MailItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MailItem_descriptor,
        new java.lang.String[] { "EquipParam", "DeleteInfo", });
    emu.grasscutter.net.proto.EquipParamOuterClass.getDescriptor();
    emu.grasscutter.net.proto.MaterialDeleteInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
