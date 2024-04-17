package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class SleepActivity extends h {
    public int awake;
    public int completed;
    public int durationtosleep;
    public int enddate;
    public int sleepDeep;
    public int sleepLight;
    public int sleepRem;
    public int startdate;
    public int wakeupcount;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 36;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2377;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.startdate = readInt(byteBuffer);
        this.enddate = readInt(byteBuffer);
        this.awake = readInt(byteBuffer);
        this.sleepLight = readInt(byteBuffer);
        this.sleepDeep = readInt(byteBuffer);
        this.sleepRem = readInt(byteBuffer);
        this.wakeupcount = readInt(byteBuffer);
        this.durationtosleep = readInt(byteBuffer);
        this.completed = readInt(byteBuffer);
    }

    public SleepActivity setAwake(int i11) {
        this.awake = i11;
        return this;
    }

    public SleepActivity setCompleted(int i11) {
        this.completed = i11;
        return this;
    }

    public SleepActivity setDurationtosleep(int i11) {
        this.durationtosleep = i11;
        return this;
    }

    public SleepActivity setEnddate(int i11) {
        this.enddate = i11;
        return this;
    }

    public SleepActivity setSleepDeep(int i11) {
        this.sleepDeep = i11;
        return this;
    }

    public SleepActivity setSleepLight(int i11) {
        this.sleepLight = i11;
        return this;
    }

    public SleepActivity setSleepRem(int i11) {
        this.sleepRem = i11;
        return this;
    }

    public SleepActivity setStartdate(int i11) {
        this.startdate = i11;
        return this;
    }

    public SleepActivity setWakeupcount(int i11) {
        this.wakeupcount = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.startdate);
        writeInt(e11, this.enddate);
        writeInt(e11, this.awake);
        writeInt(e11, this.sleepLight);
        writeInt(e11, this.sleepDeep);
        writeInt(e11, this.sleepRem);
        writeInt(e11, this.wakeupcount);
        writeInt(e11, this.durationtosleep);
        writeInt(e11, this.completed);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SleepActivity(");
        return e.a(q.d(q.d(q.d(q.d(q.d(q.d(q.d(q.d(new StringBuilder("startdate = "), this.startdate, sb2, ", ", "enddate = "), this.enddate, sb2, ", ", "awake = "), this.awake, sb2, ", ", "sleepLight = "), this.sleepLight, sb2, ", ", "sleepDeep = "), this.sleepDeep, sb2, ", ", "sleepRem = "), this.sleepRem, sb2, ", ", "wakeupcount = "), this.wakeupcount, sb2, ", ", "durationtosleep = "), this.durationtosleep, sb2, ", ", "completed = "), this.completed, sb2, ")");
    }
}
