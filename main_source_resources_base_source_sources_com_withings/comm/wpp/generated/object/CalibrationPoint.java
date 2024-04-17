package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class CalibrationPoint extends h {
    public short pointIdx;
    public int reference;
    public int value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 9;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2352;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.pointIdx = readUnsignedByte(byteBuffer);
        this.reference = readInt(byteBuffer);
        this.value = readInt(byteBuffer);
    }

    public CalibrationPoint setPointIdx(short s11) {
        this.pointIdx = s11;
        return this;
    }

    public CalibrationPoint setReference(int i11) {
        this.reference = i11;
        return this;
    }

    public CalibrationPoint setValue(int i11) {
        this.value = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.pointIdx);
        writeInt(e11, this.reference);
        writeInt(e11, this.value);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CalibrationPoint(");
        return e.a(q.d(q.d(new StringBuilder("pointIdx = "), this.pointIdx, sb2, ", ", "reference = "), this.reference, sb2, ", ", "value = "), this.value, sb2, ")");
    }
}
