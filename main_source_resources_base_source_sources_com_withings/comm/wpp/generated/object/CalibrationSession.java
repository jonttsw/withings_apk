package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class CalibrationSession extends h {
    public long param0;
    public long param1;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2332;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.param0 = readUnsignedInt(byteBuffer);
        this.param1 = readUnsignedInt(byteBuffer);
    }

    public CalibrationSession setParam0(long j5) {
        this.param0 = j5;
        return this;
    }

    public CalibrationSession setParam1(long j5) {
        this.param1 = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.param0);
        writeUnsignedInt(e11, this.param1);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CalibrationSession(");
        sb2.append("param0 = " + this.param0);
        sb2.append(", ");
        return j.b(new StringBuilder("param1 = "), this.param1, sb2, ")");
    }
}
