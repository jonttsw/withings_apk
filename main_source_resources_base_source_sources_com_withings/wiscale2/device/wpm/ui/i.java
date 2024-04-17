package com.withings.wiscale2.device.wpm.ui;

import androidx.lifecycle.h1;
import com.withings.user.User;
import com.withings.wiscale2.device.wpm.conversation.WpmMeasureConversation;
import com.withings.wiscale2.device.wpm.ui.Wpm0203Activity;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpm0203Activity.kt */
/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.w implements ym0.p<User, WpmMeasureConversation, Job> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm0203Activity.d f55747a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Wpm0203Activity.d dVar) {
        super(2);
        this.f55747a = dVar;
    }

    @Override // ym0.p
    public final Job invoke(User user, WpmMeasureConversation wpmMeasureConversation) {
        Job launch$default;
        User user2 = user;
        WpmMeasureConversation deviceConversation = wpmMeasureConversation;
        kotlin.jvm.internal.u.j(user2, "user");
        kotlin.jvm.internal.u.j(deviceConversation, "deviceConversation");
        Wpm0203Activity.d dVar = this.f55747a;
        launch$default = BuildersKt__Builders_commonKt.launch$default(h1.a(dVar), Dispatchers.getIO(), null, new h(deviceConversation, dVar, user2, null), 2, null);
        return launch$default;
    }
}
