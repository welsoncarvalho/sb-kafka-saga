/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.sb.store.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class NewPurchase extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8496079868733619736L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NewPurchase\",\"namespace\":\"com.example.sb.store.schema\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"clientId\",\"type\":\"string\"},{\"name\":\"payMethodId\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<NewPurchase> ENCODER =
      new BinaryMessageEncoder<NewPurchase>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NewPurchase> DECODER =
      new BinaryMessageDecoder<NewPurchase>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<NewPurchase> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<NewPurchase> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<NewPurchase> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<NewPurchase>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this NewPurchase to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a NewPurchase from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a NewPurchase instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static NewPurchase fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence id;
   private java.lang.CharSequence clientId;
   private java.lang.CharSequence payMethodId;
   private double value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NewPurchase() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param clientId The new value for clientId
   * @param payMethodId The new value for payMethodId
   * @param value The new value for value
   */
  public NewPurchase(java.lang.CharSequence id, java.lang.CharSequence clientId, java.lang.CharSequence payMethodId, java.lang.Double value) {
    this.id = id;
    this.clientId = clientId;
    this.payMethodId = payMethodId;
    this.value = value;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return clientId;
    case 2: return payMethodId;
    case 3: return value;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: clientId = (java.lang.CharSequence)value$; break;
    case 2: payMethodId = (java.lang.CharSequence)value$; break;
    case 3: value = (java.lang.Double)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'clientId' field.
   * @return The value of the 'clientId' field.
   */
  public java.lang.CharSequence getClientId() {
    return clientId;
  }


  /**
   * Sets the value of the 'clientId' field.
   * @param value the value to set.
   */
  public void setClientId(java.lang.CharSequence value) {
    this.clientId = value;
  }

  /**
   * Gets the value of the 'payMethodId' field.
   * @return The value of the 'payMethodId' field.
   */
  public java.lang.CharSequence getPayMethodId() {
    return payMethodId;
  }


  /**
   * Sets the value of the 'payMethodId' field.
   * @param value the value to set.
   */
  public void setPayMethodId(java.lang.CharSequence value) {
    this.payMethodId = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public double getValue() {
    return value;
  }


  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(double value) {
    this.value = value;
  }

  /**
   * Creates a new NewPurchase RecordBuilder.
   * @return A new NewPurchase RecordBuilder
   */
  public static com.example.sb.store.schema.NewPurchase.Builder newBuilder() {
    return new com.example.sb.store.schema.NewPurchase.Builder();
  }

  /**
   * Creates a new NewPurchase RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NewPurchase RecordBuilder
   */
  public static com.example.sb.store.schema.NewPurchase.Builder newBuilder(com.example.sb.store.schema.NewPurchase.Builder other) {
    if (other == null) {
      return new com.example.sb.store.schema.NewPurchase.Builder();
    } else {
      return new com.example.sb.store.schema.NewPurchase.Builder(other);
    }
  }

  /**
   * Creates a new NewPurchase RecordBuilder by copying an existing NewPurchase instance.
   * @param other The existing instance to copy.
   * @return A new NewPurchase RecordBuilder
   */
  public static com.example.sb.store.schema.NewPurchase.Builder newBuilder(com.example.sb.store.schema.NewPurchase other) {
    if (other == null) {
      return new com.example.sb.store.schema.NewPurchase.Builder();
    } else {
      return new com.example.sb.store.schema.NewPurchase.Builder(other);
    }
  }

  /**
   * RecordBuilder for NewPurchase instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NewPurchase>
    implements org.apache.avro.data.RecordBuilder<NewPurchase> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence clientId;
    private java.lang.CharSequence payMethodId;
    private double value;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.sb.store.schema.NewPurchase.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.clientId)) {
        this.clientId = data().deepCopy(fields()[1].schema(), other.clientId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.payMethodId)) {
        this.payMethodId = data().deepCopy(fields()[2].schema(), other.payMethodId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.value)) {
        this.value = data().deepCopy(fields()[3].schema(), other.value);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing NewPurchase instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.sb.store.schema.NewPurchase other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.clientId)) {
        this.clientId = data().deepCopy(fields()[1].schema(), other.clientId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.payMethodId)) {
        this.payMethodId = data().deepCopy(fields()[2].schema(), other.payMethodId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.value)) {
        this.value = data().deepCopy(fields()[3].schema(), other.value);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.example.sb.store.schema.NewPurchase.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.example.sb.store.schema.NewPurchase.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'clientId' field.
      * @return The value.
      */
    public java.lang.CharSequence getClientId() {
      return clientId;
    }


    /**
      * Sets the value of the 'clientId' field.
      * @param value The value of 'clientId'.
      * @return This builder.
      */
    public com.example.sb.store.schema.NewPurchase.Builder setClientId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.clientId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'clientId' field has been set.
      * @return True if the 'clientId' field has been set, false otherwise.
      */
    public boolean hasClientId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'clientId' field.
      * @return This builder.
      */
    public com.example.sb.store.schema.NewPurchase.Builder clearClientId() {
      clientId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'payMethodId' field.
      * @return The value.
      */
    public java.lang.CharSequence getPayMethodId() {
      return payMethodId;
    }


    /**
      * Sets the value of the 'payMethodId' field.
      * @param value The value of 'payMethodId'.
      * @return This builder.
      */
    public com.example.sb.store.schema.NewPurchase.Builder setPayMethodId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.payMethodId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'payMethodId' field has been set.
      * @return True if the 'payMethodId' field has been set, false otherwise.
      */
    public boolean hasPayMethodId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'payMethodId' field.
      * @return This builder.
      */
    public com.example.sb.store.schema.NewPurchase.Builder clearPayMethodId() {
      payMethodId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public double getValue() {
      return value;
    }


    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public com.example.sb.store.schema.NewPurchase.Builder setValue(double value) {
      validate(fields()[3], value);
      this.value = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public com.example.sb.store.schema.NewPurchase.Builder clearValue() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NewPurchase build() {
      try {
        NewPurchase record = new NewPurchase();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.clientId = fieldSetFlags()[1] ? this.clientId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.payMethodId = fieldSetFlags()[2] ? this.payMethodId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.value = fieldSetFlags()[3] ? this.value : (java.lang.Double) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<NewPurchase>
    WRITER$ = (org.apache.avro.io.DatumWriter<NewPurchase>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NewPurchase>
    READER$ = (org.apache.avro.io.DatumReader<NewPurchase>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.id);

    out.writeString(this.clientId);

    out.writeString(this.payMethodId);

    out.writeDouble(this.value);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);

      this.clientId = in.readString(this.clientId instanceof Utf8 ? (Utf8)this.clientId : null);

      this.payMethodId = in.readString(this.payMethodId instanceof Utf8 ? (Utf8)this.payMethodId : null);

      this.value = in.readDouble();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          break;

        case 1:
          this.clientId = in.readString(this.clientId instanceof Utf8 ? (Utf8)this.clientId : null);
          break;

        case 2:
          this.payMethodId = in.readString(this.payMethodId instanceof Utf8 ? (Utf8)this.payMethodId : null);
          break;

        case 3:
          this.value = in.readDouble();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










