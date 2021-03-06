// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: lobbyResponse.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace sk.WellKnownTypes {

  /// <summary>Holder for reflection information generated from lobbyResponse.proto</summary>
  public static partial class LobbyResponseReflection {

    #region Descriptor
    /// <summary>File descriptor for lobbyResponse.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static LobbyResponseReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChNsb2JieVJlc3BvbnNlLnByb3RvEgljb20ubG9iYnkiSQoNTG9naW5SZXNw",
            "b25zZRILCgN1aWQYASABKAkSDQoFcGhvbmUYAiABKAkSDQoFbW9uZXkYAyAB",
            "KAUSDQoFZ2NvZGUYBCABKAUiKwoLRUZUUmVzcG9uc2USDwoHZ29sZE51bRgD",
            "IAEoBRILCgN0b3cYBCABKAVCVgosY29tLmZhZ3AuYmFzaWNzLmNvcmUucHJv",
            "dG9idWYubG9iYnkucmVzcG9uc2VCEkxvYmJ5UHJvdG9SZXNwb25zZaoCEXNr",
            "LldlbGxLbm93blR5cGVzYgZwcm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::sk.WellKnownTypes.LoginResponse), global::sk.WellKnownTypes.LoginResponse.Parser, new[]{ "Uid", "Phone", "Money", "Gcode" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::sk.WellKnownTypes.EFTResponse), global::sk.WellKnownTypes.EFTResponse.Parser, new[]{ "GoldNum", "Tow" }, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  /// <summary>
  ///登录Response
  /// </summary>
  public sealed partial class LoginResponse : pb::IMessage<LoginResponse> {
    private static readonly pb::MessageParser<LoginResponse> _parser = new pb::MessageParser<LoginResponse>(() => new LoginResponse());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<LoginResponse> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::sk.WellKnownTypes.LobbyResponseReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public LoginResponse() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public LoginResponse(LoginResponse other) : this() {
      uid_ = other.uid_;
      phone_ = other.phone_;
      money_ = other.money_;
      gcode_ = other.gcode_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public LoginResponse Clone() {
      return new LoginResponse(this);
    }

    /// <summary>Field number for the "uid" field.</summary>
    public const int UidFieldNumber = 1;
    private string uid_ = "";
    /// <summary>
    ///user ID
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Uid {
      get { return uid_; }
      set {
        uid_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "phone" field.</summary>
    public const int PhoneFieldNumber = 2;
    private string phone_ = "";
    /// <summary>
    /// dianh
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Phone {
      get { return phone_; }
      set {
        phone_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "money" field.</summary>
    public const int MoneyFieldNumber = 3;
    private int money_;
    /// <summary>
    ///user 钱包
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int Money {
      get { return money_; }
      set {
        money_ = value;
      }
    }

    /// <summary>Field number for the "gcode" field.</summary>
    public const int GcodeFieldNumber = 4;
    private int gcode_;
    /// <summary>
    /// 金币
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int Gcode {
      get { return gcode_; }
      set {
        gcode_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as LoginResponse);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(LoginResponse other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Uid != other.Uid) return false;
      if (Phone != other.Phone) return false;
      if (Money != other.Money) return false;
      if (Gcode != other.Gcode) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Uid.Length != 0) hash ^= Uid.GetHashCode();
      if (Phone.Length != 0) hash ^= Phone.GetHashCode();
      if (Money != 0) hash ^= Money.GetHashCode();
      if (Gcode != 0) hash ^= Gcode.GetHashCode();
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
      if (Phone.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(Phone);
      }
      if (Money != 0) {
        output.WriteRawTag(24);
        output.WriteInt32(Money);
      }
      if (Gcode != 0) {
        output.WriteRawTag(32);
        output.WriteInt32(Gcode);
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
      if (Phone.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Phone);
      }
      if (Money != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(Money);
      }
      if (Gcode != 0) {
        size += 1 + pb::CodedOutputStream.ComputeInt32Size(Gcode);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(LoginResponse other) {
      if (other == null) {
        return;
      }
      if (other.Uid.Length != 0) {
        Uid = other.Uid;
      }
      if (other.Phone.Length != 0) {
        Phone = other.Phone;
      }
      if (other.Money != 0) {
        Money = other.Money;
      }
      if (other.Gcode != 0) {
        Gcode = other.Gcode;
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
          case 18: {
            Phone = input.ReadString();
            break;
          }
          case 24: {
            Money = input.ReadInt32();
            break;
          }
          case 32: {
            Gcode = input.ReadInt32();
            break;
          }
        }
      }
    }

  }

  /// <summary>
  ///转账 Response
  /// </summary>
  public sealed partial class EFTResponse : pb::IMessage<EFTResponse> {
    private static readonly pb::MessageParser<EFTResponse> _parser = new pb::MessageParser<EFTResponse>(() => new EFTResponse());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<EFTResponse> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::sk.WellKnownTypes.LobbyResponseReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public EFTResponse() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public EFTResponse(EFTResponse other) : this() {
      goldNum_ = other.goldNum_;
      tow_ = other.tow_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public EFTResponse Clone() {
      return new EFTResponse(this);
    }

    /// <summary>Field number for the "goldNum" field.</summary>
    public const int GoldNumFieldNumber = 3;
    private int goldNum_;
    /// <summary>
    /// 转账金额
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int GoldNum {
      get { return goldNum_; }
      set {
        goldNum_ = value;
      }
    }

    /// <summary>Field number for the "tow" field.</summary>
    public const int TowFieldNumber = 4;
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
      return Equals(other as EFTResponse);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(EFTResponse other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (GoldNum != other.GoldNum) return false;
      if (Tow != other.Tow) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
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
      if (GoldNum != 0) {
        output.WriteRawTag(24);
        output.WriteInt32(GoldNum);
      }
      if (Tow != 0) {
        output.WriteRawTag(32);
        output.WriteInt32(Tow);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
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
    public void MergeFrom(EFTResponse other) {
      if (other == null) {
        return;
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
          case 24: {
            GoldNum = input.ReadInt32();
            break;
          }
          case 32: {
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
