package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class PauseState extends h {
    public int startTime;
    public int sum;
    public byte value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 9;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2439;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.value = readByte(byteBuffer);
        this.startTime = readInt(byteBuffer);
        this.sum = readInt(byteBuffer);
    }

    public PauseState setStartTime(int i11) {
        this.startTime = i11;
        return this;
    }

    public PauseState setSum(int i11) {
        this.sum = i11;
        return this;
    }

    public PauseState setValue(byte b10) {
        this.value = b10;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.value);
        writeInt(e11, this.startTime);
        writeInt(e11, this.sum);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PauseState(");
        return e.a(q.d(q.d(new StringBuilder("value = "), this.value, sb2, ", ", "startTime = "), this.startTime, sb2, ", ", "sum = "), this.sum, sb2, ")");
    }
}
