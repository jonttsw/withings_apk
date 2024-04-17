package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Alarm extends h {
    public short hour;
    public short mday;
    public short minute;
    public short month;
    public short span;
    public short wday;
    public short year;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 7;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_ALARM;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.hour = readUnsignedByte(byteBuffer);
        this.minute = readUnsignedByte(byteBuffer);
        this.wday = readUnsignedByte(byteBuffer);
        this.mday = readUnsignedByte(byteBuffer);
        this.month = readUnsignedByte(byteBuffer);
        this.year = readUnsignedByte(byteBuffer);
        this.span = readUnsignedByte(byteBuffer);
    }

    public Alarm setHour(short s11) {
        this.hour = s11;
        return this;
    }

    public Alarm setMday(short s11) {
        this.mday = s11;
        return this;
    }

    public Alarm setMinute(short s11) {
        this.minute = s11;
        return this;
    }

    public Alarm setMonth(short s11) {
        this.month = s11;
        return this;
    }

    public Alarm setSpan(short s11) {
        this.span = s11;
        return this;
    }

    public Alarm setWday(short s11) {
        this.wday = s11;
        return this;
    }

    public Alarm setYear(short s11) {
        this.year = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.hour);
        writeUnsignedByte(e11, this.minute);
        writeUnsignedByte(e11, this.wday);
        writeUnsignedByte(e11, this.mday);
        writeUnsignedByte(e11, this.month);
        writeUnsignedByte(e11, this.year);
        writeUnsignedByte(e11, this.span);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Alarm(");
        return e.a(q.d(q.d(q.d(q.d(q.d(q.d(new StringBuilder("hour = "), this.hour, sb2, ", ", "minute = "), this.minute, sb2, ", ", "wday = "), this.wday, sb2, ", ", "mday = "), this.mday, sb2, ", ", "month = "), this.month, sb2, ", ", "year = "), this.year, sb2, ", ", "span = "), this.span, sb2, ")");
    }
}
