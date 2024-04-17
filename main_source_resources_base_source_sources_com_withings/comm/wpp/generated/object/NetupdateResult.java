package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class NetupdateResult extends h {
    public static final short ERROR_NETWORK = 3;
    public static final short ERROR_SIG = 2;
    public static final short ERROR_URL = 1;
    public static final short OK = 0;
    public static final short UPTODATE = 4;

    /* renamed from: rc  reason: collision with root package name */
    public short f33261rc;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 1;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 1041;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33261rc = readUnsignedByte(byteBuffer);
    }

    public NetupdateResult setRc(short s11) {
        this.f33261rc = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.f33261rc);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("rc = "), this.f33261rc, new StringBuilder("NetupdateResult("), ")");
    }
}
