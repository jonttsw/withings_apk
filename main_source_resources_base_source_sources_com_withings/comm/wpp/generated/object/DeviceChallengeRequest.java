package com.withings.comm.wpp.generated.object;

import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class DeviceChallengeRequest extends h {
    public byte[] platformRandom;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        byte[] bArr = this.platformRandom;
        if (bArr != null) {
            i11 = bArr.length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 1);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_DEVICE_CHALLENGE_REQUEST;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.platformRandom = readByteArray(byteBuffer);
    }

    public DeviceChallengeRequest setPlatformRandom(byte[] bArr) {
        this.platformRandom = bArr;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByteArray(e11, this.platformRandom);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceChallengeRequest(");
        sb2.append("platformRandom = " + Wpp.prettyBytes(this.platformRandom));
        sb2.append(")");
        return sb2.toString();
    }
}
