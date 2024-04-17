package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class FactoryResetMode extends h {
    public static final short FACTORY_RESET_MODE_COMA = 1;
    public static final short FACTORY_RESET_MODE_NONE = 0;
    public static final short FACTORY_RESET_MODE_REBOOT = 2;
    public int mode;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 302;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.mode = readInt(byteBuffer);
    }

    public FactoryResetMode setMode(int i11) {
        this.mode = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.mode);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("mode = "), this.mode, new StringBuilder("FactoryResetMode("), ")");
    }
}
