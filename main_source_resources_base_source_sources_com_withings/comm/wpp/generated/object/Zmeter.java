package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Zmeter extends h {
    public static final short DELCAL = 2;
    public static final short DOCAL = 3;
    public static final short DOMEAS = 4;
    public static final short GETCAL = 1;
    public static final short SETCAL = 0;
    public static final short SINUS_START = 5;
    public static final short SINUS_STOP = 6;
    public short cmd;
    public int modZ;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33294rc;

    /* renamed from: re  reason: collision with root package name */
    public int f33295re;

    /* renamed from: ri  reason: collision with root package name */
    public int f33296ri;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 14;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 526;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33294rc = readByte(byteBuffer);
        this.cmd = readUnsignedByte(byteBuffer);
        this.f33295re = readInt(byteBuffer);
        this.f33296ri = readInt(byteBuffer);
        this.modZ = readInt(byteBuffer);
    }

    public Zmeter setCmd(short s11) {
        this.cmd = s11;
        return this;
    }

    public Zmeter setModZ(int i11) {
        this.modZ = i11;
        return this;
    }

    public Zmeter setRc(byte b10) {
        this.f33294rc = b10;
        return this;
    }

    public Zmeter setRe(int i11) {
        this.f33295re = i11;
        return this;
    }

    public Zmeter setRi(int i11) {
        this.f33296ri = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.f33294rc);
        writeUnsignedByte(e11, this.cmd);
        writeInt(e11, this.f33295re);
        writeInt(e11, this.f33296ri);
        writeInt(e11, this.modZ);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Zmeter(");
        return e.a(q.d(q.d(q.d(q.d(new StringBuilder("rc = "), this.f33294rc, sb2, ", ", "cmd = "), this.cmd, sb2, ", ", "re = "), this.f33295re, sb2, ", ", "ri = "), this.f33296ri, sb2, ", ", "modZ = "), this.modZ, sb2, ")");
    }
}
