package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class VasistasActiRecoV1V2 extends h {
    public int recoV1;
    public int recoV2;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_VASISTAS_ACTI_RECO_V1_V2;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.recoV1 = readUnsignedShort(byteBuffer);
        this.recoV2 = readUnsignedShort(byteBuffer);
    }

    public VasistasActiRecoV1V2 setRecoV1(int i11) {
        this.recoV1 = i11;
        return this;
    }

    public VasistasActiRecoV1V2 setRecoV2(int i11) {
        this.recoV2 = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.recoV1);
        writeUnsignedShort(e11, this.recoV2);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VasistasActiRecoV1V2(");
        return e.a(q.d(new StringBuilder("recoV1 = "), this.recoV1, sb2, ", ", "recoV2 = "), this.recoV2, sb2, ")");
    }
}
