package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class VasistasSpo2 extends h {
    public int error;
    public int quality;
    public int spo2;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2453;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.spo2 = readUnsignedShort(byteBuffer);
        this.quality = readUnsignedShort(byteBuffer);
        this.error = readUnsignedShort(byteBuffer);
    }

    public VasistasSpo2 setError(int i11) {
        this.error = i11;
        return this;
    }

    public VasistasSpo2 setQuality(int i11) {
        this.quality = i11;
        return this;
    }

    public VasistasSpo2 setSpo2(int i11) {
        this.spo2 = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.spo2);
        writeUnsignedShort(e11, this.quality);
        writeUnsignedShort(e11, this.error);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VasistasSpo2(");
        return e.a(q.d(q.d(new StringBuilder("spo2 = "), this.spo2, sb2, ", ", "quality = "), this.quality, sb2, ", ", "error = "), this.error, sb2, ")");
    }
}
