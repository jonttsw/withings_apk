package com.withings.sdk.wilife;

import ah.h;
import android.app.Application;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: WilifeApplication.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.sdk.wilife.WilifeApplicationKt$shouldCheckForChangelog$1", f = "WilifeApplication.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class e extends i implements p<CoroutineScope, qm0.d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    String f43995a;

    /* renamed from: b  reason: collision with root package name */
    int f43996b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Application f43997c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Application application, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f43997c = application;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f43997c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f43996b;
        if (i11 != 0) {
            if (i11 == 1) {
                str = this.f43995a;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            Application application = this.f43997c;
            String a11 = new r40.b(application).a();
            Flow data = b.a(application).getData();
            this.f43995a = a11;
            this.f43996b = 1;
            Object first = FlowKt.first(data, this);
            if (first == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = a11;
            obj = first;
        }
        return Boolean.valueOf(!((g4.e) obj).b(h.f(str)));
    }
}
