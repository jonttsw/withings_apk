package com.withings.comm.wpp.generated.object;

import androidx.activity.result.c;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Name extends h {
    public String str;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.str;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 1);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_NAME;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.str = readString(byteBuffer);
    }

    public Name setStr(String str) {
        this.str = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeString(e11, this.str);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return c.c(new StringBuilder("str = "), this.str, new StringBuilder("Name("), ")");
    }
}
