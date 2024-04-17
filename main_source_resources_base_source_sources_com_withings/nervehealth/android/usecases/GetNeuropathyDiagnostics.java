package com.withings.nervehealth.android.usecases;

import com.withings.nervehealth.android.NeuropathyFeature;
import com.withings.nervehealth.core.model.MeasureCategory;
import com.withings.nervehealthscore.NHSProcessResult;
import com.withings.nervehealthscore.NerveHealthNative;
import com.withings.nervehealthscore.NeuropathyDiagnosticNative;
import com.withings.nervehealthscore.NeuropathyMeasureNative;
import j00.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import x70.b;
/* compiled from: GetNeuropathyDiagnostics.kt */
/* loaded from: classes4.dex */
public final class GetNeuropathyDiagnostics {

    /* renamed from: a  reason: collision with root package name */
    private final NerveHealthNative f42338a;

    /* compiled from: GetNeuropathyDiagnostics.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/nervehealth/android/usecases/GetNeuropathyDiagnostics$LibSudoMemoryAllocationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "nervehealth-android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class LibSudoMemoryAllocationException extends Exception {
    }

    /* compiled from: GetNeuropathyDiagnostics.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42339a;

        static {
            int[] iArr = new int[NeuropathyDiagnosticNative.SudoStatus.values().length];
            try {
                iArr[NeuropathyDiagnosticNative.SudoStatus.SUDO_STATUS_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NeuropathyDiagnosticNative.SudoStatus.SUDO_STATUS_PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NeuropathyDiagnosticNative.SudoStatus.SUDO_STATUS_SIGNS_OF_NEUROPATHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NeuropathyDiagnosticNative.SudoStatus.SUDO_STATUS_INCONCLUSIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f42339a = iArr;
        }
    }

    @Inject
    public GetNeuropathyDiagnostics(NerveHealthNative nerveHealthNative) {
        u.j(nerveHealthNative, "nerveHealthNative");
        this.f42338a = nerveHealthNative;
    }

    public final List<d> a(List<ky.d> list, long j5, MeasureCategory category) {
        d dVar;
        NeuropathyMeasureNative.SudoMode sudoMode;
        u.j(category, "category");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            NeuropathyMeasureNative neuropathyMeasureNative = null;
            if (!it.hasNext()) {
                break;
            }
            ky.d dVar2 = (ky.d) it.next();
            NeuropathyFeature.f42330d.getClass();
            ky.a e11 = ly.a.e(NeuropathyFeature.a.a(category).b(), dVar2);
            if (e11 != null) {
                if (dVar2.e().b() == 15) {
                    sudoMode = NeuropathyMeasureNative.SudoMode.SUDO_MODE_GUIDED_SCAN;
                } else {
                    sudoMode = NeuropathyMeasureNative.SudoMode.SUDO_MODE_ROUTINE;
                }
                neuropathyMeasureNative = new NeuropathyMeasureNative((float) e11.f(), sudoMode, e11.b());
            }
            if (neuropathyMeasureNative != null) {
                arrayList.add(neuropathyMeasureNative);
            }
        }
        NHSProcessResult neuropathyDiagnostics = this.f42338a.getNeuropathyDiagnostics(arrayList);
        if (neuropathyDiagnostics instanceof NHSProcessResult.Success) {
            NeuropathyDiagnosticNative[] diagnostics = ((NHSProcessResult.Success) neuropathyDiagnostics).getDiagnostics();
            ArrayList arrayList2 = new ArrayList();
            for (NeuropathyDiagnosticNative neuropathyDiagnosticNative : diagnostics) {
                DateTime date = neuropathyDiagnosticNative.getTimeStamp().toDateTime();
                int i11 = a.f42339a[neuropathyDiagnosticNative.getSudoStatus().ordinal()];
                boolean z5 = true;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                int b10 = an0.a.b(neuropathyDiagnosticNative.getValue());
                                u.j(date, "date");
                                dVar = new d(date, Integer.valueOf(b10));
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            if (category != MeasureCategory.f42341c) {
                                z5 = false;
                            }
                            int b11 = an0.a.b(neuropathyDiagnosticNative.getValue());
                            u.j(date, "date");
                            if (z5) {
                                dVar = new d(date, Integer.valueOf(b11));
                            } else {
                                dVar = new d(date, Integer.valueOf(b11));
                            }
                        }
                    } else {
                        u.j(date, "date");
                        date.dayOfMonth().get();
                        date.dayOfMonth().getMaximumValue();
                        dVar = new d(date, null);
                    }
                } else {
                    int b12 = an0.a.b(neuropathyDiagnosticNative.getValue());
                    u.j(date, "date");
                    dVar = new d(date, Integer.valueOf(b12));
                }
                arrayList2.add(dVar);
            }
            return arrayList2;
        }
        boolean z11 = neuropathyDiagnostics instanceof NHSProcessResult.ErrorNoMeasures;
        i0 i0Var = i0.f76187a;
        if (!z11) {
            if (neuropathyDiagnostics instanceof NHSProcessResult.ErrorAllocationFailed) {
                b.n(new Exception("NerveHealthScore C Lib experienced a memory allocation issue"));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i0Var;
    }
}
