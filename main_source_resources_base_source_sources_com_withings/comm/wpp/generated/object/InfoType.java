package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class InfoType extends h {
    public static final short ALL = 4;
    public static final short CERTAIN = 1;
    public static final short LAST_MIN = 3;
    public static final short UNCERTAIN = 2;
    public short value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 1;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2394;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.value = readUnsignedByte(byteBuffer);
    }

    public InfoType setValue(short s11) {
        this.value = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.value);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("value = "), this.value, new StringBuilder("InfoType("), ")");
    }
}
