package com.withings.wiscale2.vascularage;

import com.withings.user.core.models.User;
import com.withings.wiscale2.vascularage.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$vascularAgeData$1", f = "VascularAgeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class j1 extends kotlin.coroutines.jvm.internal.i implements ym0.t<z70.c, List<? extends ky.a>, nm0.j<? extends b90.a, ? extends b90.a>, Integer, User, qm0.d<? super w>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ z70.c f62330a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f62331b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ nm0.j f62332c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Integer f62333d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ User f62334e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ r0 f62335f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(r0 r0Var, qm0.d<? super j1> dVar) {
        super(6, dVar);
        this.f62335f = r0Var;
    }

    @Override // ym0.t
    public final Object c(z70.c cVar, List<? extends ky.a> list, nm0.j<? extends b90.a, ? extends b90.a> jVar, Integer num, User user, qm0.d<? super w> dVar) {
        j1 j1Var = new j1(this.f62335f, dVar);
        j1Var.f62330a = cVar;
        j1Var.f62331b = list;
        j1Var.f62332c = jVar;
        j1Var.f62333d = num;
        j1Var.f62334e = user;
        return j1Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        z70.c cVar = this.f62330a;
        nm0.j jVar = this.f62332c;
        Integer num = this.f62333d;
        User user = this.f62334e;
        List<ky.a> list = this.f62331b;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        for (ky.a aVar : list) {
            this.f62335f.getClass();
            arrayList.add(new r0.a((float) aVar.f(), aVar.b()));
        }
        return new w(arrayList, cVar, jVar, num, user.getBirthDate());
    }
}
