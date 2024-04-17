package com.withings.comm.wpp.generated.object;

import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class WorkoutScreenList extends h {
    public long[] screenNb;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 33;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 316;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.screenNb = readUnsignedIntArray(byteBuffer);
    }

    public WorkoutScreenList setScreenNb(long[] jArr) {
        this.screenNb = jArr;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedIntArray(e11, this.screenNb);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WorkoutScreenList(");
        sb2.append("screenNb = " + Arrays.toString(this.screenNb));
        sb2.append(")");
        return sb2.toString();
    }
}
