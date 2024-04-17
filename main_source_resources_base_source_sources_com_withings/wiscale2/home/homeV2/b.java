package com.withings.wiscale2.home.homeV2;

import com.withings.user.core.models.User;
import com.withings.wiscale2.home.homeV2.a;
import iz.a;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import ym0.u;
/* compiled from: HomeViewModel.kt */
@e(c = "com.withings.wiscale2.home.homeV2.HomeViewModel$homeComponentUiState$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class b extends i implements u<User, List<? extends a.b>, List<? extends c10.c<?>>, String, List<? extends bw.d>, List<? extends vg0.a>, qm0.d<? super a.b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ User f57838a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f57839b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ List f57840c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ String f57841d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ List f57842e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ List f57843f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(qm0.d<? super b> dVar) {
        super(7, dVar);
    }

    @Override // ym0.u
    public final Object f(User user, List<? extends a.b> list, List<? extends c10.c<?>> list2, String str, List<? extends bw.d> list3, List<? extends vg0.a> list4, qm0.d<? super a.b> dVar) {
        b bVar = new b(dVar);
        bVar.f57838a = user;
        bVar.f57839b = list;
        bVar.f57840c = list2;
        bVar.f57841d = str;
        bVar.f57842e = list3;
        bVar.f57843f = list4;
        return bVar.invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        return new a.b(this.f57839b, this.f57840c, this.f57841d, this.f57842e, this.f57843f, this.f57838a);
    }
}
