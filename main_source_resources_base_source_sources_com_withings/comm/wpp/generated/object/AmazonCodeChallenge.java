package com.withings.comm.wpp.generated.object;

import androidx.activity.a0;
import androidx.activity.result.c;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class AmazonCodeChallenge extends h {
    public String codeChallenge;
    public String productId;
    public String serialNumber;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        int i12;
        String str = this.productId;
        int i13 = 0;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        int i14 = i11 + 1;
        String str2 = this.serialNumber;
        if (str2 != null) {
            i12 = str2.getBytes().length;
        } else {
            i12 = 0;
        }
        int i15 = i12 + 1 + i14;
        String str3 = this.codeChallenge;
        if (str3 != null) {
            i13 = str3.getBytes().length;
        }
        return (short) (i13 + 1 + i15);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 2384;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.productId = readString(byteBuffer);
        this.serialNumber = readString(byteBuffer);
        this.codeChallenge = readString(byteBuffer);
    }

    public AmazonCodeChallenge setCodeChallenge(String str) {
        this.codeChallenge = str;
        return this;
    }

    public AmazonCodeChallenge setProductId(String str) {
        this.productId = str;
        return this;
    }

    public AmazonCodeChallenge setSerialNumber(String str) {
        this.serialNumber = str;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeString(e11, this.productId);
        writeString(e11, this.serialNumber);
        writeString(e11, this.codeChallenge);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AmazonCodeChallenge(");
        return c.c(a0.c(a0.c(new StringBuilder("productId = "), this.productId, sb2, ", ", "serialNumber = "), this.serialNumber, sb2, ", ", "codeChallenge = "), this.codeChallenge, sb2, ")");
    }
}
