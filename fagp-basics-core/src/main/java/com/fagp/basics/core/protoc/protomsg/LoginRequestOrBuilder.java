// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lobby.proto

package com.fagp.basics.core.protoc.protomsg;

public interface LoginRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.lobby.LoginRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.slots.GameRequestHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.com.slots.GameRequestHeader header = 1;</code>
   */
  Header.GameRequestHeader getHeader();
  /**
   * <code>.com.slots.GameRequestHeader header = 1;</code>
   */
  Header.GameRequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>string phone = 2;</code>
   */
  String getPhone();
  /**
   * <code>string phone = 2;</code>
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <code>string password = 3;</code>
   */
  String getPassword();
  /**
   * <code>string password = 3;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}
