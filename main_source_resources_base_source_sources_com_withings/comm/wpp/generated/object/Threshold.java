package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Threshold extends h {
    public short enabled;
    public byte exponent;

    /* renamed from: id  reason: collision with root package name */
    public int f33275id;
    public int value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2469;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33275id = readUnsignedShort(byteBuffer);
        this.enabled = readUnsignedByte(byteBuffer);
        this.exponent = readByte(byteBuffer);
        this.value = readInt(byteBuffer);
    }

    public Threshold setEnabled(short s11) {
        this.enabled = s11;
        return this;
    }

    public Threshold setExponent(byte b10) {
        this.exponent = b10;
        return this;
    }

    public Threshold setId(int i11) {
        this.f33275id = i11;
        return this;
    }

    public Threshold setValue(int i11) {
        this.value = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.f33275id);
        writeUnsignedByte(e11, this.enabled);
        writeByte(e11, this.exponent);
        writeInt(e11, this.value);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Threshold(");
        return e.a(q.d(q.d(q.d(new StringBuilder("id = "), this.f33275id, sb2, ", ", "enabled = "), this.enabled, sb2, ", ", "exponent = "), this.exponent, sb2, ", ", "value = "), this.value, sb2, ")");
    }
}
