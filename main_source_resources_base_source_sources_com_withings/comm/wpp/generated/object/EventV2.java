package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class EventV2 extends h {
    public long epoch;
    public long type;
    public long userid;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 12;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2473;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readUnsignedInt(byteBuffer);
        this.epoch = readUnsignedInt(byteBuffer);
        this.userid = readUnsignedInt(byteBuffer);
    }

    public EventV2 setEpoch(long j5) {
        this.epoch = j5;
        return this;
    }

    public EventV2 setType(long j5) {
        this.type = j5;
        return this;
    }

    public EventV2 setUserid(long j5) {
        this.userid = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.type);
        writeUnsignedInt(e11, this.epoch);
        writeUnsignedInt(e11, this.userid);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventV2(");
        sb2.append("type = " + this.type);
        sb2.append(", ");
        sb2.append("epoch = " + this.epoch);
        sb2.append(", ");
        return j.b(new StringBuilder("userid = "), this.userid, sb2, ")");
    }
}
