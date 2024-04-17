package com.withings.healthscore.ui.exploredata;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.common.compose.component.t1;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.wiscale2.C1987R;
import e.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import m0.t;
import nm0.y;
import ws.b;
import yk.o;
import ym0.p;
/* compiled from: HealthScoreExploreDataActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/healthscore/ui/exploredata/HealthScoreExploreDataActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HealthScoreExploreDataActivity extends Hilt_HealthScoreExploreDataActivity {

    /* renamed from: e  reason: collision with root package name */
    private final i1 f40515e = new i1(q0.b(HealthScoreExploreDataViewModel.class), new d(this), new c(this), new e(this));
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public xv.a f40516f;

    /* renamed from: g  reason: collision with root package name */
    private StateFlow<? extends ws.b> f40517g;

    /* compiled from: HealthScoreExploreDataActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40518a;

        static {
            int[] iArr = new int[MeasurementsVertical.values().length];
            try {
                MeasurementsVertical measurementsVertical = MeasurementsVertical.f41862a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MeasurementsVertical measurementsVertical2 = MeasurementsVertical.f41862a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MeasurementsVertical measurementsVertical3 = MeasurementsVertical.f41862a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MeasurementsVertical measurementsVertical4 = MeasurementsVertical.f41862a;
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f40518a = iArr;
        }
    }

    /* compiled from: HealthScoreExploreDataActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, 1226242449, new com.withings.healthscore.ui.exploredata.e(HealthScoreExploreDataActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40520a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f40520a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f40520a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40521a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f40521a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f40521a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40522a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f40522a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f40522a.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HealthScoreExploreDataViewModel B3() {
        return (HealthScoreExploreDataViewModel) this.f40515e.getValue();
    }

    @Override // com.withings.healthscore.ui.exploredata.Hilt_HealthScoreExploreDataActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int i11;
        String string;
        super.onCreate(bundle);
        com.withings.healthscore.ui.exploredata.a aVar = new com.withings.healthscore.ui.exploredata.a(B3().k0(), this);
        LifecycleCoroutineScopeImpl l5 = t.l(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow shareIn = FlowKt.shareIn(aVar, l5, companion.getEagerly(), 1);
        MeasurementsVertical q02 = B3().q0();
        if (q02 == null) {
            i11 = -1;
        } else {
            i11 = a.f40518a[q02.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        string = getString(C1987R.string.healthImprovementScore_title);
                    } else {
                        string = getString(C1987R.string.his_subScore_sleep_card_title);
                    }
                } else {
                    string = getString(C1987R.string.his_subScore_heart_card_title);
                }
            } else {
                string = getString(C1987R.string.his_subScore_body_card_title);
            }
        } else {
            string = getString(C1987R.string.his_subScore_activity_card_title);
        }
        u.g(string);
        this.f40517g = FlowKt.stateIn(FlowKt.combine(shareIn, B3().p0(), B3().i0(), B3().m0(), new com.withings.healthscore.ui.exploredata.b(new t1(string), this, null)), t.l(this), companion.getEagerly(), b.a.f106052a);
        k.a(this, new s1.a(true, 483285367, new b()));
    }
}
