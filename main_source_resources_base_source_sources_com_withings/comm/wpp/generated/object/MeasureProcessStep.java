package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class MeasureProcessStep extends h {
    public static final short MEASURE_PROCESS_STEP_ABORTED = 12;
    public static final short MEASURE_PROCESS_STEP_DISPLAY_RESULT = 11;
    public static final short MEASURE_PROCESS_STEP_DONE = 18;
    public static final short MEASURE_PROCESS_STEP_ECG_FINISHED = 10;
    public static final short MEASURE_PROCESS_STEP_ECG_IN_PROGRESS = 9;
    public static final short MEASURE_PROCESS_STEP_ECG_STARTED = 8;
    public static final short MEASURE_PROCESS_STEP_ERROR = 14;
    public static final short MEASURE_PROCESS_STEP_HAND_DETECTED = 7;
    public static final short MEASURE_PROCESS_STEP_HAND_DETECTION_STARTED = 6;
    public static final short MEASURE_PROCESS_STEP_INFLATING = 4;
    public static final short MEASURE_PROCESS_STEP_INFLATION_STARTED = 3;
    public static final short MEASURE_PROCESS_STEP_INFLATION_STOPPED = 5;
    public static final short MEASURE_PROCESS_STEP_MEASURE_BP_FINISHED = 13;
    public static final short MEASURE_PROCESS_STEP_MEASURE_BP_STARTED = 2;
    public static final short MEASURE_PROCESS_STEP_START_MENU_DISPLAYED = 1;
    public static final short MEASURE_PROCESS_STEP_USER_ASSIGNED = 17;
    public static final short MEASURE_PROCESS_STEP_USER_ASSIGNMENT = 16;
    public static final short MEASURE_PROCESS_STEP_USER_CHOICE = 15;
    public static final short MEASURE_PROCESS_STEP_USER_CHOICE_ALLOW_MEASURE = 1;
    public static final short MEASURE_PROCESS_STEP_USER_CHOICE_OK = 0;
    public static final short MEASURE_PROCESS_STEP_USER_CHOICE_SKIP_MEASURE = 2;
    public int step;
    public int stepParam;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2435;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.step = readInt(byteBuffer);
        this.stepParam = readInt(byteBuffer);
    }

    public MeasureProcessStep setStep(int i11) {
        this.step = i11;
        return this;
    }

    public MeasureProcessStep setStepParam(int i11) {
        this.stepParam = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.step);
        writeInt(e11, this.stepParam);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MeasureProcessStep(");
        return e.a(q.d(new StringBuilder("step = "), this.step, sb2, ", ", "stepParam = "), this.stepParam, sb2, ")");
    }
}
