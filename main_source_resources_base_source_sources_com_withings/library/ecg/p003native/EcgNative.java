package com.withings.library.ecg.p003native;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.ecg.diag.DiagnosticResult;
import com.withings.library.ecg.leads.ComputeResult;
import com.withings.library.ecg.parser.decompressor.DecompressResult;
import com.withings.library.ecg.parser.decompressor.EcgDecompressStream;
import kotlin.Metadata;
/* compiled from: EcgNative.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0086 ¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\fH\u0086 ¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0086 ¢\u0006\u0004\b'\u0010(JH\u0010,\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010+\u001a\u00020*H\u0086 ¢\u0006\u0004\b,\u0010-J(\u0010.\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086 ¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0086 ¢\u0006\u0004\b0\u0010&J0\u00104\u001a\u0002032\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u001eH\u0086 ¢\u0006\u0004\b4\u00105J\u0018\u00107\u001a\u00020\b2\u0006\u00106\u001a\u00020\u001eH\u0086 ¢\u0006\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/withings/library/ecg/native/EcgNative;", "", "", "getUdiNative", "()Ljava/lang/String;", "Lcom/withings/library/ecg/parser/decompressor/EcgDecompressStream;", "ecgDecompressInit", "()Lcom/withings/library/ecg/parser/decompressor/EcgDecompressStream;", "", "compressedSignal", "", "lastValueType", "", "lastValPartial", "", "lastValue", "Lcom/withings/library/ecg/parser/decompressor/DecompressResult;", "decompressEcg", "([BIZS)Lcom/withings/library/ecg/parser/decompressor/DecompressResult;", "Lnm0/y;", "decompressEcgFragLost", "(IZS)V", "frequency", "gain", "flip", "deviceModel", "", "init", "(IIII)J", "contextPointer", "", "values", "nbSample", ConstantsWs.JSON_ACCOUNT_KEY_DEBUG, "Lcom/withings/library/ecg/diag/DiagnosticResult;", "getDiagnosticAndHr", "(J[SIZ)Lcom/withings/library/ecg/diag/DiagnosticResult;", "finish", "(J)V", "getAlgoVersion", "(I)I", "mode", "Lcom/withings/library/ecg/native/NativeHrListener;", "nativeHrListener", "filterInit", "(IIIIIILcom/withings/library/ecg/native/NativeHrListener;)J", "filterAll", "(JI[S)[S", "filterFinish", "leadDII", "leadDIII", "Lcom/withings/library/ecg/leads/ComputeResult;", "computeLeadsFromdIIdIII", "(II[S[S)Lcom/withings/library/ecg/leads/ComputeResult;", "rawSignal", "compressEcg", "([S)[B", "<init>", "()V", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.withings.library.ecg.native.EcgNative  reason: invalid package */
/* loaded from: classes4.dex */
public final class EcgNative {
    public static final EcgNative INSTANCE = new EcgNative();

    static {
        System.loadLibrary("ecg-lib");
    }

    private EcgNative() {
    }

    public final native byte[] compressEcg(short[] sArr);

    public final native ComputeResult computeLeadsFromdIIdIII(int i11, int i12, short[] sArr, short[] sArr2);

    public final native DecompressResult decompressEcg(byte[] bArr, int i11, boolean z5, short s11);

    public final native void decompressEcgFragLost(int i11, boolean z5, short s11);

    public final native EcgDecompressStream ecgDecompressInit();

    public final native short[] filterAll(long j5, int i11, short[] sArr);

    public final native void filterFinish(long j5);

    public final native long filterInit(int i11, int i12, int i13, int i14, int i15, int i16, NativeHrListener nativeHrListener);

    public final native void finish(long j5);

    public final native int getAlgoVersion(int i11);

    public final native DiagnosticResult getDiagnosticAndHr(long j5, short[] sArr, int i11, boolean z5);

    public final native String getUdiNative();

    public final native long init(int i11, int i12, int i13, int i14);
}
