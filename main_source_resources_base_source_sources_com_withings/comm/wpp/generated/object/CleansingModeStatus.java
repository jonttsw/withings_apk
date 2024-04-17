package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class CleansingModeStatus extends h {
    public short status;
    public long timeoutCleansingOngoingSec;
    public long timeoutWaitMixtureSec;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 9;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_CLEANSING_MODE_STATUS;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.status = readUnsignedByte(byteBuffer);
        this.timeoutWaitMixtureSec = readUnsignedInt(byteBuffer);
        this.timeoutCleansingOngoingSec = readUnsignedInt(byteBuffer);
    }

    public CleansingModeStatus setStatus(short s11) {
        this.status = s11;
        return this;
    }

    public CleansingModeStatus setTimeoutCleansingOngoingSec(long j5) {
        this.timeoutCleansingOngoingSec = j5;
        return this;
    }

    public CleansingModeStatus setTimeoutWaitMixtureSec(long j5) {
        this.timeoutWaitMixtureSec = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.status);
        writeUnsignedInt(e11, this.timeoutWaitMixtureSec);
        writeUnsignedInt(e11, this.timeoutCleansingOngoingSec);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CleansingModeStatus(");
        StringBuilder d11 = q.d(new StringBuilder("status = "), this.status, sb2, ", ", "timeoutWaitMixtureSec = ");
        d11.append(this.timeoutWaitMixtureSec);
        sb2.append(d11.toString());
        sb2.append(", ");
        return j.b(new StringBuilder("timeoutCleansingOngoingSec = "), this.timeoutCleansingOngoingSec, sb2, ")");
    }
}
