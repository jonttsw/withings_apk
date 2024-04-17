package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Max8614xChannelStats extends h {
    public long acAdc;
    public long acCurrentPa;
    public short channelId;
    public long dcAdc;
    public long dcCurrentPa;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 17;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2480;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.channelId = readUnsignedByte(byteBuffer);
        this.acAdc = readUnsignedInt(byteBuffer);
        this.acCurrentPa = readUnsignedInt(byteBuffer);
        this.dcAdc = readUnsignedInt(byteBuffer);
        this.dcCurrentPa = readUnsignedInt(byteBuffer);
    }

    public Max8614xChannelStats setAcAdc(long j5) {
        this.acAdc = j5;
        return this;
    }

    public Max8614xChannelStats setAcCurrentPa(long j5) {
        this.acCurrentPa = j5;
        return this;
    }

    public Max8614xChannelStats setChannelId(short s11) {
        this.channelId = s11;
        return this;
    }

    public Max8614xChannelStats setDcAdc(long j5) {
        this.dcAdc = j5;
        return this;
    }

    public Max8614xChannelStats setDcCurrentPa(long j5) {
        this.dcCurrentPa = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.channelId);
        writeUnsignedInt(e11, this.acAdc);
        writeUnsignedInt(e11, this.acCurrentPa);
        writeUnsignedInt(e11, this.dcAdc);
        writeUnsignedInt(e11, this.dcCurrentPa);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Max8614xChannelStats(");
        StringBuilder d11 = q.d(new StringBuilder("channelId = "), this.channelId, sb2, ", ", "acAdc = ");
        d11.append(this.acAdc);
        sb2.append(d11.toString());
        sb2.append(", ");
        sb2.append("acCurrentPa = " + this.acCurrentPa);
        sb2.append(", ");
        sb2.append("dcAdc = " + this.dcAdc);
        sb2.append(", ");
        return j.b(new StringBuilder("dcCurrentPa = "), this.dcCurrentPa, sb2, ")");
    }
}
