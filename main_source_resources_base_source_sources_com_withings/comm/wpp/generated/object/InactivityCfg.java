package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class InactivityCfg extends h {
    public short fromHour;
    public short fromMinute;
    public short toHour;
    public short toMinute;
    public short wday;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 5;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2477;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.fromHour = readUnsignedByte(byteBuffer);
        this.fromMinute = readUnsignedByte(byteBuffer);
        this.toHour = readUnsignedByte(byteBuffer);
        this.toMinute = readUnsignedByte(byteBuffer);
        this.wday = readUnsignedByte(byteBuffer);
    }

    public InactivityCfg setFromHour(short s11) {
        this.fromHour = s11;
        return this;
    }

    public InactivityCfg setFromMinute(short s11) {
        this.fromMinute = s11;
        return this;
    }

    public InactivityCfg setToHour(short s11) {
        this.toHour = s11;
        return this;
    }

    public InactivityCfg setToMinute(short s11) {
        this.toMinute = s11;
        return this;
    }

    public InactivityCfg setWday(short s11) {
        this.wday = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.fromHour);
        writeUnsignedByte(e11, this.fromMinute);
        writeUnsignedByte(e11, this.toHour);
        writeUnsignedByte(e11, this.toMinute);
        writeUnsignedByte(e11, this.wday);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InactivityCfg(");
        return e.a(q.d(q.d(q.d(q.d(new StringBuilder("fromHour = "), this.fromHour, sb2, ", ", "fromMinute = "), this.fromMinute, sb2, ", ", "toHour = "), this.toHour, sb2, ", ", "toMinute = "), this.toMinute, sb2, ", ", "wday = "), this.wday, sb2, ")");
    }
}
