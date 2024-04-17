package com.withings.comm.wpp.generated.object;

import ab0.j;
import androidx.activity.a0;
import androidx.camera.camera2.internal.q;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class WifiConnectResult extends h {
    public static final short FAIL = 1;
    public static final short HTTP_PARSE_ERROR = 2;
    public static final short SUCCESS = 0;
    public static final short WIFI_BADPWD = 2;
    public static final short WIFI_ETHDOWN = 7;
    public static final short WIFI_LOWRSSI = 4;
    public static final short WIFI_NOANSWER = 5;
    public static final short WIFI_NOSSID = 3;
    public static final short WIFI_REFUSED = 6;
    public static final short WSASSOC_BLINDCODE = 2;
    public static final short WSASSOC_PROASSOCIATIONMISMATCH = 4;
    public static final short WSASSOC_TOOMANYUSERS = 3;
    public long blindcode;
    public short dhcp;
    public short dnsResolv;
    public short http;
    public String webSrvIp;
    public short wifi;
    public short wsAssoc;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        int i11;
        String str = this.webSrvIp;
        if (str != null) {
            i11 = str.getBytes().length;
        } else {
            i11 = 0;
        }
        return (short) (i11 + 10);
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return (short) 262;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.wifi = readUnsignedByte(byteBuffer);
        this.dhcp = readUnsignedByte(byteBuffer);
        this.dnsResolv = readUnsignedByte(byteBuffer);
        this.webSrvIp = readString(byteBuffer);
        this.http = readUnsignedByte(byteBuffer);
        this.wsAssoc = readUnsignedByte(byteBuffer);
        this.blindcode = readUnsignedInt(byteBuffer);
    }

    public WifiConnectResult setBlindcode(long j5) {
        this.blindcode = j5;
        return this;
    }

    public WifiConnectResult setDhcp(short s11) {
        this.dhcp = s11;
        return this;
    }

    public WifiConnectResult setDnsResolv(short s11) {
        this.dnsResolv = s11;
        return this;
    }

    public WifiConnectResult setHttp(short s11) {
        this.http = s11;
        return this;
    }

    public WifiConnectResult setWebSrvIp(String str) {
        this.webSrvIp = str;
        return this;
    }

    public WifiConnectResult setWifi(short s11) {
        this.wifi = s11;
        return this;
    }

    public WifiConnectResult setWsAssoc(short s11) {
        this.wsAssoc = s11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.wifi);
        writeUnsignedByte(e11, this.dhcp);
        writeUnsignedByte(e11, this.dnsResolv);
        writeString(e11, this.webSrvIp);
        writeUnsignedByte(e11, this.http);
        writeUnsignedByte(e11, this.wsAssoc);
        writeUnsignedInt(e11, this.blindcode);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WifiConnectResult(");
        return j.b(q.d(q.d(a0.c(q.d(q.d(q.d(new StringBuilder("wifi = "), this.wifi, sb2, ", ", "dhcp = "), this.dhcp, sb2, ", ", "dnsResolv = "), this.dnsResolv, sb2, ", ", "webSrvIp = "), this.webSrvIp, sb2, ", ", "http = "), this.http, sb2, ", ", "wsAssoc = "), this.wsAssoc, sb2, ", ", "blindcode = "), this.blindcode, sb2, ")");
    }
}
