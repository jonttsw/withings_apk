package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class WeightVerif extends h {

    /* renamed from: re  reason: collision with root package name */
    public int f33280re;

    /* renamed from: ri  reason: collision with root package name */
    public int f33281ri;
    public int[] weight;
    public int zWeight;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 29;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 530;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.zWeight = readInt(byteBuffer);
        this.weight = readIntArray(byteBuffer);
        this.f33280re = readInt(byteBuffer);
        this.f33281ri = readInt(byteBuffer);
    }

    public WeightVerif setRe(int i11) {
        this.f33280re = i11;
        return this;
    }

    public WeightVerif setRi(int i11) {
        this.f33281ri = i11;
        return this;
    }

    public WeightVerif setWeight(int[] iArr) {
        this.weight = iArr;
        return this;
    }

    public WeightVerif setZWeight(int i11) {
        this.zWeight = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeInt(e11, this.zWeight);
        writeIntArray(e11, this.weight);
        writeInt(e11, this.f33280re);
        writeInt(e11, this.f33281ri);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WeightVerif(");
        StringBuilder d11 = q.d(new StringBuilder("zWeight = "), this.zWeight, sb2, ", ", "weight = ");
        d11.append(Arrays.toString(this.weight));
        sb2.append(d11.toString());
        sb2.append(", ");
        return e.a(q.d(new StringBuilder("re = "), this.f33280re, sb2, ", ", "ri = "), this.f33281ri, sb2, ")");
    }
}
