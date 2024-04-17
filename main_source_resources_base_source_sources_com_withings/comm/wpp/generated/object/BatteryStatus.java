package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class BatteryStatus extends h {
    public static final short BATTERY_STATUS_SAMPLES_NB_MAX_VAL = 32;
    public static final short CHARGING = 0;
    public static final short CRITICAL = 3;
    public static final short LOW = 1;
    public static final short OK = 2;
    public long batteryMv;
    public short batteryPercent;
    public short batteryState;
    public long reserved;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 10;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1284;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.batteryPercent = readUnsignedByte(byteBuffer);
        this.batteryState = readUnsignedByte(byteBuffer);
        this.batteryMv = readUnsignedInt(byteBuffer);
        this.reserved = readUnsignedInt(byteBuffer);
    }

    public BatteryStatus setBatteryMv(long j5) {
        this.batteryMv = j5;
        return this;
    }

    public BatteryStatus setBatteryPercent(short s11) {
        this.batteryPercent = s11;
        return this;
    }

    public BatteryStatus setBatteryState(short s11) {
        this.batteryState = s11;
        return this;
    }

    public BatteryStatus setReserved(long j5) {
        this.reserved = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.batteryPercent);
        writeUnsignedByte(e11, this.batteryState);
        writeUnsignedInt(e11, this.batteryMv);
        writeUnsignedInt(e11, this.reserved);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BatteryStatus(");
        StringBuilder d11 = q.d(q.d(new StringBuilder("batteryPercent = "), this.batteryPercent, sb2, ", ", "batteryState = "), this.batteryState, sb2, ", ", "batteryMv = ");
        d11.append(this.batteryMv);
        sb2.append(d11.toString());
        sb2.append(", ");
        return j.b(new StringBuilder("reserved = "), this.reserved, sb2, ")");
    }
}
