package com.withings.comm.wpp.generated.object;

import androidx.camera.camera2.internal.q;
import androidx.core.text.e;
import androidx.health.platform.client.proto.z0;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.h;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class VasistasCbt extends h {
    public static final short ALGO_FEVER = 1;
    public static final short ALGO_FEVER_HB = 2;
    public static final short ALGO_FREE_LIVING = 0;
    public static final short ALGO_WORKOUT = 3;
    public static final short ATTRIB_BASELINE = 5;
    public static final short ATTRIB_NIGHT_MEASURE = 4;
    public static final short ATTRIB_NORMAL = 1;
    public static final short ATTRIB_SLEEPING = 2;
    public static final short ATTRIB_WORKOUT = 3;
    public short algo;
    public short attrib;
    public int temperature;

    @Override // com.withings.comm.wpp.h
    public short getDataSize() {
        return (short) 6;
    }

    @Override // com.withings.comm.wpp.h
    public short getType() {
        return Wpp.TYPE_VASISTAS_CBT;
    }

    @Override // com.withings.comm.wpp.h
    public void initWithBytes(ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        this.algo = readUnsignedByte(byteBuffer);
        this.attrib = readUnsignedByte(byteBuffer);
        this.temperature = readInt(byteBuffer);
    }

    public VasistasCbt setAlgo(short s11) {
        this.algo = s11;
        return this;
    }

    public VasistasCbt setAttrib(short s11) {
        this.attrib = s11;
        return this;
    }

    public VasistasCbt setTemperature(int i11) {
        this.temperature = i11;
        return this;
    }

    @Override // com.withings.comm.wpp.h
    public byte[] toByteArray() {
        short dataSize = getDataSize();
        ByteBuffer e11 = z0.e(dataSize, 2, dataSize);
        writeUnsignedByte(e11, this.algo);
        writeUnsignedByte(e11, this.attrib);
        writeInt(e11, this.temperature);
        return e11.array();
    }

    @Override // com.withings.comm.wpp.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VasistasCbt(");
        return e.a(q.d(q.d(new StringBuilder("algo = "), this.algo, sb2, ", ", "attrib = "), this.attrib, sb2, ", ", "temperature = "), this.temperature, sb2, ")");
    }
}
