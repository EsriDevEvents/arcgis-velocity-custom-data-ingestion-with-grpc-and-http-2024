// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: velocity_grpc.proto

// Protobuf Java Version: 3.25.1
package com.esri.realtime.core.grpc;

public interface RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:esri.realtime.core.grpc.Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .esri.realtime.core.grpc.Feature features = 1;</code>
   */
  java.util.List<com.esri.realtime.core.grpc.Feature> 
      getFeaturesList();
  /**
   * <code>repeated .esri.realtime.core.grpc.Feature features = 1;</code>
   */
  com.esri.realtime.core.grpc.Feature getFeatures(int index);
  /**
   * <code>repeated .esri.realtime.core.grpc.Feature features = 1;</code>
   */
  int getFeaturesCount();
  /**
   * <code>repeated .esri.realtime.core.grpc.Feature features = 1;</code>
   */
  java.util.List<? extends com.esri.realtime.core.grpc.FeatureOrBuilder> 
      getFeaturesOrBuilderList();
  /**
   * <code>repeated .esri.realtime.core.grpc.Feature features = 1;</code>
   */
  com.esri.realtime.core.grpc.FeatureOrBuilder getFeaturesOrBuilder(
      int index);
}
