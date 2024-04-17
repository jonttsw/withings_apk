package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class NotificationAppHashIdCrc32 extends h {
    public long hashId;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2407;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.hashId = readUnsignedInt(byteBuffer);
    }

    public NotificationAppHashIdCrc32 setHashId(long j5) {
        this.hashId = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.hashId);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return j.b(new StringBuilder("hashId = "), this.hashId, new StringBuilder("NotificationAppHashIdCrc32("), ")");
    }
}
