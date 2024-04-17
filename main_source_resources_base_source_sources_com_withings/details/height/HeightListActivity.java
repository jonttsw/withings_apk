package com.withings.details.height;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.camera.camera2.internal.p2;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c1;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.DismissDirection;
import androidx.compose.material.DismissValue;
import androidx.compose.material.c5;
import androidx.compose.material.g6;
import androidx.compose.material.q3;
import androidx.compose.material.q8;
import androidx.compose.material.t3;
import androidx.compose.material.v7;
import androidx.compose.material.z1;
import androidx.compose.material3.a9;
import androidx.compose.material3.g9;
import androidx.compose.material3.i1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.u0;
import androidx.lifecycle.h1;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.Map;
import javax.inject.Inject;
import jm.a;
import k1.j1;
import k1.r0;
import k1.v0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import r0.t0;
import x1.b;
/* compiled from: HeightListActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006 \u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/withings/details/height/HeightListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", com.huawei.hms.feature.dynamic.e.b.f28627a, "", "Lky/d;", "kotlin.jvm.PlatformType", "groupList", "", "cantBeDeletedDialog", "Lcom/withings/library/measure/MeasuresGroup;", "askDeleteConfirmation", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HeightListActivity extends Hilt_HeightListActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public cy.a f36523e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public fy.a f36524f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public fy.n f36525g;

    /* renamed from: h  reason: collision with root package name */
    private final n f36526h = new n(this);

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f36527i = nm0.h.b(new o());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f36528j = nm0.h.b(new l());

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f36522l = {androidx.camera.core.v.c(HeightListActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final b f36521k = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36530b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36531c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f36532d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f36530b = aVar;
            this.f36531c = aVar2;
            this.f36532d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36532d | 1);
            ym0.a<nm0.y> aVar2 = this.f36530b;
            ym0.a<nm0.y> aVar3 = this.f36531c;
            HeightListActivity.this.z3(aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f36533a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f36534b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z1 f36535c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CoroutineScope coroutineScope, r0<Boolean> r0Var, z1 z1Var) {
            super(0);
            this.f36533a = coroutineScope;
            this.f36534b = r0Var;
            this.f36535c = z1Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            b bVar = HeightListActivity.f36521k;
            this.f36534b.setValue(Boolean.FALSE);
            BuildersKt__Builders_commonKt.launch$default(this.f36533a, null, null, new com.withings.details.height.f(this.f36535c, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f36537b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MeasuresGroup f36538c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<MeasuresGroup> f36539d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z1 f36540e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CoroutineScope coroutineScope, MeasuresGroup measuresGroup, r0<MeasuresGroup> r0Var, z1 z1Var) {
            super(0);
            this.f36537b = coroutineScope;
            this.f36538c = measuresGroup;
            this.f36539d = r0Var;
            this.f36540e = z1Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            b bVar = HeightListActivity.f36521k;
            this.f36539d.setValue(null);
            HeightListActivity heightListActivity = HeightListActivity.this;
            heightListActivity.setResult(1);
            BuildersKt__Builders_commonKt.launch$default(this.f36537b, null, null, new com.withings.details.height.g(this.f36540e, null), 3, null);
            e0 J3 = HeightListActivity.J3(heightListActivity);
            J3.getClass();
            MeasuresGroup group = this.f36538c;
            kotlin.jvm.internal.u.j(group, "group");
            BuildersKt__Builders_commonKt.launch$default(h1.a(J3), Dispatchers.getIO(), null, new d0(J3, group, null), 2, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f36541a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0<MeasuresGroup> f36542b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z1 f36543c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CoroutineScope coroutineScope, r0<MeasuresGroup> r0Var, z1 z1Var) {
            super(0);
            this.f36541a = coroutineScope;
            this.f36542b = r0Var;
            this.f36543c = z1Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            b bVar = HeightListActivity.f36521k;
            this.f36542b.setValue(null);
            BuildersKt__Builders_commonKt.launch$default(this.f36541a, null, null, new com.withings.details.height.h(this.f36543c, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeightListActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.details.height.HeightListActivity$DeletableCell$3", f = "HeightListActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f36544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<Boolean> f36545b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MeasuresGroup f36546c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<MeasuresGroup> f36547d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f36548e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z5, ym0.a<Boolean> aVar, MeasuresGroup measuresGroup, r0<MeasuresGroup> r0Var, r0<Boolean> r0Var2, qm0.d<? super f> dVar) {
            super(2, dVar);
            this.f36544a = z5;
            this.f36545b = aVar;
            this.f36546c = measuresGroup;
            this.f36547d = r0Var;
            this.f36548e = r0Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new f(this.f36544a, this.f36545b, this.f36546c, this.f36547d, this.f36548e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            if (this.f36544a) {
                if (this.f36545b.invoke().booleanValue()) {
                    b bVar = HeightListActivity.f36521k;
                    this.f36547d.setValue(this.f36546c);
                } else {
                    b bVar2 = HeightListActivity.f36521k;
                    this.f36548e.setValue(Boolean.TRUE);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<DismissDirection, q8> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f36549a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final q8 invoke(DismissDirection dismissDirection) {
            DismissDirection it = dismissDirection;
            kotlin.jvm.internal.u.j(it, "it");
            return new q3(0.25f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z1 f36550a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(z1 z1Var) {
            super(3);
            this.f36550a = z1Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            DismissDirection dismissDirection;
            x1.d h11;
            r0.a0 SwipeToDismiss = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SwipeToDismiss, "$this$SwipeToDismiss");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                z1 z1Var = this.f36550a;
                if (z1Var.r().getValue().floatValue() == 0.0f) {
                    dismissDirection = null;
                } else if (z1Var.r().getValue().floatValue() > 0.0f) {
                    dismissDirection = DismissDirection.f4830a;
                } else {
                    dismissDirection = DismissDirection.f4831b;
                }
                if (dismissDirection != null) {
                    int ordinal = dismissDirection.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            h11 = b.a.f();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        h11 = b.a.h();
                    }
                    androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
                    aVar2.J();
                    androidx.compose.ui.e h12 = x0.h(androidx.compose.foundation.c.c(d11, ((yk.w) p2.b(aVar2, 615317871)).g().g()), yk.h.o(), 0.0f, 2);
                    aVar2.s(733328855);
                    l0 d12 = androidx.compose.foundation.layout.k.d(h11, false, aVar2);
                    aVar2.s(-1323940314);
                    int G = aVar2.G();
                    v0 l5 = aVar2.l();
                    androidx.compose.ui.node.g.D.getClass();
                    ym0.a a11 = g.a.a();
                    s1.a c11 = androidx.compose.ui.layout.y.c(h12);
                    if (aVar2.i() instanceof k1.d) {
                        aVar2.A();
                        if (aVar2.e()) {
                            aVar2.F(a11);
                        } else {
                            aVar2.m();
                        }
                        ym0.p c12 = com.google.protobuf.t.c(aVar2, d12, aVar2, l5);
                        if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                            l0.q.a(G, aVar2, G, c12);
                        }
                        l0.r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                        t3.a(s2.d.a(C1987R.drawable.ic_utilitary_delete, aVar2), "Swipe to delete", null, s2.b.a(androidx.health.connect.client.units.d.b(C1987R.color.statusUndefined), aVar2), aVar2, 56, 4);
                        defpackage.d.j(aVar2);
                    } else {
                        a3.g.s();
                        throw null;
                    }
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MeasuresGroup f36552b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<Boolean> f36553c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0<MeasuresGroup> f36554d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(MeasuresGroup measuresGroup, ym0.a<Boolean> aVar, r0<MeasuresGroup> r0Var) {
            super(3);
            this.f36552b = measuresGroup;
            this.f36553c = aVar;
            this.f36554d = r0Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            r0.a0 SwipeToDismiss = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SwipeToDismiss, "$this$SwipeToDismiss");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                ym0.a<Boolean> aVar3 = this.f36553c;
                MeasuresGroup measuresGroup = this.f36552b;
                HeightListActivity.F3(HeightListActivity.this, measuresGroup, new com.withings.details.height.i(aVar3, measuresGroup, this.f36554d), aVar2, ConstantsWs.WS_STATUS_ALREADY_EXIST);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MeasuresGroup f36556b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<Boolean> f36557c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f36558d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MeasuresGroup measuresGroup, ym0.a<Boolean> aVar, int i11) {
            super(2);
            this.f36556b = measuresGroup;
            this.f36557c = aVar;
            this.f36558d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36558d | 1);
            MeasuresGroup measuresGroup = this.f36556b;
            ym0.a<Boolean> aVar2 = this.f36557c;
            HeightListActivity.this.A3(measuresGroup, aVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36560b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36561c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f36560b = aVar;
            this.f36561c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36561c | 1);
            HeightListActivity.this.B3(this.f36560b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.a<jm.a> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final jm.a invoke() {
            return a.d.a(HeightListActivity.this);
        }
    }

    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    static final class m extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        m() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -676529827, new b0(HeightListActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class n implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f36564a = nm0.h.b(new c0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f36565b;

        public n(Activity activity) {
            this.f36565b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f36564a.getValue();
        }
    }

    /* compiled from: HeightListActivity.kt */
    /* loaded from: classes3.dex */
    static final class o extends kotlin.jvm.internal.w implements ym0.a<e0> {
        o() {
            super(0);
        }

        @Override // ym0.a
        public final e0 invoke() {
            HeightListActivity heightListActivity = HeightListActivity.this;
            User I3 = HeightListActivity.I3(heightListActivity);
            cy.a aVar = heightListActivity.f36523e;
            if (aVar != null) {
                fy.n nVar = heightListActivity.f36525g;
                if (nVar != null) {
                    fy.a aVar2 = heightListActivity.f36524f;
                    if (aVar2 != null) {
                        return new e0(I3, aVar, nVar, aVar2);
                    }
                    kotlin.jvm.internal.u.s("deleteMeasureGroupUseCase");
                    throw null;
                }
                kotlin.jvm.internal.u.s("getMeasureGroupsWithAllTypesUseCase");
                throw null;
            }
            kotlin.jvm.internal.u.s("measureListenerRegisterUseCase");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(ym0.a<nm0.y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        androidx.compose.runtime.b g11 = aVar2.g(-61417669);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
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
            bVar = g11;
        } else {
            bVar = g11;
            wk.p.a(aVar, ay.b.u(C1987R.string.heightMeasureList_lastHeightPopUpTitle, g11), ay.b.u(C1987R.string.heightMeasureList_lastHeightPopUpText, g11), ay.b.u(C1987R.string._OK_, g11), 0L, aVar, null, 0L, null, g11, (i12 & 14) | ((i12 << 15) & 458752), 464);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new k(aVar, i11));
        }
    }

    public static final void D3(HeightListActivity heightListActivity, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        heightListActivity.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(2000937350);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
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
            bVar = g11;
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e e11 = e1.e(aVar3, 1.0f);
            g11.s(-483455358);
            l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(e11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                bVar = g11;
                com.withings.common.compose.component.o.g(x0.h(aVar3, og.y.a(0, c11, j1.a(g11), g11, 2058660585), 0.0f, 2), null, null, ay.b.u(C1987R.string._LOG_YOUR_HEIGHT_TITLE_, g11), null, false, false, false, null, null, aVar, g11, 0, i12 & 14, 1014);
                g9.a(bVar);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new com.withings.details.height.e(heightListActivity, aVar, i11));
        }
    }

    public static final void F3(HeightListActivity heightListActivity, MeasuresGroup measuresGroup, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        heightListActivity.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(-1623676828);
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e g12 = x0.g(androidx.compose.foundation.h.b(androidx.compose.foundation.c.c(e1.e(aVar3, 1.0f), ((i1) g11.D(androidx.compose.material3.j1.e())).a()), false, aVar, 7), yk.h.o(), yk.h.c());
        g11.s(-483455358);
        l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(g12);
        Double d11 = null;
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            c11.invoke(j1.a(g11), g11, 0);
            g11.s(2058660585);
            nk.u.d(0, 0, 0, 61, 0L, g11, null, null, b50.b.m(new DateTime(measuresGroup.getDate()), (Context) g11.D(u0.d()), false, 6));
            androidx.compose.ui.e j5 = x0.j(e1.e(aVar3, 1.0f), 0.0f, yk.h.a(), 0.0f, 0.0f, 13);
            l0 a12 = c1.a(com.withings.authentication.d.b(g11, 693286680), b.a.l(), g11);
            g11.s(-1323940314);
            int G2 = g11.G();
            v0 l6 = g11.l();
            ym0.a a13 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(j5);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a13);
                } else {
                    g11.m();
                }
                ym0.p b12 = com.withings.authentication.e.b(g11, a12, g11, l6);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                    androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                }
                dq.x.b(0, c12, j1.a(g11), g11, 2058660585);
                Measure measureForType = measuresGroup.getMeasureForType(4);
                if (measureForType != null) {
                    d11 = Double.valueOf(measureForType.f95794y);
                }
                g11.s(-1389053080);
                if (d11 != null) {
                    double doubleValue = d11.doubleValue();
                    if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        nk.a.d(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true), ((jm.a) heightListActivity.f36528j.getValue()).f(doubleValue, 4), 0L, null, 0, 0, null, g11, 0, 124);
                    } else {
                        throw new IllegalArgumentException(defpackage.b.b("invalid weight ", 1.0f, "; must be greater than zero").toString());
                    }
                }
                g11.J();
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                androidx.compose.runtime.v o02 = g11.o0();
                if (o02 != null) {
                    o02.G(new com.withings.details.height.j(heightListActivity, measuresGroup, aVar, i11));
                    return;
                }
                return;
            }
            a3.g.s();
            throw null;
        }
        a3.g.s();
        throw null;
    }

    public static final void G3(HeightListActivity heightListActivity, Map map, androidx.compose.runtime.a aVar, int i11) {
        heightListActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1941208327);
        int i12 = r0.h0.f94240a;
        s0.a.a(null, null, r0.l0.d(t0.a(g11), g11), false, null, null, null, false, new p(heightListActivity, map), g11, 0, ConstantsWs.WS_STATUS_NODATAFOUND);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new q(heightListActivity, map, i11));
        }
    }

    public static final void H3(HeightListActivity heightListActivity, CoroutineScope coroutineScope, c5 c5Var, androidx.compose.runtime.a aVar, int i11) {
        heightListActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1744680588);
        a9.a(null, null, 0L, 0L, 0.0f, 0.0f, null, s1.b.b(g11, 646402191, new u(heightListActivity, coroutineScope, c5Var)), g11, 12582912, 127);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new v(heightListActivity, coroutineScope, c5Var, i11));
        }
    }

    public static final User I3(HeightListActivity heightListActivity) {
        return (User) heightListActivity.f36526h.getValue(heightListActivity, f36522l[0]);
    }

    public static final e0 J3(HeightListActivity heightListActivity) {
        return (e0) heightListActivity.f36527i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(-688292254);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            bVar = g11;
            wk.p.a(aVar2, ay.b.u(C1987R.string._DELETE_MEASURE_CONFIRMATION_, g11), ay.b.u(C1987R.string._THIS_DATA_WILL_BE_PERMANTENTLY_DELETED_, g11), ay.b.u(C1987R.string._DELETE_YES_, g11), ((i1) g11.D(androidx.compose.material3.j1.e())).r(), aVar, ay.b.u(C1987R.string._CANCEL_, g11), 0L, aVar2, g11, ((i12 >> 3) & 14) | ((i12 << 15) & 458752) | ((i12 << 21) & 234881024), 128);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new a(aVar, aVar2, i11));
        }
    }

    public final void A3(MeasuresGroup group, ym0.a<Boolean> aVar, androidx.compose.runtime.a aVar2, int i11) {
        boolean z5;
        boolean z11;
        kotlin.jvm.internal.u.j(group, "group");
        androidx.compose.runtime.b c11 = g6.c(aVar, "canBeDeleted", aVar2, -477849869, 773894976);
        c11.s(-492369756);
        Object t11 = c11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(c11), c11);
        }
        c11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
        c11.J();
        z1 c12 = v7.c(c11);
        c11.s(556424929);
        Object t12 = c11.t();
        if (t12 == a.C0060a.a()) {
            t12 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            c11.n(t12);
        }
        r0 r0Var = (r0) t12;
        Object a12 = com.huawei.hms.health.a.a(c11, 556425017);
        if (a12 == a.C0060a.a()) {
            a12 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
            c11.n(a12);
        }
        r0 r0Var2 = (r0) a12;
        c11.J();
        c11.s(556425059);
        if (((Boolean) r0Var.getValue()).booleanValue()) {
            B3(new c(a11, r0Var, c12), c11, 64);
        }
        c11.J();
        MeasuresGroup measuresGroup = (MeasuresGroup) r0Var2.getValue();
        c11.s(556425294);
        if (measuresGroup != null) {
            z3(new d(a11, measuresGroup, r0Var2, c12), new e(a11, r0Var2, c12), c11, 512);
            nm0.y yVar = nm0.y.f85009a;
        }
        c11.J();
        DismissDirection dismissDirection = DismissDirection.f4831b;
        if (c12.n() == DismissValue.f4835c) {
            z5 = true;
        } else {
            z5 = false;
        }
        DismissDirection dismissDirection2 = DismissDirection.f4830a;
        if (!z5 && c12.n() != DismissValue.f4834b) {
            z11 = false;
        } else {
            z11 = true;
        }
        k1.y.f(Boolean.valueOf(z11), new f(z11, aVar, group, r0Var2, r0Var, null), c11);
        v7.a(c12, x0.h(androidx.compose.ui.e.f8927a, 0.0f, yk.h.a(), 1), kotlin.collections.c1.h(dismissDirection2, dismissDirection), g.f36549a, s1.b.b(c11, -1673560443, new h(c12)), s1.b.b(c11, -726393500, new i(group, aVar, r0Var2)), c11, 224640, 0);
        androidx.compose.runtime.v o02 = c11.o0();
        if (o02 != null) {
            o02.G(new j(group, aVar, i11));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // com.withings.details.height.Hilt_HeightListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, -1136569277, new m()));
    }
}
