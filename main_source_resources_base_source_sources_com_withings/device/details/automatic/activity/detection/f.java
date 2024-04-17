package com.withings.device.details.automatic.activity.detection;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ActirecCategoryDetectionRepository.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.automatic.activity.detection.ActirecCategoryDetectionRepository$toggleCategory$2", f = "ActirecCategoryDetectionRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f36705a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f36706b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f36707c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f36708d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, long j5, long j11, boolean z5, qm0.d<? super f> dVar2) {
        super(2, dVar2);
        this.f36705a = dVar;
        this.f36706b = j5;
        this.f36707c = j11;
        this.f36708d = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new f(this.f36705a, this.f36706b, this.f36707c, this.f36708d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        this.f36705a.f36690a.c(this.f36706b, this.f36707c, this.f36708d);
        return nm0.y.f85009a;
    }
}
