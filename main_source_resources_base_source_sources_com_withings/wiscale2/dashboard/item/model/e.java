package com.withings.wiscale2.dashboard.item.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import com.withings.device.Device;
import com.withings.user.User;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.j;
import nm0.y;
import ym0.l;
import ym0.p;
/* compiled from: SummaryItemData.kt */
/* loaded from: classes4.dex */
public abstract class e extends j0<com.withings.wiscale2.dashboard.item.model.c> {

    /* renamed from: a  reason: collision with root package name */
    private final String f50573a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50574b;

    /* renamed from: c  reason: collision with root package name */
    private final int f50575c;

    /* renamed from: d  reason: collision with root package name */
    private final User f50576d;

    /* renamed from: e  reason: collision with root package name */
    private final CoroutineScope f50577e;

    /* renamed from: f  reason: collision with root package name */
    private final k0<com.withings.wiscale2.dashboard.item.model.d> f50578f = xw.d.b(null);

    /* compiled from: SummaryItemData.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements l<j<? extends Boolean, ? extends List<? extends Device>>, y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(j<? extends Boolean, ? extends List<? extends Device>> jVar) {
            j<? extends Boolean, ? extends List<? extends Device>> jVar2 = jVar;
            boolean booleanValue = jVar2.a().booleanValue();
            List<? extends Device> b10 = jVar2.b();
            e eVar = e.this;
            if (booleanValue) {
                eVar.G();
            } else {
                eVar.postValue(new com.withings.wiscale2.dashboard.item.model.c(eVar.y(), eVar.v(), eVar.A(), eVar.C(), booleanValue, b10, null));
            }
            return y.f85009a;
        }
    }

    /* compiled from: SummaryItemData.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements l<com.withings.wiscale2.dashboard.item.model.d, y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(com.withings.wiscale2.dashboard.item.model.d dVar) {
            e eVar = e.this;
            cr.a.a(new j(eVar.E().getValue(), eVar.B().getValue()), new f(eVar, dVar));
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SummaryItemData.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.dashboard.item.model.SummaryItemLiveData$loadThenPostData$1", f = "SummaryItemData.kt", l = {62}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        k0 f50581a;

        /* renamed from: b  reason: collision with root package name */
        int f50582b;

        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.k0] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            k0<com.withings.wiscale2.dashboard.item.model.d> k0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f50582b;
            if (i11 != 0) {
                if (i11 == 1) {
                    k0Var = this.f50581a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                e eVar = e.this;
                k0<com.withings.wiscale2.dashboard.item.model.d> x11 = eVar.x();
                User C = eVar.C();
                this.f50581a = x11;
                this.f50582b = 1;
                obj = eVar.F(C, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                k0Var = x11;
            }
            k0Var.postValue(obj);
            return y.f85009a;
        }
    }

    /* compiled from: SummaryItemData.kt */
    /* loaded from: classes4.dex */
    static final class d implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f50584a;

        d(l lVar) {
            this.f50584a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return u.e(this.f50584a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f50584a;
        }

        public final int hashCode() {
            return this.f50584a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50584a.invoke(obj);
        }
    }

    public e(String str, int i11, int i12, User user, CoroutineScope coroutineScope) {
        this.f50573a = str;
        this.f50574b = i11;
        this.f50575c = i12;
        this.f50576d = user;
        this.f50577e = coroutineScope;
    }

    public final int A() {
        return this.f50575c;
    }

    public abstract LiveData<List<Device>> B();

    public final User C() {
        return this.f50576d;
    }

    public abstract LiveData<Boolean> E();

    public abstract Object F(User user, qm0.d<? super com.withings.wiscale2.dashboard.item.model.d> dVar);

    public final void G() {
        if (u.e(E().getValue(), Boolean.TRUE) && B().getValue() != null) {
            BuildersKt__Builders_commonKt.launch$default(this.f50577e, Dispatchers.getIO(), null, new c(null), 2, null);
        }
    }

    public void k() {
        G();
    }

    public final void t() {
        addSource(xw.a.d(new j(E(), B())), new d(new a()));
        addSource(this.f50578f, new d(new b()));
    }

    public final int v() {
        return this.f50574b;
    }

    public final k0<com.withings.wiscale2.dashboard.item.model.d> x() {
        return this.f50578f;
    }

    public final String y() {
        return this.f50573a;
    }
}
