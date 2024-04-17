package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class CycleTrackingCycle extends h {
    public long confirmedEnd;
    public long confirmedStart;
    public long predictedOvulationEnd;
    public long predictedOvulationStart;
    public long predictedPeriodEnd;
    public long predictedPeriodStart;
    public long start;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 28;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_CYCLE_TRACKING_CYCLE;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.start = readUnsignedInt(byteBuffer);
        this.confirmedStart = readUnsignedInt(byteBuffer);
        this.confirmedEnd = readUnsignedInt(byteBuffer);
        this.predictedPeriodStart = readUnsignedInt(byteBuffer);
        this.predictedPeriodEnd = readUnsignedInt(byteBuffer);
        this.predictedOvulationStart = readUnsignedInt(byteBuffer);
        this.predictedOvulationEnd = readUnsignedInt(byteBuffer);
    }

    public CycleTrackingCycle setConfirmedEnd(long j5) {
        this.confirmedEnd = j5;
        return this;
    }

    public CycleTrackingCycle setConfirmedStart(long j5) {
        this.confirmedStart = j5;
        return this;
    }

    public CycleTrackingCycle setPredictedOvulationEnd(long j5) {
        this.predictedOvulationEnd = j5;
        return this;
    }

    public CycleTrackingCycle setPredictedOvulationStart(long j5) {
        this.predictedOvulationStart = j5;
        return this;
    }

    public CycleTrackingCycle setPredictedPeriodEnd(long j5) {
        this.predictedPeriodEnd = j5;
        return this;
    }

    public CycleTrackingCycle setPredictedPeriodStart(long j5) {
        this.predictedPeriodStart = j5;
        return this;
    }

    public CycleTrackingCycle setStart(long j5) {
        this.start = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.start);
        writeUnsignedInt(e11, this.confirmedStart);
        writeUnsignedInt(e11, this.confirmedEnd);
        writeUnsignedInt(e11, this.predictedPeriodStart);
        writeUnsignedInt(e11, this.predictedPeriodEnd);
        writeUnsignedInt(e11, this.predictedOvulationStart);
        writeUnsignedInt(e11, this.predictedOvulationEnd);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CycleTrackingCycle(");
        sb2.append("start = " + this.start);
        sb2.append(", ");
        sb2.append("confirmedStart = " + this.confirmedStart);
        sb2.append(", ");
        sb2.append("confirmedEnd = " + this.confirmedEnd);
        sb2.append(", ");
        sb2.append("predictedPeriodStart = " + this.predictedPeriodStart);
        sb2.append(", ");
        sb2.append("predictedPeriodEnd = " + this.predictedPeriodEnd);
        sb2.append(", ");
        sb2.append("predictedOvulationStart = " + this.predictedOvulationStart);
        sb2.append(", ");
        return j.b(new StringBuilder("predictedOvulationEnd = "), this.predictedOvulationEnd, sb2, ")");
    }
}
