package com.withings.wiscale2.profile;

import android.content.Context;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
/* compiled from: ProfileViewModel.kt */
/* loaded from: classes5.dex */
public final class i1 extends androidx.lifecycle.j0<String> implements zx.u {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f59362g = 0;

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f59363a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f59364b;

    /* renamed from: c  reason: collision with root package name */
    private final m70.c f59365c;

    /* renamed from: d  reason: collision with root package name */
    private final om.d f59366d;

    /* renamed from: e  reason: collision with root package name */
    private final cy.a f59367e;

    /* renamed from: f  reason: collision with root package name */
    private final iy.e f59368f;

    /* compiled from: ProfileViewModel.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<User, nm0.y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(User user) {
            i1.this.A();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ProfileViewModel.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<om.a, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(om.a aVar) {
            i1.this.A();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<User, om.a, Job> {
        c() {
            super(2);
        }

        @Override // ym0.p
        public final Job invoke(User user, om.a aVar) {
            Job launch$default;
            User user2 = user;
            om.a accountUnits = aVar;
            kotlin.jvm.internal.u.j(user2, "user");
            kotlin.jvm.internal.u.j(accountUnits, "accountUnits");
            i1 i1Var = i1.this;
            launch$default = BuildersKt__Builders_commonKt.launch$default(i1Var.f59363a, Dispatchers.getIO(), null, new l1(accountUnits, i1Var, user2, null), 2, null);
            return launch$default;
        }
    }

    /* compiled from: ProfileViewModel.kt */
    /* loaded from: classes5.dex */
    static final class d implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f59372a;

        d(ym0.l lVar) {
            this.f59372a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f59372a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f59372a;
        }

        public final int hashCode() {
            return this.f59372a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f59372a.invoke(obj);
        }
    }

    public i1(CoroutineScope coroutineScope, Context context, m70.c cVar, om.d dVar, cy.a aVar, iy.e measuresGroupRepositoryV2) {
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        this.f59363a = coroutineScope;
        this.f59364b = context;
        this.f59365c = cVar;
        this.f59366d = dVar;
        this.f59367e = aVar;
        this.f59368f = measuresGroupRepositoryV2;
        addSource(cVar, new d(new a()));
        addSource(dVar, new d(new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        cr.a.a(new nm0.j(this.f59365c.getValue(), this.f59366d.getValue()), new c());
    }

    @Override // zx.u
    public final void a0(long j5, MeasuresGroup measuresGroup) {
        A();
    }

    @Override // zx.u
    public final void l(long j5, MeasuresGroup measuresGroup) {
        A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0, androidx.lifecycle.LiveData
    public final void onActive() {
        super.onActive();
        this.f59367e.a(this);
        A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0, androidx.lifecycle.LiveData
    public final void onInactive() {
        super.onInactive();
        this.f59367e.b(this);
    }

    @Override // zx.u
    public final void z(long j5, MeasuresGroup measuresGroup, boolean z5) {
        if (!z5) {
            A();
        }
    }
}
