package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class ProbeChallenge extends h {
    public byte[] challenge;
    public String mac;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.mac;
        int i12 = 0;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        int i13 = i11 + 1;
        byte[] bArr = this.challenge;
        if (bArr != null) {
            i12 = bArr.length;
        }
        return (short) (i12 + 1 + i13);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 290;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.mac = readString(byteBuffer);
        this.challenge = readByteArray(byteBuffer);
    }

    public ProbeChallenge setChallenge(byte[] bArr) {
        this.challenge = bArr;
        return this;
    }

    public ProbeChallenge setMac(String str) {
        this.mac = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeString(e11, this.mac);
        writeByteArray(e11, this.challenge);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProbeChallenge(");
        StringBuilder c11 = a0.c(new StringBuilder("mac = "), this.mac, sb2, ", ", "challenge = ");
        c11.append(Wpp.prettyBytes(this.challenge));
        sb2.append(c11.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
