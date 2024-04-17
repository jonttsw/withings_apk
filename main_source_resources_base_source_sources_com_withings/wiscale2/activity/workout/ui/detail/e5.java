package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.amazon.model.AmazonPictureInfo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WorkoutImage.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutImageKt$getAmazonUrl$1", f = "WorkoutImage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class e5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super String>, Object> {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Object f49175a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AmazonPictureInfo f49176b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(AmazonPictureInfo amazonPictureInfo, qm0.d<? super e5> dVar) {
        super(2, dVar);
        this.f49176b = amazonPictureInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        e5 e5Var = new e5(this.f49176b, dVar);
        e5Var.f49175a = obj;
        return e5Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super String> dVar) {
        return ((e5) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f49175a;
        try {
            wg.a.a().b();
            throw null;
        } catch (Throwable th2) {
            nm0.l.a(th2);
            return null;
        }
    }
}
