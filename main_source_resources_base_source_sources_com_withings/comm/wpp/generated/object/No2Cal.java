package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class No2Cal extends h {
    public static final short GET_MEASURES = 2;
    public static final short START = 0;
    public static final short STOP = 1;
    public short cmd;
    public long reserved1;
    public long reserved2;
    public long timestamp;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 13;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_NO2_CAL;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readUnsignedByte(byteBuffer);
        this.timestamp = readUnsignedInt(byteBuffer);
        this.reserved1 = readUnsignedInt(byteBuffer);
        this.reserved2 = readUnsignedInt(byteBuffer);
    }

    public No2Cal setCmd(short s11) {
        this.cmd = s11;
        return this;
    }

    public No2Cal setReserved1(long j5) {
        this.reserved1 = j5;
        return this;
    }

    public No2Cal setReserved2(long j5) {
        this.reserved2 = j5;
        return this;
    }

    public No2Cal setTimestamp(long j5) {
        this.timestamp = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.cmd);
        writeUnsignedInt(e11, this.timestamp);
        writeUnsignedInt(e11, this.reserved1);
        writeUnsignedInt(e11, this.reserved2);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("No2Cal(");
        StringBuilder d11 = q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "timestamp = ");
        d11.append(this.timestamp);
        sb2.append(d11.toString());
        sb2.append(", ");
        sb2.append("reserved1 = " + this.reserved1);
        sb2.append(", ");
        return j.b(new StringBuilder("reserved2 = "), this.reserved2, sb2, ")");
    }
}
