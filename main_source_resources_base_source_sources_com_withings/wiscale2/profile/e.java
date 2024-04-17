package com.withings.wiscale2.profile;

import com.withings.user.User;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllTimeStats.kt */
/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.w implements ym0.p<User, om.a, Job> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f59315a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar) {
        super(2);
        this.f59315a = cVar;
    }

    @Override // ym0.p
    public final Job invoke(User user, om.a aVar) {
        CoroutineScope coroutineScope;
        Job launch$default;
        User user2 = user;
        om.a accountUnits = aVar;
        kotlin.jvm.internal.u.j(user2, "user");
        kotlin.jvm.internal.u.j(accountUnits, "accountUnits");
        c cVar = this.f59315a;
        coroutineScope = cVar.f59289a;
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new d(cVar, accountUnits, user2, null), 2, null);
        return launch$default;
    }
}
