package com.withings.weight.presentation.ui;

import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m90.e;
/* compiled from: BodyCompositionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.BodyCompositionActivity$getUiStateFlow$sectionsStateFlow$1", f = "BodyCompositionActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class i extends kotlin.coroutines.jvm.internal.i implements ym0.t<e.b.h, e.b.f, e.b.f, e.b.f, List<? extends LearnMoreEntryTranslations>, qm0.d<? super e.b.g>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ e.b.h f47255a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ e.b.f f47256b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ e.b.f f47257c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ e.b.f f47258d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ List f47259e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(qm0.d<? super i> dVar) {
        super(6, dVar);
    }

    @Override // ym0.t
    public final Object c(e.b.h hVar, e.b.f fVar, e.b.f fVar2, e.b.f fVar3, List<? extends LearnMoreEntryTranslations> list, qm0.d<? super e.b.g> dVar) {
        i iVar = new i(dVar);
        iVar.f47255a = hVar;
        iVar.f47256b = fVar;
        iVar.f47257c = fVar2;
        iVar.f47258d = fVar3;
        iVar.f47259e = list;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        return new e.b.g(this.f47255a, new e.b.C1296b(this.f47256b, this.f47257c), this.f47258d, this.f47259e);
    }
}
