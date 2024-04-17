package com.withings.wiscale2;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShareWithMyDoctor.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.ShareWithMyDoctorViewModel$generateContent$2", f = "ShareWithMyDoctor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class u2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Deferred<? extends String>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Object f61741a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t2 f61742b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<h> f61743c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShareWithMyDoctor.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.ShareWithMyDoctorViewModel$generateContent$2$1", f = "ShareWithMyDoctor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super String>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t2 f61744a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<h> f61745b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t2 t2Var, List<h> list, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61744a = t2Var;
            this.f61745b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f61744a, this.f61745b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super String> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            String string = ((HealthmateApplication) this.f61744a.getApplication()).getString(C1987R.string._BPMAIL_BODY_RAW_);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            List<h> list = this.f61745b;
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
            for (h hVar : list) {
                int a11 = hVar.a();
                int b10 = hVar.b();
                int c11 = hVar.c();
                StringBuilder b11 = androidx.glance.appwidget.protobuf.g.b("\nDate: ", hVar.d(), "\nSYS/DIA: ", a11, "/");
                b11.append(b10);
                b11.append("\nbpm: ");
                b11.append(c11);
                b11.append("\n");
                arrayList.add(b11.toString());
            }
            return kotlin.collections.x.R(arrayList, "\n\n", string.concat("\n\n"), null, null, 60);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(t2 t2Var, List<h> list, qm0.d<? super u2> dVar) {
        super(2, dVar);
        this.f61742b = t2Var;
        this.f61743c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        u2 u2Var = new u2(this.f61742b, this.f61743c, dVar);
        u2Var.f61741a = obj;
        return u2Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Deferred<? extends String>> dVar) {
        return ((u2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        async$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f61741a, Dispatchers.getIO(), null, new a(this.f61742b, this.f61743c, null), 2, null);
        return async$default;
    }
}
