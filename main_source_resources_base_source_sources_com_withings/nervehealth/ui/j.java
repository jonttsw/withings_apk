package com.withings.nervehealth.ui;

import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p00.c;
/* compiled from: NerveHealthActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.NerveHealthActivity$initFlows$screenDataFlow$1", f = "NerveHealthActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class j extends kotlin.coroutines.jvm.internal.i implements ym0.t<p00.a, p00.b, Boolean, List<? extends LearnMoreEntryTranslations>, Boolean, qm0.d<? super c.b.C1488b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ p00.a f42723a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ p00.b f42724b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ boolean f42725c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ List f42726d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ boolean f42727e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(qm0.d<? super j> dVar) {
        super(6, dVar);
    }

    @Override // ym0.t
    public final Object c(p00.a aVar, p00.b bVar, Boolean bool, List<? extends LearnMoreEntryTranslations> list, Boolean bool2, qm0.d<? super c.b.C1488b> dVar) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        j jVar = new j(dVar);
        jVar.f42723a = aVar;
        jVar.f42724b = bVar;
        jVar.f42725c = booleanValue;
        jVar.f42726d = list;
        jVar.f42727e = booleanValue2;
        return jVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        return new c.b.C1488b(this.f42723a, this.f42724b, this.f42725c, this.f42726d, this.f42727e);
    }
}
