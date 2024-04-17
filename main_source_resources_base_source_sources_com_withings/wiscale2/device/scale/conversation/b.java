package com.withings.wiscale2.device.scale.conversation;

import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.wiscale2.device.scale.conversation.ScaleInstallFinalizingConversation;
import kotlin.jvm.internal.u;
/* compiled from: ScaleInstallFinalizingConversation.kt */
/* loaded from: classes5.dex */
public final class b implements ScaleInstallFinalizingConversation.a {
    @Override // com.withings.wiscale2.device.scale.conversation.ScaleInstallFinalizingConversation.a
    public final void a(SetupConversation conversation, ScaleInstallFinalizingConversation scaleInstallFinalizingConversation) {
        u.j(scaleInstallFinalizingConversation, "scaleInstallFinalizingConversation");
        u.j(conversation, "conversation");
        conversation.M().k(new a(conversation, scaleInstallFinalizingConversation));
    }
}
