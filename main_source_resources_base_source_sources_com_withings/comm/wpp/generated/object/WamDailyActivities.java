package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WamDailyActivities extends h {
    public long ascent;
    public long calories;
    public long descent;
    public long distance;
    public long steps;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 20;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1287;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.steps = readUnsignedInt(byteBuffer);
        this.distance = readUnsignedInt(byteBuffer);
        this.ascent = readUnsignedInt(byteBuffer);
        this.descent = readUnsignedInt(byteBuffer);
        this.calories = readUnsignedInt(byteBuffer);
    }

    public WamDailyActivities setAscent(long j5) {
        this.ascent = j5;
        return this;
    }

    public WamDailyActivities setCalories(long j5) {
        this.calories = j5;
        return this;
    }

    public WamDailyActivities setDescent(long j5) {
        this.descent = j5;
        return this;
    }

    public WamDailyActivities setDistance(long j5) {
        this.distance = j5;
        return this;
    }

    public WamDailyActivities setSteps(long j5) {
        this.steps = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.steps);
        writeUnsignedInt(e11, this.distance);
        writeUnsignedInt(e11, this.ascent);
        writeUnsignedInt(e11, this.descent);
        writeUnsignedInt(e11, this.calories);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WamDailyActivities(");
        sb2.append("steps = " + this.steps);
        sb2.append(", ");
        sb2.append("distance = " + this.distance);
        sb2.append(", ");
        sb2.append("ascent = " + this.ascent);
        sb2.append(", ");
        sb2.append("descent = " + this.descent);
        sb2.append(", ");
        return j.b(new StringBuilder("calories = "), this.calories, sb2, ")");
    }
}
