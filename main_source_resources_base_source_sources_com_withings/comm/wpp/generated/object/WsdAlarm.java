package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WsdAlarm extends h {
    public short brightness;
    public short day;
    public short hour;
    public short minute;
    public short program;
    public short span;
    public short state;
    public short volume;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2308;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.hour = readUnsignedByte(byteBuffer);
        this.minute = readUnsignedByte(byteBuffer);
        this.day = readUnsignedByte(byteBuffer);
        this.volume = readUnsignedByte(byteBuffer);
        this.brightness = readUnsignedByte(byteBuffer);
        this.program = readUnsignedByte(byteBuffer);
        this.state = readUnsignedByte(byteBuffer);
        this.span = readUnsignedByte(byteBuffer);
    }

    public WsdAlarm setBrightness(short s11) {
        this.brightness = s11;
        return this;
    }

    public WsdAlarm setDay(short s11) {
        this.day = s11;
        return this;
    }

    public WsdAlarm setHour(short s11) {
        this.hour = s11;
        return this;
    }

    public WsdAlarm setMinute(short s11) {
        this.minute = s11;
        return this;
    }

    public WsdAlarm setProgram(short s11) {
        this.program = s11;
        return this;
    }

    public WsdAlarm setSpan(short s11) {
        this.span = s11;
        return this;
    }

    public WsdAlarm setState(short s11) {
        this.state = s11;
        return this;
    }

    public WsdAlarm setVolume(short s11) {
        this.volume = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.hour);
        writeUnsignedByte(e11, this.minute);
        writeUnsignedByte(e11, this.day);
        writeUnsignedByte(e11, this.volume);
        writeUnsignedByte(e11, this.brightness);
        writeUnsignedByte(e11, this.program);
        writeUnsignedByte(e11, this.state);
        writeUnsignedByte(e11, this.span);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WsdAlarm(");
        return e.a(q.d(q.d(q.d(q.d(q.d(q.d(q.d(new StringBuilder("hour = "), this.hour, sb2, ", ", "minute = "), this.minute, sb2, ", ", "day = "), this.day, sb2, ", ", "volume = "), this.volume, sb2, ", ", "brightness = "), this.brightness, sb2, ", ", "program = "), this.program, sb2, ", ", "state = "), this.state, sb2, ", ", "span = "), this.span, sb2, ")");
    }
}
