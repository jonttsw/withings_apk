package com.withings.notifications.ui;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.n1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.notifications.ui.k;
import i6.a;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: NotificationsSection.kt */
/* loaded from: classes4.dex */
public final class t0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsSection.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<c10.c<?>, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f43102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0 f43103b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f43104c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f43105d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CoroutineScope coroutineScope, r0 r0Var, Context context, long j5) {
            super(1);
            this.f43102a = coroutineScope;
            this.f43103b = r0Var;
            this.f43104c = context;
            this.f43105d = j5;
        }

        @Override // ym0.l
        public final nm0.y invoke(c10.c<?> cVar) {
            c10.c<?> notification = cVar;
            kotlin.jvm.internal.u.j(notification, "notification");
            BuildersKt__Builders_commonKt.launch$default(this.f43102a, null, null, new s0(this.f43103b, this.f43104c, notification, this.f43105d, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsSection.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<c10.c<?>, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationSectionViewModel f43106a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f43107b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(NotificationSectionViewModel notificationSectionViewModel, long j5) {
            super(1);
            this.f43106a = notificationSectionViewModel;
            this.f43107b = j5;
        }

        @Override // ym0.l
        public final nm0.y invoke(c10.c<?> cVar) {
            c10.c<?> notification = cVar;
            kotlin.jvm.internal.u.j(notification, "notification");
            k.a aVar = new k.a(this.f43107b, notification);
            NotificationSectionViewModel notificationSectionViewModel = this.f43106a;
            notificationSectionViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(notificationSectionViewModel), Dispatchers.getIO(), null, new l(notificationSectionViewModel, aVar.b(), aVar.a(), null), 2, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsSection.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f43108a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<c10.c<?>> f43109b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NotificationSectionViewModel f43110c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43111d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f43112e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(long j5, List<? extends c10.c<?>> list, NotificationSectionViewModel notificationSectionViewModel, int i11, int i12) {
            super(2);
            this.f43108a = j5;
            this.f43109b = list;
            this.f43110c = notificationSectionViewModel;
            this.f43111d = i11;
            this.f43112e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43111d | 1);
            List<c10.c<?>> list = this.f43109b;
            NotificationSectionViewModel notificationSectionViewModel = this.f43110c;
            t0.b(this.f43108a, list, notificationSectionViewModel, aVar, g11, this.f43112e);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Comparator] */
    public static final void a(int i11, androidx.compose.runtime.a aVar, List content, ym0.l openNotification, ym0.l closeNotification) {
        kotlin.jvm.internal.u.j(content, "content");
        kotlin.jvm.internal.u.j(openNotification, "openNotification");
        kotlin.jvm.internal.u.j(closeNotification, "closeNotification");
        androidx.compose.runtime.b g11 = aVar.g(-105432340);
        g11.s(660946697);
        boolean K = g11.K(content);
        Object t11 = g11.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(cp0.n.A(cp0.n.y(cp0.n.h(kotlin.collections.x.t(content), y0.f43148a), new Object())), androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        g11.J();
        g11.s(660946979);
        boolean K2 = g11.K((List) r0Var.getValue());
        Object t12 = g11.t();
        if (K2 || t12 == a.C0060a.a()) {
            t12 = androidx.compose.runtime.l0.f(kotlin.collections.x.I((List) r0Var.getValue()), androidx.compose.runtime.v0.f8878a);
            g11.n(t12);
        }
        k1.r0 r0Var2 = (k1.r0) t12;
        g11.J();
        g11.s(660947074);
        boolean K3 = g11.K((List) r0Var.getValue());
        Object t13 = g11.t();
        if (K3 || t13 == a.C0060a.a()) {
            t13 = ah.p.h(((List) r0Var.getValue()).size() - 1);
            g11.n(t13);
        }
        g11.J();
        m.a(null, ((k1.p0) t13).d(), s1.b.b(g11, -1208752923, new w0(openNotification, r0Var2, closeNotification)), g11, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 1);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new x0(i11, content, openNotification, closeNotification));
        }
    }

    public static final void b(long j5, List<? extends c10.c<?>> content, NotificationSectionViewModel notificationSectionViewModel, androidx.compose.runtime.a aVar, int i11, int i12) {
        NotificationSectionViewModel notificationSectionViewModel2;
        i6.a aVar2;
        kotlin.jvm.internal.u.j(content, "content");
        androidx.compose.runtime.b g11 = aVar.g(-1282986500);
        if ((i12 & 4) != 0) {
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
                g1 a13 = j6.b.a(NotificationSectionViewModel.class, a11, null, a12, aVar2, g11);
                g11.J();
                g11.J();
                notificationSectionViewModel2 = (NotificationSectionViewModel) a13;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            notificationSectionViewModel2 = notificationSectionViewModel;
        }
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        g11.s(660945493);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
            t11 = (r0) ah.o.c(applicationContext, r0.class);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        g11.J();
        g11.s(773894976);
        g11.s(-492369756);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a14 = ((androidx.compose.runtime.k) t12).a();
        g11.J();
        g11.s(660945748);
        Object t13 = g11.t();
        if (t13 == a.C0060a.a()) {
            t13 = new a(a14, r0Var, context, j5);
            g11.n(t13);
        }
        ym0.l lVar = (ym0.l) t13;
        Object a15 = com.huawei.hms.health.a.a(g11, 660946172);
        if (a15 == a.C0060a.a()) {
            a15 = new b(notificationSectionViewModel2, j5);
            g11.n(a15);
        }
        g11.J();
        a(440, g11, content, lVar, (ym0.l) a15);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(j5, content, notificationSectionViewModel2, i11, i12));
        }
    }
}
