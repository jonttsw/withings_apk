package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WamVasistasAwake extends h {
    public long ascent;
    public long descent;
    public long distance;
    public int steps;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 14;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_WAM_VASISTAS_AWAKE;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.steps = readUnsignedShort(byteBuffer);
        this.distance = readUnsignedInt(byteBuffer);
        this.ascent = readUnsignedInt(byteBuffer);
        this.descent = readUnsignedInt(byteBuffer);
    }

    public WamVasistasAwake setAscent(long j5) {
        this.ascent = j5;
        return this;
    }

    public WamVasistasAwake setDescent(long j5) {
        this.descent = j5;
        return this;
    }

    public WamVasistasAwake setDistance(long j5) {
        this.distance = j5;
        return this;
    }

    public WamVasistasAwake setSteps(int i11) {
        this.steps = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.steps);
        writeUnsignedInt(e11, this.distance);
        writeUnsignedInt(e11, this.ascent);
        writeUnsignedInt(e11, this.descent);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WamVasistasAwake(");
        StringBuilder d11 = q.d(new StringBuilder("steps = "), this.steps, sb2, ", ", "distance = ");
        d11.append(this.distance);
        sb2.append(d11.toString());
        sb2.append(", ");
        sb2.append("ascent = " + this.ascent);
        sb2.append(", ");
        return j.b(new StringBuilder("descent = "), this.descent, sb2, ")");
    }
}
