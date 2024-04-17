package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Gpio extends h {
    public static final short GET = 1;
    public static final short MODE_HIGHZ = 7;
    public static final short MODE_IN = 5;
    public static final short MODE_IN_FLOAT = 2;
    public static final short MODE_IN_PD = 6;
    public static final short MODE_IN_PU = 3;
    public static final short MODE_OUT_HD = 4;
    public static final short MODE_OUT_OD = 1;
    public static final short MODE_OUT_PP = 0;
    public static final short SET = 0;
    public byte bank;
    public byte cmd;
    public byte gpio;
    public byte mode;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33251rc;
    public byte state;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 516;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.bank = readByte(byteBuffer);
        this.gpio = readByte(byteBuffer);
        this.mode = readByte(byteBuffer);
        this.state = readByte(byteBuffer);
        this.f33251rc = readByte(byteBuffer);
    }

    public Gpio setBank(byte b10) {
        this.bank = b10;
        return this;
    }

    public Gpio setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public Gpio setGpio(byte b10) {
        this.gpio = b10;
        return this;
    }

    public Gpio setMode(byte b10) {
        this.mode = b10;
        return this;
    }

    public Gpio setRc(byte b10) {
        this.f33251rc = b10;
        return this;
    }

    public Gpio setState(byte b10) {
        this.state = b10;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeByte(e11, this.bank);
        writeByte(e11, this.gpio);
        writeByte(e11, this.mode);
        writeByte(e11, this.state);
        writeByte(e11, this.f33251rc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Gpio(");
        return e.a(q.d(q.d(q.d(q.d(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "bank = "), this.bank, sb2, ", ", "gpio = "), this.gpio, sb2, ", ", "mode = "), this.mode, sb2, ", ", "state = "), this.state, sb2, ", ", "rc = "), this.f33251rc, sb2, ")");
    }
}
