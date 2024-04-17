package com.withings.nervehealth.ui.usecases;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.graph.model.NormalityZoneUiModel;
import en0.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.x;
import org.joda.time.Interval;
/* compiled from: ComputeNerveHealthNormalityZoneUseCase.kt */
/* loaded from: classes4.dex */
public final class ComputeNerveHealthNormalityZoneUseCase {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ComputeNerveHealthNormalityZoneUseCase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/nervehealth/ui/usecases/ComputeNerveHealthNormalityZoneUseCase$NerveHealthState;", "", "nervehealth-ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class NerveHealthState {

        /* renamed from: b  reason: collision with root package name */
        public static final NerveHealthState f42775b;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ NerveHealthState[] f42776c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ sm0.a f42777d;

        /* renamed from: a  reason: collision with root package name */
        private final en0.g<Double> f42778a;

        static {
            NerveHealthState nerveHealthState = new NerveHealthState("HEALTHY", 0, r.o(50.0d, 100.0d));
            NerveHealthState nerveHealthState2 = new NerveHealthState("LOW", 1, r.o(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 50.0d));
            NerveHealthState nerveHealthState3 = new NerveHealthState("UNDEFINED", 2, r.o(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
            f42775b = nerveHealthState3;
            NerveHealthState[] nerveHealthStateArr = {nerveHealthState, nerveHealthState2, nerveHealthState3};
            f42776c = nerveHealthStateArr;
            f42777d = sm0.b.a(nerveHealthStateArr);
        }

        private NerveHealthState(String str, int i11, en0.g gVar) {
            this.f42778a = gVar;
        }

        public static sm0.a<NerveHealthState> a() {
            return f42777d;
        }

        public static NerveHealthState valueOf(String str) {
            return (NerveHealthState) Enum.valueOf(NerveHealthState.class, str);
        }

        public static NerveHealthState[] values() {
            return (NerveHealthState[]) f42776c.clone();
        }

        public final en0.g<Double> b() {
            return this.f42778a;
        }
    }

    private static List a(int i11, Interval interval, en0.g gVar) {
        return x.W(new ws.d(i11, interval.getStart(), ((Number) gVar.getStart()).doubleValue(), ((Number) gVar.j()).doubleValue()), new ws.d(i11, interval.getEnd(), ((Number) gVar.getStart()).doubleValue(), ((Number) gVar.j()).doubleValue()));
    }

    public static NormalityZoneUiModel b(int i11, Interval interval, ArrayList arrayList) {
        Object obj;
        NormalityZoneUiModel normalityZoneUiModel;
        double w11 = x.w(arrayList);
        Iterator it = ((kotlin.collections.c) NerveHealthState.a()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((NerveHealthState) obj).b().c(Double.valueOf(w11))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NerveHealthState nerveHealthState = (NerveHealthState) obj;
        if (nerveHealthState == null) {
            nerveHealthState = NerveHealthState.f42775b;
        }
        int ordinal = nerveHealthState.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            normalityZoneUiModel = new NormalityZoneUiModel(NormalityZoneUiModel.Status.f39969b, a(i11, interval, r.o(nerveHealthState.b().getStart().doubleValue() - 10.0d, nerveHealthState.b().j().doubleValue())), NormalityZoneUiModel.Type.f39973c);
        } else {
            normalityZoneUiModel = new NormalityZoneUiModel(NormalityZoneUiModel.Status.f39968a, a(i11, interval, r.o(nerveHealthState.b().getStart().doubleValue(), nerveHealthState.b().j().doubleValue() + 10.0d)), NormalityZoneUiModel.Type.f39971a);
        }
        return normalityZoneUiModel;
    }
}
