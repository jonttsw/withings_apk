package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class NetupdateProgress extends h {
    public short percent;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 1;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1040;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.percent = readUnsignedByte(byteBuffer);
    }

    public NetupdateProgress setPercent(short s11) {
        this.percent = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.percent);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("percent = "), this.percent, new StringBuilder("NetupdateProgress("), ")");
    }
}
