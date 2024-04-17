package com.withings.comm.wpp.generated.object;

import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class MeasureLiveEcg extends h {
    public byte[] samples;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        byte[] bArr = this.samples;
        if (bArr != null) {
            i11 = bArr.length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 1);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2429;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.samples = readByteArray(byteBuffer);
    }

    public MeasureLiveEcg setSamples(byte[] bArr) {
        this.samples = bArr;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByteArray(e11, this.samples);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MeasureLiveEcg(");
        sb2.append("samples = " + Wpp.prettyBytes(this.samples));
        sb2.append(")");
        return sb2.toString();
    }
}
