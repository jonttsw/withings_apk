package com.withings.comm.wpp.generated.object;

import androidx.activity.result.c;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WamRawData extends h {
    public String buf;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.buf;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 1);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1288;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.buf = readString(byteBuffer);
    }

    public WamRawData setBuf(String str) {
        this.buf = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeString(e11, this.buf);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return c.c(new StringBuilder("buf = "), this.buf, new StringBuilder("WamRawData("), ")");
    }
}
