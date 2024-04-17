package com.withings.notifications.ui;

import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.material.r3;
import androidx.compose.material3.g9;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.material3.o7;
import androidx.compose.material3.y7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.common.compose.component.ButtonSize;
import com.withings.common.compose.component.a3;
import com.withings.common.compose.component.l2;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.notifications.ui.viewmodels.NotificationActivityViewModel;
import com.withings.notifications.ui.viewmodels.NotificationGroup;
import com.withings.notifications.ui.viewmodels.d;
import com.withings.wiscale2.C1987R;
import i6.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k1.o1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import m0.p1;
import qk.bd;
import x1.b;
import x1.d;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
public final class z {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f43149a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43150b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43151c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f43149a = eVar;
            this.f43150b = i11;
            this.f43151c = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43150b | 1);
            int i11 = this.f43151c;
            z.a(this.f43149a, aVar, g11, i11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43152a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43153b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f43152a = aVar;
            this.f43153b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43153b | 1);
            z.b(this.f43152a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.notifications.ui.NotificationsActivityKt$NotificationListScreen$1", f = "NotificationsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationActivityViewModel f43154a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(NotificationActivityViewModel notificationActivityViewModel, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f43154a = notificationActivityViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f43154a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f43154a.m0(new d.b(NotificationGroup.f43125b));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationActivityViewModel f43155a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(NotificationActivityViewModel notificationActivityViewModel) {
            super(0);
            this.f43155a = notificationActivityViewModel;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f43155a.m0(new d.b(NotificationGroup.f43124a));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.l<c10.c<?>, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationActivityViewModel f43156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(NotificationActivityViewModel notificationActivityViewModel) {
            super(1);
            this.f43156a = notificationActivityViewModel;
        }

        @Override // ym0.l
        public final nm0.y invoke(c10.c<?> cVar) {
            c10.c<?> it = cVar;
            kotlin.jvm.internal.u.j(it, "it");
            this.f43156a.m0(new d.a(it));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationActivityViewModel f43157a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43158b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43159c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43160d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f43161e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f43162f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(NotificationActivityViewModel notificationActivityViewModel, ym0.l<? super c10.c<?>, nm0.y> lVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11, int i12) {
            super(2);
            this.f43157a = notificationActivityViewModel;
            this.f43158b = lVar;
            this.f43159c = aVar;
            this.f43160d = aVar2;
            this.f43161e = i11;
            this.f43162f = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43161e | 1);
            ym0.a<nm0.y> aVar2 = this.f43159c;
            ym0.a<nm0.y> aVar3 = this.f43160d;
            z.c(this.f43157a, this.f43158b, aVar2, aVar3, aVar, g11, this.f43162f);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43163a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ok.a f43164b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43165c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ok.a aVar, ym0.a aVar2, ym0.a aVar3) {
            super(2);
            this.f43163a = aVar2;
            this.f43164b = aVar;
            this.f43165c = aVar3;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                List V = kotlin.collections.x.V(new a3.a(new l2.c(bd.f92865a), this.f43163a));
                ok.b.b(null, ay.b.u(C1987R.string._NOTIFICATIONS_, aVar2), null, null, null, ((i1) aVar2.D(j1.e())).a(), 0L, 0L, s1.b.b(aVar2, -2064401507, new b0(this.f43165c)), V, null, null, this.f43164b, false, 0.0f, 0.0f, aVar2, 100663296, 512, 60637);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<c10.c<?>> f43166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43167b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43168c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43169d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ok.a f43170e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(List<? extends c10.c<?>> list, ym0.a<nm0.y> aVar, ym0.l<? super c10.c<?>, nm0.y> lVar, ym0.l<? super c10.c<?>, nm0.y> lVar2, ok.a aVar2) {
            super(3);
            this.f43166a = list;
            this.f43167b = aVar;
            this.f43168c = lVar;
            this.f43169d = lVar2;
            this.f43170e = aVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.w padding = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(padding, "padding");
            if ((intValue & 14) == 0) {
                if (aVar2.K(padding)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar2.h()) {
                aVar2.C();
            } else {
                List<c10.c<?>> list = this.f43166a;
                if (list == null) {
                    aVar2.s(-570590541);
                    z.f(androidx.compose.foundation.layout.x0.j(e1.d(androidx.compose.ui.e.f8927a), 0.0f, padding.d(), 0.0f, 0.0f, 13), aVar2, 0, 0);
                    aVar2.J();
                } else if (list.isEmpty()) {
                    aVar2.s(-570590324);
                    z.a(androidx.compose.foundation.layout.x0.j(androidx.compose.ui.e.f8927a, 0.0f, padding.d(), 0.0f, 0.0f, 13), aVar2, 0, 0);
                    aVar2.J();
                } else {
                    aVar2.s(-570590164);
                    z.e(this.f43166a, this.f43167b, this.f43168c, this.f43169d, androidx.compose.ui.input.nestedscroll.a.a(androidx.compose.foundation.layout.x0.j(e1.e(androidx.compose.ui.e.f8927a, 1.0f), 0.0f, padding.d(), 0.0f, 0.0f, 13), this.f43170e.a(), null), aVar2, 8, 0);
                    aVar2.J();
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<c10.c<?>> f43171a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43172b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43173c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43174d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43175e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43176f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f43177g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(List<? extends c10.c<?>> list, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super c10.c<?>, nm0.y> lVar, ym0.l<? super c10.c<?>, nm0.y> lVar2, ym0.a<nm0.y> aVar3, int i11) {
            super(2);
            this.f43171a = list;
            this.f43172b = aVar;
            this.f43173c = aVar2;
            this.f43174d = lVar;
            this.f43175e = lVar2;
            this.f43176f = aVar3;
            this.f43177g = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43177g | 1);
            ym0.l<c10.c<?>, nm0.y> lVar = this.f43175e;
            ym0.a<nm0.y> aVar2 = this.f43176f;
            z.d(this.f43171a, this.f43172b, this.f43173c, this.f43174d, lVar, aVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.notifications.ui.NotificationsActivityKt$NotificationListScreenContent$2$1", f = "NotificationsActivity.kt", l = {307}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f43178a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.o0 f43179b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f43180c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(k1.o0 o0Var, k1.r0<Boolean> r0Var, qm0.d<? super j> dVar) {
            super(2, dVar);
            this.f43179b = o0Var;
            this.f43180c = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new j(this.f43179b, this.f43180c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((j) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f43178a;
            k1.r0<Boolean> r0Var = this.f43180c;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                k1.o0 o0Var = this.f43179b;
                if (o0Var.a() != 1.0f) {
                    o0Var.t(1.0f);
                }
                if (z.g(r0Var)) {
                    this.f43178a = 1;
                    if (DelayKt.delay(750L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
            r0Var.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.notifications.ui.NotificationsActivityKt$NotificationListScreenContent$3", f = "NotificationsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<c10.c<?>> f43181a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f43182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(List<? extends c10.c<?>> list, k1.r0<Boolean> r0Var, qm0.d<? super k> dVar) {
            super(2, dVar);
            this.f43181a = list;
            this.f43182b = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new k(this.f43181a, this.f43182b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((k) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            if (this.f43181a.isEmpty()) {
                this.f43182b.setValue(Boolean.TRUE);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.l<s0.i0, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<c10.c<?>> f43183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43184b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43185c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<c10.c<?>> f43186d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o1<Float> f43187e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43188f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List<c10.c<?>> f43189g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f43190h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f43191i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(List<? extends c10.c<?>> list, ym0.l<? super c10.c<?>, nm0.y> lVar, ym0.l<? super c10.c<?>, nm0.y> lVar2, List<? extends c10.c<?>> list2, o1<Float> o1Var, ym0.a<nm0.y> aVar, List<? extends c10.c<?>> list3, k1.r0<Boolean> r0Var, k1.r0<Boolean> r0Var2) {
            super(1);
            this.f43183a = list;
            this.f43184b = lVar;
            this.f43185c = lVar2;
            this.f43186d = list2;
            this.f43187e = o1Var;
            this.f43188f = aVar;
            this.f43189g = list3;
            this.f43190h = r0Var;
            this.f43191i = r0Var2;
        }

        @Override // ym0.l
        public final nm0.y invoke(s0.i0 i0Var) {
            s0.i0 LazyColumn = i0Var;
            kotlin.jvm.internal.u.j(LazyColumn, "$this$LazyColumn");
            List<c10.c<?>> list = this.f43183a;
            boolean z5 = !list.isEmpty();
            ym0.l<c10.c<?>, nm0.y> lVar = this.f43185c;
            ym0.l<c10.c<?>, nm0.y> lVar2 = this.f43184b;
            k1.r0<Boolean> r0Var = this.f43190h;
            List<c10.c<?>> list2 = this.f43189g;
            o1<Float> o1Var = this.f43187e;
            if (z5) {
                s0.i0.g(LazyColumn, "unread", new s1.a(true, -831068313, new c0(o1Var, this.f43188f)), 2);
                List<c10.c<?>> list3 = list;
                ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    c10.c cVar = (c10.c) it.next();
                    arrayList.add(new nm0.j(Integer.valueOf(list2.indexOf(cVar)), cVar));
                }
                z.h(LazyColumn, arrayList, z.g(r0Var), lVar2, lVar);
            }
            List<c10.c<?>> list4 = this.f43186d;
            if (!list4.isEmpty()) {
                k1.r0<Boolean> r0Var2 = this.f43191i;
                if (r0Var2.getValue().booleanValue()) {
                    s0.i0.g(LazyColumn, "reads", new s1.a(true, 293865301, new d0(o1Var)), 2);
                    List<c10.c<?>> list5 = list4;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(list5, 10));
                    Iterator<T> it2 = list5.iterator();
                    while (it2.hasNext()) {
                        c10.c cVar2 = (c10.c) it2.next();
                        arrayList2.add(new nm0.j(Integer.valueOf(list2.indexOf(cVar2)), cVar2));
                    }
                    z.h(LazyColumn, arrayList2, z.g(r0Var), lVar2, lVar);
                } else {
                    s0.i0.g(LazyColumn, "open reads", new s1.a(true, 723218988, new f0(o1Var, r0Var2)), 2);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<c10.c<?>> f43192a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f43193b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43194c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43195d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f43196e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f43197f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f43198g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(List<? extends c10.c<?>> list, ym0.a<nm0.y> aVar, ym0.l<? super c10.c<?>, nm0.y> lVar, ym0.l<? super c10.c<?>, nm0.y> lVar2, androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f43192a = list;
            this.f43193b = aVar;
            this.f43194c = lVar;
            this.f43195d = lVar2;
            this.f43196e = eVar;
            this.f43197f = i11;
            this.f43198g = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43197f | 1);
            ym0.l<c10.c<?>, nm0.y> lVar = this.f43195d;
            androidx.compose.ui.e eVar = this.f43196e;
            z.e(this.f43192a, this.f43193b, this.f43194c, lVar, eVar, aVar, g11, this.f43198g);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes4.dex */
    public static final class n<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b(((c10.c) t11).h(), ((c10.c) t12).h());
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes4.dex */
    public static final class o<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b(((c10.c) t12).h(), ((c10.c) t11).h());
        }
    }

    public static final void a(androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar.g(-2141038228);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.K(eVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            if (i15 != 0) {
                eVar = androidx.compose.ui.e.f8927a;
            }
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.foundation.layout.x0.j(e1.e(eVar, 1.0f), 0.0f, yk.h.B(), 0.0f, 0.0f, 13), yk.h.o(), 0.0f, 2);
            d.a g12 = b.a.g();
            int i16 = androidx.compose.foundation.layout.e.f4229i;
            e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.b());
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(o11, g12, g11);
            g11.s(-1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(h11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                n0.z.a(s2.d.a(C1987R.drawable.empty_notifications, g11), null, null, null, null, 0.0f, null, g11, 56, 124);
                nk.a.d(null, ay.b.u(C1987R.string.notificationStack_emptyState, g11), 0L, null, 0, 0, null, g11, 0, 125);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a(eVar, i11, i12));
        }
    }

    public static final void b(ym0.a<nm0.y> onClick, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        kotlin.jvm.internal.u.j(onClick, "onClick");
        androidx.compose.runtime.b g11 = aVar.g(-1610694018);
        if ((i11 & 14) == 0) {
            if (g11.w(onClick)) {
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
            com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.notificationStack_markAsRead, g11), null, false, null, ButtonSize.f33304f, false, onClick, g11, ((i12 << 21) & 29360128) | 196608, 93);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(onClick, i11));
        }
    }

    public static final void c(NotificationActivityViewModel notificationActivityViewModel, ym0.l<? super c10.c<?>, nm0.y> onItemClick, ym0.a<nm0.y> openSettings, ym0.a<nm0.y> close, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        i6.a aVar2;
        NotificationActivityViewModel notificationActivityViewModel2;
        NotificationActivityViewModel notificationActivityViewModel3;
        kotlin.jvm.internal.u.j(onItemClick, "onItemClick");
        kotlin.jvm.internal.u.j(openSettings, "openSettings");
        kotlin.jvm.internal.u.j(close, "close");
        androidx.compose.runtime.b g11 = aVar.g(200403257);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 2;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.w(onItemClick)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        if ((i12 & 4) != 0) {
            i13 |= ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
        } else if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(openSettings)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (g11.w(close)) {
                i16 = ModuleCopy.f28574b;
            } else {
                i16 = 1024;
            }
            i13 |= i16;
        }
        int i18 = i13;
        if (i17 == 1 && (i18 & 5851) == 1170 && g11.h()) {
            g11.C();
            notificationActivityViewModel3 = notificationActivityViewModel;
        } else {
            g11.M0();
            if ((i11 & 1) != 0 && !g11.v0()) {
                g11.C();
                if (i17 != 0) {
                    i18 &= -15;
                }
            } else if (i17 != 0) {
                g11.s(1890788296);
                n1 a11 = j6.a.a(g11);
                if (a11 != null) {
                    fk0.c a12 = e6.a.a(a11, g11);
                    g11.s(1729797275);
                    if (a11 instanceof androidx.lifecycle.u) {
                        aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                    } else {
                        aVar2 = a.C1058a.f71431b;
                    }
                    g1 a13 = j6.b.a(NotificationActivityViewModel.class, a11, null, a12, aVar2, g11);
                    g11.J();
                    g11.J();
                    i18 &= -15;
                    notificationActivityViewModel2 = (NotificationActivityViewModel) a13;
                    g11.l0();
                    k1.r0 c11 = h6.b.c(notificationActivityViewModel2.k0(), g11);
                    k1.y.f("markOldNotificationsAsRead", new c(notificationActivityViewModel2, null), g11);
                    int i19 = i18 << 6;
                    d(((j10.b) c11.getValue()).a(), openSettings, new d(notificationActivityViewModel2), onItemClick, new e(notificationActivityViewModel2), close, g11, ((i18 >> 3) & 112) | 8 | (i19 & 7168) | (i19 & 458752));
                    notificationActivityViewModel3 = notificationActivityViewModel2;
                } else {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
            }
            notificationActivityViewModel2 = notificationActivityViewModel;
            g11.l0();
            k1.r0 c112 = h6.b.c(notificationActivityViewModel2.k0(), g11);
            k1.y.f("markOldNotificationsAsRead", new c(notificationActivityViewModel2, null), g11);
            int i192 = i18 << 6;
            d(((j10.b) c112.getValue()).a(), openSettings, new d(notificationActivityViewModel2), onItemClick, new e(notificationActivityViewModel2), close, g11, ((i18 >> 3) & 112) | 8 | (i192 & 7168) | (i192 & 458752));
            notificationActivityViewModel3 = notificationActivityViewModel2;
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f(notificationActivityViewModel3, onItemClick, openSettings, close, i11, i12));
        }
    }

    public static final void d(List<? extends c10.c<?>> list, ym0.a<nm0.y> openSettings, ym0.a<nm0.y> markAllAsRead, ym0.l<? super c10.c<?>, nm0.y> onItemClick, ym0.l<? super c10.c<?>, nm0.y> onItemDelete, ym0.a<nm0.y> close, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(openSettings, "openSettings");
        kotlin.jvm.internal.u.j(markAllAsRead, "markAllAsRead");
        kotlin.jvm.internal.u.j(onItemClick, "onItemClick");
        kotlin.jvm.internal.u.j(onItemDelete, "onItemDelete");
        kotlin.jvm.internal.u.j(close, "close");
        androidx.compose.runtime.b g11 = aVar.g(-1651367102);
        ok.a o11 = ah.u.o(g11);
        y7.b(ah.k.s(androidx.compose.ui.e.f8927a), s1.b.b(g11, 2085040382, new g(o11, openSettings, close)), null, null, null, 0, 0L, 0L, null, s1.b.b(g11, 903745299, new h(list, markAllAsRead, onItemClick, onItemDelete, o11)), g11, 805306416, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new i(list, openSettings, markAllAsRead, onItemClick, onItemDelete, close, i11));
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Comparator] */
    public static final void e(List<? extends c10.c<?>> notifications, ym0.a<nm0.y> markAllAsRead, ym0.l<? super c10.c<?>, nm0.y> onItemClick, ym0.l<? super c10.c<?>, nm0.y> onItemDelete, androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        e.a aVar2;
        float f11;
        kotlin.jvm.internal.u.j(notifications, "notifications");
        kotlin.jvm.internal.u.j(markAllAsRead, "markAllAsRead");
        kotlin.jvm.internal.u.j(onItemClick, "onItemClick");
        kotlin.jvm.internal.u.j(onItemDelete, "onItemDelete");
        androidx.compose.runtime.b g11 = aVar.g(427623158);
        if ((i12 & 16) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        g11.s(161472705);
        boolean K = g11.K(notifications);
        Object t11 = g11.t();
        if (K || t11 == a.C0060a.a()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : kotlin.collections.x.D0(notifications, new Object())) {
                if (p0.d.m((c10.c) obj)) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            nm0.j jVar = new nm0.j(arrayList, arrayList2);
            g11.n(jVar);
            t11 = jVar;
        }
        nm0.j jVar2 = (nm0.j) t11;
        g11.J();
        List list = (List) jVar2.a();
        List list2 = (List) jVar2.b();
        g11.s(161472879);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t12);
        }
        k1.r0 r0Var = (k1.r0) t12;
        g11.J();
        g11.s(161472950);
        boolean K2 = g11.K(notifications);
        Object t13 = g11.t();
        if (K2 || t13 == a.C0060a.a()) {
            t13 = kotlin.collections.x.D0(notifications, new Object());
            g11.n(t13);
        }
        List list3 = (List) t13;
        Object a11 = com.huawei.hms.health.a.a(g11, 161473052);
        if (a11 == a.C0060a.a()) {
            boolean z5 = true;
            if (list.size() <= 1) {
                z5 = false;
            }
            a11 = androidx.compose.runtime.l0.f(Boolean.valueOf(z5), androidx.compose.runtime.v0.f8878a);
            g11.n(a11);
        }
        k1.r0 r0Var2 = (k1.r0) a11;
        Object a12 = com.huawei.hms.health.a.a(g11, 161473116);
        if (a12 == a.C0060a.a()) {
            if (((Boolean) r0Var2.getValue()).booleanValue()) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            a12 = ah.l.t(f11);
            g11.n(a12);
        }
        k1.o0 o0Var = (k1.o0) a12;
        g11.J();
        o1 b10 = m0.f.b(o0Var.a(), new p1(300, 300, m0.c0.b()), "animatedAlpha", g11, 3072, 20);
        g11.s(161473532);
        Object t14 = g11.t();
        if (t14 == a.C0060a.a()) {
            t14 = new j(o0Var, r0Var2, null);
            g11.n(t14);
        }
        g11.J();
        k1.y.f("animation", (ym0.p) t14, g11);
        k1.y.f(Integer.valueOf(list.size()), new k(list, r0Var, null), g11);
        s0.k0 c11 = s0.n0.c(0, 3, g11);
        int i13 = androidx.compose.foundation.layout.e.f4229i;
        e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.c());
        float o12 = yk.h.o();
        float B = yk.h.B();
        s0.a.a(aVar2, c11, new r0.x(o12, B, o12, B), false, o11, null, null, false, new l(list, onItemClick, onItemDelete, list2, b10, markAllAsRead, list3, r0Var2, r0Var), g11, (i11 >> 12) & 14, ConstantsWs.WS_STATUS_SHARINGGETERROR);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new m(notifications, markAllAsRead, onItemClick, onItemDelete, aVar2, i11, i12));
        }
    }

    public static final void f(androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar.g(1274090651);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.K(eVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            if (i15 != 0) {
                eVar = androidx.compose.ui.e.f8927a;
            }
            androidx.compose.ui.e e11 = e1.e(eVar, 1.0f);
            androidx.compose.ui.layout.l0 a11 = r3.a(g11, 733328855, false, g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(e11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                o7.a(0.0f, 0, 0, 31, 0L, 0L, g11, null);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a0(eVar, i11, i12));
        }
    }

    public static final boolean g(k1.r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }

    public static final void h(s0.i0 i0Var, ArrayList arrayList, boolean z5, ym0.l lVar, ym0.l lVar2) {
        h0 h0Var;
        int size = arrayList.size();
        k0 k0Var = k0.f42966a;
        if (k0Var != null) {
            h0Var = new h0(k0Var, arrayList);
        } else {
            h0Var = null;
        }
        i0Var.c(size, h0Var, new i0(g0.f42926a, arrayList), new s1.a(true, -632812321, new j0(arrayList, z5, lVar, lVar2)));
    }
}
