package com.withings.sdk.wilife;

import com.withings.sdk.wilife.data.changelog.Changelog;
import com.withings.sdk.wilife.data.changelog.remote.RemoteChangelogService;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: WilifeApplication.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.sdk.wilife.WilifeApplicationKt$getChangelog$1", f = "WilifeApplication.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class c extends i implements p<CoroutineScope, qm0.d<? super Changelog>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f43985a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RemoteChangelogService f43986b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r40.b f43987c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RemoteChangelogService remoteChangelogService, r40.b bVar, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f43986b = remoteChangelogService;
        this.f43987c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f43986b, this.f43987c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Changelog> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f43985a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            q40.a aVar = new q40.a(this.f43987c.a());
            this.f43985a = 1;
            obj = this.f43986b.isChangelogAvailable(aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
