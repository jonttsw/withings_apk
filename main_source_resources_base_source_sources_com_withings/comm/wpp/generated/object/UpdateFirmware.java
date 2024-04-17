package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class UpdateFirmware extends h {
    public long fwSize;
    public short fwType;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 5;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1025;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.fwType = readUnsignedByte(byteBuffer);
        this.fwSize = readUnsignedInt(byteBuffer);
    }

    public UpdateFirmware setFwSize(long j5) {
        this.fwSize = j5;
        return this;
    }

    public UpdateFirmware setFwType(short s11) {
        this.fwType = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.fwType);
        writeUnsignedInt(e11, this.fwSize);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateFirmware(");
        return j.b(q.d(new StringBuilder("fwType = "), this.fwType, sb2, ", ", "fwSize = "), this.fwSize, sb2, ")");
    }
}
