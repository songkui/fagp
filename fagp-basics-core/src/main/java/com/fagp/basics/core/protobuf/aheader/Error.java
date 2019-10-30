// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: error.proto

package com.fagp.basics.core.protobuf.aheader;

public final class Error {
  private Error() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ErrorInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.fagp.ErrorInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *命令号
     * </pre>
     *
     * <code>int32 cmd = 1;</code>
     */
    int getCmd();

    /**
     * <pre>
     *200 表示成功，其他数值表示有错误
     * </pre>
     *
     * <code>int32 status_code = 2;</code>
     */
    int getStatusCode();

    /**
     * <pre>
     * 状态值 成功则是 success 错误则反回错误对应说明
     * </pre>
     *
     * <code>string status_msg = 3;</code>
     */
    String getStatusMsg();
    /**
     * <pre>
     * 状态值 成功则是 success 错误则反回错误对应说明
     * </pre>
     *
     * <code>string status_msg = 3;</code>
     */
    com.google.protobuf.ByteString
        getStatusMsgBytes();
  }
  /**
   * <pre>
   *错误信息 返回
   * </pre>
   *
   * Protobuf type {@code com.fagp.ErrorInfo}
   */
  public  static final class ErrorInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.fagp.ErrorInfo)
      ErrorInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ErrorInfo.newBuilder() to construct.
    private ErrorInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ErrorInfo() {
      statusMsg_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new ErrorInfo();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ErrorInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              cmd_ = input.readInt32();
              break;
            }
            case 16: {

              statusCode_ = input.readInt32();
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              statusMsg_ = s;
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
      return Error.internal_static_com_fagp_ErrorInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Error.internal_static_com_fagp_ErrorInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ErrorInfo.class, Builder.class);
    }

    public static final int CMD_FIELD_NUMBER = 1;
    private int cmd_;
    /**
     * <pre>
     *命令号
     * </pre>
     *
     * <code>int32 cmd = 1;</code>
     */
    public int getCmd() {
      return cmd_;
    }

    public static final int STATUS_CODE_FIELD_NUMBER = 2;
    private int statusCode_;
    /**
     * <pre>
     *200 表示成功，其他数值表示有错误
     * </pre>
     *
     * <code>int32 status_code = 2;</code>
     */
    public int getStatusCode() {
      return statusCode_;
    }

    public static final int STATUS_MSG_FIELD_NUMBER = 3;
    private volatile Object statusMsg_;
    /**
     * <pre>
     * 状态值 成功则是 success 错误则反回错误对应说明
     * </pre>
     *
     * <code>string status_msg = 3;</code>
     */
    public String getStatusMsg() {
      Object ref = statusMsg_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        statusMsg_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 状态值 成功则是 success 错误则反回错误对应说明
     * </pre>
     *
     * <code>string status_msg = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStatusMsgBytes() {
      Object ref = statusMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        statusMsg_ = b;
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

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (cmd_ != 0) {
        output.writeInt32(1, cmd_);
      }
      if (statusCode_ != 0) {
        output.writeInt32(2, statusCode_);
      }
      if (!getStatusMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, statusMsg_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cmd_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, cmd_);
      }
      if (statusCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, statusCode_);
      }
      if (!getStatusMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, statusMsg_);
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
      if (!(obj instanceof ErrorInfo)) {
        return super.equals(obj);
      }
      ErrorInfo other = (ErrorInfo) obj;

      if (getCmd()
          != other.getCmd()) return false;
      if (getStatusCode()
          != other.getStatusCode()) return false;
      if (!getStatusMsg()
          .equals(other.getStatusMsg())) return false;
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
      hash = (37 * hash) + CMD_FIELD_NUMBER;
      hash = (53 * hash) + getCmd();
      hash = (37 * hash) + STATUS_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getStatusCode();
      hash = (37 * hash) + STATUS_MSG_FIELD_NUMBER;
      hash = (53 * hash) + getStatusMsg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ErrorInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ErrorInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ErrorInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ErrorInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ErrorInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ErrorInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ErrorInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ErrorInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ErrorInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ErrorInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ErrorInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ErrorInfo parseFrom(
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
    public static Builder newBuilder(ErrorInfo prototype) {
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
     * <pre>
     *错误信息 返回
     * </pre>
     *
     * Protobuf type {@code com.fagp.ErrorInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.fagp.ErrorInfo)
        ErrorInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Error.internal_static_com_fagp_ErrorInfo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Error.internal_static_com_fagp_ErrorInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ErrorInfo.class, Builder.class);
      }

      // Construct using com.fagp.basics.core.protobuf.aheader.Error.ErrorInfo.newBuilder()
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
        cmd_ = 0;

        statusCode_ = 0;

        statusMsg_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Error.internal_static_com_fagp_ErrorInfo_descriptor;
      }

      @Override
      public ErrorInfo getDefaultInstanceForType() {
        return ErrorInfo.getDefaultInstance();
      }

      @Override
      public ErrorInfo build() {
        ErrorInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ErrorInfo buildPartial() {
        ErrorInfo result = new ErrorInfo(this);
        result.cmd_ = cmd_;
        result.statusCode_ = statusCode_;
        result.statusMsg_ = statusMsg_;
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
        if (other instanceof ErrorInfo) {
          return mergeFrom((ErrorInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ErrorInfo other) {
        if (other == ErrorInfo.getDefaultInstance()) return this;
        if (other.getCmd() != 0) {
          setCmd(other.getCmd());
        }
        if (other.getStatusCode() != 0) {
          setStatusCode(other.getStatusCode());
        }
        if (!other.getStatusMsg().isEmpty()) {
          statusMsg_ = other.statusMsg_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ErrorInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ErrorInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cmd_ ;
      /**
       * <pre>
       *命令号
       * </pre>
       *
       * <code>int32 cmd = 1;</code>
       */
      public int getCmd() {
        return cmd_;
      }
      /**
       * <pre>
       *命令号
       * </pre>
       *
       * <code>int32 cmd = 1;</code>
       */
      public Builder setCmd(int value) {
        
        cmd_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *命令号
       * </pre>
       *
       * <code>int32 cmd = 1;</code>
       */
      public Builder clearCmd() {
        
        cmd_ = 0;
        onChanged();
        return this;
      }

      private int statusCode_ ;
      /**
       * <pre>
       *200 表示成功，其他数值表示有错误
       * </pre>
       *
       * <code>int32 status_code = 2;</code>
       */
      public int getStatusCode() {
        return statusCode_;
      }
      /**
       * <pre>
       *200 表示成功，其他数值表示有错误
       * </pre>
       *
       * <code>int32 status_code = 2;</code>
       */
      public Builder setStatusCode(int value) {
        
        statusCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *200 表示成功，其他数值表示有错误
       * </pre>
       *
       * <code>int32 status_code = 2;</code>
       */
      public Builder clearStatusCode() {
        
        statusCode_ = 0;
        onChanged();
        return this;
      }

      private Object statusMsg_ = "";
      /**
       * <pre>
       * 状态值 成功则是 success 错误则反回错误对应说明
       * </pre>
       *
       * <code>string status_msg = 3;</code>
       */
      public String getStatusMsg() {
        Object ref = statusMsg_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          statusMsg_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * 状态值 成功则是 success 错误则反回错误对应说明
       * </pre>
       *
       * <code>string status_msg = 3;</code>
       */
      public com.google.protobuf.ByteString
          getStatusMsgBytes() {
        Object ref = statusMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          statusMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 状态值 成功则是 success 错误则反回错误对应说明
       * </pre>
       *
       * <code>string status_msg = 3;</code>
       */
      public Builder setStatusMsg(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        statusMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 状态值 成功则是 success 错误则反回错误对应说明
       * </pre>
       *
       * <code>string status_msg = 3;</code>
       */
      public Builder clearStatusMsg() {
        
        statusMsg_ = getDefaultInstance().getStatusMsg();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 状态值 成功则是 success 错误则反回错误对应说明
       * </pre>
       *
       * <code>string status_msg = 3;</code>
       */
      public Builder setStatusMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        statusMsg_ = value;
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


      // @@protoc_insertion_point(builder_scope:com.fagp.ErrorInfo)
    }

    // @@protoc_insertion_point(class_scope:com.fagp.ErrorInfo)
    private static final ErrorInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ErrorInfo();
    }

    public static ErrorInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ErrorInfo>
        PARSER = new com.google.protobuf.AbstractParser<ErrorInfo>() {
      @Override
      public ErrorInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ErrorInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ErrorInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ErrorInfo> getParserForType() {
      return PARSER;
    }

    @Override
    public ErrorInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fagp_ErrorInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fagp_ErrorInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\013error.proto\022\010com.fagp\"A\n\tErrorInfo\022\013\n\003" +
      "cmd\030\001 \001(\005\022\023\n\013status_code\030\002 \001(\005\022\022\n\nstatus" +
      "_msg\030\003 \001(\tB.\n%com.fagp.basics.core.proto" +
      "buf.aheaderB\005Errorb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_fagp_ErrorInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_fagp_ErrorInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fagp_ErrorInfo_descriptor,
        new String[] { "Cmd", "StatusCode", "StatusMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}