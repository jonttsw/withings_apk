package com.withings.wiscale2.home.homeV2;

import bw.g;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import ym0.s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeViewModel.kt */
@e(c = "com.withings.wiscale2.home.homeV2.HomeViewModel$trendsList$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class d extends i implements s<bw.b, bw.a, g, bw.e, qm0.d<? super List<? extends bw.d>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ bw.b f57845a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ bw.a f57846b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ g f57847c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ bw.e f57848d;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        return kotlin.collections.l.z(new bw.d[]{this.f57845a, this.f57846b, this.f57847c, this.f57848d});
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.wiscale2.home.homeV2.d] */
    @Override // ym0.s
    public final Object k(bw.b bVar, bw.a aVar, g gVar, bw.e eVar, qm0.d<? super List<? extends bw.d>> dVar) {
        ?? iVar = new i(5, dVar);
        iVar.f57845a = bVar;
        iVar.f57846b = aVar;
        iVar.f57847c = gVar;
        iVar.f57848d = eVar;
        return iVar.invokeSuspend(y.f85009a);
    }
}
