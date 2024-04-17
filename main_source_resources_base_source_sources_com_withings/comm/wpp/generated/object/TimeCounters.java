package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class TimeCounters extends h {
    public long rtcCounterLsb;
    public long rtcCounterMsb;
    public long rtcMsLsb;
    public long rtcMsMsb;
    public long rtcSeconds;
    public long utc;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 24;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2371;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.rtcCounterMsb = readUnsignedInt(byteBuffer);
        this.rtcCounterLsb = readUnsignedInt(byteBuffer);
        this.rtcMsMsb = readUnsignedInt(byteBuffer);
        this.rtcMsLsb = readUnsignedInt(byteBuffer);
        this.rtcSeconds = readUnsignedInt(byteBuffer);
        this.utc = readUnsignedInt(byteBuffer);
    }

    public TimeCounters setRtcCounterLsb(long j5) {
        this.rtcCounterLsb = j5;
        return this;
    }

    public TimeCounters setRtcCounterMsb(long j5) {
        this.rtcCounterMsb = j5;
        return this;
    }

    public TimeCounters setRtcMsLsb(long j5) {
        this.rtcMsLsb = j5;
        return this;
    }

    public TimeCounters setRtcMsMsb(long j5) {
        this.rtcMsMsb = j5;
        return this;
    }

    public TimeCounters setRtcSeconds(long j5) {
        this.rtcSeconds = j5;
        return this;
    }

    public TimeCounters setUtc(long j5) {
        this.utc = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.rtcCounterMsb);
        writeUnsignedInt(e11, this.rtcCounterLsb);
        writeUnsignedInt(e11, this.rtcMsMsb);
        writeUnsignedInt(e11, this.rtcMsLsb);
        writeUnsignedInt(e11, this.rtcSeconds);
        writeUnsignedInt(e11, this.utc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TimeCounters(");
        sb2.append("rtcCounterMsb = " + this.rtcCounterMsb);
        sb2.append(", ");
        sb2.append("rtcCounterLsb = " + this.rtcCounterLsb);
        sb2.append(", ");
        sb2.append("rtcMsMsb = " + this.rtcMsMsb);
        sb2.append(", ");
        sb2.append("rtcMsLsb = " + this.rtcMsLsb);
        sb2.append(", ");
        sb2.append("rtcSeconds = " + this.rtcSeconds);
        sb2.append(", ");
        return j.b(new StringBuilder("utc = "), this.utc, sb2, ")");
    }
}
