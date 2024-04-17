package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class AppProbeOsVersion extends h {
    public static final short ANDROID4 = 20;
    public static final short NOT_SPECIFIED = 0;
    public int osVersion;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 2;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2344;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.osVersion = readUnsignedShort(byteBuffer);
    }

    public AppProbeOsVersion setOsVersion(int i11) {
        this.osVersion = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedShort(e11, this.osVersion);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        return e.a(new StringBuilder("osVersion = "), this.osVersion, new StringBuilder("AppProbeOsVersion("), ")");
    }
}
