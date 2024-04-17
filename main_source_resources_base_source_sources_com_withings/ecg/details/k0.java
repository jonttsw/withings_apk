package com.withings.ecg.details;

import androidx.lifecycle.LiveData;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.library.ecg.EcgLeadType;
import com.withings.library.ecg.EcgSignalType;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
final class k0 extends kotlin.jvm.internal.w implements ym0.l<Map<EcgLeadType, List<EcgEntry>>, LiveData<List<EcgEntry>>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartSignalMeasurement f38249a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b0 f38250b;

    /* compiled from: EcgDetailsFragment.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38251a;

        static {
            int[] iArr = new int[EcgSignalType.values().length];
            try {
                iArr[EcgSignalType.DI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EcgSignalType.DI_FILTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EcgSignalType.DI_DI_FILTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EcgSignalType.DII_DIII.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EcgSignalType.DII_DIII_FILTERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f38251a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(b0 b0Var, HeartSignalMeasurement heartSignalMeasurement) {
        super(1);
        this.f38249a = heartSignalMeasurement;
        this.f38250b = b0Var;
    }

    @Override // ym0.l
    public final LiveData<List<EcgEntry>> invoke(Map<EcgLeadType, List<EcgEntry>> map) {
        Map<EcgLeadType, List<EcgEntry>> signals = map;
        kotlin.jvm.internal.u.j(signals, "signals");
        HeartSignalMeasurement ecg = this.f38249a;
        kotlin.jvm.internal.u.i(ecg, "$ecg");
        int i11 = a.f38251a[androidx.collection.c.l(ecg).ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            b0 b0Var = this.f38250b;
            if (i11 != 4) {
                if (i11 == 5) {
                    return androidx.lifecycle.e1.b(b0Var.U0(), new j0(signals));
                }
                throw new NoWhenBranchMatchedException();
            }
            return androidx.lifecycle.e1.b(b0Var.U0(), new i0(signals));
        }
        return androidx.lifecycle.h.a(null, new h0(signals, null), 3);
    }
}
