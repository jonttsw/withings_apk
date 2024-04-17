package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class RawDataStreamControl extends h {
    public long cmd;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2400;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readUnsignedInt(byteBuffer);
    }

    public RawDataStreamControl setCmd(long j5) {
        this.cmd = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.cmd);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return j.b(new StringBuilder("cmd = "), this.cmd, new StringBuilder("RawDataStreamControl("), ")");
    }
}
