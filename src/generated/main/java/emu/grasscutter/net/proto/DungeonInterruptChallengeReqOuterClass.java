// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonInterruptChallengeReq.proto

package emu.grasscutter.net.proto;

public final class DungeonInterruptChallengeReqOuterClass {
  private DungeonInterruptChallengeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonInterruptChallengeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonInterruptChallengeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 group_id = 9;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 challenge_id = 7;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 challenge_index = 13;</code>
     * @return The challengeIndex.
     */
    int getChallengeIndex();
  }
  /**
   * <pre>
   * CmdId: 918
   * Obf: EEGGKBINCKG
   * </pre>
   *
   * Protobuf type {@code DungeonInterruptChallengeReq}
   */
  public static final class DungeonInterruptChallengeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonInterruptChallengeReq)
      DungeonInterruptChallengeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonInterruptChallengeReq.newBuilder() to construct.
    private DungeonInterruptChallengeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonInterruptChallengeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonInterruptChallengeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonInterruptChallengeReq(
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
            case 56: {

              challengeId_ = input.readUInt32();
              break;
            }
            case 72: {

              groupId_ = input.readUInt32();
              break;
            }
            case 104: {

              challengeIndex_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.internal_static_DungeonInterruptChallengeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.internal_static_DungeonInterruptChallengeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq.class, emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq.Builder.class);
    }

    public static final int GROUP_ID_FIELD_NUMBER = 9;
    private int groupId_;
    /**
     * <code>uint32 group_id = 9;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 7;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 7;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int CHALLENGE_INDEX_FIELD_NUMBER = 13;
    private int challengeIndex_;
    /**
     * <code>uint32 challenge_index = 13;</code>
     * @return The challengeIndex.
     */
    @java.lang.Override
    public int getChallengeIndex() {
      return challengeIndex_;
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
      if (challengeId_ != 0) {
        output.writeUInt32(7, challengeId_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(9, groupId_);
      }
      if (challengeIndex_ != 0) {
        output.writeUInt32(13, challengeIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, challengeId_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, groupId_);
      }
      if (challengeIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, challengeIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq other = (emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq) obj;

      if (getGroupId()
          != other.getGroupId()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getChallengeIndex()
          != other.getChallengeIndex()) return false;
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
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + CHALLENGE_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq prototype) {
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
     * CmdId: 918
     * Obf: EEGGKBINCKG
     * </pre>
     *
     * Protobuf type {@code DungeonInterruptChallengeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonInterruptChallengeReq)
        emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.internal_static_DungeonInterruptChallengeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.internal_static_DungeonInterruptChallengeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq.class, emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq.newBuilder()
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
        groupId_ = 0;

        challengeId_ = 0;

        challengeIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.internal_static_DungeonInterruptChallengeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq build() {
        emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq buildPartial() {
        emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq result = new emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq(this);
        result.groupId_ = groupId_;
        result.challengeId_ = challengeId_;
        result.challengeIndex_ = challengeIndex_;
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
        if (other instanceof emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq other) {
        if (other == emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq.getDefaultInstance()) return this;
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getChallengeIndex() != 0) {
          setChallengeIndex(other.getChallengeIndex());
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
        emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 9;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 9;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 7;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 7;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int challengeIndex_ ;
      /**
       * <code>uint32 challenge_index = 13;</code>
       * @return The challengeIndex.
       */
      @java.lang.Override
      public int getChallengeIndex() {
        return challengeIndex_;
      }
      /**
       * <code>uint32 challenge_index = 13;</code>
       * @param value The challengeIndex to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeIndex(int value) {
        
        challengeIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_index = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeIndex() {
        
        challengeIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonInterruptChallengeReq)
    }

    // @@protoc_insertion_point(class_scope:DungeonInterruptChallengeReq)
    private static final emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq();
    }

    public static emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonInterruptChallengeReq>
        PARSER = new com.google.protobuf.AbstractParser<DungeonInterruptChallengeReq>() {
      @java.lang.Override
      public DungeonInterruptChallengeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonInterruptChallengeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonInterruptChallengeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonInterruptChallengeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonInterruptChallengeReqOuterClass.DungeonInterruptChallengeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonInterruptChallengeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonInterruptChallengeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"DungeonInterruptChallengeReq.proto\"_\n\034" +
      "DungeonInterruptChallengeReq\022\020\n\010group_id" +
      "\030\t \001(\r\022\024\n\014challenge_id\030\007 \001(\r\022\027\n\017challeng" +
      "e_index\030\r \001(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonInterruptChallengeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonInterruptChallengeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonInterruptChallengeReq_descriptor,
        new java.lang.String[] { "GroupId", "ChallengeId", "ChallengeIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
