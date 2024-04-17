package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WamVasistasDuration extends h {
    public int duration;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_WAM_VASISTAS_DURATION;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.duration = readUnsignedShort(byteBuffer);
    }

    public WamVasistasDuration setDuration(int i11) {
        this.duration = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.duration);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("duration = "), this.duration, new StringBuilder("WamVasistasDuration("), ")");
    }
}
