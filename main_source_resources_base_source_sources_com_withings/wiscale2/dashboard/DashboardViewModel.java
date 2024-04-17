package com.withings.wiscale2.dashboard;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.withings.device.Device;
import com.withings.user.User;
import com.withings.webservices.legacy.sync.SyncJob;
import com.withings.wiscale2.measure.accountmeasure.unknown.ui.UserItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
/* compiled from: DashboardViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/dashboard/DashboardViewModel;", "Landroidx/lifecycle/g1;", "Lcom/withings/webservices/legacy/sync/SyncJob$Listener;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DashboardViewModel extends g1 implements SyncJob.Listener {

    /* renamed from: a  reason: collision with root package name */
    private final m70.i f50497a;

    /* renamed from: b  reason: collision with root package name */
    private final oi0.b f50498b;

    /* renamed from: c  reason: collision with root package name */
    private final kn.e f50499c;

    /* renamed from: d  reason: collision with root package name */
    private final fl.e f50500d;

    /* renamed from: e  reason: collision with root package name */
    private final k0<User> f50501e;

    /* renamed from: f  reason: collision with root package name */
    private final k0<Boolean> f50502f;

    /* renamed from: g  reason: collision with root package name */
    private final xw.p<List<User>, User, User> f50503g;

    /* renamed from: h  reason: collision with root package name */
    private final Flow<List<h>> f50504h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.lifecycle.f f50505i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f50506j;

    /* compiled from: DashboardViewModel.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<xw.p<List<? extends User>, User, List<? extends UserItemData>>, List<? extends User>, User, y> {
        a() {
            super(3);
        }

        @Override // ym0.q
        public final y invoke(xw.p<List<? extends User>, User, List<? extends UserItemData>> pVar, List<? extends User> list, User user) {
            boolean z5;
            xw.p<List<? extends User>, User, List<? extends UserItemData>> liveData = pVar;
            List<? extends User> users = list;
            User user2 = user;
            kotlin.jvm.internal.u.j(liveData, "liveData");
            kotlin.jvm.internal.u.j(users, "users");
            DashboardViewModel dashboardViewModel = DashboardViewModel.this;
            dashboardViewModel.getClass();
            List D0 = kotlin.collections.x.D0(users, new p(dashboardViewModel));
            ArrayList arrayList = null;
            if (D0.size() <= 1) {
                D0 = null;
            }
            if (D0 != null) {
                List<User> list2 = D0;
                arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
                for (User user3 : list2) {
                    if (user3.q() == user2.q()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    arrayList.add(new UserItemData(user3, Boolean.valueOf(z5)));
                }
            }
            liveData.postValue(arrayList);
            return y.f85009a;
        }
    }

    /* compiled from: DashboardViewModel.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<User, LiveData<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ wg0.a f50508a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(wg0.a aVar) {
            super(1);
            this.f50508a = aVar;
        }

        @Override // ym0.l
        public final LiveData<Boolean> invoke(User user) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new o(this.f50508a, null), 2);
        }
    }

    /* compiled from: DashboardViewModel.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<nm0.o<User, List<Device>, Boolean>, LiveData<List<h>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f50509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DashboardViewModel f50510b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, DashboardViewModel dashboardViewModel) {
            super(1);
            this.f50509a = context;
            this.f50510b = dashboardViewModel;
        }

        @Override // ym0.l
        public final LiveData<List<h>> invoke(nm0.o<User, List<Device>, Boolean> oVar) {
            nm0.o<User, List<Device>, Boolean> oVar2 = oVar;
            User a11 = oVar2.a();
            List<Device> b10 = oVar2.b();
            boolean booleanValue = oVar2.c().booleanValue();
            kotlin.jvm.internal.u.g(a11);
            kotlin.jvm.internal.u.g(b10);
            return new g(a11, b10, this.f50509a, h1.a(this.f50510b), booleanValue);
        }
    }

    /* compiled from: DashboardViewModel.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.q<xw.p<List<? extends User>, User, User>, List<? extends User>, User, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f50511a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final y invoke(xw.p<List<? extends User>, User, User> pVar, List<? extends User> list, User user) {
            Object obj;
            xw.p<List<? extends User>, User, User> liveData = pVar;
            List<? extends User> users = list;
            User user2 = user;
            kotlin.jvm.internal.u.j(liveData, "liveData");
            kotlin.jvm.internal.u.j(users, "users");
            Iterator<T> it = users.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    User user3 = (User) obj;
                    if (user2 != null && user3.q() == user2.q()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            User user4 = (User) obj;
            if (user4 != null) {
                liveData.setValue(user4);
            }
            return y.f85009a;
        }
    }

    @Inject
    public DashboardViewModel(Context context, m70.i userManager, oi0.b syncManager, kn.e deviceManager, fl.e eVar, fl.p pVar, wg0.a aVar) {
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(syncManager, "syncManager");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        this.f50497a = userManager;
        this.f50498b = syncManager;
        this.f50499c = deviceManager;
        this.f50500d = eVar;
        m70.a aVar2 = new m70.a(h1.a(this), userManager, null);
        k0<User> b10 = xw.d.b(null);
        this.f50501e = b10;
        this.f50502f = xw.d.b(Boolean.FALSE);
        xw.p<List<User>, User, User> pVar2 = new xw.p<>(aVar2, b10, d.f50511a);
        this.f50503g = pVar2;
        j0 c11 = e1.c(pVar2, new b(aVar));
        new xw.p(aVar2, pVar2, new a());
        Flow<List<h>> a11 = androidx.lifecycle.q.a(e1.c(e1.a(xw.a.a(new nm0.o(pVar2, new fl.x(h1.a(this), pVar2, deviceManager, pVar), c11))), new c(context, this)));
        this.f50504h = a11;
        this.f50505i = androidx.lifecycle.q.b(a11, h1.a(this).getCoroutineContext(), 2);
    }

    public final androidx.lifecycle.f j0() {
        return this.f50505i;
    }

    public final xw.p<List<User>, User, User> k0() {
        return this.f50503g;
    }

    public final k0<Boolean> m0() {
        return this.f50502f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f50506j = false;
        super.onCleared();
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob.Listener
    public final void onSyncJobDone(SyncJob syncJob, int i11) {
        if (this.f50506j) {
            this.f50502f.postValue(Boolean.FALSE);
        }
    }

    public final void p0() {
        this.f50506j = true;
        this.f50498b.m("syncForDashboardRefresh", this);
        User value = this.f50503g.getValue();
        if (value != null) {
            if (value.D()) {
                value = null;
            }
            if (value != null) {
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new q(this, value, null), 3, null);
            }
        }
    }

    public final void q0(User user) {
        kotlin.jvm.internal.u.j(user, "user");
        this.f50501e.postValue(user);
    }
}
