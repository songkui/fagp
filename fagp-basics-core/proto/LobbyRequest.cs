// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: lobbyRequest.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace sk.WellKnownTypes {

  /// <summary>Holder for reflection information generated from lobbyRequest.proto</summary>
  public static partial class LobbyRequestReflection {

    #region Descriptor
    /// <summary>File descriptor for lobbyRequest.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static LobbyRequestReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChJsb2JieVJlcXVlc3QucHJvdG8SCWNvbS5sb2JieSI8CgxMb2dpblJlcXVl",
            "c3QSDQoFcGhvbmUYASABKAkSEAoIcGFzc3dvcmQYAiABKAkSCwoDbWFjGAMg",
            "ASgJIjcKCkVGVFJlcXVlc3QSCwoDdWlkGAEgASgJEg8KB2dvbGROdW0YAiAB",
            "KAUSCwoDdG93GAMgASgFQlQKK2NvbS5mYWdwLmJhc2ljcy5jb3JlLnByb3Rv",
            "YnVmLmxvYmJ5LnJlcXVlc3RCEUxvYmJ5UHJvdG9SZXF1ZXN0qgIRc2suV2Vs",
            "bEtub3duVHlwZXNiBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::sk.WellKnownTypes.LoginRequest), global::sk.WellKnownTypes.LoginRequest.Parser, new[]{ "Phone", "Password", "Mac" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::sk.WellKnownTypes.EFTRequest), global::sk.WellKnownTypes.EFTRequest.Parser, new[]{ "Uid", "GoldNum", "Tow" }, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  /// <summary>
  ///登录 Request header
  /// </summary>
  public sealed partial class LoginRequest : pb::IMessage<LoginRequest> {
    private static readonly pb::MessageParser<LoginRequest> _parser = new pb::MessageParser<LoginRequest>(() => new LoginRequest());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<LoginRequest> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::sk.WellKnownTypes.LobbyRequestReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public LoginRequest() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public LoginRequest(LoginRequest other) : this() {
      phone_ = other.phone_;
      password_ = other.password_;
      mac_ = other.mac_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public LoginRequest Clone() {
      return new LoginRequest(this);
    }

    /// <summary>Field number for the "phone" field.</summary>
    public const int PhoneFieldNumber = 1;
    private string phone_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Phone {
      get { return phone_; }
      set {
        phone_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "password" field.</summary>
    public const int PasswordFieldNumber = 2;
    private string password_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Password {
      get { return password_; }
      set {
        password_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "mac" field.</summary>
    public const int MacFieldNumber = 3;
    private string mac_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Mac {
      get { return mac_; }
      set {
        mac_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as LoginRequest);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(LoginRequest other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Phone != other.Phone) return false;
      if (Password != other.Password) return false;
      if (Mac != other.Mac) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Phone.Length != 0) hash ^= Phone.GetHashCode();
      if (Password.Length != 0) hash ^= Password.GetHashCode();
      if (Mac.Length != 0) hash ^= Mac.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (Phone.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Phone);
      }
      if (Password.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Password);
      }
      if (Mac.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(Mac);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Phone.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Phone);
      }
      if (Password.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Password);
      }
      if (Mac.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Mac);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(LoginRequest other) {
      if (other == null) {
        return;
      }
      if (other.Phone.Length != 0) {
        Phone = other.Phone;
      }
      if (other.Password.Length != 0) {
        Password = other.Password;
      }
      if (other.Mac.Length != 0) {
        Mac = other.Mac;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            Phone = input.ReadString();
            break;
          }
          case 18: {
            Password = input.ReadString();
            break;
          }
          case 26: {
            Mac = input.ReadString();
            break;
          }
        }
      }
    }

  }

  /// <summary>
  ///转账 Request
  /// </summary>
  public sealed partial class EFTRequest : pb::IMessage<EFTRequest> {
    private static readonly pb::MessageParser<EFTRequest> _parser = new pb::MessageParser<EFTRequest>(() => new EFTRequest());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<EFTRequest> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::sk.WellKnownTypes.LobbyRequestReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public EFTRequest() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public EFTRequest(EFTRequest other) : this() {
      uid_ = other.uid_;
      goldNum_ = other.goldNum_;
      tow_ = other.tow_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public EFTRequest Clone() {
      return new EFTRequest(this);
    }

    /// <summary>Field number for the "uid" field.</summary>
    public const int UidFieldNumber = 1;
    private string uid_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Uid {
      get { return uid_; }
      set {
        uid_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "goldNum" field.</summary>
    public const int GoldNumFieldNumber = 2;
    private int goldNum_;
    /// <summary>
    ///金额
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int GoldNum {
      get { return goldNum_; }
      set {
        goldNum_ = value;
      }
    }

    /// <summary>Field number for the "tow" field.</summary>
    public const int TowFieldNumber = 3;
    private int tow_;
    /// <summary>
    ///0 表示 从奖池转到 钱包； 1，表示 从钱包转到 奖池
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int Tow {
      get { return tow_; }
      set {
        tow_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as EFTRequest);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(EFTRequest other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Uid != other.Uid) return false;
      if (GoldNum != other.GoldNum) return false;
      if (Tow != other.Tow) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Uid.Length != 0) hash ^= Uid.GetHashCode();
      if (GoldNum != 0) hash ^= GoldNum.GetHashCode();
      if (Tow != 0) hash ^= Tow.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (Uid.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Uid);
      }
      if (GoldNum != 0) {
        output.WriteRawTag(16);
        output.WriteInt32(GoldNum);
      }
      if (Tow != 0) {
        output.WriteRawTag(24);
        output.WriteInt32(Tow);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Uid.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Uid);
      }
      if (GoldNum != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(GoldNum);
      }
      if (Tow != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(Tow);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(EFTRequest other) {
      if (other == null) {
        return;
      }
      if (other.Uid.Length != 0) {
        Uid = other.Uid;
      }
      if (other.GoldNum != 0) {
        GoldNum = other.GoldNum;
      }
      if (other.Tow != 0) {
        Tow = other.Tow;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            Uid = input.ReadString();
            break;
          }
          case 16: {
            GoldNum = input.ReadInt32();
            break;
          }
          case 24: {
            Tow = input.ReadInt32();
            break;
          }
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code