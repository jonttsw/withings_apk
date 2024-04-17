package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Lcd extends h {
    public static final short DISPLAY_TESTPIC = 3;
    public static final short INIT = 0;
    public static final short RELEASE = 1;
    public static final short SET_CONTRAST = 2;
    public byte cmd;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33256rc;
    public byte value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 3;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 515;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.value = readByte(byteBuffer);
        this.f33256rc = readByte(byteBuffer);
    }

    public Lcd setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public Lcd setRc(byte b10) {
        this.f33256rc = b10;
        return this;
    }

    public Lcd setValue(byte b10) {
        this.value = b10;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeByte(e11, this.value);
        writeByte(e11, this.f33256rc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Lcd(");
        return e.a(q.d(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "value = "), this.value, sb2, ", ", "rc = "), this.f33256rc, sb2, ")");
    }
}
