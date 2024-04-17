package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class EventV1Deprecated extends h {
    public long data;
    public int time;
    public short type;
    public long userid;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 13;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_EVENT_V1_DEPRECATED;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.time = readInt(byteBuffer);
        this.userid = readUnsignedInt(byteBuffer);
        this.type = readUnsignedByte(byteBuffer);
        this.data = readUnsignedInt(byteBuffer);
    }

    public EventV1Deprecated setData(long j5) {
        this.data = j5;
        return this;
    }

    public EventV1Deprecated setTime(int i11) {
        this.time = i11;
        return this;
    }

    public EventV1Deprecated setType(short s11) {
        this.type = s11;
        return this;
    }

    public EventV1Deprecated setUserid(long j5) {
        this.userid = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.time);
        writeUnsignedInt(e11, this.userid);
        writeUnsignedByte(e11, this.type);
        writeUnsignedInt(e11, this.data);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventV1Deprecated(");
        StringBuilder d11 = q.d(new StringBuilder("time = "), this.time, sb2, ", ", "userid = ");
        d11.append(this.userid);
        sb2.append(d11.toString());
        sb2.append(", ");
        return j.b(q.d(new StringBuilder("type = "), this.type, sb2, ", ", "data = "), this.data, sb2, ")");
    }
}
