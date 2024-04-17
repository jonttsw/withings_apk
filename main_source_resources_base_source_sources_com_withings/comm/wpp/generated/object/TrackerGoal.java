package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class TrackerGoal extends h {
    public static final short SLEEP = 1;
    public static final short STEPS = 0;
    public static final short SWIM = 2;
    public int goalType;
    public int value;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_TRACKER_GOAL;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.goalType = readInt(byteBuffer);
        this.value = readInt(byteBuffer);
    }

    public TrackerGoal setGoalType(int i11) {
        this.goalType = i11;
        return this;
    }

    public TrackerGoal setValue(int i11) {
        this.value = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.goalType);
        writeInt(e11, this.value);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TrackerGoal(");
        return e.a(q.d(new StringBuilder("goalType = "), this.goalType, sb2, ", ", "value = "), this.value, sb2, ")");
    }
}
