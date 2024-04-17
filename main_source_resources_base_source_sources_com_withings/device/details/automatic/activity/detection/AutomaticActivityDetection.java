package com.withings.device.details.automatic.activity.detection;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.w7;
import androidx.compose.material3.j1;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.common.compose.component.n1;
import com.withings.common.compose.component.v4;
import com.withings.common.compose.component.y3;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.q0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
/* compiled from: AutomaticActivityDetection.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006 \u0010\t\u001a\u0016\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\u0004\u0012\u00020\u00040\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/device/details/automatic/activity/detection/AutomaticActivityDetection;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "", "globalState", "", "Lcom/withings/workout/category/model/WorkoutCategory;", "kotlin.jvm.PlatformType", "activityCategoryState", "device-details-common_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AutomaticActivityDetection extends Hilt_AutomaticActivityDetection {

    /* renamed from: e  reason: collision with root package name */
    private final i1 f36660e = new i1(q0.b(AutomaticActivityDetectionViewModel.class), new d(this), new c(this), new e(this));
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public ch.l f36661f;

    /* compiled from: AutomaticActivityDetection.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                AutomaticActivityDetection.B3(AutomaticActivityDetection.this, aVar2, 8);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AutomaticActivityDetection.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.automatic.activity.detection.AutomaticActivityDetection$onPause$1", f = "AutomaticActivityDetection.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            int i11 = v70.a.f103433b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<WorkoutCategory, Boolean> entry : AutomaticActivityDetection.E3(AutomaticActivityDetection.this).i0().getValue().entrySet()) {
                if (entry.getValue().booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set<WorkoutCategory> keySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(keySet, 10));
            for (WorkoutCategory workoutCategory : keySet) {
                w7.k(workoutCategory.getId(), arrayList);
            }
            v70.a.d("automatic_activity_detection", "automatic_activity_detection", s0.i(new nm0.j("choice", kotlin.collections.x.R(arrayList, ",", null, null, null, 62))), true);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f36664a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f36664a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f36664a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f36665a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f36665a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f36665a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f36666a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f36666a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f36666a.getDefaultViewModelCreationExtras();
        }
    }

    public static final void A3(AutomaticActivityDetection automaticActivityDetection, androidx.compose.runtime.a aVar, int i11) {
        automaticActivityDetection.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1642431386);
        v4.b(null, ay.b.u(C1987R.string.scanwatch_settings_actirec_deactivation_title, g11), ay.b.u(((AutomaticActivityDetectionViewModel) automaticActivityDetection.f36660e.getValue()).k0(), g11), null, 0.0f, 0.0f, 0, 0, g11, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
        n0.z.a(s2.d.a(C1987R.drawable.actirect_auto_settings, g11), null, w0.a(x0.h(e1.e(androidx.compose.ui.e.f8927a, 1.0f), yk.h.o(), 0.0f, 2), 1.7777778f), null, null, 0.0f, null, g11, 56, 120);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(automaticActivityDetection, i11));
        }
    }

    public static final void B3(AutomaticActivityDetection automaticActivityDetection, androidx.compose.runtime.a aVar, int i11) {
        automaticActivityDetection.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-684194393);
        yk.o.b(false, s1.b.b(g11, -1042511411, new q(automaticActivityDetection)), g11, 48, 1);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new r(automaticActivityDetection, i11));
        }
    }

    public static final void C3(AutomaticActivityDetection automaticActivityDetection, String str, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        automaticActivityDetection.getClass();
        androidx.compose.runtime.b g11 = aVar.g(661741738);
        if ((i11 & 14) == 0) {
            if (g11.K(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            n1.d(str, ((androidx.compose.material3.i1) g11.D(j1.e())).J(), null, g11, i12 & 14, 4);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new s(automaticActivityDetection, str, i11));
        }
    }

    public static final void D3(AutomaticActivityDetection automaticActivityDetection, Map map, ym0.p pVar, androidx.compose.runtime.a aVar, int i11) {
        automaticActivityDetection.getClass();
        androidx.compose.runtime.b g11 = aVar.g(377085142);
        y3.d(null, null, null, 0.0f, 0.0f, 0L, s1.b.b(g11, 1895965088, new v(map, pVar, automaticActivityDetection)), g11, 1572864, 63);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new w(automaticActivityDetection, map, pVar, i11));
        }
    }

    public static final AutomaticActivityDetectionViewModel E3(AutomaticActivityDetection automaticActivityDetection) {
        return (AutomaticActivityDetectionViewModel) automaticActivityDetection.f36660e.getValue();
    }

    public static final void z3(AutomaticActivityDetection automaticActivityDetection, boolean z5, ym0.l lVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        automaticActivityDetection.getClass();
        androidx.compose.runtime.b g11 = aVar.g(459795083);
        if ((i11 & 14) == 0) {
            if (g11.a(z5)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            y3.c(null, null, null, null, 0.0f, 0L, s1.b.b(g11, -1587283993, new h(lVar, z5)), g11, 1572864, 63);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new i(automaticActivityDetection, z5, lVar, i11));
        }
    }

    @Override // com.withings.device.details.automatic.activity.detection.Hilt_AutomaticActivityDetection, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 1890095839, new a()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new b(null), 2, null);
        super.onPause();
    }
}
