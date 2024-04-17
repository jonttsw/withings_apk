package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class DemoStart extends h {
    public long timestamp;
    public short type;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 5;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1293;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readUnsignedByte(byteBuffer);
        this.timestamp = readUnsignedInt(byteBuffer);
    }

    public DemoStart setTimestamp(long j5) {
        this.timestamp = j5;
        return this;
    }

    public DemoStart setType(short s11) {
        this.type = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.type);
        writeUnsignedInt(e11, this.timestamp);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DemoStart(");
        return j.b(q.d(new StringBuilder("type = "), this.type, sb2, ", ", "timestamp = "), this.timestamp, sb2, ")");
    }
}
