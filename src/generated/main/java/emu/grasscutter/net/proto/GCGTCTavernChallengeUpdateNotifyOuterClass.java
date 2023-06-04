// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGTCTavernChallengeUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class GCGTCTavernChallengeUpdateNotifyOuterClass {
  private GCGTCTavernChallengeUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGTCTavernChallengeUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGTCTavernChallengeUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
     * @return Whether the tavernChallenge field is set.
     */
    boolean hasTavernChallenge();
    /**
     * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
     * @return The tavernChallenge.
     */
    emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getTavernChallenge();
    /**
     * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
     */
    emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder getTavernChallengeOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 7976
   * Obf: BPPMNLFJGBJ
   * </pre>
   *
   * Protobuf type {@code GCGTCTavernChallengeUpdateNotify}
   */
  public static final class GCGTCTavernChallengeUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGTCTavernChallengeUpdateNotify)
      GCGTCTavernChallengeUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGTCTavernChallengeUpdateNotify.newBuilder() to construct.
    private GCGTCTavernChallengeUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGTCTavernChallengeUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGTCTavernChallengeUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGTCTavernChallengeUpdateNotify(
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
            case 50: {
              emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder subBuilder = null;
              if (tavernChallenge_ != null) {
                subBuilder = tavernChallenge_.toBuilder();
              }
              tavernChallenge_ = input.readMessage(emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(tavernChallenge_);
                tavernChallenge_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.internal_static_GCGTCTavernChallengeUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.internal_static_GCGTCTavernChallengeUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.class, emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.Builder.class);
    }

    public static final int TAVERN_CHALLENGE_FIELD_NUMBER = 6;
    private emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData tavernChallenge_;
    /**
     * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
     * @return Whether the tavernChallenge field is set.
     */
    @java.lang.Override
    public boolean hasTavernChallenge() {
      return tavernChallenge_ != null;
    }
    /**
     * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
     * @return The tavernChallenge.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getTavernChallenge() {
      return tavernChallenge_ == null ? emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance() : tavernChallenge_;
    }
    /**
     * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder getTavernChallengeOrBuilder() {
      return getTavernChallenge();
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
      if (tavernChallenge_ != null) {
        output.writeMessage(6, getTavernChallenge());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (tavernChallenge_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getTavernChallenge());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify other = (emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify) obj;

      if (hasTavernChallenge() != other.hasTavernChallenge()) return false;
      if (hasTavernChallenge()) {
        if (!getTavernChallenge()
            .equals(other.getTavernChallenge())) return false;
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
      if (hasTavernChallenge()) {
        hash = (37 * hash) + TAVERN_CHALLENGE_FIELD_NUMBER;
        hash = (53 * hash) + getTavernChallenge().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify prototype) {
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
     * CmdId: 7976
     * Obf: BPPMNLFJGBJ
     * </pre>
     *
     * Protobuf type {@code GCGTCTavernChallengeUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGTCTavernChallengeUpdateNotify)
        emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.internal_static_GCGTCTavernChallengeUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.internal_static_GCGTCTavernChallengeUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.class, emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.newBuilder()
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
        if (tavernChallengeBuilder_ == null) {
          tavernChallenge_ = null;
        } else {
          tavernChallenge_ = null;
          tavernChallengeBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.internal_static_GCGTCTavernChallengeUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify build() {
        emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify result = new emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify(this);
        if (tavernChallengeBuilder_ == null) {
          result.tavernChallenge_ = tavernChallenge_;
        } else {
          result.tavernChallenge_ = tavernChallengeBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.getDefaultInstance()) return this;
        if (other.hasTavernChallenge()) {
          mergeTavernChallenge(other.getTavernChallenge());
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
        emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData tavernChallenge_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder> tavernChallengeBuilder_;
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
       * @return Whether the tavernChallenge field is set.
       */
      public boolean hasTavernChallenge() {
        return tavernChallengeBuilder_ != null || tavernChallenge_ != null;
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
       * @return The tavernChallenge.
       */
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getTavernChallenge() {
        if (tavernChallengeBuilder_ == null) {
          return tavernChallenge_ == null ? emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance() : tavernChallenge_;
        } else {
          return tavernChallengeBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
       */
      public Builder setTavernChallenge(emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData value) {
        if (tavernChallengeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          tavernChallenge_ = value;
          onChanged();
        } else {
          tavernChallengeBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
       */
      public Builder setTavernChallenge(
          emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder builderForValue) {
        if (tavernChallengeBuilder_ == null) {
          tavernChallenge_ = builderForValue.build();
          onChanged();
        } else {
          tavernChallengeBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
       */
      public Builder mergeTavernChallenge(emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData value) {
        if (tavernChallengeBuilder_ == null) {
          if (tavernChallenge_ != null) {
            tavernChallenge_ =
              emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.newBuilder(tavernChallenge_).mergeFrom(value).buildPartial();
          } else {
            tavernChallenge_ = value;
          }
          onChanged();
        } else {
          tavernChallengeBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
       */
      public Builder clearTavernChallenge() {
        if (tavernChallengeBuilder_ == null) {
          tavernChallenge_ = null;
          onChanged();
        } else {
          tavernChallenge_ = null;
          tavernChallengeBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
       */
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder getTavernChallengeBuilder() {
        
        onChanged();
        return getTavernChallengeFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
       */
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder getTavernChallengeOrBuilder() {
        if (tavernChallengeBuilder_ != null) {
          return tavernChallengeBuilder_.getMessageOrBuilder();
        } else {
          return tavernChallenge_ == null ?
              emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance() : tavernChallenge_;
        }
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder> 
          getTavernChallengeFieldBuilder() {
        if (tavernChallengeBuilder_ == null) {
          tavernChallengeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder>(
                  getTavernChallenge(),
                  getParentForChildren(),
                  isClean());
          tavernChallenge_ = null;
        }
        return tavernChallengeBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGTCTavernChallengeUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGTCTavernChallengeUpdateNotify)
    private static final emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify();
    }

    public static emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGTCTavernChallengeUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGTCTavernChallengeUpdateNotify>() {
      @java.lang.Override
      public GCGTCTavernChallengeUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGTCTavernChallengeUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGTCTavernChallengeUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGTCTavernChallengeUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGTCTavernChallengeUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGTCTavernChallengeUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&GCGTCTavernChallengeUpdateNotify.proto" +
      "\032\036GCGTCTavernChallengeData.proto\"W\n GCGT" +
      "CTavernChallengeUpdateNotify\0223\n\020tavern_c" +
      "hallenge\030\006 \001(\0132\031.GCGTCTavernChallengeDat" +
      "aB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.getDescriptor(),
        });
    internal_static_GCGTCTavernChallengeUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGTCTavernChallengeUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGTCTavernChallengeUpdateNotify_descriptor,
        new java.lang.String[] { "TavernChallenge", });
    emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
