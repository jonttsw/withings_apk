package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class CaptureSct01 extends h {
    public int tamb;
    public int[] tbody;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 69;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 304;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.tamb = readInt(byteBuffer);
        this.tbody = readIntArray(byteBuffer);
    }

    public CaptureSct01 setTamb(int i11) {
        this.tamb = i11;
        return this;
    }

    public CaptureSct01 setTbody(int[] iArr) {
        this.tbody = iArr;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.tamb);
        writeIntArray(e11, this.tbody);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CaptureSct01(");
        StringBuilder d11 = q.d(new StringBuilder("tamb = "), this.tamb, sb2, ", ", "tbody = ");
        d11.append(Arrays.toString(this.tbody));
        sb2.append(d11.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
