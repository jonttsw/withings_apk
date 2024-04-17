package com.withings.device.details.automatic.activity.detection;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ActirecCategoryDetectionRepository.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.automatic.activity.detection.ActirecCategoryDetectionRepository$toggleAllCategory$2", f = "ActirecCategoryDetectionRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f36702a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f36703b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f36704c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, long j5, boolean z5, qm0.d<? super e> dVar2) {
        super(2, dVar2);
        this.f36702a = dVar;
        this.f36703b = j5;
        this.f36704c = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f36702a, this.f36703b, this.f36704c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        this.f36702a.f36690a.a(this.f36703b, this.f36704c);
        return nm0.y.f85009a;
    }
}
