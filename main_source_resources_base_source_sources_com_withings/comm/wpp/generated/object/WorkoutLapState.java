package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WorkoutLapState extends h {
    public int diff;
    public int time;
    public byte value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 9;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_WORKOUT_LAP_STATE;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.value = readByte(byteBuffer);
        this.time = readInt(byteBuffer);
        this.diff = readInt(byteBuffer);
    }

    public WorkoutLapState setDiff(int i11) {
        this.diff = i11;
        return this;
    }

    public WorkoutLapState setTime(int i11) {
        this.time = i11;
        return this;
    }

    public WorkoutLapState setValue(byte b10) {
        this.value = b10;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByte(e11, this.value);
        writeInt(e11, this.time);
        writeInt(e11, this.diff);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WorkoutLapState(");
        return e.a(q.d(q.d(new StringBuilder("value = "), this.value, sb2, ", ", "time = "), this.time, sb2, ", ", "diff = "), this.diff, sb2, ")");
    }
}
