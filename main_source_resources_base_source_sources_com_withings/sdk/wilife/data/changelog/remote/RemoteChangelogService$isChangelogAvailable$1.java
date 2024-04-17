package com.withings.sdk.wilife.data.changelog.remote;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteChangelogService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.sdk.wilife.data.changelog.remote.RemoteChangelogService", f = "RemoteChangelogService.kt", l = {23}, m = "isChangelogAvailable")
/* loaded from: classes4.dex */
public final class RemoteChangelogService$isChangelogAvailable$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteChangelogService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteChangelogService$isChangelogAvailable$1(RemoteChangelogService remoteChangelogService, d<? super RemoteChangelogService$isChangelogAvailable$1> dVar) {
        super(dVar);
        this.this$0 = remoteChangelogService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isChangelogAvailable(null, this);
    }
}
