package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class UnitConversionParameters extends h {
    public int gain;
    public int offset;
    public long qfix;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 12;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 327;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.offset = readInt(byteBuffer);
        this.gain = readInt(byteBuffer);
        this.qfix = readUnsignedInt(byteBuffer);
    }

    public UnitConversionParameters setGain(int i11) {
        this.gain = i11;
        return this;
    }

    public UnitConversionParameters setOffset(int i11) {
        this.offset = i11;
        return this;
    }

    public UnitConversionParameters setQfix(long j5) {
        this.qfix = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.offset);
        writeInt(e11, this.gain);
        writeUnsignedInt(e11, this.qfix);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UnitConversionParameters(");
        return j.b(q.d(q.d(new StringBuilder("offset = "), this.offset, sb2, ", ", "gain = "), this.gain, sb2, ", ", "qfix = "), this.qfix, sb2, ")");
    }
}
