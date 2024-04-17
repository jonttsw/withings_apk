package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class VasistasAhi extends h {
    public short ahi;
    public short bdProba;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2464;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.ahi = readShort(byteBuffer);
        this.bdProba = readShort(byteBuffer);
    }

    public VasistasAhi setAhi(short s11) {
        this.ahi = s11;
        return this;
    }

    public VasistasAhi setBdProba(short s11) {
        this.bdProba = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeShort(e11, this.ahi);
        writeShort(e11, this.bdProba);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VasistasAhi(");
        return e.a(q.d(new StringBuilder("ahi = "), this.ahi, sb2, ", ", "bdProba = "), this.bdProba, sb2, ")");
    }
}
