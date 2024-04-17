package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class StoredMeasureData extends h {
    public short exponent;
    public int type;
    public int value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 279;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.value = readInt(byteBuffer);
        this.type = readUnsignedShort(byteBuffer);
        this.exponent = readShort(byteBuffer);
    }

    public StoredMeasureData setExponent(short s11) {
        this.exponent = s11;
        return this;
    }

    public StoredMeasureData setType(int i11) {
        this.type = i11;
        return this;
    }

    public StoredMeasureData setValue(int i11) {
        this.value = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.value);
        writeUnsignedShort(e11, this.type);
        writeShort(e11, this.exponent);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StoredMeasureData(");
        return e.a(q.d(q.d(new StringBuilder("value = "), this.value, sb2, ", ", "type = "), this.type, sb2, ", ", "exponent = "), this.exponent, sb2, ")");
    }
}
