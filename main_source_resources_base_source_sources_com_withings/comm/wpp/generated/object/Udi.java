package com.withings.comm.wpp.generated.object;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Udi extends h {
    public static final short TYPE_ECG = 1;
    public byte type;
    public String value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.value;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 2);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2437;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.type = readByte(byteBuffer);
        this.value = readString(byteBuffer);
    }

    public Udi setType(byte b10) {
        this.type = b10;
        return this;
    }

    public Udi setValue(String str) {
        this.value = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.type);
        writeString(e11, this.value);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Udi(");
        return c.c(q.d(new StringBuilder("type = "), this.type, sb2, ", ", "value = "), this.value, sb2, ")");
    }
}
