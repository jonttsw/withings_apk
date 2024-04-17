package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class TrackerHistory extends h {
    public long day0;
    public long day1;
    public long day2;
    public long day3;
    public long day4;
    public long day5;
    public long day6;
    public short historyType;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 29;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_TRACKER_HISTORY;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.day0 = readUnsignedInt(byteBuffer);
        this.day1 = readUnsignedInt(byteBuffer);
        this.day2 = readUnsignedInt(byteBuffer);
        this.day3 = readUnsignedInt(byteBuffer);
        this.day4 = readUnsignedInt(byteBuffer);
        this.day5 = readUnsignedInt(byteBuffer);
        this.day6 = readUnsignedInt(byteBuffer);
        this.historyType = readUnsignedByte(byteBuffer);
    }

    public TrackerHistory setDay0(long j5) {
        this.day0 = j5;
        return this;
    }

    public TrackerHistory setDay1(long j5) {
        this.day1 = j5;
        return this;
    }

    public TrackerHistory setDay2(long j5) {
        this.day2 = j5;
        return this;
    }

    public TrackerHistory setDay3(long j5) {
        this.day3 = j5;
        return this;
    }

    public TrackerHistory setDay4(long j5) {
        this.day4 = j5;
        return this;
    }

    public TrackerHistory setDay5(long j5) {
        this.day5 = j5;
        return this;
    }

    public TrackerHistory setDay6(long j5) {
        this.day6 = j5;
        return this;
    }

    public TrackerHistory setHistoryType(short s11) {
        this.historyType = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedInt(e11, this.day0);
        writeUnsignedInt(e11, this.day1);
        writeUnsignedInt(e11, this.day2);
        writeUnsignedInt(e11, this.day3);
        writeUnsignedInt(e11, this.day4);
        writeUnsignedInt(e11, this.day5);
        writeUnsignedInt(e11, this.day6);
        writeUnsignedByte(e11, this.historyType);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TrackerHistory(");
        sb2.append("day0 = " + this.day0);
        sb2.append(", ");
        sb2.append("day1 = " + this.day1);
        sb2.append(", ");
        sb2.append("day2 = " + this.day2);
        sb2.append(", ");
        sb2.append("day3 = " + this.day3);
        sb2.append(", ");
        sb2.append("day4 = " + this.day4);
        sb2.append(", ");
        sb2.append("day5 = " + this.day5);
        sb2.append(", ");
        sb2.append("day6 = " + this.day6);
        sb2.append(", ");
        return e.a(new StringBuilder("historyType = "), this.historyType, sb2, ")");
    }
}
