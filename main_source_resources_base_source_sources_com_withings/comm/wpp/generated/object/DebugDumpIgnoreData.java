package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class DebugDumpIgnoreData extends h {
    public static final short REASON_CORRUPTED = 1;
    public static final short REASON_NONE = 0;
    public long reason;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 293;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.reason = readUnsignedInt(byteBuffer);
    }

    public DebugDumpIgnoreData setReason(long j5) {
        this.reason = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.reason);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return j.b(new StringBuilder("reason = "), this.reason, new StringBuilder("DebugDumpIgnoreData("), ")");
    }
}
