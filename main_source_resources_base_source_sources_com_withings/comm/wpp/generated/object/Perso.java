package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Perso extends h {
    public static final short DEL = 2;
    public static final short ERR_FAIL = -1;
    public static final short ERR_KEY = -2;
    public static final short ERR_OK = 0;
    public static final short ERR_VAL = -3;
    public static final short GET = 1;
    public static final short RST_SETTINGS = 3;
    public static final short SET = 0;
    public byte cmd;
    public String key;

    /* renamed from: rc  reason: collision with root package name */
    public byte f33263rc;
    public String val1;
    public String val2;
    public String val3;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        int i12;
        int i13;
        String str = this.key;
        int i14 = 0;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        int i15 = i11 + 2;
        String str2 = this.val1;
        if (str2 != null) {
            i12 = str2.getBytes().length;
        } else {
            i12 = 0;
        }
        int i16 = i12 + 1 + i15;
        String str3 = this.val2;
        if (str3 != null) {
            i13 = str3.getBytes().length;
        } else {
            i13 = 0;
        }
        int i17 = i13 + 1 + i16;
        String str4 = this.val3;
        if (str4 != null) {
            i14 = str4.getBytes().length;
        }
        return (short) (i14 + 1 + i17 + 1);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 517;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.cmd = readByte(byteBuffer);
        this.key = readString(byteBuffer);
        this.val1 = readString(byteBuffer);
        this.val2 = readString(byteBuffer);
        this.val3 = readString(byteBuffer);
        this.f33263rc = readByte(byteBuffer);
    }

    public Perso setCmd(byte b10) {
        this.cmd = b10;
        return this;
    }

    public Perso setKey(String str) {
        this.key = str;
        return this;
    }

    public Perso setRc(byte b10) {
        this.f33263rc = b10;
        return this;
    }

    public Perso setVal1(String str) {
        this.val1 = str;
        return this;
    }

    public Perso setVal2(String str) {
        this.val2 = str;
        return this;
    }

    public Perso setVal3(String str) {
        this.val3 = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.cmd);
        writeString(e11, this.key);
        writeString(e11, this.val1);
        writeString(e11, this.val2);
        writeString(e11, this.val3);
        writeByte(e11, this.f33263rc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Perso(");
        return e.a(a0.c(a0.c(a0.c(a0.c(q.d(new StringBuilder("cmd = "), this.cmd, sb2, ", ", "key = "), this.key, sb2, ", ", "val1 = "), this.val1, sb2, ", ", "val2 = "), this.val2, sb2, ", ", "val3 = "), this.val3, sb2, ", ", "rc = "), this.f33263rc, sb2, ")");
    }
}
