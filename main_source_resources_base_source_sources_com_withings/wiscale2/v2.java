package com.withings.wiscale2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShareWithMyDoctor.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.ShareWithMyDoctorViewModel$generateFile$2", f = "ShareWithMyDoctor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class v2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Deferred<? extends File>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Object f62178a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<h> f62179b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ t2 f62180c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShareWithMyDoctor.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.ShareWithMyDoctorViewModel$generateFile$2$1", f = "ShareWithMyDoctor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super File>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<h> f62181a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t2 f62182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t2 t2Var, List list, qm0.d dVar) {
            super(2, dVar);
            this.f62181a = list;
            this.f62182b = t2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f62182b, this.f62181a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super File> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List<h> list = this.f62181a;
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
            for (h hVar : list) {
                List<Object> W = kotlin.collections.x.W(hVar.d(), new Integer(hVar.a()), new Integer(hVar.b()), new Integer(hVar.c()));
                ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(W, 10));
                for (Object obj2 : W) {
                    arrayList2.add(dp0.j.O(obj2.toString(), ",", ".", false));
                }
                arrayList.add(kotlin.collections.x.R(arrayList2, ",", null, null, null, 62));
            }
            String R = kotlin.collections.x.R(arrayList, "\n", "Date;SYS;DIA;BPM\n", null, null, 60);
            File file = new File(((HealthmateApplication) this.f62182b.getApplication()).getCacheDir(), "medical-reports");
            file.mkdirs();
            File file2 = new File(file, "bloodPressure.csv");
            wm0.b.g(file2, R);
            return file2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(t2 t2Var, List list, qm0.d dVar) {
        super(2, dVar);
        this.f62179b = list;
        this.f62180c = t2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        v2 v2Var = new v2(this.f62180c, this.f62179b, dVar);
        v2Var.f62178a = obj;
        return v2Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Deferred<? extends File>> dVar) {
        return ((v2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        async$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f62178a, Dispatchers.getIO(), null, new a(this.f62180c, this.f62179b, null), 2, null);
        return async$default;
    }
}
