package com.withings.wiscale2.device.common.handcalibration.v2;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import ej.k;
import kotlin.jvm.internal.u;
/* compiled from: HandsCalibrationActivity.kt */
/* loaded from: classes5.dex */
public final class b extends k.e<HandsCalibrationConversation> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f52763a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(c cVar) {
        this.f52763a = cVar;
    }

    @Override // ej.k.e, ej.k.f
    public final void a(ej.k conversationSubmitter, WppDeviceConversation wppDeviceConversation) {
        HandsCalibrationConversation conversation = (HandsCalibrationConversation) wppDeviceConversation;
        u.j(conversationSubmitter, "conversationSubmitter");
        u.j(conversation, "conversation");
        c.b(this.f52763a, conversation);
    }

    @Override // ej.k.e, ej.k.f
    public final void c(ej.k conversationSubmitter, WppDeviceConversation wppDeviceConversation) {
        u.j(conversationSubmitter, "conversationSubmitter");
        c.b(this.f52763a, (HandsCalibrationConversation) wppDeviceConversation);
    }

    @Override // ej.k.e, ej.k.f
    public final void g(ej.k conversationSubmitter, WppDeviceConversation wppDeviceConversation) {
        HandsCalibrationConversation conversation = (HandsCalibrationConversation) wppDeviceConversation;
        u.j(conversationSubmitter, "conversationSubmitter");
        u.j(conversation, "conversation");
        c.b(this.f52763a, conversation);
    }
}
