// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: map.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace TTF.Tokens.Model.Map {

  /// <summary>Holder for reflection information generated from map.proto</summary>
  public static partial class MapReflection {

    #region Descriptor
    /// <summary>File descriptor for map.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static MapReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CgltYXAucHJvdG8SCW1vZGVsLm1hcCJFCgtNYXBDYXRlZ29yeRIMCgRuYW1l",
            "GAEgASgJEigKC21hcF9lbnRyaWVzGAIgAygLMhMubW9kZWwubWFwLk1hcEVu",
            "dHJ5Im8KCE1hcEVudHJ5EgwKBG5hbWUYASABKAkSFwoPdGF4b25vbXlfc3lt",
            "Ym9sGAIgASgJEjwKFW1hcF90YXJnZXRfcmVmZXJlbmNlcxgDIAMoCzIdLm1v",
            "ZGVsLm1hcC5NYXBUYXJnZXRSZWZlcmVuY2UiZAoSTWFwVGFyZ2V0UmVmZXJl",
            "bmNlEgwKBG5hbWUYASABKAkSKwoIcGxhdGZvcm0YAiABKA4yGS5tb2RlbC5t",
            "YXAuVGFyZ2V0UGxhdGZvcm0SEwoLdGFyZ2V0X3BhdGgYAyABKAkiPAoHQ29k",
            "ZU1hcBIxChFtYXBwZWRfY2F0ZWdvcmllcxgBIAMoCzIWLm1vZGVsLm1hcC5N",
            "YXBDYXRlZ29yeSp2Cg5UYXJnZXRQbGF0Zm9ybRIVChFFVEhFUkVVTV9TT0xJ",
            "RElUWRAAEhAKDENIQUlOQ09ERV9HTxABEhIKDkNIQUlOQ09ERV9KQVZBEAIS",
            "EgoOQ0hBSU5DT0RFX05PREUQAxIJCgVDT1JEQRAEEggKBERBTUwQBUJHCixv",
            "cmcudG9rZW50YXhvbm9teWluaXRpYXRpdmUudG9rZW5zLm1vZGVsLm1hcFAB",
            "qgIUVFRGLlRva2Vucy5Nb2RlbC5NYXBiBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(new[] {typeof(global::TTF.Tokens.Model.Map.TargetPlatform), }, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::TTF.Tokens.Model.Map.MapCategory), global::TTF.Tokens.Model.Map.MapCategory.Parser, new[]{ "Name", "MapEntries" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::TTF.Tokens.Model.Map.MapEntry), global::TTF.Tokens.Model.Map.MapEntry.Parser, new[]{ "Name", "TaxonomySymbol", "MapTargetReferences" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::TTF.Tokens.Model.Map.MapTargetReference), global::TTF.Tokens.Model.Map.MapTargetReference.Parser, new[]{ "Name", "Platform", "TargetPath" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::TTF.Tokens.Model.Map.CodeMap), global::TTF.Tokens.Model.Map.CodeMap.Parser, new[]{ "MappedCategories" }, null, null, null)
          }));
    }
    #endregion

  }
  #region Enums
  public enum TargetPlatform {
    [pbr::OriginalName("ETHEREUM_SOLIDITY")] EthereumSolidity = 0,
    [pbr::OriginalName("CHAINCODE_GO")] ChaincodeGo = 1,
    [pbr::OriginalName("CHAINCODE_JAVA")] ChaincodeJava = 2,
    [pbr::OriginalName("CHAINCODE_NODE")] ChaincodeNode = 3,
    [pbr::OriginalName("CORDA")] Corda = 4,
    [pbr::OriginalName("DAML")] Daml = 5,
  }

  #endregion

  #region Messages
  public sealed partial class MapCategory : pb::IMessage<MapCategory> {
    private static readonly pb::MessageParser<MapCategory> _parser = new pb::MessageParser<MapCategory>(() => new MapCategory());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<MapCategory> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TTF.Tokens.Model.Map.MapReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public MapCategory() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public MapCategory(MapCategory other) : this() {
      name_ = other.name_;
      mapEntries_ = other.mapEntries_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public MapCategory Clone() {
      return new MapCategory(this);
    }

    /// <summary>Field number for the "name" field.</summary>
    public const int NameFieldNumber = 1;
    private string name_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Name {
      get { return name_; }
      set {
        name_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "map_entries" field.</summary>
    public const int MapEntriesFieldNumber = 2;
    private static readonly pb::FieldCodec<global::TTF.Tokens.Model.Map.MapEntry> _repeated_mapEntries_codec
        = pb::FieldCodec.ForMessage(18, global::TTF.Tokens.Model.Map.MapEntry.Parser);
    private readonly pbc::RepeatedField<global::TTF.Tokens.Model.Map.MapEntry> mapEntries_ = new pbc::RepeatedField<global::TTF.Tokens.Model.Map.MapEntry>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<global::TTF.Tokens.Model.Map.MapEntry> MapEntries {
      get { return mapEntries_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as MapCategory);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(MapCategory other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Name != other.Name) return false;
      if(!mapEntries_.Equals(other.mapEntries_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Name.Length != 0) hash ^= Name.GetHashCode();
      hash ^= mapEntries_.GetHashCode();
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
      if (Name.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Name);
      }
      mapEntries_.WriteTo(output, _repeated_mapEntries_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Name.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Name);
      }
      size += mapEntries_.CalculateSize(_repeated_mapEntries_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(MapCategory other) {
      if (other == null) {
        return;
      }
      if (other.Name.Length != 0) {
        Name = other.Name;
      }
      mapEntries_.Add(other.mapEntries_);
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
            Name = input.ReadString();
            break;
          }
          case 18: {
            mapEntries_.AddEntriesFrom(input, _repeated_mapEntries_codec);
            break;
          }
        }
      }
    }

  }

  public sealed partial class MapEntry : pb::IMessage<MapEntry> {
    private static readonly pb::MessageParser<MapEntry> _parser = new pb::MessageParser<MapEntry>(() => new MapEntry());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<MapEntry> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TTF.Tokens.Model.Map.MapReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public MapEntry() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public MapEntry(MapEntry other) : this() {
      name_ = other.name_;
      taxonomySymbol_ = other.taxonomySymbol_;
      mapTargetReferences_ = other.mapTargetReferences_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public MapEntry Clone() {
      return new MapEntry(this);
    }

    /// <summary>Field number for the "name" field.</summary>
    public const int NameFieldNumber = 1;
    private string name_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Name {
      get { return name_; }
      set {
        name_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "taxonomy_symbol" field.</summary>
    public const int TaxonomySymbolFieldNumber = 2;
    private string taxonomySymbol_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string TaxonomySymbol {
      get { return taxonomySymbol_; }
      set {
        taxonomySymbol_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "map_target_references" field.</summary>
    public const int MapTargetReferencesFieldNumber = 3;
    private static readonly pb::FieldCodec<global::TTF.Tokens.Model.Map.MapTargetReference> _repeated_mapTargetReferences_codec
        = pb::FieldCodec.ForMessage(26, global::TTF.Tokens.Model.Map.MapTargetReference.Parser);
    private readonly pbc::RepeatedField<global::TTF.Tokens.Model.Map.MapTargetReference> mapTargetReferences_ = new pbc::RepeatedField<global::TTF.Tokens.Model.Map.MapTargetReference>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<global::TTF.Tokens.Model.Map.MapTargetReference> MapTargetReferences {
      get { return mapTargetReferences_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as MapEntry);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(MapEntry other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Name != other.Name) return false;
      if (TaxonomySymbol != other.TaxonomySymbol) return false;
      if(!mapTargetReferences_.Equals(other.mapTargetReferences_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Name.Length != 0) hash ^= Name.GetHashCode();
      if (TaxonomySymbol.Length != 0) hash ^= TaxonomySymbol.GetHashCode();
      hash ^= mapTargetReferences_.GetHashCode();
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
      if (Name.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Name);
      }
      if (TaxonomySymbol.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(TaxonomySymbol);
      }
      mapTargetReferences_.WriteTo(output, _repeated_mapTargetReferences_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Name.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Name);
      }
      if (TaxonomySymbol.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(TaxonomySymbol);
      }
      size += mapTargetReferences_.CalculateSize(_repeated_mapTargetReferences_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(MapEntry other) {
      if (other == null) {
        return;
      }
      if (other.Name.Length != 0) {
        Name = other.Name;
      }
      if (other.TaxonomySymbol.Length != 0) {
        TaxonomySymbol = other.TaxonomySymbol;
      }
      mapTargetReferences_.Add(other.mapTargetReferences_);
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
            Name = input.ReadString();
            break;
          }
          case 18: {
            TaxonomySymbol = input.ReadString();
            break;
          }
          case 26: {
            mapTargetReferences_.AddEntriesFrom(input, _repeated_mapTargetReferences_codec);
            break;
          }
        }
      }
    }

  }

  public sealed partial class MapTargetReference : pb::IMessage<MapTargetReference> {
    private static readonly pb::MessageParser<MapTargetReference> _parser = new pb::MessageParser<MapTargetReference>(() => new MapTargetReference());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<MapTargetReference> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TTF.Tokens.Model.Map.MapReflection.Descriptor.MessageTypes[2]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public MapTargetReference() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public MapTargetReference(MapTargetReference other) : this() {
      name_ = other.name_;
      platform_ = other.platform_;
      targetPath_ = other.targetPath_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public MapTargetReference Clone() {
      return new MapTargetReference(this);
    }

    /// <summary>Field number for the "name" field.</summary>
    public const int NameFieldNumber = 1;
    private string name_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Name {
      get { return name_; }
      set {
        name_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "platform" field.</summary>
    public const int PlatformFieldNumber = 2;
    private global::TTF.Tokens.Model.Map.TargetPlatform platform_ = 0;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::TTF.Tokens.Model.Map.TargetPlatform Platform {
      get { return platform_; }
      set {
        platform_ = value;
      }
    }

    /// <summary>Field number for the "target_path" field.</summary>
    public const int TargetPathFieldNumber = 3;
    private string targetPath_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string TargetPath {
      get { return targetPath_; }
      set {
        targetPath_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as MapTargetReference);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(MapTargetReference other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Name != other.Name) return false;
      if (Platform != other.Platform) return false;
      if (TargetPath != other.TargetPath) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Name.Length != 0) hash ^= Name.GetHashCode();
      if (Platform != 0) hash ^= Platform.GetHashCode();
      if (TargetPath.Length != 0) hash ^= TargetPath.GetHashCode();
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
      if (Name.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Name);
      }
      if (Platform != 0) {
        output.WriteRawTag(16);
        output.WriteEnum((int) Platform);
      }
      if (TargetPath.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(TargetPath);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Name.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Name);
      }
      if (Platform != 0) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Platform);
      }
      if (TargetPath.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(TargetPath);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(MapTargetReference other) {
      if (other == null) {
        return;
      }
      if (other.Name.Length != 0) {
        Name = other.Name;
      }
      if (other.Platform != 0) {
        Platform = other.Platform;
      }
      if (other.TargetPath.Length != 0) {
        TargetPath = other.TargetPath;
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
            Name = input.ReadString();
            break;
          }
          case 16: {
            Platform = (global::TTF.Tokens.Model.Map.TargetPlatform) input.ReadEnum();
            break;
          }
          case 26: {
            TargetPath = input.ReadString();
            break;
          }
        }
      }
    }

  }

  /// <summary>
  ///use this to create a Code, Implementation or other reference map.
  /// </summary>
  public sealed partial class CodeMap : pb::IMessage<CodeMap> {
    private static readonly pb::MessageParser<CodeMap> _parser = new pb::MessageParser<CodeMap>(() => new CodeMap());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<CodeMap> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::TTF.Tokens.Model.Map.MapReflection.Descriptor.MessageTypes[3]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CodeMap() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CodeMap(CodeMap other) : this() {
      mappedCategories_ = other.mappedCategories_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CodeMap Clone() {
      return new CodeMap(this);
    }

    /// <summary>Field number for the "mapped_categories" field.</summary>
    public const int MappedCategoriesFieldNumber = 1;
    private static readonly pb::FieldCodec<global::TTF.Tokens.Model.Map.MapCategory> _repeated_mappedCategories_codec
        = pb::FieldCodec.ForMessage(10, global::TTF.Tokens.Model.Map.MapCategory.Parser);
    private readonly pbc::RepeatedField<global::TTF.Tokens.Model.Map.MapCategory> mappedCategories_ = new pbc::RepeatedField<global::TTF.Tokens.Model.Map.MapCategory>();
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<global::TTF.Tokens.Model.Map.MapCategory> MappedCategories {
      get { return mappedCategories_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as CodeMap);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(CodeMap other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if(!mappedCategories_.Equals(other.mappedCategories_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      hash ^= mappedCategories_.GetHashCode();
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
      mappedCategories_.WriteTo(output, _repeated_mappedCategories_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      size += mappedCategories_.CalculateSize(_repeated_mappedCategories_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(CodeMap other) {
      if (other == null) {
        return;
      }
      mappedCategories_.Add(other.mappedCategories_);
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
            mappedCategories_.AddEntriesFrom(input, _repeated_mappedCategories_codec);
            break;
          }
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code
