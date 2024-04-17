package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class TempCalReply extends h {
    public short pointIdx;
    public int rawValue;
    public int tempMili;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 9;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2350;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.pointIdx = readUnsignedByte(byteBuffer);
        this.tempMili = readInt(byteBuffer);
        this.rawValue = readInt(byteBuffer);
    }

    public TempCalReply setPointIdx(short s11) {
        this.pointIdx = s11;
        return this;
    }

    public TempCalReply setRawValue(int i11) {
        this.rawValue = i11;
        return this;
    }

    public TempCalReply setTempMili(int i11) {
        this.tempMili = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.pointIdx);
        writeInt(e11, this.tempMili);
        writeInt(e11, this.rawValue);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TempCalReply(");
        return e.a(q.d(q.d(new StringBuilder("pointIdx = "), this.pointIdx, sb2, ", ", "tempMili = "), this.tempMili, sb2, ", ", "rawValue = "), this.rawValue, sb2, ")");
    }
}
