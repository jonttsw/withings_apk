package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WamVasistasMetCalEarned extends h {
    public int calories;
    public int met;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 4;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_WAM_VASISTAS_MET_CAL_EARNED;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.calories = readUnsignedShort(byteBuffer);
        this.met = readUnsignedShort(byteBuffer);
    }

    public WamVasistasMetCalEarned setCalories(int i11) {
        this.calories = i11;
        return this;
    }

    public WamVasistasMetCalEarned setMet(int i11) {
        this.met = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.calories);
        writeUnsignedShort(e11, this.met);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WamVasistasMetCalEarned(");
        return e.a(q.d(new StringBuilder("calories = "), this.calories, sb2, ", ", "met = "), this.met, sb2, ")");
    }
}
