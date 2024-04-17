package com.withings.comm.wpp.generated.object;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ConnectResultExt extends h {
    public static final short KEY_RTMP = 1;
    public static final short VAL_FAIL = 1;
    public int key;
    public int valInt;
    public String valStr;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.valStr;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 9);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 273;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.key = readInt(byteBuffer);
        this.valInt = readInt(byteBuffer);
        this.valStr = readString(byteBuffer);
    }

    public ConnectResultExt setKey(int i11) {
        this.key = i11;
        return this;
    }

    public ConnectResultExt setValInt(int i11) {
        this.valInt = i11;
        return this;
    }

    public ConnectResultExt setValStr(String str) {
        this.valStr = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.key);
        writeInt(e11, this.valInt);
        writeString(e11, this.valStr);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConnectResultExt(");
        return c.c(q.d(q.d(new StringBuilder("key = "), this.key, sb2, ", ", "valInt = "), this.valInt, sb2, ", ", "valStr = "), this.valStr, sb2, ")");
    }
}
