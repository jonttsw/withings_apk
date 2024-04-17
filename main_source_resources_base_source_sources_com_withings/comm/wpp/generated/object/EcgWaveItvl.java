package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class EcgWaveItvl extends h {

    /* renamed from: pq  reason: collision with root package name */
    public int f33248pq;
    public int qrs;

    /* renamed from: qt  reason: collision with root package name */
    public int f33249qt;
    public int qtc;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 8;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2475;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33249qt = readUnsignedShort(byteBuffer);
        this.qtc = readUnsignedShort(byteBuffer);
        this.f33248pq = readUnsignedShort(byteBuffer);
        this.qrs = readUnsignedShort(byteBuffer);
    }

    public EcgWaveItvl setPq(int i11) {
        this.f33248pq = i11;
        return this;
    }

    public EcgWaveItvl setQrs(int i11) {
        this.qrs = i11;
        return this;
    }

    public EcgWaveItvl setQt(int i11) {
        this.f33249qt = i11;
        return this;
    }

    public EcgWaveItvl setQtc(int i11) {
        this.qtc = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.f33249qt);
        writeUnsignedShort(e11, this.qtc);
        writeUnsignedShort(e11, this.f33248pq);
        writeUnsignedShort(e11, this.qrs);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EcgWaveItvl(");
        return e.a(q.d(q.d(q.d(new StringBuilder("qt = "), this.f33249qt, sb2, ", ", "qtc = "), this.qtc, sb2, ", ", "pq = "), this.f33248pq, sb2, ", ", "qrs = "), this.qrs, sb2, ")");
    }
}
