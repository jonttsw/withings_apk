package com.withings.nervehealth.android;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.nervehealth.core.model.MeasureCategory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NeuropathyFeature.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/nervehealth/android/NeuropathyFeature;", "", "a", "nervehealth-android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeuropathyFeature {

    /* renamed from: d  reason: collision with root package name */
    public static final a f42330d;

    /* renamed from: e  reason: collision with root package name */
    public static final NeuropathyFeature f42331e;

    /* renamed from: f  reason: collision with root package name */
    public static final NeuropathyFeature f42332f;

    /* renamed from: g  reason: collision with root package name */
    public static final NeuropathyFeature f42333g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ NeuropathyFeature[] f42334h;

    /* renamed from: a  reason: collision with root package name */
    private final int f42335a;

    /* renamed from: b  reason: collision with root package name */
    private final int f42336b;

    /* renamed from: c  reason: collision with root package name */
    private final String f42337c = null;

    /* compiled from: NeuropathyFeature.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static NeuropathyFeature a(MeasureCategory category) {
            u.j(category, "category");
            int ordinal = category.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return NeuropathyFeature.f42333g;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return NeuropathyFeature.f42332f;
            }
            return NeuropathyFeature.f42331e;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.withings.nervehealth.android.NeuropathyFeature$a] */
    static {
        NeuropathyFeature neuropathyFeature = new NeuropathyFeature("Medical", 0, 29, ConstantsWs.MEASURE_TYPE_NHS_FEET);
        f42331e = neuropathyFeature;
        NeuropathyFeature neuropathyFeature2 = new NeuropathyFeature("NonMedical", 1, 30, 196);
        f42332f = neuropathyFeature2;
        NeuropathyFeature neuropathyFeature3 = new NeuropathyFeature("B2B", 2, 29, 229);
        f42333g = neuropathyFeature3;
        NeuropathyFeature[] neuropathyFeatureArr = {neuropathyFeature, neuropathyFeature2, neuropathyFeature3};
        f42334h = neuropathyFeatureArr;
        b.a(neuropathyFeatureArr);
        f42330d = new Object();
    }

    private NeuropathyFeature(String str, int i11, int i12, int i13) {
        this.f42335a = i12;
        this.f42336b = i13;
    }

    public static NeuropathyFeature valueOf(String str) {
        return (NeuropathyFeature) Enum.valueOf(NeuropathyFeature.class, str);
    }

    public static NeuropathyFeature[] values() {
        return (NeuropathyFeature[]) f42334h.clone();
    }

    public final int a() {
        return this.f42335a;
    }

    public final int b() {
        return this.f42336b;
    }

    public final String d() {
        return this.f42337c;
    }
}
