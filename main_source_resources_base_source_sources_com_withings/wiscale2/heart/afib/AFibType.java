package com.withings.wiscale2.heart.afib;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AFibLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/heart/afib/AFibType;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AFibType {

    /* renamed from: b  reason: collision with root package name */
    public static final AFibType f57108b;

    /* renamed from: c  reason: collision with root package name */
    public static final AFibType f57109c;

    /* renamed from: d  reason: collision with root package name */
    public static final AFibType f57110d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AFibType[] f57111e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f57112f;

    /* renamed from: a  reason: collision with root package name */
    private final int f57113a;

    static {
        AFibType aFibType = new AFibType("AFibECG", 0, 130);
        f57108b = aFibType;
        AFibType aFibType2 = new AFibType("AFibOverPPG", 1, ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT);
        f57109c = aFibType2;
        AFibType aFibType3 = new AFibType("IrregularHeartbeat", 2, ConstantsWs.MEASURE_TYPE_IRREGULAR_HEART_BEAT);
        f57110d = aFibType3;
        AFibType[] aFibTypeArr = {aFibType, aFibType2, aFibType3};
        f57111e = aFibTypeArr;
        f57112f = sm0.b.a(aFibTypeArr);
    }

    private AFibType(String str, int i11, int i12) {
        this.f57113a = i12;
    }

    public static sm0.a<AFibType> a() {
        return f57112f;
    }

    public static AFibType valueOf(String str) {
        return (AFibType) Enum.valueOf(AFibType.class, str);
    }

    public static AFibType[] values() {
        return (AFibType[]) f57111e.clone();
    }

    public final int b() {
        return this.f57113a;
    }
}
