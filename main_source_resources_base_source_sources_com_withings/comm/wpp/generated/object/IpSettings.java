package com.withings.comm.wpp.generated.object;

import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class IpSettings extends h {
    public byte[] dnsIp;
    public byte[] gatewayIp;

    /* renamed from: ip  reason: collision with root package name */
    public byte[] f33255ip;
    public long mask;
    public byte[] proxyIp;
    public int proxyPort;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        int i12;
        int i13;
        byte[] bArr = this.f33255ip;
        int i14 = 0;
        if (bArr != null) {
            i11 = bArr.length;
        } else {
            i11 = 0;
        }
        int i15 = i11 + 5;
        byte[] bArr2 = this.gatewayIp;
        if (bArr2 != null) {
            i12 = bArr2.length;
        } else {
            i12 = 0;
        }
        int i16 = i12 + 1 + i15;
        byte[] bArr3 = this.dnsIp;
        if (bArr3 != null) {
            i13 = bArr3.length;
        } else {
            i13 = 0;
        }
        int i17 = i13 + 1 + i16;
        byte[] bArr4 = this.proxyIp;
        if (bArr4 != null) {
            i14 = bArr4.length;
        }
        return (short) (i14 + 1 + i17 + 2);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 261;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.f33255ip = readByteArray(byteBuffer);
        this.mask = readUnsignedInt(byteBuffer);
        this.gatewayIp = readByteArray(byteBuffer);
        this.dnsIp = readByteArray(byteBuffer);
        this.proxyIp = readByteArray(byteBuffer);
        this.proxyPort = readUnsignedShort(byteBuffer);
    }

    public IpSettings setDnsIp(byte[] bArr) {
        this.dnsIp = bArr;
        return this;
    }

    public IpSettings setGatewayIp(byte[] bArr) {
        this.gatewayIp = bArr;
        return this;
    }

    public IpSettings setIp(byte[] bArr) {
        this.f33255ip = bArr;
        return this;
    }

    public IpSettings setMask(long j5) {
        this.mask = j5;
        return this;
    }

    public IpSettings setProxyIp(byte[] bArr) {
        this.proxyIp = bArr;
        return this;
    }

    public IpSettings setProxyPort(int i11) {
        this.proxyPort = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeByteArray(e11, this.f33255ip);
        writeUnsignedInt(e11, this.mask);
        writeByteArray(e11, this.gatewayIp);
        writeByteArray(e11, this.dnsIp);
        writeByteArray(e11, this.proxyIp);
        writeUnsignedShort(e11, this.proxyPort);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IpSettings(");
        sb2.append("ip = " + Wpp.prettyBytes(this.f33255ip));
        sb2.append(", ");
        sb2.append("mask = " + this.mask);
        sb2.append(", ");
        sb2.append("gatewayIp = " + Wpp.prettyBytes(this.gatewayIp));
        sb2.append(", ");
        sb2.append("dnsIp = " + Wpp.prettyBytes(this.dnsIp));
        sb2.append(", ");
        sb2.append("proxyIp = " + Wpp.prettyBytes(this.proxyIp));
        sb2.append(", ");
        return e.a(new StringBuilder("proxyPort = "), this.proxyPort, sb2, ")");
    }
}
