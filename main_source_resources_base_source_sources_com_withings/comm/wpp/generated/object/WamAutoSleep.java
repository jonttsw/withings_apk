package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WamAutoSleep extends h {
    public static final short WAM_AUTO_SLEEP_DISABLED = 0;
    public static final short WAM_AUTO_SLEEP_ENABLED = 2;
    public int autoSleep;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1290;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.autoSleep = readInt(byteBuffer);
    }

    public WamAutoSleep setAutoSleep(int i11) {
        this.autoSleep = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.autoSleep);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("autoSleep = "), this.autoSleep, new StringBuilder("WamAutoSleep("), ")");
    }
}
