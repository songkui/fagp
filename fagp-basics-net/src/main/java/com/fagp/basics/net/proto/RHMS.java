
package com.fagp.basics.net.proto;

public final class RHMS {
  private RHMS() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code com.fagp.MsgType}
   */
  public enum MsgType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>M_LoginRequest = 10001;</code>
     */
    M_LoginRequest(10001),
    /**
     * <code>M_LoginResponse = 10002;</code>
     */
    M_LoginResponse(10002),
    /**
     * <code>M_LogoutRequest = 10003;</code>
     */
    M_LogoutRequest(10003),
    /**
     * <code>M_LogoutResponse = 10004;</code>
     */
    M_LogoutResponse(10004),
    /**
     * <code>M_KeepaliveRequest = 10005;</code>
     */
    M_KeepaliveRequest(10005),
    /**
     * <code>M_KeepaliveResponse = 10006;</code>
     */
    M_KeepaliveResponse(10006),
    /**
     * <code>M_GetFriendsRequest = 10007;</code>
     */
    M_GetFriendsRequest(10007),
    /**
     * <code>M_GetFriendsResponse = 10008;</code>
     */
    M_GetFriendsResponse(10008),
    /**
     * <code>M_SendMessageRequest = 10009;</code>
     */
    M_SendMessageRequest(10009),
    /**
     * <code>M_SendMessageResponse = 10010;</code>
     */
    M_SendMessageResponse(10010),
    /**
     * <code>M_Friend_Notification = 20001;</code>
     */
    M_Friend_Notification(20001),
    /**
     * <code>M_Message_Notification = 20002;</code>
     */
    M_Message_Notification(20002),
    /**
     * <code>M_Welcome_Notification = 20003;</code>
     */
    M_Welcome_Notification(20003),
    ;

    /**
     * <code>M_LoginRequest = 10001;</code>
     */
    public static final int M_LoginRequest_VALUE = 10001;
    /**
     * <code>M_LoginResponse = 10002;</code>
     */
    public static final int M_LoginResponse_VALUE = 10002;
    /**
     * <code>M_LogoutRequest = 10003;</code>
     */
    public static final int M_LogoutRequest_VALUE = 10003;
    /**
     * <code>M_LogoutResponse = 10004;</code>
     */
    public static final int M_LogoutResponse_VALUE = 10004;
    /**
     * <code>M_KeepaliveRequest = 10005;</code>
     */
    public static final int M_KeepaliveRequest_VALUE = 10005;
    /**
     * <code>M_KeepaliveResponse = 10006;</code>
     */
    public static final int M_KeepaliveResponse_VALUE = 10006;
    /**
     * <code>M_GetFriendsRequest = 10007;</code>
     */
    public static final int M_GetFriendsRequest_VALUE = 10007;
    /**
     * <code>M_GetFriendsResponse = 10008;</code>
     */
    public static final int M_GetFriendsResponse_VALUE = 10008;
    /**
     * <code>M_SendMessageRequest = 10009;</code>
     */
    public static final int M_SendMessageRequest_VALUE = 10009;
    /**
     * <code>M_SendMessageResponse = 10010;</code>
     */
    public static final int M_SendMessageResponse_VALUE = 10010;
    /**
     * <code>M_Friend_Notification = 20001;</code>
     */
    public static final int M_Friend_Notification_VALUE = 20001;
    /**
     * <code>M_Message_Notification = 20002;</code>
     */
    public static final int M_Message_Notification_VALUE = 20002;
    /**
     * <code>M_Welcome_Notification = 20003;</code>
     */
    public static final int M_Welcome_Notification_VALUE = 20003;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static MsgType valueOf(int value) {
      return forNumber(value);
    }

    public static MsgType forNumber(int value) {
      switch (value) {
        case 10001: return M_LoginRequest;
        case 10002: return M_LoginResponse;
        case 10003: return M_LogoutRequest;
        case 10004: return M_LogoutResponse;
        case 10005: return M_KeepaliveRequest;
        case 10006: return M_KeepaliveResponse;
        case 10007: return M_GetFriendsRequest;
        case 10008: return M_GetFriendsResponse;
        case 10009: return M_SendMessageRequest;
        case 10010: return M_SendMessageResponse;
        case 20001: return M_Friend_Notification;
        case 20002: return M_Message_Notification;
        case 20003: return M_Welcome_Notification;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MsgType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MsgType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MsgType>() {
            public MsgType findValueByNumber(int number) {
              return MsgType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return RHMS.getDescriptor().getEnumTypes().get(0);
    }

    private static final MsgType[] VALUES = values();

    public static MsgType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MsgType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.fagp.MsgType)
  }

  public interface HeaderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.fagp.Header)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bool success = 1;</code>
     */
    boolean hasSuccess();
    /**
     * <code>required bool success = 1;</code>
     */
    boolean getSuccess();

    /**
     * <code>optional int32 code = 2;</code>
     */
    boolean hasCode();
    /**
     * <code>optional int32 code = 2;</code>
     */
    int getCode();

    /**
     * <code>optional string message = 3;</code>
     */
    boolean hasMessage();
    /**
     * <code>optional string message = 3;</code>
     */
    String getMessage();
    /**
     * <code>optional string message = 3;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code com.fagp.Header}
   */
  public  static final class Header extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.fagp.Header)
      HeaderOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Header.newBuilder() to construct.
    private Header(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Header() {
      message_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Header();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Header(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {
              bitField0_ |= 0x00000001;
              success_ = input.readBool();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              code_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              message_ = bs;
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
      return RHMS.internal_static_com_fagp_Header_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RHMS.internal_static_com_fagp_Header_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Header.class, Builder.class);
    }

    private int bitField0_;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private boolean success_;
    /**
     * <code>required bool success = 1;</code>
     */
    public boolean hasSuccess() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required bool success = 1;</code>
     */
    public boolean getSuccess() {
      return success_;
    }

    public static final int CODE_FIELD_NUMBER = 2;
    private int code_;
    /**
     * <code>optional int32 code = 2;</code>
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 code = 2;</code>
     */
    public int getCode() {
      return code_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 3;
    private volatile Object message_;
    /**
     * <code>optional string message = 3;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string message = 3;</code>
     */
    public String getMessage() {
      Object ref = message_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string message = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSuccess()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeBool(1, success_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(2, code_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, success_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, code_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Header)) {
        return super.equals(obj);
      }
      Header other = (Header) obj;

      if (hasSuccess() != other.hasSuccess()) return false;
      if (hasSuccess()) {
        if (getSuccess()
            != other.getSuccess()) return false;
      }
      if (hasCode() != other.hasCode()) return false;
      if (hasCode()) {
        if (getCode()
            != other.getCode()) return false;
      }
      if (hasMessage() != other.hasMessage()) return false;
      if (hasMessage()) {
        if (!getMessage()
            .equals(other.getMessage())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSuccess()) {
        hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getSuccess());
      }
      if (hasCode()) {
        hash = (37 * hash) + CODE_FIELD_NUMBER;
        hash = (53 * hash) + getCode();
      }
      if (hasMessage()) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Header parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Header parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Header parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Header parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Header parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Header parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Header parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Header parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Header parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Header parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Header parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Header parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Header prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.fagp.Header}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.fagp.Header)
        HeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RHMS.internal_static_com_fagp_Header_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RHMS.internal_static_com_fagp_Header_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Header.class, Builder.class);
      }

      // Construct using com.fagp.basics.net.proto.RHMS.Header.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        success_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RHMS.internal_static_com_fagp_Header_descriptor;
      }

      @Override
      public Header getDefaultInstanceForType() {
        return Header.getDefaultInstance();
      }

      @Override
      public Header build() {
        Header result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Header buildPartial() {
        Header result = new Header(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.success_ = success_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.code_ = code_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Header) {
          return mergeFrom((Header)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Header other) {
        if (other == Header.getDefaultInstance()) return this;
        if (other.hasSuccess()) {
          setSuccess(other.getSuccess());
        }
        if (other.hasCode()) {
          setCode(other.getCode());
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000004;
          message_ = other.message_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasSuccess()) {
          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Header parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Header) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean success_ ;
      /**
       * <code>required bool success = 1;</code>
       */
      public boolean hasSuccess() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required bool success = 1;</code>
       */
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <code>required bool success = 1;</code>
       */
      public Builder setSuccess(boolean value) {
        bitField0_ |= 0x00000001;
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool success = 1;</code>
       */
      public Builder clearSuccess() {
        bitField0_ = (bitField0_ & ~0x00000001);
        success_ = false;
        onChanged();
        return this;
      }

      private int code_ ;
      /**
       * <code>optional int32 code = 2;</code>
       */
      public boolean hasCode() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 code = 2;</code>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>optional int32 code = 2;</code>
       */
      public Builder setCode(int value) {
        bitField0_ |= 0x00000002;
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 code = 2;</code>
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        code_ = 0;
        onChanged();
        return this;
      }

      private Object message_ = "";
      /**
       * <code>optional string message = 3;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public String getMessage() {
        Object ref = message_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessage(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000004);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.fagp.Header)
    }

    // @@protoc_insertion_point(class_scope:com.fagp.Header)
    private static final Header DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Header();
    }

    public static Header getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<Header>
        PARSER = new com.google.protobuf.AbstractParser<Header>() {
      @Override
      public Header parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Header(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Header> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Header> getParserForType() {
      return PARSER;
    }

    @Override
    public Header getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LoginRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.fagp.LoginRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string account = 1;</code>
     */
    boolean hasAccount();
    /**
     * <code>required string account = 1;</code>
     */
    String getAccount();
    /**
     * <code>required string account = 1;</code>
     */
    com.google.protobuf.ByteString
        getAccountBytes();

    /**
     * <code>optional string passwd = 2;</code>
     */
    boolean hasPasswd();
    /**
     * <code>optional string passwd = 2;</code>
     */
    String getPasswd();
    /**
     * <code>optional string passwd = 2;</code>
     */
    com.google.protobuf.ByteString
        getPasswdBytes();
  }
  /**
   * Protobuf type {@code com.fagp.LoginRequest}
   */
  public  static final class LoginRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.fagp.LoginRequest)
      LoginRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LoginRequest.newBuilder() to construct.
    private LoginRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LoginRequest() {
      account_ = "";
      passwd_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new LoginRequest();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LoginRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              account_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              passwd_ = bs;
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
      return RHMS.internal_static_com_fagp_LoginRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RHMS.internal_static_com_fagp_LoginRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LoginRequest.class, Builder.class);
    }

    private int bitField0_;
    public static final int ACCOUNT_FIELD_NUMBER = 1;
    private volatile Object account_;
    /**
     * <code>required string account = 1;</code>
     */
    public boolean hasAccount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string account = 1;</code>
     */
    public String getAccount() {
      Object ref = account_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          account_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string account = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAccountBytes() {
      Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PASSWD_FIELD_NUMBER = 2;
    private volatile Object passwd_;
    /**
     * <code>optional string passwd = 2;</code>
     */
    public boolean hasPasswd() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string passwd = 2;</code>
     */
    public String getPasswd() {
      Object ref = passwd_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          passwd_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string passwd = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPasswdBytes() {
      Object ref = passwd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        passwd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasAccount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, account_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, passwd_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, account_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, passwd_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof LoginRequest)) {
        return super.equals(obj);
      }
      LoginRequest other = (LoginRequest) obj;

      if (hasAccount() != other.hasAccount()) return false;
      if (hasAccount()) {
        if (!getAccount()
            .equals(other.getAccount())) return false;
      }
      if (hasPasswd() != other.hasPasswd()) return false;
      if (hasPasswd()) {
        if (!getPasswd()
            .equals(other.getPasswd())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAccount()) {
        hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getAccount().hashCode();
      }
      if (hasPasswd()) {
        hash = (37 * hash) + PASSWD_FIELD_NUMBER;
        hash = (53 * hash) + getPasswd().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static LoginRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LoginRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LoginRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LoginRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LoginRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LoginRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LoginRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LoginRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static LoginRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static LoginRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static LoginRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LoginRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(LoginRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.fagp.LoginRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.fagp.LoginRequest)
        LoginRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RHMS.internal_static_com_fagp_LoginRequest_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RHMS.internal_static_com_fagp_LoginRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                LoginRequest.class, Builder.class);
      }

      // Construct using com.fagp.basics.net.proto.RHMS.LoginRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        account_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        passwd_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RHMS.internal_static_com_fagp_LoginRequest_descriptor;
      }

      @Override
      public LoginRequest getDefaultInstanceForType() {
        return LoginRequest.getDefaultInstance();
      }

      @Override
      public LoginRequest build() {
        LoginRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public LoginRequest buildPartial() {
        LoginRequest result = new LoginRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.account_ = account_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.passwd_ = passwd_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof LoginRequest) {
          return mergeFrom((LoginRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(LoginRequest other) {
        if (other == LoginRequest.getDefaultInstance()) return this;
        if (other.hasAccount()) {
          bitField0_ |= 0x00000001;
          account_ = other.account_;
          onChanged();
        }
        if (other.hasPasswd()) {
          bitField0_ |= 0x00000002;
          passwd_ = other.passwd_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasAccount()) {
          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        LoginRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (LoginRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object account_ = "";
      /**
       * <code>required string account = 1;</code>
       */
      public boolean hasAccount() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string account = 1;</code>
       */
      public String getAccount() {
        Object ref = account_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            account_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string account = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAccountBytes() {
        Object ref = account_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          account_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string account = 1;</code>
       */
      public Builder setAccount(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        account_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string account = 1;</code>
       */
      public Builder clearAccount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        account_ = getDefaultInstance().getAccount();
        onChanged();
        return this;
      }
      /**
       * <code>required string account = 1;</code>
       */
      public Builder setAccountBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        account_ = value;
        onChanged();
        return this;
      }

      private Object passwd_ = "";
      /**
       * <code>optional string passwd = 2;</code>
       */
      public boolean hasPasswd() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string passwd = 2;</code>
       */
      public String getPasswd() {
        Object ref = passwd_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            passwd_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string passwd = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPasswdBytes() {
        Object ref = passwd_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          passwd_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string passwd = 2;</code>
       */
      public Builder setPasswd(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        passwd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string passwd = 2;</code>
       */
      public Builder clearPasswd() {
        bitField0_ = (bitField0_ & ~0x00000002);
        passwd_ = getDefaultInstance().getPasswd();
        onChanged();
        return this;
      }
      /**
       * <code>optional string passwd = 2;</code>
       */
      public Builder setPasswdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        passwd_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.fagp.LoginRequest)
    }

    // @@protoc_insertion_point(class_scope:com.fagp.LoginRequest)
    private static final LoginRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LoginRequest();
    }

    public static LoginRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<LoginRequest>
        PARSER = new com.google.protobuf.AbstractParser<LoginRequest>() {
      @Override
      public LoginRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LoginRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LoginRequest> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<LoginRequest> getParserForType() {
      return PARSER;
    }

    @Override
    public LoginRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LoginResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.fagp.LoginResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .com.fagp.Header header = 1;</code>
     */
    boolean hasHeader();
    /**
     * <code>optional .com.fagp.Header header = 1;</code>
     */
    Header getHeader();
    /**
     * <code>optional .com.fagp.Header header = 1;</code>
     */
    HeaderOrBuilder getHeaderOrBuilder();

    /**
     * <code>optional string account = 2;</code>
     */
    boolean hasAccount();
    /**
     * <code>optional string account = 2;</code>
     */
    String getAccount();
    /**
     * <code>optional string account = 2;</code>
     */
    com.google.protobuf.ByteString
        getAccountBytes();

    /**
     * <code>optional int32 age = 3;</code>
     */
    boolean hasAge();
    /**
     * <code>optional int32 age = 3;</code>
     */
    int getAge();

    /**
     * <code>optional string uid = 4;</code>
     */
    boolean hasUid();
    /**
     * <code>optional string uid = 4;</code>
     */
    String getUid();
    /**
     * <code>optional string uid = 4;</code>
     */
    com.google.protobuf.ByteString
        getUidBytes();
  }
  /**
   * Protobuf type {@code com.fagp.LoginResponse}
   */
  public  static final class LoginResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.fagp.LoginResponse)
      LoginResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LoginResponse.newBuilder() to construct.
    private LoginResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LoginResponse() {
      account_ = "";
      uid_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new LoginResponse();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LoginResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
              Header.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(Header.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              account_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              age_ = input.readInt32();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              uid_ = bs;
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
      return RHMS.internal_static_com_fagp_LoginResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RHMS.internal_static_com_fagp_LoginResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LoginResponse.class, Builder.class);
    }

    private int bitField0_;
    public static final int HEADER_FIELD_NUMBER = 1;
    private Header header_;
    /**
     * <code>optional .com.fagp.Header header = 1;</code>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .com.fagp.Header header = 1;</code>
     */
    public Header getHeader() {
      return header_ == null ? Header.getDefaultInstance() : header_;
    }
    /**
     * <code>optional .com.fagp.Header header = 1;</code>
     */
    public HeaderOrBuilder getHeaderOrBuilder() {
      return header_ == null ? Header.getDefaultInstance() : header_;
    }

    public static final int ACCOUNT_FIELD_NUMBER = 2;
    private volatile Object account_;
    /**
     * <code>optional string account = 2;</code>
     */
    public boolean hasAccount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string account = 2;</code>
     */
    public String getAccount() {
      Object ref = account_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          account_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string account = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAccountBytes() {
      Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 3;
    private int age_;
    /**
     * <code>optional int32 age = 3;</code>
     */
    public boolean hasAge() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int32 age = 3;</code>
     */
    public int getAge() {
      return age_;
    }

    public static final int UID_FIELD_NUMBER = 4;
    private volatile Object uid_;
    /**
     * <code>optional string uid = 4;</code>
     */
    public boolean hasUid() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string uid = 4;</code>
     */
    public String getUid() {
      Object ref = uid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uid_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string uid = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUidBytes() {
      Object ref = uid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        uid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasHeader()) {
        if (!getHeader().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getHeader());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, account_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt32(3, age_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, uid_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getHeader());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, account_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, age_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, uid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof LoginResponse)) {
        return super.equals(obj);
      }
      LoginResponse other = (LoginResponse) obj;

      if (hasHeader() != other.hasHeader()) return false;
      if (hasHeader()) {
        if (!getHeader()
            .equals(other.getHeader())) return false;
      }
      if (hasAccount() != other.hasAccount()) return false;
      if (hasAccount()) {
        if (!getAccount()
            .equals(other.getAccount())) return false;
      }
      if (hasAge() != other.hasAge()) return false;
      if (hasAge()) {
        if (getAge()
            != other.getAge()) return false;
      }
      if (hasUid() != other.hasUid()) return false;
      if (hasUid()) {
        if (!getUid()
            .equals(other.getUid())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasHeader()) {
        hash = (37 * hash) + HEADER_FIELD_NUMBER;
        hash = (53 * hash) + getHeader().hashCode();
      }
      if (hasAccount()) {
        hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getAccount().hashCode();
      }
      if (hasAge()) {
        hash = (37 * hash) + AGE_FIELD_NUMBER;
        hash = (53 * hash) + getAge();
      }
      if (hasUid()) {
        hash = (37 * hash) + UID_FIELD_NUMBER;
        hash = (53 * hash) + getUid().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static LoginResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LoginResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LoginResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LoginResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LoginResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LoginResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LoginResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LoginResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static LoginResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static LoginResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static LoginResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LoginResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(LoginResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.fagp.LoginResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.fagp.LoginResponse)
        LoginResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RHMS.internal_static_com_fagp_LoginResponse_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RHMS.internal_static_com_fagp_LoginResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                LoginResponse.class, Builder.class);
      }

      // Construct using com.fagp.basics.net.proto.RHMS.LoginResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getHeaderFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = null;
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        account_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        age_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        uid_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RHMS.internal_static_com_fagp_LoginResponse_descriptor;
      }

      @Override
      public LoginResponse getDefaultInstanceForType() {
        return LoginResponse.getDefaultInstance();
      }

      @Override
      public LoginResponse build() {
        LoginResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public LoginResponse buildPartial() {
        LoginResponse result = new LoginResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (headerBuilder_ == null) {
            result.header_ = header_;
          } else {
            result.header_ = headerBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.account_ = account_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.age_ = age_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.uid_ = uid_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof LoginResponse) {
          return mergeFrom((LoginResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(LoginResponse other) {
        if (other == LoginResponse.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        if (other.hasAccount()) {
          bitField0_ |= 0x00000002;
          account_ = other.account_;
          onChanged();
        }
        if (other.hasAge()) {
          setAge(other.getAge());
        }
        if (other.hasUid()) {
          bitField0_ |= 0x00000008;
          uid_ = other.uid_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (hasHeader()) {
          if (!getHeader().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        LoginResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (LoginResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Header header_;
      private com.google.protobuf.SingleFieldBuilderV3<
          Header, Header.Builder, HeaderOrBuilder> headerBuilder_;
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public Header getHeader() {
        if (headerBuilder_ == null) {
          return header_ == null ? Header.getDefaultInstance() : header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public Builder setHeader(Header value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public Builder setHeader(
          Header.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public Builder mergeHeader(Header value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              header_ != null &&
              header_ != Header.getDefaultInstance()) {
            header_ =
              Header.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = null;
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public Header.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public HeaderOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_ == null ?
              Header.getDefaultInstance() : header_;
        }
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          Header, Header.Builder, HeaderOrBuilder>
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              Header, Header.Builder, HeaderOrBuilder>(
                  getHeader(),
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      private Object account_ = "";
      /**
       * <code>optional string account = 2;</code>
       */
      public boolean hasAccount() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public String getAccount() {
        Object ref = account_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            account_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAccountBytes() {
        Object ref = account_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          account_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public Builder setAccount(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        account_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public Builder clearAccount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        account_ = getDefaultInstance().getAccount();
        onChanged();
        return this;
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public Builder setAccountBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        account_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>optional int32 age = 3;</code>
       */
      public boolean hasAge() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional int32 age = 3;</code>
       */
      public int getAge() {
        return age_;
      }
      /**
       * <code>optional int32 age = 3;</code>
       */
      public Builder setAge(int value) {
        bitField0_ |= 0x00000004;
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 age = 3;</code>
       */
      public Builder clearAge() {
        bitField0_ = (bitField0_ & ~0x00000004);
        age_ = 0;
        onChanged();
        return this;
      }

      private Object uid_ = "";
      /**
       * <code>optional string uid = 4;</code>
       */
      public boolean hasUid() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional string uid = 4;</code>
       */
      public String getUid() {
        Object ref = uid_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            uid_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string uid = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUidBytes() {
        Object ref = uid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          uid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string uid = 4;</code>
       */
      public Builder setUid(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string uid = 4;</code>
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        uid_ = getDefaultInstance().getUid();
        onChanged();
        return this;
      }
      /**
       * <code>optional string uid = 4;</code>
       */
      public Builder setUidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        uid_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.fagp.LoginResponse)
    }

    // @@protoc_insertion_point(class_scope:com.fagp.LoginResponse)
    private static final LoginResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LoginResponse();
    }

    public static LoginResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<LoginResponse>
        PARSER = new com.google.protobuf.AbstractParser<LoginResponse>() {
      @Override
      public LoginResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LoginResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LoginResponse> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<LoginResponse> getParserForType() {
      return PARSER;
    }

    @Override
    public LoginResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LogoutRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.fagp.LogoutRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string account = 1;</code>
     */
    boolean hasAccount();
    /**
     * <code>required string account = 1;</code>
     */
    String getAccount();
    /**
     * <code>required string account = 1;</code>
     */
    com.google.protobuf.ByteString
        getAccountBytes();
  }
  /**
   * Protobuf type {@code com.fagp.LogoutRequest}
   */
  public  static final class LogoutRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.fagp.LogoutRequest)
      LogoutRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LogoutRequest.newBuilder() to construct.
    private LogoutRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LogoutRequest() {
      account_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new LogoutRequest();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LogoutRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              account_ = bs;
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
      return RHMS.internal_static_com_fagp_LogoutRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RHMS.internal_static_com_fagp_LogoutRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LogoutRequest.class, Builder.class);
    }

    private int bitField0_;
    public static final int ACCOUNT_FIELD_NUMBER = 1;
    private volatile Object account_;
    /**
     * <code>required string account = 1;</code>
     */
    public boolean hasAccount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string account = 1;</code>
     */
    public String getAccount() {
      Object ref = account_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          account_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string account = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAccountBytes() {
      Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasAccount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, account_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, account_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof LogoutRequest)) {
        return super.equals(obj);
      }
      LogoutRequest other = (LogoutRequest) obj;

      if (hasAccount() != other.hasAccount()) return false;
      if (hasAccount()) {
        if (!getAccount()
            .equals(other.getAccount())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAccount()) {
        hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getAccount().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static LogoutRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LogoutRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LogoutRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LogoutRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LogoutRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LogoutRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LogoutRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LogoutRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static LogoutRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static LogoutRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static LogoutRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LogoutRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(LogoutRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.fagp.LogoutRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.fagp.LogoutRequest)
        LogoutRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RHMS.internal_static_com_fagp_LogoutRequest_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RHMS.internal_static_com_fagp_LogoutRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                LogoutRequest.class, Builder.class);
      }

      // Construct using com.fagp.basics.net.proto.RHMS.LogoutRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        account_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RHMS.internal_static_com_fagp_LogoutRequest_descriptor;
      }

      @Override
      public LogoutRequest getDefaultInstanceForType() {
        return LogoutRequest.getDefaultInstance();
      }

      @Override
      public LogoutRequest build() {
        LogoutRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public LogoutRequest buildPartial() {
        LogoutRequest result = new LogoutRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.account_ = account_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof LogoutRequest) {
          return mergeFrom((LogoutRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(LogoutRequest other) {
        if (other == LogoutRequest.getDefaultInstance()) return this;
        if (other.hasAccount()) {
          bitField0_ |= 0x00000001;
          account_ = other.account_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasAccount()) {
          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        LogoutRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (LogoutRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object account_ = "";
      /**
       * <code>required string account = 1;</code>
       */
      public boolean hasAccount() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string account = 1;</code>
       */
      public String getAccount() {
        Object ref = account_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            account_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string account = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAccountBytes() {
        Object ref = account_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          account_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string account = 1;</code>
       */
      public Builder setAccount(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        account_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string account = 1;</code>
       */
      public Builder clearAccount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        account_ = getDefaultInstance().getAccount();
        onChanged();
        return this;
      }
      /**
       * <code>required string account = 1;</code>
       */
      public Builder setAccountBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        account_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.fagp.LogoutRequest)
    }

    // @@protoc_insertion_point(class_scope:com.fagp.LogoutRequest)
    private static final LogoutRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LogoutRequest();
    }

    public static LogoutRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<LogoutRequest>
        PARSER = new com.google.protobuf.AbstractParser<LogoutRequest>() {
      @Override
      public LogoutRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LogoutRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LogoutRequest> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<LogoutRequest> getParserForType() {
      return PARSER;
    }

    @Override
    public LogoutRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LogoutResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.fagp.LogoutResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .com.fagp.Header header = 1;</code>
     */
    boolean hasHeader();
    /**
     * <code>optional .com.fagp.Header header = 1;</code>
     */
    Header getHeader();
    /**
     * <code>optional .com.fagp.Header header = 1;</code>
     */
    HeaderOrBuilder getHeaderOrBuilder();

    /**
     * <code>optional string account = 2;</code>
     */
    boolean hasAccount();
    /**
     * <code>optional string account = 2;</code>
     */
    String getAccount();
    /**
     * <code>optional string account = 2;</code>
     */
    com.google.protobuf.ByteString
        getAccountBytes();

    /**
     * <code>optional string uid = 3;</code>
     */
    boolean hasUid();
    /**
     * <code>optional string uid = 3;</code>
     */
    String getUid();
    /**
     * <code>optional string uid = 3;</code>
     */
    com.google.protobuf.ByteString
        getUidBytes();
  }
  /**
   * Protobuf type {@code com.fagp.LogoutResponse}
   */
  public  static final class LogoutResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.fagp.LogoutResponse)
      LogoutResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LogoutResponse.newBuilder() to construct.
    private LogoutResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LogoutResponse() {
      account_ = "";
      uid_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new LogoutResponse();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LogoutResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
              Header.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(Header.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              account_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              uid_ = bs;
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
      return RHMS.internal_static_com_fagp_LogoutResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RHMS.internal_static_com_fagp_LogoutResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LogoutResponse.class, Builder.class);
    }

    private int bitField0_;
    public static final int HEADER_FIELD_NUMBER = 1;
    private Header header_;
    /**
     * <code>optional .com.fagp.Header header = 1;</code>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .com.fagp.Header header = 1;</code>
     */
    public Header getHeader() {
      return header_ == null ? Header.getDefaultInstance() : header_;
    }
    /**
     * <code>optional .com.fagp.Header header = 1;</code>
     */
    public HeaderOrBuilder getHeaderOrBuilder() {
      return header_ == null ? Header.getDefaultInstance() : header_;
    }

    public static final int ACCOUNT_FIELD_NUMBER = 2;
    private volatile Object account_;
    /**
     * <code>optional string account = 2;</code>
     */
    public boolean hasAccount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string account = 2;</code>
     */
    public String getAccount() {
      Object ref = account_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          account_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string account = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAccountBytes() {
      Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UID_FIELD_NUMBER = 3;
    private volatile Object uid_;
    /**
     * <code>optional string uid = 3;</code>
     */
    public boolean hasUid() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string uid = 3;</code>
     */
    public String getUid() {
      Object ref = uid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uid_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string uid = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUidBytes() {
      Object ref = uid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        uid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasHeader()) {
        if (!getHeader().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getHeader());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, account_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uid_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getHeader());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, account_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof LogoutResponse)) {
        return super.equals(obj);
      }
      LogoutResponse other = (LogoutResponse) obj;

      if (hasHeader() != other.hasHeader()) return false;
      if (hasHeader()) {
        if (!getHeader()
            .equals(other.getHeader())) return false;
      }
      if (hasAccount() != other.hasAccount()) return false;
      if (hasAccount()) {
        if (!getAccount()
            .equals(other.getAccount())) return false;
      }
      if (hasUid() != other.hasUid()) return false;
      if (hasUid()) {
        if (!getUid()
            .equals(other.getUid())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasHeader()) {
        hash = (37 * hash) + HEADER_FIELD_NUMBER;
        hash = (53 * hash) + getHeader().hashCode();
      }
      if (hasAccount()) {
        hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getAccount().hashCode();
      }
      if (hasUid()) {
        hash = (37 * hash) + UID_FIELD_NUMBER;
        hash = (53 * hash) + getUid().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static LogoutResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LogoutResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LogoutResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LogoutResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LogoutResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LogoutResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LogoutResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LogoutResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static LogoutResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static LogoutResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static LogoutResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LogoutResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(LogoutResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.fagp.LogoutResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.fagp.LogoutResponse)
        LogoutResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RHMS.internal_static_com_fagp_LogoutResponse_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RHMS.internal_static_com_fagp_LogoutResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                LogoutResponse.class, Builder.class);
      }

      // Construct using com.fagp.basics.net.proto.RHMS.LogoutResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getHeaderFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = null;
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        account_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        uid_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RHMS.internal_static_com_fagp_LogoutResponse_descriptor;
      }

      @Override
      public LogoutResponse getDefaultInstanceForType() {
        return LogoutResponse.getDefaultInstance();
      }

      @Override
      public LogoutResponse build() {
        LogoutResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public LogoutResponse buildPartial() {
        LogoutResponse result = new LogoutResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (headerBuilder_ == null) {
            result.header_ = header_;
          } else {
            result.header_ = headerBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.account_ = account_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.uid_ = uid_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof LogoutResponse) {
          return mergeFrom((LogoutResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(LogoutResponse other) {
        if (other == LogoutResponse.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        if (other.hasAccount()) {
          bitField0_ |= 0x00000002;
          account_ = other.account_;
          onChanged();
        }
        if (other.hasUid()) {
          bitField0_ |= 0x00000004;
          uid_ = other.uid_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (hasHeader()) {
          if (!getHeader().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        LogoutResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (LogoutResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Header header_;
      private com.google.protobuf.SingleFieldBuilderV3<
          Header, Header.Builder, HeaderOrBuilder> headerBuilder_;
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public Header getHeader() {
        if (headerBuilder_ == null) {
          return header_ == null ? Header.getDefaultInstance() : header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public Builder setHeader(Header value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public Builder setHeader(
          Header.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public Builder mergeHeader(Header value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              header_ != null &&
              header_ != Header.getDefaultInstance()) {
            header_ =
              Header.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = null;
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public Header.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      public HeaderOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_ == null ?
              Header.getDefaultInstance() : header_;
        }
      }
      /**
       * <code>optional .com.fagp.Header header = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          Header, Header.Builder, HeaderOrBuilder>
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              Header, Header.Builder, HeaderOrBuilder>(
                  getHeader(),
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      private Object account_ = "";
      /**
       * <code>optional string account = 2;</code>
       */
      public boolean hasAccount() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public String getAccount() {
        Object ref = account_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            account_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAccountBytes() {
        Object ref = account_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          account_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public Builder setAccount(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        account_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public Builder clearAccount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        account_ = getDefaultInstance().getAccount();
        onChanged();
        return this;
      }
      /**
       * <code>optional string account = 2;</code>
       */
      public Builder setAccountBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        account_ = value;
        onChanged();
        return this;
      }

      private Object uid_ = "";
      /**
       * <code>optional string uid = 3;</code>
       */
      public boolean hasUid() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string uid = 3;</code>
       */
      public String getUid() {
        Object ref = uid_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            uid_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string uid = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUidBytes() {
        Object ref = uid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          uid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string uid = 3;</code>
       */
      public Builder setUid(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string uid = 3;</code>
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        uid_ = getDefaultInstance().getUid();
        onChanged();
        return this;
      }
      /**
       * <code>optional string uid = 3;</code>
       */
      public Builder setUidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        uid_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.fagp.LogoutResponse)
    }

    // @@protoc_insertion_point(class_scope:com.fagp.LogoutResponse)
    private static final LogoutResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LogoutResponse();
    }

    public static LogoutResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<LogoutResponse>
        PARSER = new com.google.protobuf.AbstractParser<LogoutResponse>() {
      @Override
      public LogoutResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LogoutResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LogoutResponse> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<LogoutResponse> getParserForType() {
      return PARSER;
    }

    @Override
    public LogoutResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fagp_Header_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fagp_Header_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fagp_LoginRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fagp_LoginRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fagp_LoginResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fagp_LoginResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fagp_LogoutRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fagp_LogoutRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fagp_LogoutResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fagp_LogoutResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\nRHMS.proto\022\010com.fagp\"8\n\006Header\022\017\n\007succ" +
      "ess\030\001 \002(\010\022\014\n\004code\030\002 \001(\005\022\017\n\007message\030\003 \001(\t" +
      "\"/\n\014LoginRequest\022\017\n\007account\030\001 \002(\t\022\016\n\006pas" +
      "swd\030\002 \001(\t\"\\\n\rLoginResponse\022 \n\006header\030\001 \001" +
      "(\0132\020.com.fagp.Header\022\017\n\007account\030\002 \001(\t\022\013\n" +
      "\003age\030\003 \001(\005\022\013\n\003uid\030\004 \001(\t\" \n\rLogoutRequest" +
      "\022\017\n\007account\030\001 \002(\t\"P\n\016LogoutResponse\022 \n\006h" +
      "eader\030\001 \001(\0132\020.com.fagp.Header\022\017\n\007account" +
      "\030\002 \001(\t\022\013\n\003uid\030\003 \001(\t*\331\002\n\007MsgType\022\023\n\016M_Log" +
      "inRequest\020\221N\022\024\n\017M_LoginResponse\020\222N\022\024\n\017M_" +
      "LogoutRequest\020\223N\022\025\n\020M_LogoutResponse\020\224N\022" +
      "\027\n\022M_KeepaliveRequest\020\225N\022\030\n\023M_KeepaliveR" +
      "esponse\020\226N\022\030\n\023M_GetFriendsRequest\020\227N\022\031\n\024" +
      "M_GetFriendsResponse\020\230N\022\031\n\024M_SendMessage" +
      "Request\020\231N\022\032\n\025M_SendMessageResponse\020\232N\022\033" +
      "\n\025M_Friend_Notification\020\241\234\001\022\034\n\026M_Message" +
      "_Notification\020\242\234\001\022\034\n\026M_Welcome_Notificat" +
      "ion\020\243\234\001B!\n\031com.fagp.basics.net.protoB\004RH" +
      "MS"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_fagp_Header_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_fagp_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fagp_Header_descriptor,
        new String[] { "Success", "Code", "Message", });
    internal_static_com_fagp_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_fagp_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fagp_LoginRequest_descriptor,
        new String[] { "Account", "Passwd", });
    internal_static_com_fagp_LoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_fagp_LoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fagp_LoginResponse_descriptor,
        new String[] { "Header", "Account", "Age", "Uid", });
    internal_static_com_fagp_LogoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_fagp_LogoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fagp_LogoutRequest_descriptor,
        new String[] { "Account", });
    internal_static_com_fagp_LogoutResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_fagp_LogoutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fagp_LogoutResponse_descriptor,
        new String[] { "Header", "Account", "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
