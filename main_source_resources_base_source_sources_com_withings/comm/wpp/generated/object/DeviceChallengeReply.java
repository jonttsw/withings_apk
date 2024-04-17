package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class DeviceChallengeReply extends h {
    public byte[] deviceRandom;
    public byte[] platformRandom;
    public long signatureAlgoId;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        byte[] bArr = this.platformRandom;
        int i12 = 0;
        if (bArr != null) {
            i11 = bArr.length;
        } else {
            i11 = 0;
        }
        int i13 = i11 + 1;
        byte[] bArr2 = this.deviceRandom;
        if (bArr2 != null) {
            i12 = bArr2.length;
        }
        return (short) (i12 + 1 + i13 + 4);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_DEVICE_CHALLENGE_REPLY;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.platformRandom = readByteArray(byteBuffer);
        this.deviceRandom = readByteArray(byteBuffer);
        this.signatureAlgoId = readUnsignedInt(byteBuffer);
    }

    public DeviceChallengeReply setDeviceRandom(byte[] bArr) {
        this.deviceRandom = bArr;
        return this;
    }

    public DeviceChallengeReply setPlatformRandom(byte[] bArr) {
        this.platformRandom = bArr;
        return this;
    }

    public DeviceChallengeReply setSignatureAlgoId(long j5) {
        this.signatureAlgoId = j5;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByteArray(e11, this.platformRandom);
        writeByteArray(e11, this.deviceRandom);
        writeUnsignedInt(e11, this.signatureAlgoId);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceChallengeReply(");
        sb2.append("platformRandom = " + Wpp.prettyBytes(this.platformRandom));
        sb2.append(", ");
        sb2.append("deviceRandom = " + Wpp.prettyBytes(this.deviceRandom));
        sb2.append(", ");
        return j.b(new StringBuilder("signatureAlgoId = "), this.signatureAlgoId, sb2, ")");
    }
}
