package com.withings.comm.wpp.generated.object;

import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class Null extends h {
    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 0;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 256;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer allocate = ByteBuffer.allocate(dataSize + 2);
        allocate.putShort(dataSize);
        return allocate.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return "Null()";
    }
}
